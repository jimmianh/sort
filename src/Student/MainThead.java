package Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


import static jdk.nashorn.internal.objects.NativeArray.sort;

public class MainThead {

    public static void main(String[] args) throws IOException, NoSuchFieldException, IllegalAccessException {
        Transcript transcript = new Transcript();

        List<Transcript> transcriptsArray = new ArrayList<Transcript>();

        ArrayList<Integer> classRoomIdsArray = new ArrayList<>();
        ArrayList<Integer> subjectIdsArray = new ArrayList<>();
        FileWriter fw = new FileWriter("E:\\Student\\src\\Student\\output.txt");


        classRoomIdsArray.add(101);
        classRoomIdsArray.add(102);
        subjectIdsArray.add(1);
        subjectIdsArray.add(2);

        try {
            // Đọc file txt
            File file = new File("E:\\Student\\src\\Student\\svbangdiem.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            Integer index = 0;
            // Vòng lặp đọc nội dung theo dòng
            while ((line = br.readLine()) != null) {
                try {
                    String[] infoArray = line.split(",");
                    // Tạo Object từ 1 dòng
                    Transcript record = new Transcript(
                            Integer.parseInt(infoArray[0]),
                            infoArray[1],
                            infoArray[2],
                            infoArray[3],
                            Integer.parseInt(infoArray[4]),
                            Integer.parseInt(infoArray[5]),
                            Integer.parseInt(infoArray[6])
                    );

//                    transcriptsArray.add(record);
                    if(classRoomIdsArray.contains(Integer.parseInt(infoArray[4])) && subjectIdsArray.contains(Integer.parseInt(infoArray[5]))){
                        transcriptsArray.add(record);
                    }

                    // Kiểm tra điều kiện lớp học và môn học có nằm trong phần đã khai báo
                } finally {

                }
            }
            fr.close();
            Collections.sort(transcriptsArray);
//            Arrays.sort(transcriptsArray);
            System.out.println(transcriptsArray.size());
            for(Transcript temp: transcriptsArray){
                System.out.println(temp.getName() + "-" + temp.getPoint());
                fw.write(temp.toString() + "\n");
            }
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    void quickSort (List<Transcript> transcriptsArray[], int left, int right) {
//        int i, j, x;
//        x = a[(left + right) / 2];
//        i = left; j = right;
//        do {
//            while (a[i] < x) i++;
//            while (a[j] > x) j--;
//            if (i <= j) { swap(a, i, j); i++; j--; }
//        } while (i <= j);
//        if (left < j) quickSort(a, left, j);
//        if(i < right) quickSort(a, i, right);
//    }


//    void binaryInsertionSort ( List transcriptsArray, int n) {
//        int left, right, mid, x;
//        for (int i = 1; i < n; i++) {
//            x = transcriptsArray[i]; left = 0; right = i - 1;
//            while (left <= right) {
//                mid = (left + right) / 2;
//                if (x < transcriptsArray[mid]) right = mid - 1;
//                else left = mid + 1;
//            }
//            for (int j = i - 1; j >= left; j--) transcriptsArray[j + 1] = transcriptsArray[j];
//            transcriptsArray[left] = x;
//        }
//    }
}















//
//    pass wf medlink
//        Medlink@6868
//