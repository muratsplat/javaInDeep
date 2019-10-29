package deep.lambdaexpressions;

import java.time.LocalDate;

public class Person {

  public Person(String name, Person.Sex gender) {
    this.name = name;
    this.gender = gender;
    this.birthday = LocalDate.now();
  }

  public Person(String name, Person.Sex gender, long age) {
    this.name = name;
    this.gender = gender;
    this.birthday = LocalDate.now().plusYears(age * 1);
  }

  public enum Sex {
      MALE, FEMALE
  }

  private String name;
  private LocalDate birthday;
  private Sex gender;
  private String emailAddress;

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
    return String.format("Person[Name: %s, Age: %d, Gender: %s]", this.getName(), this.getAge(), this.getGender());
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Person) {
      Person cast = (Person) obj;
      return this.getAge() == cast.getAge() 
        && this.getName().equals(cast.getName())
        && this.getGender().equals(cast.getGender());
    }
    return false;
  }

  public static int compareByAge(Person a, Person b) {
    return a.birthday.compareTo(b.birthday);
  }
}