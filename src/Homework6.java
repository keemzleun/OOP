package src;

// Course 클래스 정의
class Course {
    protected String code;
    protected String name;

    // Course 생성자
    public Course(String code, String name) {
        this.code = code;
        this.name = name;
    }

    // toString 메서드 오버라이딩
    @Override
    public String toString() {
        return "Code: " + code + ", Name: " + name;
    }
}

// OnlineCourse 클래스 정의 (Course 클래스를 상속)
class OnlineCourse extends Course {
    // OnlineCourse 생성자
    public OnlineCourse(String code, String name) {
        super(code, name);
    }

    // toString 메서드 오버라이딩
    @Override
    public String toString() {
        return super.toString() + ", Type: Online";
    }
}

// OfflineCourse 클래스 정의 (Course 클래스를 상속)
class OfflineCourse extends Course {
    // OfflineCourse 생성자
    public OfflineCourse(String code, String name) {
        super(code, name);
    }

    // toString 메서드 오버라이딩
    @Override
    public String toString() {
        return super.toString() + ", Type: Offline";
    }
}

// Homework6 클래스 정의
public class Homework6 {
    public static void main(String[] args) {
        OfflineCourse course1 = new OfflineCourse("HAEA9201", "Object Oriented Programming");
        OnlineCourse course2 = new OnlineCourse("HAFL0012", "C Programming 1");

        // toString 메서드 호출하여 출력
        System.out.println(course1);
        System.out.println(course2);
    }
}

