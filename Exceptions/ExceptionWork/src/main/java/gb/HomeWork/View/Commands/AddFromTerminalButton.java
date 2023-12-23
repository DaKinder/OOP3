package gb.HomeWork.View.Commands;

import gb.HomeWork.View.ConsoleUI;

public class AddFromTerminalButton implements ICommand{

    private ConsoleUI consoleUI;
    private String menuItem;

    public AddFromTerminalButton(ConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
        menuItem = "Ввести данные с терминала";
    }
    @Override
    public void execute() {
        consoleUI.getConsoleUI().fileRead();
    }
    @Override
    public String getMenuItem() {
        return menuItem;
    }
}
