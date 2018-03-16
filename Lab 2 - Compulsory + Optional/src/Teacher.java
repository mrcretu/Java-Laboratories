import java.util.ArrayList;
import java.util.Arrays;

public class Teacher extends Person {

    private ArrayList<Student> pref_array;
    Teacher(){

    }

    Teacher(String name, String email){
        setName(name);
        setEmail(email);
    }

    Project createProject(String name, int capacity){
        return new Project(name,capacity);
    }

    void setPreferences(Student ... args){
        pref_array = new ArrayList<>();
        for(int i = 0; i < args.length; i++){
            pref_array.add(args[i]);
        }

    }

    /* override the equals method form the Object class for Teacher class */
    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;

        if(this == null) return false;

        if(this.getClass() != obj.getClass()) return false;

        Teacher other = (Teacher) obj;

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
        return "Teacher{" +
                "pref_array=" + pref_array +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public ArrayList getPref_array(){
        return pref_array;
    }
}
