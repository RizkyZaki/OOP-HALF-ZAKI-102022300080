import java.time.LocalDate;

public class Task {
    // Atribut-atribut private
    private String title;
    private String priority;
    private final LocalDate dueDate;
    private String status;

    // Constructor
    public Task(String title, String priority, LocalDate dueDate, String status) {
        this.title = title;
        this.priority = priority;
        this.dueDate = dueDate;
        this.status = status; 
    }

    // Getter untuk title
    public String getTitle() {
        return title;
    }

    // Getter untuk priority
    public String getPriority() {
        return priority;
    }

    // Getter untuk dueDate
    public LocalDate getDueDate() {
        return dueDate;
    }

    // Getter untuk status
    public String getStatus() {
        return status;
    }

    // Setter untuk status
    public void setStatus(String status) {
        this.status = status;
    }
}