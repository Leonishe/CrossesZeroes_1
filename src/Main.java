import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Players players = new Players();
        Units units = new Units();
        players.Names();
        players.NameOut();
        units.defaultUnit();
        units.newUnitOut();
        for (int i=1;i<10;i++){
            if (i%2==0){
              players.Names();
            }
        }

    }

}
