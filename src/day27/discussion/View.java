
package day27.discussion;

import java.util.List;

//user interaction
import java.util.ArrayList;
public class View {
    public void displayAllStudents(){
        Repository repo = new Repository ();
        
        List<Student> studentList = repo.getAllStudents();
        
        // Iterate and dislay
        for (Student stud : studentList){
            System.out.println(stud);
        }
    }
}
