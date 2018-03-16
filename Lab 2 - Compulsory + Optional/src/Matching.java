import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.ArrayList;

public class Matching {

    private ArrayList<Student> studs;
    private ArrayList<Project> projects;


    /**
     * default contructor
     * initialize studs and projects arrays
     */
    Matching(){
        studs = new ArrayList<>();
        projects = new ArrayList<>();
    }

    /**
     * @param student represent the student for which we allocate the project
     * @param project represent the project allocated for the student
     */
    public void addMatch(Student student, Project project){
        addStudent(student);
        addProiect(project);
    }

    private void addStudent(Student student) {
        this.studs.add(student);
    }

    private void addProiect(Project project) {
        this.projects.add(project);
    }

    @Override
    public String toString() {
        String string = new String();
        string += "Matching: \n";
        for(int i=0; i < studs.size(); i++){
            string += studs.get(i).name;
            string += " : ";
            string += projects.get(i).name;
            string += "\n";
        }
        return string;
    }
}
