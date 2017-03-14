import java.util.Arrays;

/**
 * Created by dell on 2017/3/14.
 */
public class StudentDemo {
    public static void main(String[] args){
        Student[] student=new Student[5];
        student[0]=new Student("Bob",1500);
        student[1]=new Student("Alice",1503);
        student[2]=new Student("Mary",1501);
        student[3]=new Student("Kevin",1504);
        student[4]=new Student("Kobe",1502);

        Arrays.sort(student);
        for(int i=0;i<student.length;i++){
            student[i].writeOutput();
        }

    }
}
