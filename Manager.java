
import java.util.ArrayList;

public class Manager {
    public ArrayList<STUDENT> student;

    public Manager() {
        this.student = new ArrayList<>();
    }

    public void addstudent(STUDENT students) {
        student.add(students);
        System.out.println("Student is added" + students.getname());
    }

    public STUDENT FindStudentByUsingRollNo(int rollNumber) {
        for (STUDENT S : student) {
            if (S.getrollnumber() == rollNumber) {
                return S;
            }
        }

        System.out.println("Roll no. not found!" + rollNumber);
        return null;
    }

    public void allstudent() {
        if (student.isEmpty())
            System.out.println("student not exist!");
        else {
            for (STUDENT s : student) {
                System.out.println(s);
            }
        }
    }

    public double allAvg(ArrayList<STUDENT> student) {
        if (student.isEmpty()) {
            System.out.println("student not exist!");
            return 0.0;
        }
        double totalavg = 0.0;
        int totalcourse = 0;
        for (STUDENT A : student) {
            for (double i : A.getcourse().values()) {
                totalavg += i;
                totalcourse++;

            }
        }
        return totalcourse > 0 ? totalavg / totalcourse : 0.0;
    }

}
