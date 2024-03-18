import java.util.Scanner;
import java.util.Random;

public class BlackjackDiceGame {
    public static void main(String[] args) {
        System.out.println("Velkommen til BlackJack Dice Game!");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int BrugerTotal = terning(random) + terning(random);
        System.out.println("Du har slået: " + BrugerTotal);

        while (true) {
            System.out.print("Vil du rulle terningen igen ja/nej: ");
            String igen = scanner.nextLine();

            if (igen.equalsIgnoreCase("ja")) {
                int roll = terning(random);
                BrugerTotal += roll;
                System.out.println("Du har nu slået: " + BrugerTotal);
                if (BrugerTotal >= 21) {
                    break;
                }
            } else if (igen.equalsIgnoreCase("nej")) {
                break;
            }
        }

        int MaskineTotal = 0;
        while (MaskineTotal < 16) {
            MaskineTotal += terning(random);
        }

        System.out.println("Maskinen har: " + MaskineTotal);

        if (BrugerTotal <= 21 && (MaskineTotal > 21 || BrugerTotal > MaskineTotal)) {
            System.out.println("Du vinder!");
        } else if (BrugerTotal == MaskineTotal) {
            System.out.println("Uafgjort!");
        } else {
            System.out.println("Maskinen vinder!");
        }
    }
    public static int terning(Random random) {
        return random.nextInt(6) + 1;
    }
}