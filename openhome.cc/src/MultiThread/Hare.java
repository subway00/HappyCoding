package MultiThread;

public class Hare implements Runnable {

    private boolean[] flags = {true, false};
    private int totalStep;
    private int step;

    public Hare(int totalStep) {
        this.totalStep = totalStep;
    }

    @Override
    public void run() {
        while (step < totalStep) {
            boolean isHareStep = flags[((int) (Math.random() * 10)) % 2];     //Math.random()產生0.0~1.0間的值，//*10 產生0.0~10.0間的值
            //%2 取0.0~10.0間的餘數，即1 or 2.
            if (isHareStep) {
                System.out.println("兔子睡著了");
            } else {
                step += 2;
                System.out.printf("兔子跑了 %d 步...%n", step);
            }
        }
    }
}
