
import java.util.*;

public class project1 {
    public static int choice;

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Manager manage = new Manager();

        while (true) {
            System.out.println("click 1-to add a student");
            System.out.println("click 2-to add a course");
            System.err.println("click 3- to view all student");
            System.out.println("click 4- to view a students course and marks");
            System.out.println("click 5- to calculate avg marks of all students");
            System.out.println(" click 6- to use calc operations ");
            System.out.println(" click 7-to manage one student");
            System.out.println("click 8- to exit");
            boolean validinput = false;
            int choice = 0;
            while (!validinput) {
                System.out.println("Enter your choice");
                try {
                    choice = obj.nextInt();
                    validinput = true;
                } catch (Exception e) {
                    System.out.println("please enter a valid integer");
                    obj.next();

                }
                switch (choice) {
                    case 1:
                        System.out.print("Enter the number of student's you want to add :");
                        int numberOfStudent = obj.nextInt();
                        for (int i = 1; i <= numberOfStudent; i++) {
                            System.out.println("Enter the data of your student :" + i);
                            System.out.print("Enter Student RollNumber : ");
                            int rollNumber = obj.nextInt();
                            obj.nextLine(); // Consume newline
                            System.out.print("Enter Name: ");
                            String name = obj.nextLine();
                            System.out.print("Enter Age: ");
                            int age = obj.nextInt();
                            STUDENT student = new STUDENT(rollNumber, name, age);
                            manage.addstudent(student);
                            ;

                        }
                        System.out.println("Student added successfully.");

                        for (int i = 0; i < 20; i++) {
                            System.out.print("---");
                        }
                        break;

                    case 2:
                        System.out.print("Enter Student RollNumber : ");
                        int studentRollNumber = obj.nextInt();
                        STUDENT existingStudent = manage.FindStudentByUsingRollNo(studentRollNumber);
                        if (existingStudent != null) {
                            obj.nextLine(); // Consume newline
                            System.out.print("Enter Course Name: ");
                            String courseName = obj.nextLine();
                            System.out.print("Enter Score : ");
                            double score = obj.nextDouble();
                            existingStudent.addcourse(courseName, null);
                            System.out.println("Course added successfully.");
                            for (int i = 0; i < 20; i++) {
                                System.out.print("---");
                            }
                        }
                        break;

                    case 3:
                        manage.allstudent();
                        break;

                    case 4:
                        System.out.print("Enter Student RollNumber : ");
                        int viewRollNumber = obj.nextInt();
                        STUDENT studentToView = manage.FindStudentByUsingRollNo(viewRollNumber);
                        if (studentToView != null) {
                            System.out.println("Courses and Score for " + studentToView.getname() + ":");
                            System.out.println(studentToView.getcourse());
                            System.out.println("Average Score: " + studentToView.averagescore());
                        }
                        for (int i = 0; i < 20; i++) {
                            System.out.print("----");
                        }
                        break;

                    case 5:
                        double averageMarks = manage.allAvg(manage.student);
                        System.out.println("Average Marks for All Students: " + averageMarks);
                        for (int i = 0; i < 20; i++) {
                            System.out.print("---");
                        }
                        break;
                    case 6:
                        calcc obj1 = new calcc();
                        obj1.start();
                        break;
                    case 7:
                        System.out.println("enter student rollnumber");
                        int viewRollNumber1 = obj.nextInt();
                        STUDENT studenttoview = manage.FindStudentByUsingRollNo(viewRollNumber1);
                        if (studenttoview != null) {
                            System.out.println("enter 1 view a stuent's course and marks");
                            System.out.println("enter 2 to  update score");
                            System.out.println("enter 3 to remove course");
                            System.out.println("enter 4 to togetcourse");
                            System.out.println("enter  your choice");
                            int z = obj.nextInt();
                            switch (z) {
                                case 1:
                                    System.out.println("courses and scorefor" + studenttoview.getname());
                                    System.out.println(studenttoview.getcourse());
                                    System.out.println("average score" + studenttoview.averagescore());
                                    break;
                                case 2:
                                    obj.nextLine();
                                    System.out.println("enter course name");
                                    String coursename = obj.nextLine();
                                    System.out.println("enter score");
                                    double score = obj.nextDouble();
                                    studenttoview.update(coursename, score);
                                    System.out.println("course update successfull");
                                    break;
                                case 3:
                                    obj.nextLine();
                                    System.out.println("write course name");
                                    String coursename1 = obj.nextLine();
                                    studenttoview.remove(coursename1);
                                    System.out.println("course removed successfully");
                                    break;
                                case 4:
                                    String course = obj.nextLine();
                                    studenttoview.getcourse();
                                    break;
                                default:
                                    System.out.println("not found!");
                                    break;
                            }
                        }

                        break;

                    case 8:
                        System.out.println("Exiting. Thank you!");
                        obj.close();
                        for (int i = 0; i < 20; i++) {
                            System.out.print("-------");

                        }
                        return;

                    default:
                        System.out.println("Invalid choice. Try again.");
                        for (int i = 0; i < 20; i++) {
                            System.out.print("-------");
                        }
                }
            }
        }

    }
}
