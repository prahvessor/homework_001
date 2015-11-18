// Написать программу, которая при запуске спрашивала бы имя в консоли.
// если сегодня четное число - она должна отвечать "Привет, (имя)!"
// если нечетное - "Здраствуй, (имя)!"
// testing vcs
// ver.2 using Time


import java.time.LocalDate;
import java.time.MonthDay;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
// Ввод имени из косноли
        Scanner in = new Scanner(System.in); //создаём объект класса Scanner
        System.out.print("Введите имя: ");
        String name = in.nextLine(); // считывает строку из потока ввода и сохраняет в переменную
// Вывод даты
        System.out.println("Сегодня: " + LocalDate.now());
// объявление переменной dayOfMonth
        MonthDay m = MonthDay.now();
        int dayOfMonth = m.getDayOfMonth();
// Проверка даты на четность
// Вывод приветствия в косоли

        if ((dayOfMonth%2) == 0)
        {
            System.out.println("Привет, " + name);// четное число
        }
        else
        {
            System.out.println("Здравствуй, " + name);//нечетное число
        }
    }
}



