public class student {
    public void studDet() {
        String name = "Prasad";
        String prg = "BCA";
        int sem = 4;
        String[] course = {"DevOps" , 
         "Machine Learning", "C#"};
        System.out.println("Student Name = " + name);
        System.out.println("Student Program = " + prg);
        System.out.println("Student Semester = " + sem);
        System.out.println("Student registered courses are:");
        for (int i = 0; i < course.length; i++) {
            System.out.println(course[i]);
        }
    }
}



