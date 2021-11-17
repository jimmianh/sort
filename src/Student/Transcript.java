package Student;

import java.util.ArrayList;
import java.util.Comparator;

public class Transcript extends Student implements Comparable<Transcript> {
    private int point;
    private int subjectId;


    public Transcript(int studentID, String name, String birthDay, String gender, int classRoomId, int subjectId, int point) {
        super(studentID, name, birthDay, gender, classRoomId);
        this.subjectId = subjectId;
        this.point = point;
    }

    public Transcript() {

    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
//
//    public int compareTo(Transcript compareTranscript) {
//
//        int comparePoint = ((Transcript) compareTranscript).getPoint();
//
//        //ascending order
//        return this.point - comparePoint;
//
//        //descending order
//        //return compareQuantity - this.quantity;
//
//    }

//    public static Comparator<Transcript> TranscriptPointComparator = new Comparator<Transcript>() {
//
//        public int compare(Transcript transcript1, Transcript transcript2) {
//
//            Integer transcriptPoint1 = transcript1.getPoint();
//            Integer transcriptPoint2 = transcript2.getPoint();
//
//            //ascending order
//            return transcriptPoint1.compareTo(transcriptPoint2);
//
//            //descending order
//            //return fruitName2.compareTo(fruitName1);
//        }
//    };

    @Override
    public String toString() {
        return getStudentID() + ","
                + getName() + ","
                + getBirthDay() + ","
                + getGender() + ","
                + getClassRoomId() + ","
                + subjectId + ","
                + getPoint();
    }


    @Override
    public int compareTo(Transcript compareTranscript) {
        int comparePoint = compareTranscript.getPoint();
        //ascending order
        return this.point - comparePoint;
    }
}
// gán điểm với obj