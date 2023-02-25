
import java.io.File;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static String getValue() {
        System.out.println(
                "1-предыдущая задача\n2-следующая задача\n3-Добавить задачу\n4-Удалить задачу\n5-update tasks list deadline\n" +
                        "6-прочитать список задач из файла\n7-записать список задач в файл\n8-вывести на экран список задач");
        System.out.print("Ваш выбор?: ");
        return sc.next();
    }
    public static void main(String[] args) {
        int currentTask = 0;
        while (true) {
            if (TaskList.getTasks().size() > 0) {
               Task.print(TaskList.getTaskById());
            }
            switch (getValue()) {
                case ("1"):
                    currentTask--;
                    if (currentTask < 0) {
                        currentTask = TaskList.getTasks().size() - 1;
                    }
                    break;
                case ("2"):
                    currentTask++;
                    if (currentTask > TaskList.getTasks().size() - 1) {
                        currentTask = 0;
                    }
                    break;
                case ("3"):
                    AddTask.addTask();
                    currentTask = 0;
                    break;
                case ("4"):
                    DeleteTask.deleteTask();
                    currentTask = 0;
                    break;
                case ("5"):
                    TaskList.updateByDeadline();
                    currentTask = 0;
                    break;
                case ("6"):
                    ReaderService.getChoice();
                    break;
                case ("7"):
                    WriteService.getChoice();
                    break;
                case ("8"):
                    for (Task task:TaskList.getTasks()) {
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
