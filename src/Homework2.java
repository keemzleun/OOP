package src;
import java.util.Scanner;

class Student {
    private int studentNumber;
    private String name;
    private String major;
    private String phoneNumber;

    // Constructor
    public Student(int studentNumber, String name, String major, String phoneNumber) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.major = major;
        this.phoneNumber = phoneNumber;
    }

    // Getter and Setter methods
    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Helper method to format phone number
    public String formatPhoneNumber() {
        // Assuming phoneNumber is a 10-digit number
        String formattedPhoneNumber = phoneNumber.substring(0, 3) + "-" +
                phoneNumber.substring(3, 7) + "-" +
                phoneNumber.substring(7);
        return formattedPhoneNumber;
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store student objects
        Student[] students = new Student[3];

        // Input student information
        for (int i = 0; i < 3; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            int studentNumber = scanner.nextInt();
            String name = scanner.next();
            String major = scanner.next();
            String phoneNumber = scanner.next();

            // Create a Student object and store it in the array
            students[i] = new Student(studentNumber, name, major, phoneNumber);
        }

        // Output student information
        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        for (int i = 0; i < 3; i++) {
            System.out.println("첫번째 학생: " + students[i].getStudentNumber() + " " + students[i].getName() + " " +
                    students[i].getMajor() + " " + students[i].formatPhoneNumber());
        }

        scanner.close();
    }
}
