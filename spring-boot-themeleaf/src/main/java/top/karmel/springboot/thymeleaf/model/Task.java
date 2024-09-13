package top.karmel.springboot.thymeleaf.model;

/**
 * @ClassName Task
 * @Description TODO
 * @Author BC
 * @Date 2024/9/9 14:54
 * @Version 1.0
 */
public class Task {
    private Long id;
    private String name;
    private boolean completed;

    public Task(Long id, String name) {
        this.id = id;
        this.name = name;
        this.completed = false;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public boolean getCompleted() {
        return completed;
    }
}
