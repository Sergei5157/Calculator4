package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class Main {

    public static void main(String[] args) throws IOException, MyException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "*", "/", "-", "+", "I", "V", "X"};
        System.out.println("Input: ");
        String str = reader.readLine();                                                                      // Считываем условие
        Integer result = 0;
        String[] numbers;
        try {

            if (str.contains("I") | str.contains("V") | str.contains("X")) {                                      // Проверка на то, с какими числами работаем
                System.out.println("Output: ");
                if (str.indexOf('+') > 0) {
                    numbers = str.split("[+]");                                                               // Делим условие на числа
                    int a = RomanNumeral.romanToArabic(numbers[0]);
                    int b = RomanNumeral.romanToArabic(numbers[1]);
                    if ((a > 10) | (a < 1) | (b > 10) | (b < 1)) {
                        throw new MyException("Введены числа не входящие в интервал от 1 до 10");                  //Обработка исключения чисел не входящих в интервал
                    }
                    result = a + b;
                } else if (str.indexOf('-') > 0) {
                    numbers = str.split("[-]");
                    int a = RomanNumeral.romanToArabic(numbers[0]);
                    int b = RomanNumeral.romanToArabic(numbers[1]);
                    if ((a > 10) | (a < 1) | (b > 10) | (b < 1)) {
                        throw new MyException("Введены числа не входящие в интервал от 1 до 10");
                    }
                    result = a - b;
                } else if (str.indexOf('/') > 0) {
                    numbers = str.split("[/]");
                    int a = RomanNumeral.romanToArabic(numbers[0]);
                    int b = RomanNumeral.romanToArabic(numbers[1]);
                    if ((a > 10) | (a < 1) | (b > 10) | (b < 1)) {
                        throw new MyException("Введены числа не входящие в интервал от 1 до 10");
                    }
                    result = a / b;
                } else if (str.indexOf('*') > 0) {
                    numbers = str.split("[*]");
                    int a = RomanNumeral.romanToArabic(numbers[0]);
                    int b = RomanNumeral.romanToArabic(numbers[1]);
                    if ((a > 10) | (a < 1) | (b > 10) | (b < 1)) {
                        throw new MyException("Введены числа не входящие в интервал от 1 до 10");
                    }
                    result = a * b;
                } else {

                }
                System.out.println(RomanNumeral.arabicToRoman(result));                                             // Переводим обратно в римские и выводим результат в консоль

            } else if (!str.contains("I") | !str.contains("V") | !str.contains("X")) {
                System.out.println("Output: ");
                if (str.indexOf('+') > 0) {
                    numbers = str.split("[+]");
                    int a = Integer.parseInt(numbers[0]);
                    int b = Integer.parseInt(numbers[1]);
                    if ((a > 10) | (a < 1) | (b > 10) | (b < 1)) {
                        throw new MyException("Введены числа не входящие в интервал от 1 до 10");
                    }
                    result = a + b;

                } else if (str.indexOf('-') > 0) {
                    numbers = str.split("[-]");
                    int a = Integer.parseInt(numbers[0]);
                    int b = Integer.parseInt(numbers[1]);
                    if ((a > 10) | (a < 1) | (b > 10) | (b < 1)) {
                        throw new MyException("Введены числа не входящие в интервал от 1 до 10");
                    }
                    result = a - b;
                } else if (str.indexOf('/') > 0) {
                    numbers = str.split("[/]");
                    int a = Integer.parseInt(numbers[0]);
                    int b = Integer.parseInt(numbers[1]);
                    if ((a > 10) | (a < 1) | (b > 10) | (b < 1)) {
                        throw new MyException("Введены числа не входящие в интервал от 1 до 10");
                    }
                    result = a / b;
                } else if (str.indexOf('*') > 0) {
                    numbers = str.split("[*]");
                    int a = Integer.parseInt(numbers[0]);
                    int b = Integer.parseInt(numbers[1]);
                    if ((a > 10) | (a < 1) | (b > 10) | (b < 1)) {
                        throw new MyException("Введены числа не входящие в интервал от 1 до 10");
                    }
                    result = a * b;
                } else {

                }

                System.out.println(result);
            }

        } catch (NumberFormatException e) {                                                                           //Обработка исключения при вводе дробных чисел и некоректного ввода
            System.out.println("Некорректное условие");
        }

    }
}

