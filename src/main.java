import java.util.Random;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        long x;
        System.out.println("[mbot]What's you name? in mc ofc");
        Scanner Iscaner = new Scanner(System.in);
        String McName = Iscaner.nextLine();
        System.out.println("[mbot]What is fav minecraft item?");
        String Mcitem = Iscaner.nextLine();
        System.out.println("[mbot] Your name is " + McName);
        System.out.println("[mbot] your fav item is " + Mcitem);
        System.out.println("[mbot] Great. YOUR PC HAS BEEN HACKED bruh jk lol");
        System.out.println("[Mbot] should i spam your pc? say true or if you dont want to say false // Warning this might lag the pc");
        String tnt = Iscaner.nextLine();
        System.out.println(tnt);
        Random rand = new Random();
        while(!tnt.equals("true")) {
            if (tnt.equals("false")){
                System.exit(0);
            }
            System.out.println("[mbot] Nope thats not a boolean! try again. ps: use false or true");
            tnt = Iscaner.nextLine();

        }
        while(tnt.equals("true")){
            x = rand.nextInt(394584544);
            System.out.println(x);

        }
    }
}
