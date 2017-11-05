package datastructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Students implements Comparable {
    private int id;
    private String fname;
    private double cgpa;

    public Students(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Object o) {
        Students s = (Students) o;
        if (cgpa == s.cgpa) {
            if (fname.equals(s.fname)) {
                return id - s.id;
            } else {
                return s.fname.compareTo(fname);
            }
        } else {
            if (cgpa - s.cgpa > 0) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}

public class JavaSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Students> studentsList = new ArrayList<>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Students st = new Students(id, fname, cgpa);
            studentsList.add(st);

            testCases--;
        }
        Collections.sort(studentsList);
        Collections.reverse(studentsList);
        for (Students st : studentsList) {
            System.out.println(st.getFname());
        }
    }
}