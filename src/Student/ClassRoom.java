package Student;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;

public class ClassRoom {
    private int classId;
    private String name;

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClassRoom(int classId, String name) {
        this.classId = classId;
        this.name = name;
    }

    public ClassRoom() {
    }
}
