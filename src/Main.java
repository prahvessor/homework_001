// �������� ���������, ������� ��� ������� ���������� �� ��� � �������.
// ���� ������� ������ ����� - ��� ������ �������� "������, (���)!"
// ���� �������� - "���������, (���)!"
// testing vcs
// ver.2 using Time


import java.time.LocalDate;
import java.time.MonthDay;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
// ���� ����� �� �������
        Scanner in = new Scanner(System.in); //������ ������ ������ Scanner
        System.out.print("������� ���: ");
        String name = in.nextLine(); // ��������� ������ �� ������ ����� � ��������� � ����������
// ����� ����
        System.out.println("�������: " + LocalDate.now());
// ���������� ���������� dayOfMonth
        MonthDay m = MonthDay.now();
        int dayOfMonth = m.getDayOfMonth();
// �������� ���� �� ��������
// ����� ����������� � ������

        if ((dayOfMonth%2) == 0)
        {
            System.out.println("������, " + name);// ������ �����
        }
        else
        {
            System.out.println("����������, " + name);//�������� �����
        }
    }
}

/*
public class Main {

    public static void main(String[] args){
// ���� ����� �� �������
        Scanner in = new Scanner(System.in);
        System.out.print("������� ���: ");
        String name = in.nextLine();
// ����� ����
        System.out.println("�������: " + new Date());
// ���������� ���������� cal
        Calendar cal = Calendar.getInstance();
// �������� ���� �� ��������
// ����� ����������� � ������

        if ((cal.get(Calendar.DAY_OF_MONTH)%2) == 0)
        {
            System.out.println("������, " + name);// ������ �����
        }
        else
        {
            System.out.println("����������, " + name);//�������� �����
        }
    }
}
*/

