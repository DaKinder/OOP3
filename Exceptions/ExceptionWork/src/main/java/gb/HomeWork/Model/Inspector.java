package gb.HomeWork.Model;

import gb.HomeWork.Static.Notice;
import gb.HomeWork.Model.Validator;

import javax.management.MBeanAttributeInfo;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Inspector {
    final private ArrayList<String[]> incomingList;
    private ArrayList<String[]> correctDataList;
    private ArrayList<String[]> incorrectDataList;

    public Inspector(ArrayList<String[]> incomingList) {
        this.incomingList = incomingList;
        correctDataList = new ArrayList<>();
        incorrectDataList = new ArrayList<>();
        checkLetters();
//        Validator validator = new Validator();
    }

    public ArrayList<String[]> getIncorrectDataList(){return incorrectDataList;}
    public ArrayList<String[]> getCorrectDataList(){return correctDataList;}

    // метод проверяющий буквы
    private void checkLetters() {

        int listIndex;
        int arrIndex;
        int upperLetter = 0;
        int genderCounter = 0;
        int genderErrorFormat = 0;

        for (listIndex = 0; listIndex < incomingList.size(); listIndex++) {
            for (arrIndex = 0; arrIndex < 6; arrIndex++) {
                if (Character.isUpperCase(incomingList.get(listIndex)[arrIndex].charAt(0))) upperLetter++;
                if (incomingList.get(listIndex)[arrIndex].charAt(0) == 'm' || incomingList.get(listIndex)[arrIndex].charAt(0) == 'f') {
                    try{
                        incomingList.get(listIndex)[arrIndex].charAt(1);
                        Notice.incorrectGenderFormat(listIndex + 1);
                        genderErrorFormat++;

                    } catch (Exception e) {
                        genderCounter++;
                    }
                }
            }
            if(genderErrorFormat == 1){
                if(upperLetter < 3) Notice.incorrectFIO(listIndex + 1);
                incorrectDataList.add(incomingList.get(listIndex));
                upperLetter = 0;
                genderErrorFormat = 0;
                continue;
            }
            if (upperLetter == 3 && genderCounter == 1) {
                correctDataList.add(incomingList.get(listIndex));
//                Notice.correctLetters(listIndex + 1);
            } else {
                if (upperLetter > 3) {
//                    Notice.correctFIO(listIndex + 1);
                    Notice.incorrectGender(listIndex + 1);
                } else if (upperLetter != 3 && genderCounter == 1) {
                    Notice.incorrectFIO(listIndex + 1);
//                    Notice.correctGender(listIndex + 1);
                } else {
                    Notice.incorrectFIO(listIndex + 1);
                    Notice.incorrectGender(listIndex + 1);
                }
                 incorrectDataList.add(incomingList.get(listIndex));
            }
            upperLetter = 0;
            genderCounter = 0;
        }
    }
    private void check(){
    }
}
