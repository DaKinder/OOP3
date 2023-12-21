package gb.HomeWork.View.Commands;

import gb.HomeWork.View.ConsoleUI;

public class ShowInfoButton implements ICommand{

    private ConsoleUI consoleUI;
    private String menuItem;

    public ShowInfoButton(ConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
        menuItem = "Показать список";
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
