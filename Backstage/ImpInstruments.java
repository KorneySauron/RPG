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

    public static int guardianCondition(BufferedReader br, int bounce) throws IOException {
        int answer=-1;
        while (answer < 0 || answer > bounce) {
            try {
                answer = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {
                System.err.println("Введите корректное число!");
            }
            if (answer > bounce) {
                System.err.println("Введите корректное число!");
                answer = Integer.parseInt(br.readLine());
            }

        }
        return answer;
    }
    public static int numberGenerator(int orig, int bounce){
        Random random=new Random();
        return random.nextInt(orig, bounce);
    }
}
