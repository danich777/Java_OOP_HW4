
import java.time.LocalDate;
import java.time.Period;

public class Task {
    private static int idCount = 0;
    private final LocalDate createDate;
    private final LocalDate deadline;
    private final String author;
    private String description;
    private TaskPriority taskPriority;
    private int id;

    public Task(LocalDate createDate, LocalDate deadline, String author, String description, TaskPriority taskPriority) {
        this.createDate = createDate;
        this.deadline = deadline;
        this.author = author;
        this.description = description;
        this.taskPriority = taskPriority;
        this.id = ++idCount;
    }


    public LocalDate getCreateDate() {
        return createDate;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }
    public TaskPriority getTaskPriority() {
        return taskPriority;
    }

    @Override
    public String toString() {
        Period p = Period.between(LocalDate.now(), deadline);
        return "Задача{" +
                "id=" + id +
                ", лет до дедлайна =" + p.getYears() + "месяцев: " + p.getMonths() + " дней: " + p.getDays() +
                ", дата создания: " + createDate +
                ", дедлайн = " + deadline +
                ", Ответсвенный = '" + author + "\'" +
                ", Описание = ' " + description + "\'" +
                ", Приоритет = '" + taskPriority + "\'" +
                "}";
    }

    public static void print(Task task) {

        System.out.println("------------------------------------------------------");
        System.out.printf("ID задачи : \t\t\t%d\n", task.getId());
        System.out.printf("Дней до дедлайна: \t\t%s\n",
                task.getDeadline().toEpochDay() - LocalDate.now().toEpochDay());
        System.out.printf("Дедлайн: \t\t\t\t%s\n", task.getDeadline());
        System.out.printf("Дата создания: \t\t\t%s\n", task.getCreateDate());
        System.out.printf("Ответсвенный: \t\t\t%s\n", task.getAuthor());
        System.out.printf("Описание: \t\t\t\t%s\n", task.getDescription());
        System.out.printf("Приоритет: \t\t\t\t%s\n", task.getTaskPriority());
        System.out.println("-------------------------------------------------------");
    }
}
