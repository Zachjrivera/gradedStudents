import java.lang.reflect.Array;
import java.util.*;

public class ClassRoom {

   private Student [] students;
   private Student student;
     private int classsize;

    public ClassRoom(int classsize) {
        this.classsize = classsize;
    }

    public ClassRoom(Student[] students) {
        this.students = students;
    }

    public ClassRoom(){
        this(30);
    }

    //This wont work
    public void getStudents() {
        System.out.println(students.toString());
    }



    public double getAverageExamScores(){
        double sum = 0;
        double averageScore = 0;
        if (!(students.length == 0)) {
            for (Student student : students) {
                sum += student.getAverageExamScore();
            }
            averageScore = sum / students.length;
        }
        return averageScore;
    }



    public void addStudent(Student student){
 for (int index = 0; index < students.length; index++) {
           //because array is autofilled with nulls
            if (students[index] == null) {
                students[index] = student;
            }
        }
    }

    public  void removeStudent(String firstName,String lastName){
        for (int index = 0; index < students.length; index++){

            if(!students[index].getFirstName().equalsIgnoreCase(firstName) && !students[index].getLastName().equalsIgnoreCase(lastName)){

                //this will set the index it stops on to null so it is no longer there its the only way i could work it
                students[index] = null;
                Arrays.sort(students);
                //Array sort is a thing that can sort you arrays to  put null at bottom of list
              //not sure how works need a comparator or something
            }
        }
    }


    public  Student[] getStudentsByScore(){
        Arrays.sort(students, Collections.reverseOrder());
        return this.students;
   }

               //lettergrade,Student array of grades
    private TreeMap<Character, ArrayList<Student>> gradebook = new TreeMap<Character,ArrayList<Student>>();

//    public void getGradebook(){
//
//        for (int index = 0; index <students.length; index++){
//            Character letterGrade;
//
//            double tenthpercentile = .9;
//            double percentile11thThru29th =
//
//
//        }
//
//    }

}


