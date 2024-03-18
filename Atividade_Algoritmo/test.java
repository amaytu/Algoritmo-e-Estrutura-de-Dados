
public class test {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        // Adicionando tarefas
        taskManager.addTask(new Task("Implementar feature X"));
        taskManager.addTask(new Task("Corrigir bug Y"));
        taskManager.addTask(new Task("Realizar revisao de codigo"));

        // Visualizando próxima tarefa
        Task nextTask = taskManager.getNewTask();
        System.out.println("Proxima tarefa" + nextTask.descricao());

        // Completando a próxima tarefa
        taskManager.completeTask();
        System.out.println("tarefa concluida.");

        // Visualizando próxima tarefa após a conclusão
        nextTask = taskManager.getNewTask();
        if (nextTask != null) {
            System.out.println("Proxima tarefa " + nextTask.descricao());
        } else {
            System.out.println("Nao a mais tarefas pendentes");
        }
    }
}

