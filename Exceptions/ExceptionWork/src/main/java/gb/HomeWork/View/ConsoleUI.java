package gb.HomeWork.View;

import gb.HomeWork.Static.Colors;
import gb.HomeWork.Static.Notice;
import gb.HomeWork.Presenter.Hub;
import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleUI implements UI{
    private Scanner scanner;
//    private String userInput;
    private int userChoice;
    private Hub hub;
    private MainMenu mainMenu;
    private boolean process = true;
//    public String getInput(){return userInput;}
    public ConsoleUI getConsoleUI(){ return this;}

    // Конструктор пользовательского интерфейса
    public ConsoleUI(){
        scanner = new Scanner( System.in );
        hub = new Hub( this );
        mainMenu = new MainMenu(this);
    }

    @Override
    // Процесс работы программы
    public void start() {
        Notice.introduction();
        while (process) {
            System.out.println(mainMenu.showMenu());
            Notice.makeChoice();
            try {
                userChoice = Integer.parseInt( scanner.nextLine() );
                mainMenu.execute( userChoice -1 );
            } catch (NumberFormatException e) {
                Notice.tryInputNumber();
            } catch (IndexOutOfBoundsException e){
                Notice.tryAgain();
            }
        }
    }

    // TO DO
    @Override
    public void consoleRead() {
       hub.readConsole();
    }

    @Override
    public void fileRead() {
        hub.readFile();
    }

    @Override
    public ArrayList printUserList() {
        hub.print();
        System.out.println("данные получены");
        return null;
    }
    @Override
    public String changeInput() {
        System.out.println("Вы выбрали третий пункт");
        return null;}
    @Override
    public String saveToFile() {
        System.out.println("Вы выбрали четвертый пункт");
        return null;
    }
    @Override
    public void closeProgram() {
        System.out.println( Colors.YELLOW + "\nРабота завершена, всего доброго" + Colors.RESET);
        process = false;
    }



}
