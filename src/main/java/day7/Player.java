package day7;

public class Player {
    private int stamina;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        countPlayers++;
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {
        if (stamina == MIN_STAMINA) {
            countPlayers--;
        }
        stamina--;
        if (stamina < 0) {
            stamina = MIN_STAMINA;
        }
    }

    public static void info() {
        if (countPlayers > 6) {
            countPlayers--;
            System.out.println("Мест в команде больше нет");
        } else if (countPlayers == 6) {
            System.out.println("Мест в команде больше нет");
        } else {
            if (countPlayers == 1) {
                System.out.println("Команды не полные, еще есть " + (6 - countPlayers) + " свободых мест");
            } else if (countPlayers > 1 && countPlayers < 5) {
                System.out.println("Команды не полные, еще есть " + (6 - countPlayers) + " свободных места");
            } else {
                System.out.println("Команды не полные, еще есть " + (6 - countPlayers) + " свободное место");
            }
        }
        if (countPlayers == 1) {
            System.out.println("На поле " + countPlayers + " игрок");
        } else if (countPlayers > 1 && countPlayers < 5) {
            System.out.println("На поле " + countPlayers + " игрокa");
        } else {
            System.out.println("На поле " + countPlayers + " игроков");
        }
    }
}
