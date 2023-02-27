
import java.io.File;

public class WriteService {
    public static String path = "TaskList2";

    public static void WriteToCSV() {
        path += ".csv";
        WriteToCSV exp = new WriteToCSV(new File(path));
    }


}
