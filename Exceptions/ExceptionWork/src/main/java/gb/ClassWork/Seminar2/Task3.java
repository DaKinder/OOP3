package gb.ClassWork.Seminar2;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;

// Task3
// Запишите в файл следующие строки:
// Анна=4
// Елена=5
// Марина=6
// Владимир=?
// Константин=?
// Иван=4
//
// Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив (либо HashMap, если
// студенты с ним знакомы). В отдельном методе нужно будет пройти по структуре данных, если сохранено
// значение ?, заменить его на соответствующее число.Если на каком-то месте встречается символ, отличный от
// числа или ?, бросить подходящее исключение.Записать в тот же файл данные с замененными символами ?.



public class Task3 {
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> temp = checkFile("list.txt");
        System.out.println(temp);
        FileWriter fileWriter = new FileWriter( "list.txt" ,false) ;
        for (String key: temp.keySet()) {
            fileWriter.append(key + "=" + temp.get(key) + "\n");
        }
        fileWriter.close();
    }
    static HashMap<String, Integer> checkFile(String pathToFile){
        HashMap<String, Integer> temp = new HashMap<>();
        try{
            File file = new File(pathToFile);
            if(!file.exists())return null;
            else {
                BufferedReader br = new BufferedReader(new FileReader(file));
                Iterator<String> iterator = br.lines().iterator();
                while(iterator.hasNext()){
                    String[] tempString = iterator.next().split("=");
                    try {
                        if (tempString[1].equals( "?" )) temp.put( tempString[0], tempString[0].length() );
                        else temp.put( tempString[0], Integer.parseInt( tempString[1] ) );
                    } catch(NumberFormatException e) {
                        throw new RuntimeException("Ошибка преобразования");
                    }
                }
                br.close();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return temp;
    }
}
