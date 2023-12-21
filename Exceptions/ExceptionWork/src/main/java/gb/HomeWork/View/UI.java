package gb.HomeWork.View;

import java.util.ArrayList;

public interface UI {
    public void start();
    public void addPerson();
    public ArrayList printUserList();
    String changeInput();
    public String saveToFile();
    public void closeProgram();
}
