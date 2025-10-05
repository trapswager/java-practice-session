// Этот файл — моя практика по Java. Здесь я запрашиваю данные у пользователя и вывожу персональное сообщение.

import java.util.Scanner; // Импортирую класс Scanner, чтобы считывать ввод пользователя

public class HW1 {
    public static void main(String[] args) {

        // Привет! В этой программе я прошу пользователя ввести свои данные.
        Scanner input = new Scanner(System.in); // Создаю объект Scanner для ввода данных с клавиатуры

        // Однострочный комментарий: Запрашиваю у пользователя его имя, фамилию, возраст и специальность
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your surname: ");
        String surname = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine(); // Это нужно, чтобы после числа корректно считалась следующая строка

        System.out.print("Enter your major/course: ");
        String major = input.nextLine();

        /*
         Многострочный комментарий:
         Ниже я вывожу все введённые пользователем данные.
         Также формирую персональное приветствие, чтобы программа выглядела дружелюбно.
        */
        System.out.println("\n--- User Information ---");
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Major/Course: " + major);

        // Однострочный комментарий: вывожу персональное приветствие
        System.out.println("Welcome to the Java world, " + name + "! Keep learning and growing rheh");

        input.close(); // Закрываю Scanner, чтобы освободить ресурсы
    }
}

