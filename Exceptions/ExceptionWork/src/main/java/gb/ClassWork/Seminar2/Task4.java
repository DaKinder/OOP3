package gb.ClassWork.Seminar2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;

// Task4
// Исправьте код, примените подходящие способы обработки исключений.

public class Task4 {
    public static void main(String[] args) {
        InputStream inputStream;
        try{
            String[] strings = {"asdf", "asdf"};
            String strings1 = strings[1];
            test();
            int a = 1/0;
            inputStream = new FileInputStream( "asdfasdf" );
        }catch (Throwable e){
            e.printStackTrace();
//        }catch ( RuntimeException e){
//            System.out.println("Я всёравно выполнился!!!");
        }
        System.out.println("Я жив)))");
    }

    public static void test() throws Exception{
        File file = new File("1");
        file.createNewFile();
        FileReader fileReader = new FileReader( file );
        fileReader.read();
        //test();
    }
}