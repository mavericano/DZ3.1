package lesson3;

public class Main {
    public static void main(String[] args) {
        int s = 1113700;

        int sec;

        //int m;

        int min, h;

        int days, weeks;

        //sec = s % 60;

        //m = (s - sec) / 60;

        //min = m % 60;

        //h = (m - min) / 60;

        days = s / (86400);
        weeks = days / 7;
        s -= days * 86400;

        h = s / 3600;
        s -= h * 3600;

        min = s / 60;
        s -= min * 60;
        sec = s;

        System.out.println(weeks + " недель " + days + " суток " + h + " часов " + min + " минут " + sec + " секунд");
    }
}
