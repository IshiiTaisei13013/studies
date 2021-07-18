import javax.imageio.IIOException;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class main {
    public static void main(String args[]){
        Path path = Paths.get("./sample.bat");

        byte[] data  = new byte[]{0x42,0x42,0x43};

        try (OutputStream stream = Files.newOutputStream(path,
                StandardOpenOption.APPEND,StandardOpenOption.CREATE,StandardOpenOption.WRITE)) {
            stream.write(data);
        } catch (IOException ex) {
            System.err.println(ex);
        }
//
//        File file = new File("./sample.dat");
//
//        InputStream is = null;
//
//        try{
//            is = new FileInputStream(file);
//            for (int ch;(ch = is.read()) != -1;){
//                System.out.println((char) ch);
//            }
//        } catch (FileNotFoundException ex) {
//            System.err.println(ex);
//        } catch (IOException ex) {
//            System.err.println(ex);
//        } finally {
//            if(is != null){
//                try {
//                    is.close();
//                } catch (IOException ex){
//                    System.err.println(ex);
//                }
//            }
//        }
    }
}
