package game;

public class Main {
    public static void main(String[] args) {
        Player1 player1 = new Player1("John", "Laser", 120);
        Player2 player2 = new Player2("John", "Laser", 150, true);

        System.out.println(player1.getName());
        System.out.println(player1.getWeapon());
        System.out.println(player1.getHealth());

        player1.damageGun1();
        player1.damageGun1();
        player1.medKit();
        player1.medKit();

    }
}
