import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Array needs to be made before object to use in obj
      Double[] testscoresone = {50.0,100.0,98.0};
        Student stud = new Student("Leon","Hunter",testscoresone);

        //making sure this shiz works right. ps it do
//        //works
//        System.out.println(stud.getNumberOfExamsTaken());
//
//       // works
//        stud.getExamScores();
//
//       // works
//        stud.addExamScores(20.0);
//        System.out.println(stud.getNumberOfExamsTaken());
//
//      //  changes last index should read change exam 3 to 69.0
//        stud.setExamScores(2,69.0);
//        stud.getExamScores();
//
//       //works
//        System.out.println(stud.getAverageExamScore());

        //Stud1 specs
        //System.out.println(stud.toString());
        Double[] testScores2 = {100.0,100.0,100.0};
        Student stud2 = new Student("Zach","Rivera",testScores2);

        Double[] testscores3 = {50.0,42.0,69.0};
        Student stud3 = new Student("Jimmy","Who",testscores3);

        //Array of Student objects
        Student[] students = {stud,stud2};

        ClassRoom classRoomone = new ClassRoom(students);

        //Why you no work
       classRoomone.getStudents();


        //Works
        //System.out.println(classRoomone.getAverageExamScores());

        //why you no work
        System.out.println(classRoomone.getStudentsByScore());

//        classRoomone.addStudent(stud3);
//        System.out.println(classRoomone.);;












        //==============================================================
    }
}
