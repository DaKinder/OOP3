package gb.ClassWork.Seminar3;

import javax.swing.plaf.PanelUI;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
public class Task1 {
    public void rwLine(Path pathRead, Path pathWrite) throws IOException{
        try(BufferedReader in = Files.newBufferedReader( pathRead ); BufferedWriter out =  Files.newBufferedWriter( pathWrite )){
            out.write(in.readLine());
        }
    }
}
