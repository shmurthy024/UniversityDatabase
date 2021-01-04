/** Students.java
*
* This is the Students class to create Undergraduate and Graduate Students
* @author Shree Murthy
* @author Student ID: 2374658
* @author shmurthy@chapman.edu
* CPSC 231-01 - Dr. Stevens
* Assignment - MP4
* @version 1.0
*/

/** This class extends Affiliates and creates student objects
 */
public class Students extends Affiliates{

  /**String to set the type of Student*/
  private String type;
  /**int representing Student ID*/
  protected int studentID;
  /**String to set the major*/
  private String major;
  /**String to set the minor*/
  private String minor;
  /**String to take the class standing*/
  private String classStanding;
  /**int for Papers Published*/
  private int papersPublished;
  /**String for thesis advisor*/
  private String thesisAdvisor;
  /**int for courses taken*/
  private int courses;
  /**long for scholarship money*/
  private long scholarship;

  /** Default constructor
  * Use super() if needed to call default of Affilates
  * set all values to null or 0
  */
  public Students(){
    super();
    type = null;
    studentID = 0;
    major = null;
    minor = null;
    classStanding = null;
    papersPublished = 0;
    thesisAdvisor = null;
    courses = 0;
    scholarship = 0;
  }

  /** Overloaded constructor
  * @param n String for name input
  * @param a int for age
  * @param addy String for addresses
  * @param p String for phone number
  * @param arrive int for arrival year
  * @param t String for type of student
  * @param id int for student id
  * @param m String major
  * @param min String minor
  * @param standing String for class standing
  * @param papersPub int for papers published
  * @param advisor String for thesis advisor
  * @param coursesTaken int for courses taken
  * @param scholarMoney long for scholarship money
  */
  public Students(String n, int a, String addy, String p, int arrive, String t, int id, String m, String min, String standing
  , int papersPub, String advisor, int coursesTaken, long scholarMoney){
    super(n, a, addy, p, arrive);
    type = t;
    studentID = id;
    major = m;
    minor = min;
    classStanding = standing;
    papersPublished = papersPub;
    thesisAdvisor = advisor;
    courses = coursesTaken;
    scholarship = scholarMoney;
  }

  /** Set the type of student
  * @param t String representing type
  */
  public void setType(String t){
    type = t;
  }
  /** get the type of student
  * @return String representing type
  */
  public String getType(){
    return type;
  }
  /** Set the student id
  * @param t String representing type
  */
  public void setStudentID(int i){
    studentID = i;
  }
  /** Get the student id
  * @return int representing student id
  */
  public int getStudentID(){
    return studentID;
  }
  /** Set the major of student
  * @param ma String for the major
  */
  public void setMajor(String ma){
    major = ma;
  }
  /** Get the major
  * @return String representing major
  */
  public String getMajor(){
    return major;
  }
  /** Set the minor
  * @param mi String representing student minor
  */
  public void setMinor(String mi){
    minor = mi;
  }
  /** get the minor
  * @return String for minor attribute
  */
  public String getMinor(){
    return minor;
  }
  /** Set the students standing
  * @param st String representing student standing
  */
  public void setStanding(String st){
    classStanding = st;
  }
  /** Get the student standing
  * @return String representing class standing
  */
  public String getStanding(){
    return classStanding;
  }
  /** Set the papers published
  * @param p int representing papers published
  */
  public void setPapers(int p){
    papersPublished = p;
  }
  /** Get the paper published
  * @return int representing papers published
  */
  public int getPapers(){
    return papersPublished;
  }
  /** Set the advisor
  * @param a String representing thesis advisor
  */
  public void setAdvisor(String a){
    thesisAdvisor = a;
  }
  /** Get the advisor
  * @return String representing advisor
  */
  public String getAdvisor(){
    return thesisAdvisor;
  }
  /** Get the student id
  * @param c int representing courses
  */
  public void setCourses(int c){
    courses = c;
  }
  /** Get the total courses
  * @return int representing courses taken
  */
  public int getCourses(){
    return courses;
  }
  /** Set the student scholarship money
  * @param s long representing scholarship value
  */
  public void setScholarship(long s){
    scholarship = s;
  }
  /** Get the scholarship money
  * @return long representing student scholarship
  */
  public long getScholarship(){
    return scholarship;
  }



  /** Override the existing print() method to cover all student variables
  * @return String representing all attributes
  */
  public String print(){
    String s = "";
    s += type;
    s += super.print();
    if(type.equalsIgnoreCase("Undergraduate") || type.equalsIgnoreCase("Undergraduate Student")){
      s += ", " + classStanding;
      s += ", " + courses;
      s += ", " + major;
      s += ", " + minor;
      s += ", " + scholarship;
      s += ", " + studentID;

    }
    else if(type.equalsIgnoreCase("Graduate") || type.equalsIgnoreCase("Graduate Student")){
      s += ", " + classStanding;
      s += ", " + major;
      s += ", " + minor;
      s += ", " + papersPublished;
      s += ", " + studentID;
      s += ", " + thesisAdvisor;
    }
    else{
      s += ", Class Standing: " + classStanding;
      s += ", Number of Courses Takes: " + courses;
      s += ", Major: " + major;
      s += ", Minor: " + minor;
      s += ", Number of Papers Published: " + papersPublished;
      s += ", Scholarship Money: $" + scholarship;
      s += ", Student ID: " + studentID;
      s += ", Thesis Advisor: " + thesisAdvisor;
    }
    return s;
  }

  /** A simple equals method to compare two Students
  * @param o Students representing the student object to be compared
  * @return boolean T/F regarding if the students have the same ID
  */
  public boolean equals(Students o){
    return (o.studentID == studentID);
  }



}
