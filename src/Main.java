import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Players players = new Players();  //Создаю игрочков

        players.Names();                  //Даю им имена

        Units units =new Units();         //Создаю массив 3*3 для игры

        units.defaultUnit();              //Заполняю массив пробелами
        units.newUnitOut();               //Вывожу массив для наглядности

        //т.к. в массив можно ввести только 9 значений
        for (int i=1;i<10;i++){    //введём эти 9 значений, "начинаем играть"
            if (i%2==0){           //проверяем на чётность/нечётность  чтоб определить какой игрок ходит

                units.startNewUnit(players.player2);//заполняем крестиками
                units.newUnitOut();                   //выводим на экран
            }
            else {
                units.startNewUnit1(players.player1);//заполняем ноликами
                units.newUnitOut();                    //выводим на экран
            }
                if (i>=5){                            //когда i становится равно 5 начинаем проверять поля на наличие
                    int game = units.checkWinner();   //победителя
                    if (game==1){                     //если вернулась единица, то
                        if (i%2==0){                  //кто последний ставил значение
                            System.out.println(players.player2 + " WON!"); //выиграл игрок 2
                            break;                                         //и прерываем цикл игры
                        }
                        else {
                            System.out.println(players.player1 + " WON!"); //выиграл игрок 1
                            break;                                         //и прерываем цикл игры
                        }

                    }
                    else
                        if (game==0){                 //а если вернулся нолик
                        continue;                     //то продолжаем играть
                    }

                }

        }

    }

}
