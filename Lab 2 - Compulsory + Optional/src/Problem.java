import java.util.ArrayList;
import java.util.Arrays;

/* PARTEA OPTIONALA SE GASESTE AICI IN CLASA PROBLEM */

public class Problem{

    private ArrayList<Student> array_stud; //Array of type Student for keeping the Students and their array of projects preferences
    private ArrayList<Teacher> array_teacher; //Array of type Teacher for keeping the Students and their array of students preferences
    // Array for keeping the Participants
    private ArrayList<String> array_person;

    Problem(){
        array_stud = new ArrayList<>();
        array_teacher = new ArrayList<>();
        array_person = new ArrayList<>();
    }


    /**
     * @param args are a list of Students and their project preferences that must be added to the problem
     * @ok is a variable that indicates if the arg Student is valid for adding to the stud Array
     * @method equals is overriden in the Student class
     */
    void setStudents(Student...args){
        int ok;
        array_stud.add(args[0]);

        for(int i = 1; i < args.length;i++){
            ok = 1;
            //
            for(int j = 0; j < array_stud.size(); j++){
                if(array_stud.get(j).equals(args[i])) ok = 0;
            }
            //
            if(ok == 1) array_stud.add(args[i]);
        }
    }

    /**
     * @param args are a list of Teachers and their student preferences that must be added to the problem
     * @var ok is a variable that indicates if the arg Student is valid for adding to the stud Array or not
     * @method equals is overriden in the Teacher class
     */
    void setTeachers(Teacher...args){
        int ok;
        array_teacher.add(args[0]);

        for(int i = 1; i < args.length;i++){
            ok = 1;
            //
            for(int j = 0; j < array_teacher.size(); j++){
                if(array_teacher.get(j).equals(args[i])) ok = 0;
            }
            //
            if(ok == 1) array_teacher.add(args[i]);
        }
    }

    @Override
    public String toString() {
        String string="Studenti: \n";
        for (int i = 0; i < array_stud.size(); i++) {
            string+=(array_stud.get(i)).toString();
            string+="\n";

        }
        string += "\nProfesori: \n";
        for(int i = 0; i < array_teacher.size(); i++) {
            string += array_teacher.get(i).toString();
            string += "\n";
        }
        return string;
    }

    /**
     * @return array_person with all the participants
     */
    public ArrayList getParticipants(){
        for(int i = 0; i < array_stud.size(); i++){
            array_person.add(array_stud.get(i).name);
        }
        for(int i = 0; i < array_teacher.size(); i++){
            array_person.add(array_teacher.get(i).name);
        }
        return array_person;
    }

    /**
     * It looks for each student, subject to the preferences and capacities, and allocate a project for each student.
     */
    public void SolveProblem(){
        Matching match = new Matching();
        for(int i = 0; i < array_stud.size(); i++) {
            //System.out.println("Student: " + i);
            for(int j = 0; j < array_stud.get(i).getPref_array_size(); j++){

                //System.out.println(array_stud.get(i).getProject(j).name + ' ' + array_stud.get(i).getProject(j).capacity);
                if(array_stud.get(i).getProject(j).capacity > 0) {
                    //System.out.println(array_stud.get(i).name + " : " + array_stud.get(i).getProject(j).name);
                    match.addMatch( array_stud.get(i), array_stud.get(i).getProject(j) );
                    array_stud.get(i).getProject(j).capacity--;
                    j = array_stud.get(i).getPref_array_size();
                }
            }
        }
        System.out.println(match);
    }
}
