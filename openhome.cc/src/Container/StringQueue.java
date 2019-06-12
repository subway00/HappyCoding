package Container;

import java.util.*;

public class StringQueue {
    private LinkedList<String> linkedList;
    
    public StringQueue() {
        linkedList = new LinkedList<>();
    }
    public void put(String name) {
        linkedList.addFirst(name);
    }
    public String get() {
        return linkedList.removeLast();
    }
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }
}
