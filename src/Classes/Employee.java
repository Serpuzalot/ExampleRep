package Classes;

public class Employee {

    private String lastName;
    private int age;
    private Education education;
    private EmployeePosition position;

    public Employee(String lastName,int age,Education education,EmployeePosition position) {
        setLastName(lastName);
        setAge(age);
        setEducation(education);
        setPosition(position);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName !=null){
            this.lastName = lastName;
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 18){
            age = 0;
        }
        this.age = age;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public EmployeePosition getPosition() {
        return position;
    }

    public void setPosition(EmployeePosition position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", education=" + education +
                ", position=" + position +
                '}';
    }
}
