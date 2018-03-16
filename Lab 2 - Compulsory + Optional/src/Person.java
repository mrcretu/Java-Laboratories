public class Person {

    protected String name;
    protected String email;
    /* attributes */

    /* constructor implicit */
    Person(){
        this.name = "\0";
        this.email = "\0";
    }

    /* setters generated with  IDE features (Alt + Insert)*/

    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    /* getters generated with  IDE features (Alt + Insert)*/

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }

    /* overidded toString method() */

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


}
