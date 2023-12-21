package gb.HomeWork.View.Commands;

import gb.HomeWork.View.ConsoleUI;

public class AddButton implements ICommand{

    private ConsoleUI consoleUI;
    private String menuItem;

    public AddButton(ConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
        menuItem = "Добавить человека";
    }
    @Override
    public void execute() {
        consoleUI.getConsoleUI().addPerson();
    }
    @Override
    public String getMenuItem() {
        return menuItem;
    }
}
