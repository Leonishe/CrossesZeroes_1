import java.util.Scanner;

public class Players {
    public String player1;
    public String player2;

    public String getPlayer1(){
     return player1;
    }
    public void setPlayer1(String player1){
        this.player1 = player1;
    }

    public String getPlayer2(){
        return player2;
    }
    public void setPlayer2(String player2){
        this.player2 = player2;
    }
    //Даю имена игрочкам
    public void Names(){
        System.out.println("Player 1 name: ");
        Scanner name1 = new Scanner(System.in);
        setPlayer1(name1.next());
        System.out.println("Player 2 name: ");
        Scanner name2 = new Scanner(System.in);
        setPlayer2(name2.next());
    }
    //вывожу имена игрочков
    public void NameOut(){
        System.out.println("Player1 name: " + player1);
        System.out.println("Player2 name: " + player2);

    }
}
