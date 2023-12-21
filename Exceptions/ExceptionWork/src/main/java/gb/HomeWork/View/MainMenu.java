package gb.HomeWork.View;

import gb.HomeWork.View.Commands.*;
import java.util.ArrayList;
import java.util.List;

public class MainMenu {
    final private List<ICommand> commandList;
    protected MainMenu(ConsoleUI consoleUI){
        commandList = new ArrayList<>();
        commandList.add(new AddButton(consoleUI));
        commandList.add(new ShowInfoButton(consoleUI));
        commandList.add(new ChangeButton(consoleUI));
        commandList.add(new SafeButton(consoleUI));
        commandList.add(new FinishButton(consoleUI));
    }
    protected String showMenu(){
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= commandList.size(); i++) {
            sb.append(i);
            sb.append( ". " );
            sb.append( commandList.get( i-1 ).getMenuItem());
            sb.append("\n");
        }
        return sb.toString();
    }
    protected void execute(int choice){
        ICommand cmd = commandList.get(choice);
        cmd.execute();
    }
}
