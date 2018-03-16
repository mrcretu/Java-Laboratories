import java.util.ArrayList;
import java.util.Arrays;

public class Student extends Person{

    private ArrayList<Project> pref_array;

    Student(){
    }

    Student(String name, String email){
        setName(name);
        setEmail(email);
    }

    void setPreferences(Project ... args){
        pref_array = new ArrayList<>();
        for(int i = 0; i < args.length; i++){
            pref_array.add(args[i]);
        }
    }

    /* override the equals method form the Object class for Student class */
    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;

        if(this == null) return false;

        if(this.getClass() != obj.getClass()) return false;

        Student other = (Student) obj;

        if(this.name == null){
            if(other.name == null)
                return false;
        }
        else if(!this.name.equals(other.name)) {
            return false;
        }

        if(this.email == null){
            if(other.email == null)
                return false;
        }
        else if(!this.email.equals(other.email)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Student{ " +
                "pref_array=" + pref_array +
                ",name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Project getProject(int index){
        return pref_array.get(index);
    }
    public int getPref_array_size(){
        return pref_array.size();
    }
}
