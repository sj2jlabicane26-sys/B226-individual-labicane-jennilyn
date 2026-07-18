package day27.discussion;

// Model
public class Student {

    
    //encapsulation
    
    
    private int id;
    private String name;
    private int age;
    private String course;
    private String yearLevel;

    public Student(int id, String name, int age, String course, String yearLevel) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.yearLevel = yearLevel;
    }
    
    

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setYearLevel(String yearLevel) {
        this.yearLevel = yearLevel;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public String getYearLevel() {
        return yearLevel;
    }

    @Override
    public String toString() {
        return id + " - " + name + " (" + course + ", " + yearLevel + ")";
    }
}
