import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class main {
    public static void main(String args[]){
        Path path = Paths.get("./mail.properties");

        try(BufferedReader reader = Files.newBufferedReader(
                path, StandardCharsets.UTF_8
        )){
            Properties properties = new Properties();
            properties.load(reader);

            String address = properties.getProperty("system.mail.address");

            System.out.println(address);


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
