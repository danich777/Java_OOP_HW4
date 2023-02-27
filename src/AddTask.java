
import java.time.LocalDate;
import java.util.Scanner;

public class AddTask {
    static Scanner sc = new Scanner(System.in);

    public static void addTask() {
        String author;
        String description = new String();
        String priority = new String();
        LocalDate deadline = LocalDate.now();
        System.out.println("Введите день дедлайна (YYYY-MM-DD):");
        deadline = LocalDate.parse(sc.nextLine());
        System.out.println("Введите ответственного: ");
        author = sc.nextLine();
        System.out.println("Input description of the task");
        description = sc.nextLine();
        System.out.println("Input priority of the task");
        priority = sc.nextLine();
        TaskPriority taskPriority = TaskPriority.valueOf(priority);
        Calendar.add(new Task(LocalDate.now(), deadline, author, description, taskPriority));
    }

}
