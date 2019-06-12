package Thread;
import static java.lang.System.out;
public class TortoiseHareRace {
    public static void main(String[] args) {
        boolean [] flags = { true, false };
        int totalStep = 10;
        int tortoiseStep = 0;
        int hareStep = 0;
        out.println("龜兔賽跑開始...");
        while (tortoiseStep < totalStep && hareStep < totalStep) {
            tortoiseStep++;
            out.printf("烏龜跑了 %d步...%n",tortoiseStep);
            boolean isHareSleep = flags[((int) (Math.random() *10)) %2];    //random() 0.0~1.0 , Math.random()*10 %2 傳回的值不是0就是1
            if (isHareSleep) {                                              //random() 的傳回值是double 固須(int)強制值轉換
                out.println("兔子睡著了 zzzz");
            } else{
                hareStep += 2;
                out.printf("兔子跑了 %d步...%n", hareStep);
            }
        }
    }
    
}
