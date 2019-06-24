package Container;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> queue = new LinkedList<String>();
        
        System.out.println("輸入名稱 或輸入quit結束");
        while (true) {            
            System.out.print("#");
            String input = scanner.next();
            
            if (input.equals("quit")) break;
            //offer()加入元素至佇列中
            queue.offer(input);
        }
        
        System.out.println("顯示輸入");
        String element = null;
        
        //poll()取得並移除head元素,佇列為空則傳回null
        while ((element = queue.poll()) != null) {            
            System.out.println(element + " ");
        }
        System.out.println("");
    }
}
