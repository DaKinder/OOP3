package gb.HomeWork.View;

import java.util.ArrayList;

public interface UI {
    public void start();
    public void consoleRead();
    public void fileRead();
    public ArrayList printUserList();
    String changeInput();
    public String saveToFile();
    public void closeProgram();
}
