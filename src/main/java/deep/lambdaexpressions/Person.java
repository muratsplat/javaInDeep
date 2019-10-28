package deep.lambdaexpressions;

import java.time.LocalDate;

public class Person {

  public enum Sex {
      MALE, FEMALE
  }

  String name;
  LocalDate birthday;
  Sex gender;
  String emailAddress;

  public int getAge() { 
    return LocalDate.now().getYear() - birthday.getYear();
  }

  /**
   * @param birthday the birthday to set
   */
  public void setBirthday(LocalDate birthday) {
    this.birthday = birthday;
  }

  /**
   * @return the birthday
   */
  public LocalDate getBirthday() {
    return birthday;
  }
  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param gender the gender to set
   */
  public void setGender(Sex gender) {
    this.gender = gender;
  }

  /**
   * @return the emailAddress
   */
  public String getEmailAddress() {
    return emailAddress;
  }

  /**
   * @param emailAddress the emailAddress to set
   */
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  /**
   * @return the gender
   */
  public Sex getGender() {
    return gender;
  }
  
  @Override
  public String toString() {
    return String.format("Person[Name: %s]", this.name);
  }
}