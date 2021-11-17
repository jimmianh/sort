package Student;

public class Student {
    private int studentID;
    private String name;
    private String birthDay;
    private String gender;
    private int classRoomId;

    public String getStudentID() {
        return String.valueOf(studentID);
    }

    public String getName() {
        return name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getGender() {
        return gender;
    }

    public String getClassRoomId() {
        return String.valueOf(classRoomId);
    }

    public Student() {
    }

    public Student(int studentID, String name, String birthDay, String gender, int classRoomId) {
        this.studentID = studentID;
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
        this.classRoomId = classRoomId;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setClassRoom(int classRoomId) {
        this.classRoomId = classRoomId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", name='" + name + '\'' +
                ", birthDay=" + birthDay +
                ", gender='" + gender + '\'' +
                ", classRoom='" + classRoomId + '\'' +
                '}';
    }
}
