import Backstage.GameProcess;
import Backstage.ImpInstruments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(ImpInstruments.BLUE + "Добро пожаловать в игру " + ImpInstruments.GREEN + "\"Древние земли\"" + ImpInstruments.RESET);
        System.out.println(ImpInstruments.RED + "Чтобы продвигаться дальше, выбирайте доступные вам числа" + ImpInstruments.RESET);
        System.out.println("""
                Выберите действие:
                1.Новая игра
                2.Выйти из игры""");
        int answer = ImpInstruments.guardianCondition(br,3);
        switch (answer) {
            case 1:
                GameProcess.launch();
                break;
            case 2:
                break;
        }
    }
}
