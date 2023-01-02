package komandax;

import static komandax.UniSystem.slist;

public class Student {

    public static int studentId=0;
    public int id;
    public String nameSurname;
    public String password;

    public Student(String nameSurname, String password) {
        
        this.id= Student.studentId;
        Student.studentId++;
        this.nameSurname= nameSurname;
        this.password= password;
    }
    
    public static Student SignIn(String userName, String password){
        for (Student s : UniSystem.slist) {
            if(s.nameSurname.compareTo(userName)==0
            && s.password.compareTo(password)==0)
            {
                return s;
            }
        } 
        return null;
    }
       public static Student SerchById(int id){
        for (Student s : UniSystem.slist) {
            if(s.id==id)
            {
                return s;
            }
        } 
        return null;
    }
 
    public static void addTestStudent() {
        Student np = new Student("Fatih", "1453");
        slist.add(np);
    }
}
