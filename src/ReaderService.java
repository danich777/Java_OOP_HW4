import java.io.File;
import java.util.Scanner;

public class ReaderService {
    public static String path = "Calendar.csv";

    public static void getChoice() {
                    ReaderFromCSV();
    }



    public static void ReaderFromCSV() {
        ReaderFromCSV imp = new ReaderFromCSV(new File(path));
    }



}
