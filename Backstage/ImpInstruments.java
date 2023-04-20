package Backstage;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Random;

public interface ImpInstruments {
    String SPACE = "\u2009\u2009";
    String RESET = "\u001B[0m";
    String RED = "\u001B[31m";
    String GREEN = "\u001B[32m";
    String YELLOW = "\u001B[33m";
    String BLUE = "\u001B[34m";
    String PURPLE = "\u001B[35m";
    String CYAN = "\u001B[36m";
    String STRAIGHT = "Прямо";
    String LEFT = "Налево";
    String RIGHT = "Направо";
    int OFFERED = (int) (Math.random() * 6);

    public static int guardianCondition(int answer, BufferedReader br) throws IOException {
        while (answer < 0 || answer > 3) {
            try {
                answer = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {
                System.err.println("Введите корректное число!");
            }
            if (answer > 3) {
                System.err.println("Введите корректное число!");
                answer = Integer.parseInt(br.readLine());
            }

        }
        return answer;
    }
    public static int numberGenerator(int orig, int bounce){
        Random random=new Random();
        int genNumber=random.nextInt(orig, bounce);
        return genNumber;
    }
}
