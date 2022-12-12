import java.net.SocketTimeoutException;

public class HookPrePush {
    public static void main(String[] args) throws Exception {
        String currentBranch = args[1];
        String protectedBranch = args[0];

        // if(currentBranch.equals(protectedBranch)){
        //     System.out.println("Vous etes sur une branche protegée");
        //     System.exit(1);
        // }
        // else {
        //     System.exit(0);
        // }
        
    }
}
