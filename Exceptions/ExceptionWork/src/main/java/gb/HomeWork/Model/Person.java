package gb.HomeWork.Model;

public class Person {

    private String name = "";
    private String surname = "";
    private String lastname = "";
    private String birthDate = "";
    private int phoneNumber = 0;
    private char gender = ' ';

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getSurname() {return surname;}
    public void setSurname(String surname) {this.surname = surname;}
    public String getLastname() {return lastname;}
    public void setLastname(String lastname) {this.lastname = lastname;}
    public String getBirthDate() {return birthDate;}
    public void setBirthDate(String birthDate) {this.birthDate = birthDate;}
    public int getPhoneNumber() {return phoneNumber;}
    public void setPhoneNumber(int phoneNumber) {this.phoneNumber = phoneNumber;}
    public char getGender() {return gender;}
    public void setGender(char gender) {this.gender = gender;}
    protected Person(String name, String surname, String lastname, String birthDate, int phoneNumber, char gender) {
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }
}
