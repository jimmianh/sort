package Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


import static jdk.nashorn.internal.objects.NativeArray.sort;

public class MainThead {

    private Transcript transcript = new Transcript();
    List<Transcript> transcriptsArray = new ArrayList<Transcript>();

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

                    if (classRoomIdsArray.contains(Integer.parseInt(infoArray[4])) && subjectIdsArray.contains(Integer.parseInt(infoArray[5]))) {
                        transcriptsArray.add(record);
                    }
//

                    // Kiểm tra điều kiện lớp học và môn học có nằm trong phần đã khai báo
                } finally {

                }
            }
            fr.close();


            quickSort(transcript, , 2 );
            System.out.println(transcriptsArray.size());
            for (Transcript temp : transcriptsArray) {
                System.out.println(temp.getName() + "-" + temp.getPoint());
                fw.write(temp.toString() + "\n");
            }
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // hàm mới
//    public void quickSortPrint(Transcript transcript,int[] x) {
//        x = new int[transcript.getPoint()];
//        printArray(x);
//
//        int left = 0;
//        int right = x.length - 1;
//
//        quickSort(x, left, right);
//        printArray(x);
//    }

    public static void quickSort(int[], int left, int right) {
        if (arr == null || transcriptsArray.length == 0)
            return;

        if (left >= right)
            return;

        int middle = left + (right - left) / 2;
        int pivot = arr[middle];
        int i = left, j = right;

        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        if (left < j)
            quickSort(arr, left, j);

        if (right > i)
            quickSort(arr, i, right);
    }

//    public static void printArray(int[] arr) {
//        for(int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//        System.out.println();
//    }

    }
