package lab3;

import java.util.HashMap;
import java.util.Map;
public class AnniversaryModel {
    private int year = 1;
    private static final Map<Integer, String> map = new  HashMap();
    
    public AnniversaryModel() {
        map.put(1, "Papper");
        map.put(2, "Gold");
        map.put(3, "Diamond");
        
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }
    public String getMaterial() {
        return map.get(year);
    }
}
