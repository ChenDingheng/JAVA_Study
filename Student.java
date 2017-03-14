/**
 * Created by dell on 2017/3/14.
 */
public class Student extends Person implements Comparable {

    private int studentNumber;
    public Student(){
        super();
        studentNumber=0;
    }

    public Student(String initialName, int initialStudentNumber){
        super(initialName);
        this.studentNumber=initialStudentNumber;
    }

    public void reset(String newName, int newStudentNumber){
        setName(newName);
        this.studentNumber=newStudentNumber;
    }

    public int getStudentNumber(){
        return studentNumber;
    }

    public void setStudentNumber(int newStudentNumber){
        this.studentNumber=newStudentNumber;
    }

    @Override
    public void writeOutput() {
        System.out.println("Name: "+getName());
        System.out.println("Student Number: "+studentNumber);
    }

    public boolean equals(Student otherStudent){
        return this.hasSameName(otherStudent)&&(this.studentNumber==otherStudent.studentNumber);
    }

    /**
     * sort by name
     * */
    /**
    @Override
    public int compareTo(Object o) {
        if((o!=null)&&(o instanceof Student)){
            Student otherStudent=(Student)o;
            return this.getName().compareTo(otherStudent.getName());
        }
        return -1;
    }
    */
    @Override
    public int compareTo(Object o) {
        if((o!=null)&&(o instanceof Student)){
            Student otherStudent=(Student)o;
            if(this.studentNumber>otherStudent.studentNumber)
                return 1;
            else if(this.studentNumber==otherStudent.studentNumber)
                return 0;
        }
        return -1;
    }
}
