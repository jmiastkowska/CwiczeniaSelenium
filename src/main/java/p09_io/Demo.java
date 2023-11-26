package p09_io;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Demo {
    public static void main(String[] args) throws IOException {
        //stworz plik na pulpicie o nazwie plik.txt
        //i wpisz tam ""hello io

        Files.writeString(
          Path.of("C:\\Users\\sasia\\Desktop\\plik.txt"),
          "hello io",
                StandardCharsets.UTF_8,
                StandardOpenOption.CREATE
        );



    }
}
