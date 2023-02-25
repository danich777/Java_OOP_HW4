
import java.io.File;
import java.util.Scanner;

public class WriteService {
    public static String path = "TaskList2";
    static Scanner sc = new Scanner(System.in);

    public static void getChoice() {

        while (true) {
            System.out.println("Записать в файл? (y/n)");
            switch (sc.next()) {
                case ("y") -> {
                    WriteToCSV();
                    break;
                }
                case ("n") -> {
                    break;
                }
                default -> System.out.println("write ERROR");
            }
        }
    }


    public static void WriteToCSV() {
        path += ".csv";
        WriteToCSV exp = new WriteToCSV(new File(path));
    }


}
