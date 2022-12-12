import java.net.SocketTimeoutException;

public class HookPrePush {
    public static void main(String[] args) throws Exception {
        String branchProtect = args[0];
        String branchCourent = args[1];
        if ( branchCourent != branchProtect){
            System.exit(0);
        }else{
            System.out.println("Attention vous etes sur la branche " + branchProtect + "." );
            System.out.println("Merci de changer de branche.");
            System.exit(1);
        }
    }
}
