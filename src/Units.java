import java.util.Scanner;


public class Units extends Players{
    //Создаю массив 3*3 как поле для игры в крестики нолики

    String[][] units = new String[3][3];

    //Записываю в ячейки массива дефолтные значения " " для наглядности


    public void defaultUnit(){

       for (int i=0;i<3;i++){
           for (int j=0;j<3;j++){
               units[i][j] = " ";
           }
       }

    }

    //Вывожу значения массива
    public void newUnitOut(){
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print("[ "+ units[i][j] + " ]");
            }
            System.out.println();
        }
    }
    //Выбираем какое поле массива нужно заполнить
    public int getStarted(String player){
        int item = 0;
            System.out.println(player + ", enter the box number, please!");
            Scanner newItem = new Scanner(System.in);
            item = Integer.parseInt(newItem.next());//принимаем значение
                          if((item<=0)|(item>9))     //проверяем подходит ли нам принятое значение
                            do {                    //если нет, то повторяем ввод
                             System.out.println(item + "th box:");
                             System.out.println("Enter correct box number please!");
                             item = Integer.parseInt(newItem.next());
                            }  while ((item<=0)|(item>9));




         return(item);                              //возвращаем полученное значение
    }

    // Проверяем полученную таблицу на "конец игры"
    public int checkWinner(){
        int winner =0;

            if (units[1][1]!=" ")
                if ((units[0][0]==units[1][1])&(units[1][1]==units[2][2])|          //проверка в диагоналях
                    (units[0][2]==units[1][1])&(units[1][1]==units[2][0]))
                    winner=1;


        if (winner == 0)
        for (int i=0;i<3;i++){

            if (units[i][0]!=" ")

                if ((units[i][0]==units[i][1])&(units[i][0]==units[i][2])){           //проверка в строках
                    winner=1;
                    break;
                }

            if(units[0][i]!=" ")

                if((units[0][i]==units[1][i])&(units[0][i]==units[2][i])){            //проверка в столбцах
                    winner=1;
                    break;
                }
        }

        return(winner);    //Если условие выполнится, то возвращаем 1, если не выполнится то 0
    }

    //устанавливаем крестик или нолик в зависимости от входящих значений
    public void startNewUnit(String player){

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

    public void startNewUnit1( String player){
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
