import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameProcess {

    public static void launch() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Colors.CYAN + "Привестствую!");
        System.out.println("Я-твой рассказчик. Так как ты слеп, я помогу тебе ориентироваться, что с тобой происходит");
        System.out.println("Поведай, как тебя звать?");
        System.out.println("""
                1.Сказать свое имя
                2."А кто ты?"
                3. Выйти из игры""");
        int answer = Integer.parseInt(br.readLine());
        MainCharacter mc = null;
        while (answer != 1 && answer != 2 && answer != 3) {
            System.out.println(Colors.RED + "Введите корректное число!"+Colors.RESET);
            answer = Integer.parseInt(br.readLine());
        }
        switch (answer) {
            case 1:
                System.out.print("Меня зовут:");
                String name = br.readLine();
                mc = new MainCharacter(name);
                GameProcess.adventureGenerator(mc);
            case 2:
                System.out.println("Неважно. Важнее кто ты.");
                name = br.readLine();
                mc = new MainCharacter(name);
                GameProcess.adventureGenerator(mc);
            case 3:
                break;
        }
    }
    public static void adventureGenerator (MainCharacter mc) {

    }
}