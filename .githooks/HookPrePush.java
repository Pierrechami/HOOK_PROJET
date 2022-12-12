public class HookPrePush {
    public static void main(String[] args) throws Exception {
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println("coucou depuis le hook");
        System.exit(1);
    }
}
