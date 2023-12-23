package gb.HomeWork.Model;

import gb.HomeWork.Static.Notice;
import java.util.ArrayList;

public class Inspector {
    final private ArrayList<String[]> incomingList;
    private ArrayList<String[]> correctDataList;
    private ArrayList<String[]> incorrectDataList;

    public Inspector(ArrayList<String[]> incomingList) {
        this.incomingList = incomingList;
        correctDataList = new ArrayList<>();
        incorrectDataList = new ArrayList<>();
        checkLetters();
    }

    public ArrayList<String[]> getIncorrectDataList(){return incorrectDataList;}
    public ArrayList<String[]> getCorrectDataList(){return correctDataList;}

    // метод проверяющий буквы
    private void checkLetters() {

        int listIndex;
        int arrIndex;
        int upperLetterCounter = 0;
        int genderCounter = 0;
        int genderErrorFormatCounter = 0;

        for (listIndex = 0; listIndex < incomingList.size(); listIndex++) {
            for (arrIndex = 0; arrIndex < 6; arrIndex++) {
                if (Character.isUpperCase(incomingList.get(listIndex)[arrIndex].charAt(0))) upperLetterCounter++;
                if (incomingList.get(listIndex)[arrIndex].charAt(0) == 'm' || incomingList.get(listIndex)[arrIndex].charAt(0) == 'f') {
                    try{
                        incomingList.get(listIndex)[arrIndex].charAt(1);
                        Notice.incorrectGenderFormat(listIndex + 1);
                        genderErrorFormatCounter++;

                    } catch (Exception e) {genderCounter++;}
                }
            }
            if(genderErrorFormatCounter == 1){
                if(upperLetterCounter < 3) Notice.incorrectFIO(listIndex + 1);
                incorrectDataList.add(incomingList.get(listIndex));
                upperLetterCounter = 0;
                genderErrorFormatCounter = 0;
                continue;
            }
            if (upperLetterCounter == 3 && genderCounter == 1)
                correctDataList.add(incomingList.get(listIndex));
                else {
                if (upperLetterCounter > 3) Notice.incorrectGender(listIndex + 1);
                else if (upperLetterCounter != 3 && genderCounter == 1) Notice.incorrectFIO(listIndex + 1);
                else {
                    Notice.incorrectFIO(listIndex + 1);
                    Notice.incorrectGender(listIndex + 1);
                }
                 incorrectDataList.add(incomingList.get(listIndex));
            }
            upperLetterCounter = 0;
            genderCounter = 0;
        }
    }
    private void check(){
    }
}
