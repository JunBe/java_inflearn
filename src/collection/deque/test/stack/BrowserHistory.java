package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    Deque<String> stack = new ArrayDeque<>();

    public void visitPage(String url) {
        if (url != null) {
            stack.push(url);
        }
        System.out.println("방문: " + url);
    }

    public String goBack() {
        if (!stack.isEmpty()) {
            System.out.println("뒤로 가기: "+stack.peek());
            return stack.pop();
        }
        return null;
    }
}
