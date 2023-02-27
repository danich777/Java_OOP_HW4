
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static String getValue() {
        System.out.println(
                "1-Добавить задачу\n" +
                        "2-Удалить задачу\n" +
                        "3-прочитать список задач из файла\n" +
                        "4-записать список задач в файл\n" +
                        "5-вывести на экран список задач");
        System.out.print("Ваш выбор?: ");
        return sc.next();
    }
    public static void main(String[] args) {
//        int currentTask = 0;
        while (true) {
//            if (Calendar.getTasks().size() > 0) {
//               Task.print(Calendar.getTasks().get(currentTask));
//            }
            switch (getValue()) {

                case ("1"):
                    AddTask.addTask();
//                    currentTask = 0;
                    break;
                case ("2"):
                    Calendar.deleteTask();
//                    currentTask = 0;
                    break;
                case ("3"):
                    ReaderService.getChoice();
                    break;
                case ("4"):
                    WriteService.WriteToCSV();
                    break;
                case ("5"):
                    for (Task task: Calendar.getTasks()) {
                        Task.print(task);
                    }
                    break;
                default:
                    System.out.println("Нет такого пункта меню");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
            }
        }
    }
}
