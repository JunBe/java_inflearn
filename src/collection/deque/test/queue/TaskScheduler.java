package collection.deque.test.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TaskScheduler {
    Queue<Task> queue = new ArrayDeque<>();
    public void addTask(Task task) {
        queue.offer(task);
    }

    public int getRemainingTask() {
        return queue.size();
    }

    public void processNextTask() {
        Task task = queue.poll();
        if (task != null) {
            task.execute();
        }
    }
}
