

import java.io.File;
import java.util.Scanner;

public class ReaderService {
    static Scanner sc = new Scanner(System.in);
    public static String path = "TaskList";

    public static void getChoice() {
        boolean repeatInput = true;
        while (repeatInput) {
            System.out.println("Read from: 2-CSV");
            switch (sc.next()) {
                case ("2") -> {
                    ReaderFromCSV();
                    repeatInput = false;
                }

                default -> System.out.println("read ERROR");
            }
        }
    }



    public static void ReaderFromCSV() {
        path += ".csv";
        ReaderFromCSV imp = new ReaderFromCSV(new File(path));
    }



}
