package gb.HomeWork.View.Commands;

import gb.HomeWork.View.ConsoleUI;

public class ChangeButton implements ICommand{

    private ConsoleUI consoleUI;
    private String menuItem;

    public ChangeButton(ConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
        menuItem = "Изменить данные";
    }
    @Override
    public void execute() {
        consoleUI.getConsoleUI().changeInput();
    }
    @Override
    public String getMenuItem() {
        return menuItem;
    }
}
