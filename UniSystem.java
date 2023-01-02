package komandax;

import java.util.ArrayList;

public class UniSystem {

    
    public static ArrayList<Lecture> Leclist = new ArrayList<>();
    public static ArrayList<Student> slist = new ArrayList<>();
    public static Student activePersonel= null;
    public static void addTestPersonel() {
        Student np = new Student("Fatih", "1453");
        slist.add(np);
    }

    public static void main(String args[]) {
        Student.addTestStudent();
        Lecture.addTestLecture();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new LogIn().setVisible(true);
            }
        });
    }
}
