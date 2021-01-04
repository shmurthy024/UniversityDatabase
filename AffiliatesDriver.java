/** AffiliatesDriver.java
*
* This is the driver class that will run all needed functions and work with files.
* @author Shree Murthy
* @author Student ID: 2374658
* @author shmurthy@chapman.edu
* CPSC 231-01 - Dr. Stevens
* Assignment - MP4
* @version 1.0
*/


import java.util.*;
import java.io.*;

/** This class will only deal with Files (and its handlings). As well as test all needed methods
 * The goal of this class is to learn/use file handling and make sure all requried methods work properly
 * Use any method necessary to complete: Reading a file, writing into a file, creating a record, etc
 */
public class AffiliatesDriver{

  /** Read into a file. Throw IOExceptions
  * @param br BufferedReader for reading from a file
  */
  public static void readFile(BufferedReader br) throws IOException{
    System.out.println("File Exists. Will Read Now");
    String currLine;
    while((currLine = br.readLine()) != null){
      System.out.println(currLine);
    }
    System.out.println("DONE!!!");
  }


  /** This method will purely write into a file
  * @param pw PrintWriter to take the file to write into
  * @param content HashMap<Integer, Affiliates> that will take a HashMap and copy its information into the txt file
  */
  public static void writeFile(PrintWriter pw, HashMap<Integer, Affiliates> content){
    System.out.println("About to write into file.");
    for(int key : content.keySet()){
      pw.println(content.get(key).print());
    }
    System.out.println("DONE!!!");
  }


  /** Sort all Affilates as it pertains to their arrival year. Make sure to copy HashMap into another list that can run ___List.sort()
  * @param content HashMap<Integer, Affilates> the HashMap input needed to be sorted
  * @return ArrayList<Affilates> sorted ArrayList in seniority
  */
  public static ArrayList<Affiliates> sort(HashMap<Integer, Affiliates> content){
    ArrayList<Affiliates> list = new ArrayList<Affiliates>();
    for(int key : content.keySet()){
      list.add(content.get(key));
    }
    Collections.sort(list);
    for(int i = 0; i < list.size(); i++){
      System.out.println(list.get(i).print());
    }
    return list;
  }

  /** Fill a database given a file and a HashMap. Throw IOException
  * @param r FileReader to read from the file that contains everyone's information
  * @param content HashMap<Integer, Affiliates> this acts as the HashMap to hold all the information from the file.
  */
  public static void fillDatabase(FileReader r, HashMap<Integer, Affiliates> content) throws IOException{
    BufferedReader br = new BufferedReader(r);
    String currLine;
    while((currLine = br.readLine()) != null){
        Scanner sc = new Scanner(currLine).useDelimiter(", ");
        String tp = sc.next();
        if(tp.equalsIgnoreCase("Full Time") || tp.equalsIgnoreCase("Part Time")){
          Staff s = new Staff();
          s.setAge(sc.nextInt());
          s.setType(tp);
          s.setAddress(sc.next());
          s.setArrivalYear(sc.nextInt());
          s.setName(sc.next());
          s.setPhoneNumber(sc.next());
          s.setBuilding(sc.next());
          s.setSalary(sc.nextInt());
          s.setStaffID(sc.nextInt());
          s.setTitle(sc.next());
          content.put(s.getStaffID(), s);

        }
        if(tp.equalsIgnoreCase("Full Professor") || tp.equalsIgnoreCase("Associate Professor") || tp.equalsIgnoreCase("Assistant Professor")){
          Faculty f = new Faculty();
          f.setAge(sc.nextInt());
          f.setType(tp);
          f.setAddress(sc.next());
          f.setArrivalYear(sc.nextInt());
          f.setName(sc.next());
          f.setPhoneNumber(sc.next());
          f.setDepartment(sc.next());
          f.setFacultyID(sc.nextInt());
          f.setPapers(sc.nextInt());
          f.setSalary(sc.nextLong());
          f.setYears(sc.nextInt());
          content.put(f.getFacultyID(), f);
        }
        if(tp.equalsIgnoreCase("Undergraduate") || tp.equalsIgnoreCase("Graduate")){
          Students st = new Students();
          st.setAge(sc.nextInt());
          st.setType(tp);
          st.setAddress(sc.next());
          st.setArrivalYear(sc.nextInt());
          st.setName(sc.next());
          st.setPhoneNumber(sc.next());
          st.setStanding(sc.next());
          st.setCourses(sc.nextInt());
          st.setMajor(sc.next());
          st.setMinor(sc.next());
          st.setScholarship(sc.nextLong());
          st.setStudentID(sc.nextInt());
          content.put(st.getStudentID(), st);
        }



    }
    for(int key : content.keySet()){
      System.out.println(content.get(key).print());
    }
    System.out.println("DONE!!!");

  }


  /** Take user inputs and accordingly create a affiliate record and store into your HashMap
  * @param data HashMap<Integer, Affiliates> that will take the created record and store into the HashMap
  */
  public static void createRecord(HashMap<Integer, Affiliates> data){
    Faculty fa = new Faculty();
    Staff st = new Staff();
    Students su = new Students();
    Scanner scan = new Scanner(System.in);
    System.out.println("What type of Affiliate are we creating: (Faculty, Staff, Student)");
    String affiliate = scan.next();
    if(affiliate.equalsIgnoreCase("Faculty")){
      Scanner scnr = new Scanner(System.in);
      System.out.println("Input the following information: (Type of faculty, age, address, arrival year, name, phone number, department, faculty id, number of papers, salary, and years until/since tenure/retirement)");
      String faculty = scnr.nextLine();
      String[] tempL = faculty.split(",");
      String[] list = new String[tempL.length];
      for(int i = 0; i < tempL.length; i++){
        list[i] = tempL[i].trim();
      }
      fa.setType(list[0]);
      fa.setAge(Integer.parseInt(list[1]));
      fa.setAddress(list[2]);
      fa.setArrivalYear(Integer.parseInt(list[3]));
      fa.setName(list[4]);
      fa.setPhoneNumber(list[5]);
      fa.setDepartment(list[6]);
      fa.setFacultyID(Integer.parseInt(list[7]));
      fa.setPapers(Integer.parseInt(list[8]));
      fa.setSalary(Long.parseLong(list[9]));
      fa.setYears(Integer.parseInt(list[10]));
      data.put(fa.getFacultyID(), fa);
    }
    else if(affiliate.equalsIgnoreCase("Student")){
      Scanner scnr = new Scanner(System.in);
      System.out.println("Input the following information: (Type of Student, age, address, arrival year, name, phone number, student id, major, minor, class standing, papers published, thesis advisor, courses taken, and scholarship money)");
      String student = scnr.nextLine();
      String[] tempL = student.split(",");
      String[] list = new String[tempL.length];
      for(int i = 0; i < tempL.length; i++){
        list[i] = tempL[i].trim();
      }
      su.setType(list[0]);
      su.setAge(Integer.parseInt(list[1]));
      su.setAddress(list[2]);
      su.setArrivalYear(Integer.parseInt(list[3]));
      su.setName(list[4]);
      su.setPhoneNumber(list[5]);
      su.setStudentID(Integer.parseInt(list[6]));
      su.setMajor(list[7]);
      su.setMinor(list[8]);
      su.setStanding(list[9]);
      su.setPapers(Integer.parseInt(list[10]));
      su.setAdvisor(list[11]);
      su.setCourses(Integer.parseInt(list[11]));
      su.setScholarship(Long.parseLong(list[12]));
      data.put(su.getStudentID(), su);
    }
    else if(affiliate.equalsIgnoreCase("Staff")){
      Scanner scnr = new Scanner(System.in);
      System.out.println("Input the following information: (Type of Staff, age, address, arrival year, name, phone number, staff id, hourly/yearly salary, title, building) \nIf salary is hourly input as: 14 and not 14.00 \nIf salary is yearly input as: 120500 not 120500.00");
      String staff = scnr.nextLine();
      String[] tempL = staff.split(",");
      String[] list = new String[tempL.length];
      for(int i = 0; i < tempL.length; i++){
        list[i] = tempL[i].trim();
      }
      st.setType(list[0]);
      st.setAge(Integer.parseInt(list[1]));
      st.setAddress(list[2]);
      st.setArrivalYear(Integer.parseInt(list[3]));
      st.setName(list[4]);
      st.setPhoneNumber(list[5]);
      st.setStaffID(Integer.parseInt(list[6]));
      st.setSalary(Integer.parseInt(list[7]));
      st.setTitle(list[8]);
      st.setBuilding(list[9]);
      data.put(st.getStaffID(), st);
    }
    else{
      System.out.println("Sorry that input is invalid. Try again.");
      createRecord(data);
    }
    System.out.println("Finished.");
  }

  /** Remove a certain Affiliate given their unique ID
  * @param id int serves as the unique ID/Key that will access the HashMap
  * @param d HashMap<Integer, Affiliates> the HashMap that will be accessed
  * @return boolean T/F depending on what happens
  */
  public static boolean remove(int id, HashMap<Integer, Affiliates> d){
    if(d.containsKey(id)){
      d.remove(id, d.get(id));
      return true;
    }
    else{
      System.out.println("Affiliate with such ID doesn't exist. Sorry!");
      return false;
    }
  }

  /** Print information given an ID and HashMap
  * @param id int serves as the unique ID/Key that will access the HashMap
  * @param d HashMap<Integer, Affiliates> the HashMap that will be accessed
  * @return boolean T/F depending on what happens
  */
  public static boolean printInfo(int id, HashMap<Integer, Affiliates> d){
    if(d.containsKey(id)){
      System.out.println(d.get(id).print());
      return true;
    }
    else{
      System.out.println("Affiliate with such ID doesn't exist. Sorry!");
      return false;
    }
  }


  public static void main(String[] args) {
    BufferedReader br = null;
    PrintWriter pw = null;

    HashMap<Integer, Affiliates> database = new HashMap<Integer, Affiliates>(); //pre-created HashMap


    int currNum = 0;
    while(currNum != 7){
      try{
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello! Welcome to the University Database. The following are your options. \n1) Create a Record \n2) Print information for an Affiliate given the ID \n3) List all Affiliates in Database \n4) Delete Record given the ID \n5) Save your database to a txt file \n6) Restore your database from a file \n7) Exit");
        currNum = scan.nextInt();
        if(currNum == 1){
          createRecord(database);
        }
        if(currNum == 2){
          Scanner i = new Scanner(System.in);
          System.out.println("Input affiliate ID: ");
          printInfo(i.nextInt(), database);
        }
        if(currNum == 3){
          sort(database);
        }
        if(currNum == 4){
          Scanner scanID = new Scanner(System.in);
          System.out.println("Input affiliate ID: ");
          remove(scanID.nextInt(), database);
        }
        if(currNum == 5){
          try{
            br = new BufferedReader(new FileReader(args[0]));
            AffiliatesDriver.readFile(br);
            pw = new PrintWriter(new FileWriter(args[0], false));
            AffiliatesDriver.writeFile(pw, database);

          }
          catch(FileNotFoundException e){
            System.err.println(e.getMessage());
          }
          catch(IOException e){
            System.err.println(e.getMessage());
          }
          finally{
            if(pw != null){
              pw.close();
            }
            try{
              if(br != null){
                br.close();
              }
            }
            catch(IOException e){
              e.printStackTrace();
            }
          }
        }
        if(currNum == 6){
          database.clear();
          try{
            fillDatabase(new FileReader(args[0]), database);
          }catch(FileNotFoundException e){
            System.err.println(e.getMessage());
          }catch(IOException e){
            System.err.println(e.getMessage());
          }finally{
            System.out.println("Complete.");
          }
        }
        if(currNum == 7){
          System.out.println("Thanks for using this application!");
          break;
        }
        if(currNum > 7 || currNum < 1){
          System.out.println("Sorry please enter a number 1-7. Try again.");
        }
      }
      catch(InputMismatchException e){
        System.out.println("Sorry Please input a number 1-7. Strings are not allowed");
      }

    }
  }



}
