package gb.HomeWork.View.Commands;

import gb.HomeWork.View.ConsoleUI;

public class FinishButton implements ICommand{

    private ConsoleUI consoleUI;
    private String menuItem;

    public FinishButton(ConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
        menuItem = "Закрыть программу";
    }
    @Override
    public void execute() {
        consoleUI.getConsoleUI().closeProgram(  );
    }
    @Override
    public String getMenuItem() {return menuItem;}
}
