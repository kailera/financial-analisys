import java.io.BufferedReader;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        lerArquivoCsv();
    }

    public static void lerArquivoCsv() {

        try{
            Files.lines(Paths.get("src/files/Resultados.csv"))
                    .skip(1)
                    .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}



