import java.util.PriorityQueue;

class Task {
    private String description;
    private boolean completed;

    public Task(String description) {
        this.description = description;
        this.completed = false;
    }

    public String descricao() {
        return description;
    }

    public boolean completo() {
        return completed;
    }

    public void completar() {
        completed = true;
    }
}

class TaskManager {
    private PriorityQueue<Task> tasks;

    public TaskManager() {
        this.tasks = new PriorityQueue<>((t1, t2) -> {
            if (t1.completo() && !t2.completo()) {
                return 1;
            } else if (!t1.completo() && t2.completo()) {
                return -1;
            } else {
                return 0;
            }
        });
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void completeTask() {
        Task nextTask = tasks.poll();
        if (nextTask != null) {
            nextTask.completar();
        }
    }

    public Task getNewTask() {
        return tasks.peek();
    }
}
