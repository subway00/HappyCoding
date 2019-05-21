
public class Rpg {

    public static void main(String[] args) {
        SwordsMan swordsMan = new SwordsMan();
        demoSwordsMan();
        demoMagician();
        showBlood(swordsMan);
    }

    static void demoSwordsMan() {
        SwordsMan swordsMan = new SwordsMan();
        swordsMan.setName("Justin");
        swordsMan.setlevel(1);
        swordsMan.setBlood(200);
        System.out.printf("劍士: (%s , %d , %d ) %n", swordsMan.getName(), swordsMan.getLevel(), swordsMan.getBlood());
        drawfight(swordsMan);
        drawfight(swordsMan);
    }

    static void showBlood(SwordsMan swordsMan) {
        System.out.printf(" %s 血量 %d%n", swordsMan.getName(), swordsMan.getBlood());
    }

    static void demoMagician() {
        Magician magician = new Magician();
    }
    static void  drawfight (Role role) {
        role.fight();
    }
}
