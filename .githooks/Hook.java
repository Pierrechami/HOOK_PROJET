import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Hook {
    public static void main (String[] args) throws IOException {

        String message = ""; 
        String data = "";
        // Lire le fichier COMMIT_EDITMSG qui est notre premier arguments 
        data = new String(Files.readAllBytes(Paths.get(args[0])));


        // If pour savoir si le commit commence bien par Bonjour 
        if (data.startsWith("Zainab") ||  data.startsWith("Matis") || data.startsWith("Pierre") ) {
            message = "Le commit n'est pas bon, il ne commence pas par Matis, Zainab ou Pierre ";
            System.out.println(message);
            System.exit(1); 
        } else {
            message = "Le commit ne commence pas par Zainab ou Matis ou Pierre";
            System.out.println(message);
            System.exit(0);
        }
        System.exit(1); 

    }

}