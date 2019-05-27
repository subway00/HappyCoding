import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        System.out.println("新增資料");
        
        a.add("banana") ;
        a.add("apple");
        a.add("orange");
        a.add("grape");
        
        System.out.printf ("印出陣列 %s%n", a.toString());
        System.out.printf("印出陣列大小 %d%n", a.size());
        
        System.out.printf("修改陣列索引資料 ,");
        int index = 0;
        a.set( index ,"lemon");
        System.out.printf("索引資料為 %s%n", a);
        
        index = 2;
        System.out.printf("取第 %d索引資料元素 %n", index);
        Object obj = a.get(index);  //Object可存入任何形態的資料。
        System.out.printf("第 %d 元素為 %s%n", index ,obj);
        
        System.out.println("查索引資料");
        obj = "watermelonmelon";
        index = a.indexOf(obj); //indexof()查詢陣列資料並傳回所在的索引值，若無則傳回-1。
        System.out.printf("obj :%s index:%d%n", obj ,index);
        
        System.out.println("----刪除索引資料----");
        index = 2 ;
        obj = a.remove(index);//刪除第x索引資料，傳回值為該資料。
        System.out.printf("刪除資料為第%d索引:%s%n", index , obj);
        System.out.printf("陣列資料為%s%n", a.toString());
        //取出0索引資料後，後面索引會往前排序。
        boolean ynSuccess;
        obj = "water";
        ynSuccess = a.remove(obj);//刪除XX資料，傳回值為boolean。
        System.out.printf("刪除資料為 %s%n", obj) ;
        System.out.println("是否成功 "+ynSuccess);
    }
}
