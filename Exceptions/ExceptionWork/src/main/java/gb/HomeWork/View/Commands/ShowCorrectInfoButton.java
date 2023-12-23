package gb.HomeWork.View.Commands;

import gb.HomeWork.View.ConsoleUI;

public class ShowCorrectInfoButton implements ICommand{

    private ConsoleUI consoleUI;
    private String menuItem;

    public ShowCorrectInfoButton(ConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
        menuItem = "Показать принятые данные";
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
