package Container;

import java.util.Scanner;
//queue 佇列先進先出
public class StringQueueDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringQueue queue = new StringQueue();
        
        System.out.println("輸入名稱    或輸入quit結束");
        
        while (true) {            
            System.out.print("#");
            String input = scanner.next();
            
            if(input.equals("quit")) break;
            
            queue.put(input);
        }
        System.out.println("顯示輸入");
        while (! queue.isEmpty()) {            
            System.out.println(queue.get() + " ");
        }
        System.out.println(queue);
    }
}
