package gb.HomeWork.Model;

import gb.HomeWork.Static.Notice;
import java.util.ArrayList;
import java.util.Scanner;

public class InputReader {

    final private ArrayList<String[]> rawObjects;
    private final Scanner scanner;
    final int value = 6;
    boolean work;
    String[] stringsArr;
    public InputReader(){
        scanner = new Scanner(System.in);
        rawObjects = new ArrayList<>();
        stringsArr = new String[value];
        work = true;
    }

    public ArrayList<String[]> getList(){return rawObjects;}

    // Метод считывающий ввод данных, ФИО, дата рождения и т.д.
    public void readInput() {

        work = true;

        while (work) {
            Notice.addPerson();
            String input = scanner.nextLine().trim();
            stringsArr = input.split(" ");
            if(input.equals("q")){work = false;}
            else {
                int tmp = Integer.compare(stringsArr.length, value);
                if (tmp < 0) Notice.fewDataException();
                else if (tmp > 0) Notice.extraDataException();
                else {
                    Notice.success();
                    stringsArr = input.split(" ");
                    rawObjects.add(stringsArr);
                }
            }
        }
    }
}
