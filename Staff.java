/** Staff.java
*
* This is the staff class needed to create Full-Time and Part-Time staff
* @author Shree Murthy
* @author Student ID: 2374658
* @author shmurthy@chapman.edu
* CPSC 231-01 - Dr. Stevens
* Assignment - MP4
* @version 1.0
*/

/** This class contains all the necessary staff variables
 *
 */
public class Staff extends Affiliates{

  /**String for the type of Staff*/
  private String type;
  /**int representing staff id*/
  protected int staffID;
  /**int representing hourly/yearly salary*/
  private int salary;
  /**String representing their title*/
  private String title;
  /**String representing their specific building*/
  private String building;

  /** Default constructor
  * Use super() if needed to call default of Affilates
  * set all values to null or 0
  */
  public Staff(){
    super();
    type = null;
    staffID = 0;
    salary = 0;
    title = null;
    building = null;
  }

 /** Overloaded constructor
  * @param n String for name input
  * @param a int for age
  * @param addy String for addresses
  * @param p String for phone number
  * @param arrive int for arrival year
  * @param tp String for type of staff
  * @param id int for staff id
  * @param sal int for salary
  * @param ti String for title
  * @param b String for building
  */
  public Staff(String n, int a, String addy, String p, int arrive,
  String tp, int id, int sal, String ti, String b){
    super(n, a, addy, p, arrive);
    type = tp;
    staffID = id;
    salary = sal;
    title = ti;
    building = b;
  }


  /** Set the type
  * @param ty String representing type
  */
  public void setType(String ty){
    type = ty;
  }
  /** Get the type
  * @return String for the type attribute
  */
  public String getType(){
    return type;
  }
  /** Set the staff id
  * @param i int representing staff id 
  */
  public void setStaffID(int i){
    staffID = i;
  }
  /** Get the staff id
  * @return int for the id attribute
  */
  public int getStaffID(){
    return staffID;
  }
  /** Set the salary
  * @param s int representing hourly/yearly salary
  */
  public void setSalary(int s){
    salary = s;
  }
  /** Get the salary
  * @return int for the Salary attribute
  */
  public int getSalary(){
    return salary;
  }
  /** Set the title
  * @param ti String representing title
  */
  public void setTitle(String ti){
    title = ti;
  }
  /** Get the title
  * @return String for their title
  */
  public String getTitle(){
    return title;
  }
  /** Set the building
  * @param bu String representing building
  */
  public void setBuilding(String bu){
    building = bu;
  }
  /** Get the Staff's building
  * @return String for the building attribute
  */
  public String getBuilding(){
    return building;
  }



  /** Override the existing print() method to cover all staff variables
  * @return String representing all attributes
  */
  public String print(){
    String s = "";
    s += type;
    s += super.print();
    s += ", " + building;
    if(type.equalsIgnoreCase("Full Time") || type.equalsIgnoreCase("Full") || type.equalsIgnoreCase("Full-Time Staff") || type.equalsIgnoreCase("Full-Time") || type.equalsIgnoreCase("Full Time")){
      s += ", " + salary;
    }
    else if(type.equalsIgnoreCase("Part Time") || type.equalsIgnoreCase("Part") || type.equalsIgnoreCase("Part-Time Staff") || type.equalsIgnoreCase("Part-Time") || type.equalsIgnoreCase("Part Time")){
      s += ", " + salary;
    }
    else{
      s += ", " + salary;
    }
    s += ", " + staffID;
    s += ", " + title;


    return s;
  }

  /** A simple equals method to compare two Staff objects
  * @param s Staff representing the staff object to be compared
  * @return boolean T/F regarding if the staff have the same ID
  */
  public boolean equals(Staff s){
    return (s.staffID == staffID);
  }




}
