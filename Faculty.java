/** Faculty.java
*
* This is a class that creates only Faculty objects.
* @author Shree Murthy
* @author Student ID: 2374658
* @author shmurthy@chapman.edu
* CPSC 231-01 - Dr. Stevens
* Assignment - MP4
* @version 1.0
*/

/** This class creates a faculty with the correct attributes.
 * Make sure to extend Affiliates class as well as overwrite the print() method.
 */
public class Faculty extends Affiliates{

  /**String to store the specific type of Faculty. Associate/Full/Assistant*/
  private String type;
  /**int to store unique facutly id*/
  protected int facultyID;
  /**String to store the department they work in*/
  private String department;
  /**Long to store salary*/
  private long salary;
  /**int to store the number of papers they have*/
  private int numOfPapers;
  /**int for number of years until/since tenure/retirement*/
  private int years;


  /** Default constructor.
  * Set all other values to null or 0
  */
  public Faculty(){
    super();
    type = null;
    facultyID = 0;
    department = null;
    salary = 0;
    numOfPapers = 0;
  }

  /** Overloaded constructor
  * @param n String for name input
  * @param a int for age
  * @param addy String for addresses
  * @param p String for phone number
  * @param arrive int for arrival year
  * @param t String for type of faculty
  * @param id int for faculty id
  * @param deprt String for department
  * @param sal long for salary information
  * @param papers int for number of papers
  * @param y int for years until/since retirement/tenure
  */
  public Faculty(String n, int a, String addy, String p, int arrive, String t, int id, String deprt, long sal, int papers, int y){
    super(n, a, addy, p, arrive);
    type = t;
    facultyID = id;
    department = deprt;
    salary = sal;
    numOfPapers = papers;
    years = y;
  }

  /** Set the type of faculty
  * @param ty String for type to be set
  */
  public void setType(String ty){
    type = ty;
  }
  /** Get the type of faculty
  * @return String for type attribute
  */
  public String getType(){
    return type;
  }
  /** Set the faculty ID
  * @param i int for faculty ID
  */
  public void setFacultyID(int i){
    facultyID = i;
  }
  /** Get the faculty id
  * @return int for faculty ID
  */
  public int getFacultyID(){
    return facultyID;
  }
  /** set the department
  * @param d String for department
  */
  public void setDepartment(String d){
    department = d;
  }
  /** Get the department
  * @return String for department
  */
  public String getDepartment(){
    return department;
  }
  /** Set the salary
  * @param s long to set the salary
  */
  public void setSalary(long s){
    salary = s;
  }
  /** Get salary information
  * @return long for salary attribute
  */
  public long getSalary(){
    return salary;
  }
  /** Set the number of papers
  * @param pa int for number of papers
  */
  public void setPapers(int pa){
    numOfPapers = pa;
  }
  /** Get num of papers
  * @return int for numOfPaper attribute
  */
  public int getPapers(){
    return numOfPapers;
  }
  /** Set years
  * @param ye int for setting years until/since tenure/retirement
  */
  public void setYears(int ye){
    years = ye;
  }
  /** Get years until/since retirement/tenure
  * @return years attribute
  */
  public int getYears(){
    return years;
  }


  /** Override the existing print() method and print out all attributes
  * @return String of all attributes
  */
  public String print(){
    String s = "";
    s += type;
    s += super.print();
    s += ", " + department;
    s += ", " + facultyID;
    s += ", " + numOfPapers;
    s += ", " + salary;
    if(type.equalsIgnoreCase("Assistant Professor") || type.equalsIgnoreCase("Assistant")){
      s += ", " + years;
    }
    if(type.equalsIgnoreCase("Associate Professor") || type.equalsIgnoreCase("Associate")){
      s += ", " + years;
    }
    if(type.equalsIgnoreCase("Full Professor") || type.equalsIgnoreCase("Full")){
      s += ", " + years;
    }
    return s;
  }

  /** Simple equals method that checks both faculty's ID and returns a T/F
  * @return boolean if the two Faculty objects are the same
  * @param o Faculty object to be compared
  */
  public boolean equals(Faculty o){
    return (o.facultyID == facultyID);
  }




}
