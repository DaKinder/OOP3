package gb.HomeWork.Presenter;

import gb.HomeWork.Model.Inspector;
import gb.HomeWork.Model.Printer;
import gb.HomeWork.Model.Validator;
import gb.HomeWork.View.ConsoleUI;
import gb.HomeWork.Model.InputReader;
import java.util.ArrayList;

public class Hub {
    Printer printer;
    private ArrayList<String[]> userInput;
    private ArrayList<String[]> correctObjectsFromInspector;
    private ArrayList<String[]> incorrectObjectsFromInspector;
    ConsoleUI consoleUI;
    Inspector inspector;
    Validator validator;
    InputReader inputReader;

    public ArrayList<String[]> getIncorrectData (){return incorrectObjectsFromInspector;}

    public Hub(ConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
        inputReader = new InputReader();
        this.userInput = new ArrayList<>();
    }

    public void readConsole() {
        inputReader.readInput();
        if(inputReader.getListSize() == 0) System.out.println("\nВы ничего не добавили\n");
        else userInput = inputReader.getList();
        inspect();
    }

    public void readFile() {
        //TO DO
    }

    private void inspect(){
        inspector = new Inspector(userInput);
        incorrectObjectsFromInspector = inspector.getIncorrectDataList();
        correctObjectsFromInspector = inspector.getCorrectDataList();
    }

    private void validate(){
        validator = new Validator(correctObjectsFromInspector);
    }


    public void print() {
        printer = new Printer(correctObjectsFromInspector, incorrectObjectsFromInspector);
    }
}

