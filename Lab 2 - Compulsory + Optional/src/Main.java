public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("S1", "s1@info.uaic.ro");
        Student s2 = new Student("S2", "s2@info.uaic.ro");
        Student s3 = new Student("S3", "s3@info.uaic.ro");
        Student s4 = new Student("S4", "s4@info.uaic.ro");
        Student s5 = new Student("S1","s1@info.uaic.ro");

        /* se instantiaza 4 obiecte de tip Student */

        Teacher t1 = new Teacher("T1", "t1@info.uaic.ro");
        Teacher t2 = new Teacher("T2", "t2@info.uaic.ro");
        Teacher t3 = new Teacher("T3", "t3@info.uaic.ro");

        /* se instantiaza 3 obiecte de tip Profesor*/

        Project p1 = t1.createProject("P1", 2); //capacity of the project is 2
        Project p2 = t2.createProject("P2", 1); //capacity of the project is 1
        Project p3 = t3.createProject("P3", 1); //capacity of the project is 1

        /* cu ajutorul motodei CreateProject fiecare profesor ofera 3 proiecte cu capacitati diferite */

        s1.setPreferences(p1, p2, p3);
        s2.setPreferences(p1, p3, p2);
        s3.setPreferences(p1);
        s4.setPreferences(p3, p2, p1);

        /* studentul 1 isi seteaza preferintele referitoare la proiect */

        t1.setPreferences(s3, s1, s2, s4);
        t2.setPreferences(s1, s2, s3,s4);
        t3.setPreferences(s4, s3, s1, s2);

        /* profesorul 1 isi seteaza preferintele referitoare la studenti */

        Problem problem = new Problem();



        problem.setStudents(s1, s2, s3, s4, s4, s1, s1, s2, s2, s3, s4); //for verifying the equals method
        problem.setTeachers(t1, t2, t3, t1, t1, t2, t2, t3, t3); //for verifying the equals method
        System.out.println(problem);
        //System.out.println("Participants: " + problem.getParticipants() + '\n');
        //problem.SolveProblem();
        //System.out.println(match);


    }
}
