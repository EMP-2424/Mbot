import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("[system] Select which mbot you want to use.");
        String Mbot = scan.nextLine();
        if (Mbot.equals("Mbot1")){
            Mbot2 mbot2 = new Mbot2();
            mbot2.Mbot2();
        }
        else {
            System.exit(0);
        }
    }
}
