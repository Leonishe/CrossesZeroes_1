import java.util.Scanner;

public class Units {
    String[][] units = new String[3][3];
    public String unit;

    public String getUnit(){
        return unit;
    }

    public void setUnit(String unit){
        if (unit != "X" | unit != "0")
        this.unit = unit;
        else return;
    }

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

                System.out.println(player + "Введите номер поля");
                Scanner newItem = new Scanner(System.in);
                item = Integer.parseInt(newItem.next());

        return(item);
    }

    public int checkWinner(){
        int i =0;
            if(
               ((units[1][1] == units[1][2]) & (units[1][1] == units[1][3]) & (units[1][2] == units[1][3]))|
               ((units[2][1] == units[2][2]) & (units[2][1] == units[2][3]) & (units[2][2] == units[2][3]))|
               ((units[3][1] == units[3][2]) & (units[3][1] == units[3][3]) & (units[3][2] == units[3][3]))|

               ((units[1][1] == units[2][1]) & (units[1][1] == units[3][1]) & (units[2][1] == units[3][1]))|
               ((units[1][2] == units[2][2]) & (units[1][2] == units[3][2]) & (units[2][2] == units[3][2]))|
               ((units[1][3] == units[2][3]) & (units[1][3] == units[3][3]) & (units[3][2] == units[3][3]))|

               ((units[1][1] == units[2][2]) & (units[1][1] == units[3][3]) & (units[2][2] == units[3][3]))|
               ((units[1][3] == units[2][2]) & (units[1][3] == units[3][1]) & (units[2][2] == units[3][1]))

               ){
                 i=1;
            }
        return(i);
    }

    public void startNewUnit(){
        for (int i=1; i<10; i++)
            if (i%2==0) {
                String player = Players
                switch (getStarted()){
            }


        }
    }

}
