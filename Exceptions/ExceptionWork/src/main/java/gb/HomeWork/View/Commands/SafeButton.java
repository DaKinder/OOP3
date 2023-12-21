package gb.HomeWork.View.Commands;

import gb.HomeWork.View.ConsoleUI;

public class SafeButton implements ICommand{

    private ConsoleUI consoleUI;
    private String menuItem;

    public SafeButton(ConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
        menuItem = "Записать данные в файл";
    }
    @Override
    public void execute() {
        consoleUI.getConsoleUI().saveToFile();
    }
    @Override
    public String getMenuItem() {
        return menuItem;
    }
}
