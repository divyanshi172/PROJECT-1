import java.util.*;

public class calcc {
    Scanner obj = new Scanner(System.in);

    public void add() {
        ArrayList<Double> num = new ArrayList<>();
        System.out.println("enter the number of student you want to add");
        double p = obj.nextDouble();

        System.out.println("enter number");
        for (int i = 0; i < p; i++) {
            double x = obj.nextDouble();
            num.add(x);
        }
        double total = 0;
        for (double s : num) {
            total += s;
        }
        System.out.println("the addition of number " + total);
    }

    public void multiply() {
        ArrayList<Double> num = new ArrayList<>();
        double p = obj.nextDouble();

        for (int i = 0; i < p; i++) {
            System.out.println("enter number" + i);
            double x = obj.nextDouble();
            num.add(x);

        }
        double into = 1;
        for (double s : num) {
            into *= s;
        }
        System.out.println("the addition of number " + into);
    }

    public void avg() {
        ArrayList<Double> num = new ArrayList<>();
        System.out.println("enter the number student you want avg");
        double p = obj.nextDouble();
        for (int i = 0; i < p; i++) {
            System.out.println("enter number" + i);
            double x = obj.nextDouble();
            num.add(x);
        }
        double l = 0;
        double count = 0;
        for (double s : num) {
            l += s;
            count++;
            System.out.println("the average is" + (l / count));
        }
    }

    public void start() {
        System.out.println("ADVANCED CALCULATOR! ");
        System.out.println("Please select an Operation");
        System.out.println("to add  numbers press 1 ");
        System.out.println("to subract  numbers press 2 ");
        System.out.println("to divide  numbers press 3 ");
        System.out.println("to multiply  numbers press 4 ");
        System.out.println("to cuberoot   press 5 ");
        System.out.println("to squareroot   press 6 ");
        System.out.println(" power of  number press 7 ");
        System.out.println("to exponentiation number press 8");
        System.out.println("to get the average press 9");
        int choice = obj.nextInt();

        switch (choice) {
            case 1:
                add();
                break;
            case 2:
                System.out.println("enter first number");
                double O = obj.nextDouble();
                System.out.println("enter second number");
                double P = obj.nextDouble();
                System.out.println("the subtration of two numbers is" + (O - P));
                break;
            case 3:
                System.out.println("enter first number");
                double Q = obj.nextDouble();
                System.out.println("enter second number");
                double R = obj.nextDouble();
                System.out.println("the divide of two numbers is" + (Q / R));
                break;
            case 4:
                multiply();
                break;
            case 5:
                System.out.println("enter  number");
                double V = obj.nextDouble();
                System.out.println("the cuberoot  is" + Math.cbrt(V));
                break;
            case 6:
                System.out.println("enter  number");
                double U = obj.nextDouble();
                System.out.println("the squareroot  is" + Math.sqrt(U));
                break;
            case 7:
                System.out.println("enter the base number");
                double W = obj.nextDouble();
                System.out.println("enter exponent");
                double X = obj.nextDouble();
                System.out.println("the exponent  is" + Math.pow(W, X));
                break;
            case 8:
                avg();
                break;
            default:
                System.out.println("please enter a value upto 8");
        }

        obj.close();

    }
}