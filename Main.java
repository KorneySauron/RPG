import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Colors.BLUE + "Добро пожаловать в игру " + Colors.GREEN + "\"Древние земли\"" + Colors.RESET);
        System.out.println(Colors.RED + "Чтобы продвигаться дальше, выбирайте доступные вам числа" + Colors.RESET);
        System.out.println("""
                Выберите действие:
                1.Новая игра
                2.Продолжить
                3.Выйти из игры""");
        int answer = -1;
        while (answer < 0 || answer>3) {
            try {
                answer = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {
                System.err.println("Введите корректное число!");
            }
            if (answer>3) {
                System.out.println("Введите корректное число!");
            }
        }
        switch (answer) {
            case 1:
                GameProcess.launch();
                break;
            case 2:

                break;
            case 3:
                return;
        }
    }
}
