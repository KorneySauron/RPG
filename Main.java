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
        switch (Integer.parseInt(br.readLine())) {
            case 1:
                ;

                break;
            case 2:

                break;
            case 3:

                break;
        }
    }
}
