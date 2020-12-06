package ru.geekbrains.new_project;

public class Main {

    public static void main(String[] args) {
        boolean res = task10and20(12);
        System.out.println(res);
    }

    public static boolean task10and20(int a) {
        if (a > 10 && a < 20) {
            return true;
        } else {
            return false;

        }
    }
}