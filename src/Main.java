// �������� ���������, ������� ��� ������� ���������� �� ��� � �������.
// ���� ������� ������ ����� - ��� ������ �������� "������, (���)!"
// ���� �������� - "���������, (���)!"
// testing vcs


import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
// import java.time.*;

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

