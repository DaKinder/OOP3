package gb.HomeWork.Model;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Validator {
//    private int arrLength;
    private final ArrayList<String[]> validatedList;

    final private ArrayList<String[]> dataFromHub;

    public Validator(ArrayList<String[]> list) {
        dataFromHub = list;
        validatedList = new ArrayList<>();
        checkArray();
    }

    private boolean checkPhoneNumber(String phone) {
        if (phone.length() != 11) {return false;}

        try {
            Double.parseDouble(phone);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean checkName(String str) {
        return str.matches("[а-яА-Я]*");
    }

    private boolean checkDate(String birthDate) {
        boolean isValidDate = Pattern.matches("\\d\\d\\.\\d\\d\\.\\d\\d\\d\\d", birthDate);
        if (!isValidDate) return false;

        String[] date = birthDate.split("\\.");
        int day = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int year = Integer.parseInt(date[2]);

        if (year < 1900 || year > 2023 || month < 1 || month > 12) return false;

        int maxDayInMonth = 31;

        if (month == 4 || month == 6 || month == 9 || month == 11) maxDayInMonth = 30;
        else if (month == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) maxDayInMonth = 29;
            else maxDayInMonth = 28;
        }
        return day >= 1 && day <= maxDayInMonth;
    }

    public void checkArray() {

        int phoneCounter = 0;
        int dateCounter = 0;
        int nameCounter = 0;
        int arrIndex = 0;
        int arrayINDEX = 0;

        for (String[] arr : dataFromHub) {
            for (String str : arr) {
                if (checkDate(str))dateCounter++;
                if (checkPhoneNumber(str)) phoneCounter++;
                if (checkName(arr[arrIndex])){nameCounter++;}
                arrIndex++;
            }
            if(phoneCounter == 1 && dateCounter == 1 && nameCounter == 3){
                validatedList.add(arr);
            }
            phoneCounter = 0;
            dateCounter = 0;
            nameCounter = 0;
            arrIndex = 0;
        }
    }


    private void sortData(){
        String[] str = new String[6];
        int pointer = 0;
        int listIterator = 0;

        for(String[] arr : validatedList) {
            for (int j = 0; j < arr.length; j++) {
                if(Character.isUpperCase(arr[j].charAt(0))){
                    str[pointer] = arr[j];
                    pointer++;
                    continue;
                }
                if(Character.isLowerCase(arr[j].charAt(0))){
                    str[5] = arr[j];
                }
                try{
                    Long.parseLong(validatedList.get(listIterator)[j]);
                    str[4] = arr[j];
                } catch (NumberFormatException e) {
                    if (validatedList.get(listIterator)[j].charAt(0) != 'm') str[3] = arr[j];
                }
            }
        }
    }
}


