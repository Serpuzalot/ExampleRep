package main;

import Classes.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    private static ArrayList<Employee> employees;
    private static ArrayList<Footbaler> footbalers;

    private static void initialEmployees(){
        employees = new ArrayList<Employee>();
        String[] names =  {"Sidorov","Ivanov","Petrov","Full","Snow","SudoBoo"};
        Education[] educations = {Education.higer,Education.secondary};
        EmployeePosition[] employeePositions = {EmployeePosition.cook,EmployeePosition.economist,EmployeePosition.director,EmployeePosition.manager,EmployeePosition.securityGuard,EmployeePosition.programmer};
        for(int i=0;i<6;i++){
            Employee emloyee = new Employee(names[i], 18+(int)(Math.random() * 30), educations[0+(int)(Math.random()*2)], employeePositions[i]);
            employees.add(emloyee);
        }
    }

    private  static ArrayList<Employee> getEmployeesWithSecondaryEducationOlder30(){
        ArrayList<Employee> result = new ArrayList<Employee>();
        for (Employee employee: employees) {
            if(employee.getEducation() == Education.secondary && employee.getAge() > 30){
                result.add(employee);
            }
        }
        return result;
    }

    private  static void initialFootbalers(){
        footbalers = new ArrayList<Footbaler>();
        String[] lastNames = {"Fo1","Fo2","Fo3","Fo4","fo5"};
        String[] birthdayPlaces = {"Germany","Italy","Japan","Polish","Kanada"};
        FootballerAmplua[] ampluas = {FootballerAmplua.attacking,FootballerAmplua.defender,FootballerAmplua.goalkeeper,FootballerAmplua.halfback,FootballerAmplua.libero};
        for(int i=0;i<5;i++){
            Footbaler footbaler = new Footbaler(lastNames[0+(int)(Math.random()*5)],1980 + (int)(Math.random()*30),0+(int)(Math.random()*12),0+(int)(Math.random()*28),birthdayPlaces[i],ampluas[i],50+(int)(Math.random()*150),0+(int)(Math.random()*30));
            footbalers.add(footbaler);
        }

    }

    private  static  ArrayList<Footbaler> getFootbalersOlder20AndLess1CardFor10Games(){
        ArrayList<Footbaler> result = new ArrayList<Footbaler>();
        for (Footbaler footbaler: footbalers) {
            boolean olderThen20 = footbaler.getBirtdayDate().getYear() - LocalDate.now().getYear() >=20;
            boolean less1CardFor10Games;
            if(footbaler.getNumberOfYellowCard()==0){
                less1CardFor10Games = true;
            }else{
                less1CardFor10Games = footbaler.getNumberOfGames() / footbaler.getNumberOfYellowCard() >=10;
            }
            if(olderThen20 = true && less1CardFor10Games == true){
                result.add(footbaler);
            }
        }
        return result;
    }

    public static void main(String[] args) {

       initialEmployees();
        for (var el :employees) {
            System.out.println(el.toString());
        }
       ArrayList<Employee> neededEmployees = getEmployeesWithSecondaryEducationOlder30();
        System.out.println("||||||||||");
       if(neededEmployees.isEmpty()){
           System.out.println("No result");
       }else{
           for (Employee employee : neededEmployees) {
               System.out.println(employee.toString());
           }
       }
      /* initialFootbalers();
       ArrayList<Footbaler>neededFootbalers = getFootbalersOlder20AndLess1CardFor10Games();
       if(neededFootbalers.isEmpty()){
           System.out.println("No result");
       }else{
           for (Footbaler footbaler: neededFootbalers) {
               System.out.println(footbaler.toString());
           }
       }*/


    }

}

