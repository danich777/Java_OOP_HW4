

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.Scanner;

public class ReaderFromCSV {

    public ReaderFromCSV(File fName) {
        try (Scanner reader = new Scanner(new BufferedReader(new FileReader(fName)))) {

            while (reader.hasNext()) {
                String str = reader.nextLine();
                if (!str.equals("\n")) {
                    String[] stringArray = str.split(";");
                    LocalDate createDate = LocalDate.parse(stringArray[0]);
                    LocalDate deadline = LocalDate.parse(stringArray[1]);
                    String author = stringArray[2];
                    String description = stringArray[3];
                    String priority = stringArray[4];
                    TaskPriority taskPriority = TaskPriority.valueOf(priority);
                    Calendar.add(new Task(createDate,
                            deadline,
                            author,
                            description,
                            taskPriority));
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
