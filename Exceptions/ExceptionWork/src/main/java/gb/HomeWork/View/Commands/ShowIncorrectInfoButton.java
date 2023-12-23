package gb.HomeWork.View.Commands;

import gb.HomeWork.View.ConsoleUI;

public class ShowIncorrectInfoButton implements ICommand{

    private ConsoleUI consoleUI;
    private String menuItem;

    public ShowIncorrectInfoButton(ConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
        menuItem = "Показать неверные данные";
    }
    @Override
    public void execute() {
        consoleUI.getConsoleUI().printUserList();
    }
    @Override
    public String getMenuItem() {
        return menuItem;
    }
}
