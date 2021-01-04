/** Affiliates.java
*
* This is an abstract class that will act as the parent class for all that folow.
* @author Shree Murthy
* @author Student ID: 2374658
* @author shmurthy@chapman.edu
* CPSC 231-01 - Dr. Stevens
* Assignment - MP4
* @version 1.0
*/

/** This class creates a rough outline that the rest of the classes will follow.
 * Every child class must extend this class and overwrite the print() method.
 * Moreover, this class implements Printable and Comparable<>. Comparable should be specified as Affiliates.
 */

public abstract class Affiliates implements Printable, Comparable<Affiliates>{

  /**A string variable that sets the name of Affiliate*/
  protected String name;
  /**An int that stores age*/
  protected int age;
  /**A string that stores addresses*/
  protected String address;
  /**A string to store Phone Numbers*/
  protected String phoneNumber;
  /**An int to store the year they came to the University*/
  protected int arrivalYear;


  /** This is the default constructor.
  * Set all values to null or 0.
  */
  public Affiliates(){
    name = null;
    age = 0;
    address = null;
    phoneNumber = null;
    arrivalYear = 0;
  }

  /** This is the Overloaded constructor
  * @param n String that takes in the name
  * @param a int for the age Input
  * @param addy String for the address Input
  * @param p String for the phone numbers
  * @param arrive int for arrival year input
  */
  public Affiliates(String n, int a, String addy, String p, int arrive){
    name = n;
    age = a;
    address = addy;
    phoneNumber = p;
    arrivalYear = arrive;
  }

  /**Set the name of Affiliate
  * @param na String for name Input
  */
  public void setName(String na){
    name = na;
  }
  /** Get the name
  * @return String for the name
  */
  public String getName(){
    return name;
  }
  /** Set the age
  * @param ag int for age
  */
  public void setAge(int ag){
    age = ag;
  }
  /** Get the age
  * @return int for the age
  */
  public int getAge(){
    return age;
  }
  /** Set address
  * @param add String for Address
  */
  public void setAddress(String add){
    address = add;
  }
  /** Get address
  * @return String for Address
  */
  public String getAddress(){
    return address;
  }
  /** Set the phone number
  * @param num String for phone number
  */
  public void setPhoneNumber(String num){
    phoneNumber = num;
  }
  /** Get phone number
  * @return String representing phone number
  */
  public String getPhoneNumber(){
    return phoneNumber;
  }
  /** Set Arrival Year
  * @param year int for Arrival year
  */
  public void setArrivalYear(int year){
    arrivalYear = year;
  }
  /** Get arrival year
  * @return int for arrival year
  */
  public int getArrivalYear(){
    return arrivalYear;
  }


  /** Override the method from the Printable class
  * Print all variables in alphabetical order. Best practice for the rest of the subclasses.
  */
  public String print(){
    String s = "";
    s += ", " + age;
    s += ", " + address;
    s += ", " + arrivalYear;
    s += ", " + name;
    s += ", " + phoneNumber;
    return s;
  }

  /** This is the compareTo method from the Comparable class.
  * @param other Affiliate object that is used to compare against existing Affiliate object.
  * Compare only their arrival years for seniority.
  */
  public int compareTo(Affiliates other){
    int val = 0;
    if(other.arrivalYear < arrivalYear){
      val = 1;
    }
    if(other.arrivalYear > arrivalYear){
      val = -1;
    }
    return val;
  }

}
