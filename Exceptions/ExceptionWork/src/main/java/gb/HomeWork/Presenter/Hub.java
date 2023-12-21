package gb.HomeWork.Presenter;

import gb.HomeWork.Model.Inspector;
import gb.HomeWork.Model.Validator;
import gb.HomeWork.View.ConsoleUI;
import gb.HomeWork.Model.InputReader;
import java.util.ArrayList;

public class Hub {
    private ArrayList<String[]> objectsFromUser;
    private ArrayList<String[]> correctObjectsFromInspector;
    private ArrayList<String[]> incorrectObjectsFromInspector;
    ConsoleUI consoleUI;
    Inspector inspector;
    InputReader inputReader;

    public Hub(ConsoleUI consoleUI) {
        this.consoleUI = consoleUI;

        inputReader = new InputReader();
        this.objectsFromUser = new ArrayList<>();
    }

    public void addPerson() {
        inputReader.readInput();
        objectsFromUser = inputReader.getList();
        inspector= new Inspector(objectsFromUser);
        correctObjectsFromInspector = inspector.getCorrectDataList();
        incorrectObjectsFromInspector = inspector.getIncorrectDataList();
        Validator validator = new Validator(correctObjectsFromInspector);
        validator.validateAll();

//        for (String[] object : objects) {
//            System.out.println(Arrays.toString(object));
//        }
//        System.out.println();
    }
}

