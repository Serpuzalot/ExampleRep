package Classes;

import java.time.LocalDate;
import java.util.Date;

public class Footbaler {
    private final Date MIN_DATE = new Date(1979,01,01);

    private String lastName;
    private Date birtdayDate;
    private String birthdayPlace;
    private FootballerAmplua amplua;
    private int numberOfGames;
    private int numberOfYellowCard;

    public Footbaler(String lastName, Date birtdayDate, String birthdayPlace, FootballerAmplua amplua, int numberOfGames , int numberOfYellowCard){
        setLastName(lastName);
        setBirtdayDate(birtdayDate);
        setBirthdayPlace(birthdayPlace);
        setAmplua(amplua);
        setNumberOfGames(numberOfGames);
        setNumberOfYellowCard(numberOfYellowCard);
    }

    public Footbaler(String lastName,int year,int month,int day,String birthdayPlace,FootballerAmplua amplua,int numberOfGames,int numberOfYellowCard){

        this(lastName,new Date(year,month,day),birthdayPlace,amplua,numberOfGames,numberOfYellowCard);
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName != null){
            this.lastName = lastName;
        }

    }

    public Date getBirtdayDate() {
        return birtdayDate;
    }

    public void setBirtdayDate(Date birtdayDate) {
        if(birtdayDate.getYear() > MIN_DATE.getYear() && birtdayDate.getYear() <= LocalDate.now().getYear()) {
            this.birtdayDate = birtdayDate;
        }
    }

    public String getBirthdayPlace() {
        return birthdayPlace;
    }

    public void setBirthdayPlace(String birthdayPlace) {
        this.birthdayPlace = birthdayPlace;
    }

    public FootballerAmplua getAmplua() {
        return amplua;
    }

    public void setAmplua(FootballerAmplua amplua) {
        this.amplua = amplua;
    }

    public int getNumberOfGames() {
        return numberOfGames;
    }

    public void setNumberOfGames(int numberOfGames) {
        if(numberOfGames>=0){
             this.numberOfGames = numberOfGames;
        }
    }

    public int getNumberOfYellowCard() {
        return numberOfYellowCard;
    }

    public void setNumberOfYellowCard(int numberOfYellowCard) {
        if(numberOfYellowCard>=0){
          this.numberOfYellowCard = numberOfYellowCard;
        }

    }

    @Override
    public String toString() {
        return "Footbaler{" +
                "lastName='" + lastName + '\'' +
                ", birtdayDate=" + birtdayDate.getYear()+"-"+ birtdayDate.getMonth()+"-"+birtdayDate.getDate() +
                ", birthdayPlace='" + birthdayPlace + '\'' +
                ", amplua=" + amplua +
                ", numberOfGames=" + numberOfGames +
                ", numberOfYellowCard=" + numberOfYellowCard +
                '}';
    }
}
