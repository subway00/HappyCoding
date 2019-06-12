package Container;

import java.util.*;

public class StringStack {
    private LinkedList<String> linkedList;
    
    public StringStack() {
        linkedList = new LinkedList<String>();
    }
    public void push(String name) {
        linkedList.addFirst(name);
    }
    public String top() {
        return linkedList.getFirst();
    }
    public String pop() {
        return linkedList.removeFirst();
    }
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }
}
