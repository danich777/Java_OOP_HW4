
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calendar {
    private static List<Task> tasks = new ArrayList<>();

    public static List<Task> getTasks() {
        return tasks;
    }

    public static void add(Task task) {
        tasks.add(task);
    }

    public static void addAll(List<Task> tasks) {
        tasks.addAll(tasks);
    }


    public static void deleteTask() {
        Scanner sc = new Scanner(System.in);
//        boolean repeatInput = true;
        System.out.println("Введите id задачи, которую хотите удалить: ");
        int id = sc.nextInt();
        tasks.remove(id-1);
        }
        public String toString () {
            StringBuilder str = new StringBuilder();
            for (Task element : tasks) {
                str.append(element + "\n");
            }
            return str.toString();

        }

}