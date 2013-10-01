import java.util.Scanner;

public class Units extends Players{
    String[][] units = new String[3][3];
    public String unit;




    public void defaultUnit(){

       for (int i=0;i<3;i++){
           for (int j=0;j<3;j++){
               units[i][j] = " ";
           }
       }

    }

    public void newUnitOut(){
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print("[ "+ units[i][j] + " ]");
            }
            System.out.println();
        }
    }

    public int getStarted(String player){
        int item = 0;
              System.out.println(player + ", введите номер поля");
              Scanner newItem = new Scanner(System.in);
              item = Integer.parseInt(newItem.next());
                    if((item<0)|(item>9))
                            do {
                             System.out.println(item + "-й бокс:");
                             System.out.println("Введите номер ещё раз:");
                             item = Integer.parseInt(newItem.next());
                    }  while ((item<0)|(item>9));





        return(item);
    }

    public int checkWinner(){
        int i =0;
            if(
               ((units[0][0] == units[0][1]) & (units[0][0] == units[0][2]) & (units[0][1] == units[0][2]))|
               ((units[1][0] == units[1][1]) & (units[1][0] == units[1][2]) & (units[1][1] == units[1][2]))|
               ((units[2][0] == units[2][1]) & (units[2][0] == units[2][2]) & (units[2][1] == units[2][2]))|

               ((units[0][0] == units[1][0]) & (units[0][0] == units[2][0]) & (units[1][0] == units[2][0]))|
               ((units[0][1] == units[1][1]) & (units[0][1] == units[2][1]) & (units[1][1] == units[2][1]))|
               ((units[0][2] == units[1][2]) & (units[0][2] == units[2][2]) & (units[1][2] == units[2][2]))|

               ((units[0][0] == units[1][1]) & (units[1][1] == units[2][2]) & (units[0][0] == units[2][2]))|
               ((units[0][2] == units[1][1]) & (units[0][2] == units[2][0]) & (units[1][1] == units[2][0]))

               ){
                 i=1;
            }
        return(i);
    }

    public void startNewUnit(int i, String player){


                switch ( getStarted(player)){
                    case 1: units[0][0]="0";
                        break;
                    case 2: units[0][1]="0";
                        break;
                    case 3: units[0][2]="0";
                        break;
                    case 4: units[1][0]="0";
                        break;
                    case 5: units[1][1]="0";
                        break;
                    case 6: units[1][2]="0";
                        break;
                    case 7: units[2][0]="0";
                        break;
                    case 8: units[2][1]="0";
                        break;
                    case 9: units[2][2]="0";
                        break;
                }
    }
    public void startNewUnit1(int i, String player){
               switch (getStarted(player)){
                   case 1: units[0][0]="X";
                        break;
                   case 2: units[0][1]="X";
                        break;
                   case 3: units[0][2]="X";
                        break;
                   case 4: units[1][0]="X";
                        break;
                   case 5: units[1][1]="X";
                        break;
                   case 6: units[1][2]="X";
                        break;
                   case 7: units[2][0]="X";
                        break;
                   case 8: units[2][1]="X";
                        break;
                   case 9: units[2][2]="X";
                        break;
               }

    }

}
