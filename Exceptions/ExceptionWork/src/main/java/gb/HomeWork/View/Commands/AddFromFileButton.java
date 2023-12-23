package gb.HomeWork.View.Commands;

import gb.HomeWork.View.ConsoleUI;

public class AddFromFileButton implements ICommand{

    private ConsoleUI consoleUI;
    private String menuItem;

    public AddFromFileButton(ConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
        menuItem = "Прочитать данные из файла";
    }
    @Override
    public void execute() {
        consoleUI.getConsoleUI().consoleRead();
    }
    @Override
    public String getMenuItem() {
        return menuItem;
    }
}
