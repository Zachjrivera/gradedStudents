import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Student   {

    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;


    public Student(String firstName, String lastName, Double [] testScores ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<Double>();

        //This will take all the testscores and stores them as a List so they can be added to ArrayList
        this.examScores.addAll(Arrays.asList(testScores));

    }

    //Name getters and setters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



   //Exam methods


    public double getNumberOfExamsTaken(){
        return examScores.size();
    }

    public void addExamScores(double score) {
        examScores.add(score);
    }

    public void setExamScores(int examnum,double score){

       // this will add to end of array
        examScores.set(examnum ,score);
    }

    //This wont print out all of the array scores
    public void getExamScores() {
        String rando = " " ;

        for (int index = 0; index < examScores.size(); index++) {

            rando ="Exam " +(index + 1) + " "+ examScores.get(index);
            System.out.println(rando);
        }


    }

    public Double getAverageExamScore(){
        double average = 0;
        double sum = 0;
        if (!examScores.isEmpty()) {
            for (double score : examScores) {
                sum += score;
            }
            average = sum / examScores.size();
        }
        return average;
    }



    @Override
    public String toString() {
        return "Student Name: " +
                  firstName + " " + lastName + '\n' + "Average score: " + getAverageExamScore() +
                "\n ExamScores: " + examScores +
                "\n}";
    }


    //========================================================
}
