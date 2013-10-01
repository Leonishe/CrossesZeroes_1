import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Players players = new Players();
        players.Names();
        players.NameOut();
        Units units =new Units();
        units.defaultUnit();
        units.newUnitOut();

        for (int i=1;i<10;i++){
            if (i%2==0){

                units.startNewUnit(i,players.player2);
                units.newUnitOut();
            }
            else {
                units.startNewUnit1(i,players.player1);
                units.newUnitOut();
            }
                if (i>=5){
                    int game = units.checkWinner();
                    if (game==1){
                        if (i%2==0){
                            System.out.println(players.player2 + " WON!");
                            break;
                        }
                        else {
                            System.out.println(players.player1 + " WON!");
                            break;
                        }

                    }
                    else
                        if (game==0){
                        continue;
                    }

                }

        }

    }

}
