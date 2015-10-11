// Написать программу, которая при запуске спрашивала бы имя в консоли.
// если сегодня четное число - она должна отвечать "Привет, (имя)!"
// если нечетное - "Здраствуй, (имя)!"
// testing vcs


import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
// import java.time.*;

public class Main {

    public static void main(String[] args){
// Ввод имени из косноли
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();
// Вывод даты
        System.out.println("Сегодня: " + new Date());
// объявление переменной cal
        Calendar cal = Calendar.getInstance();
// Проверка даты на четность
// Вывод приветствия в косоли

        if ((cal.get(Calendar.DAY_OF_MONTH)%2) == 0)
        {
            System.out.println("Привет, " + name);// четное число
        }
        else
        {
            System.out.println("Здравствуй, " + name);//нечетное число
        }
    }
}

