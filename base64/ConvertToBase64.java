import java.io.File;
import java.util.Base64;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ConvertToBase64 {

    public String convertoBase64(String imagefile) throws IOException, FileNotFoundException {
        File f = new File(imagefile);
        FileInputStream fis = new FileInputStream(f);
        byte[] byteArray = new byte[(int) f.length()];
        fis.read(byteArray);

        String result = Base64.getEncoder().encodeToString(byteArray);
        return result;
    } 

    public static void main( String[] args ) throws IOException, FileNotFoundException {
        ConvertToBase64 ctb = new ConvertToBase64();
        String imagefile = null, base64String = null;

        if ( args.length == 1 ) {
            imagefile = args[0];
            base64String = ctb.convertoBase64(imagefile);
            System.out.println(base64String);
        }
    }
}
