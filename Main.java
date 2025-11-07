import java.util.Arrays;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        <-- Challenge 1 -->

//        System.out.print("Enter your consumption: ");
//        int consumption = Integer.parseInt(scanner.nextLine());
//        double total = 0;
//
//        for (int i = 1; i <= consumption; i++) {
//
//            if (i <= 100) {
//                total = i * 0.8;
//            } else if (i > 100 && i <= 300) {
//                total = i * 1.2;
//            } else {
//                total = i * 1.5;
//            }
//
//        }
//
//
//        DecimalFormat reg = new DecimalFormat("#.##");
//        String fixedNum = reg.format(total);
//
//        System.out.println("Facture avant taxe : " + fixedNum);
//        System.out.println("Taxe (10%) : " + (total / 100) * 10);
//        System.out.println("Facture totale : " + Double.parseDouble(fixedNum) + ((total / 100) * 10));

//        <-- Challenge 2 -->

        System.out.print("Enter your commands: ");
        String commands = scanner.nextLine();
        int positionY = 0;
        int positionX = 0;

        String regex = ",";
        String[] array = commands.toLowerCase().split(regex);


        for (int i = 0; i < array.length; i++) {
            switch (array[i]) {
                case "up":
                    positionY++;
                    break;
                case "down":
                    positionY--;
                    break;
                case "right":
                    positionX++;
                    break;
                case "left":
                    positionX--;
            }
        }

        System.out.println("Position finale : " + positionX + "," + positionX);


        scanner.close();
    }
}
