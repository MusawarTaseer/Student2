/**
 * This class +++ Insert class description here +++
 *
 * @author Musawar Taseer
 */
public class StudentList {
    public static void main(String[] args)
    {
       Student2 [] studentList = new Student[1];//change size before running
       Student2 s1 = new Student2();
       s1.setName("Liz Dancy");
       studentList[0]=s1;
       //fill in 4 student names before running
       for(Student2 s: studentList)
       {
           System.out.println(s.getName());
       }
        
    }
}
