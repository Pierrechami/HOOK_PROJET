import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Hook {
    public static void main (String[] args) throws IOException {

        System.out.println(args[0]);

        System.out.println("Message mtn ");

        String message = ""; 
        String data = "";
        // Lire le fichier COMMIT_EDITMSG qui est notre premier arguments 
        data = new String(Files.readAllBytes(Paths.get(args[0])));
        data = data.trim(); // 
     

        int dataLength =  data.length() ; // recupère le nombre de caractère du commit 
        System.out.println(dataLength);  // renvoie le nombre de caractère du commit 


        // Si le commit est paire le if est ok 
        if (dataLength % 2 == 0) {
        System.out.println("le commit comporte bien un nombre paire ");

        }

        
        // If pour savoir si le commit commence bien par Bonjour 
        if (data.startsWith("Bonjour") == false) {
            message = "Le commit ne commence pas par Bonjour";
            System.out.println(message);
           // System.exit(1);
        } else {
            message = "Le commit est bon, il commence bien par Bonjour ";
            System.out.println(message);
          //  System.exit(0);
        }

            // If pour savoir si le commit commence bien par Bonjour 
            if (data.startsWith("Zainab") ||  data.startsWith("Matis") || data.startsWith("Pierre") ) {
                message = "Le commit respect le préfix ";
                System.out.println(message);
                System.exit(0);
            } else {
                message = "Le commit ne commence par Zainab, Matis ou Pierre ";
                System.out.println(message);
                System.exit(0);
            }

    
        
        System.exit(1);
    }

}



// // String data = "";
// //data = new String(Files.readAllBytes(Paths.get(args[0])));

// System.out.println(data)

// //System.out.println(data.indexOf("TES"));