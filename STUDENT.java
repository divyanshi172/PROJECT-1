import java.util.*;

public class STUDENT {
    private int rollNumber;
    private String name;
    private int age;
    private Map<String, Double> courses = new HashMap<>();

    public STUDENT(int rollNumber, String name, int age) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.courses = new HashMap<>();
    }

    public void addcourse(String coursename, Double score) {
        courses.put(coursename, score);
    }

    public int getrollnumber() {
        return rollNumber;
    }

    public String getname() {
        return name;
    }

    public int getage() {
        return age;
    }

    public Map<String, Double> getcourse() {
        return courses;
    }

    public void remove(String coursename) {
        if (courses.containsKey(coursename)) {
            courses.remove(coursename);
            System.out.println("The cousrse is removed!" + coursename);
        } else {
            System.out.println("NOT FOUND PLEASE TRY AGAIN!" + coursename);
        }
    }

    public void update(String coursename, Double score) {
        if (courses.containsKey(coursename)) {
            courses.put(coursename, score);
        } else {
            System.out.println("something went wrong!");
        }
    }

    public Double getscore(String coursename) {
        if (courses.containsKey(coursename))
            return courses.get(coursename);

        else {
            System.out.println("KEY NOT FOUND!");
            return 0.0;
        }
    }

    public Double averagescore() {
        double total = 0;
        for (double score : courses.values()) {
            total += score;
        }
        return courses.size() > 0 ? total / courses.size() : 0.0;
    }

    @Override
    public String toString() {

        return " Roll-number-" + rollNumber + "\n Name-" + name + "\n Age-" + age + "\nCourses-" + courses;
    }
}