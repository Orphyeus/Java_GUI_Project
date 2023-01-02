package komandax;

import static komandax.UniSystem.Leclist;

public class Lecture {
    public static int lectureId=0;
    public int id, hour;
    public String name;
    public String prof;
    public String lang;
    public String faculty;
    public String term;

    public Lecture(String name, String prof, String lang, String faculty, int hour, String term) {
        
        this.id= Lecture.lectureId;
        Lecture.lectureId++;
        this.name= name;
        this.prof= prof;
        this.lang= lang;
        this.faculty= faculty;
        this.term= term;
        this.hour= hour;

    }
       public static Lecture SerchById(int id){
        for (Lecture l : UniSystem.Leclist) {
            if(l.id==id)
            {
                return l;
            }
        } 
        return null;
    }
 
    public static void addTestLecture() {
        Lecture np = new Lecture("Calculus-I", "Nazım Agahev", "Muh", "English", 5, "Fall Term");
        Leclist.add(np);
    }
}
