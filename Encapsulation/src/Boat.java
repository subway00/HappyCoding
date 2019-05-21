
public class Boat implements Swimmer{
    protected  String name ;
    
    public Boat (String name) {
        this.name = name ;
    }
    @Override
    public void swim() {
        System.out.printf(" 船在水裡 %s 航行\n", name);
    }
}
