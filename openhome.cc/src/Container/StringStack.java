package Container;

import java.util.*;

public class StringStack {
    private LinkedList<String> linkedList;
    
    public StringStack() {
        linkedList = new LinkedList<String>();
    }
    public void push(String name) {
        //將元素加入串列前端
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
