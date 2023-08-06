
// 1. Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
// Числа могут быть, как целочисленные, так и дробные.

//package org.example;
//
//public class Main {
//    public static void main(String[] args) {
//        double m = 6.5;
//        double n = 8.8;
//
//        double nearestTo10 = numberNearestTo10(m, n);
//        System.out.println("Ближайшее к 10 число: " + nearestTo10);
//    }
//
//    public static double numberNearestTo10(double m, double n) {
//        double resM = Math.abs(m - 10);
//        double resN = Math.abs(n - 10);
//
//        if (resM < resN) {
//            return m;
//        } else {
//            return n;
//        }
//    }
//        }


// 2. Есть устройство, на табло которого показывается количество секунд, оставшихся до конца рабочего дня. Когда рабочий день начинается ровно в 9 часов утра — табло отображает «28800» (т.е. остаётся 8 часов), когда 14:30 — на табло «9000» (т.е. остаётся два с половиной часа), а когда наступает 17 часов — на табло отображается «0» (т.е. рабочий день закончился).
//Некоторый сотрудники не умеют оценивать остаток рабочего дня в секундах.
//Требуется написать программу, которая вместо секунд будет выводить на табло понятные фразы с информацией о том, сколько полных часов осталось до конца рабочего дня.
//Например: «осталось 7 часов», «осталось 4 часа», «остался 1 час», «осталось менее часа».
//Объяснение: в переменную n должно записываться случайное (на время тестирования программы) целое число из диапазона от 0 до 28800, далее оно должно выводиться на экран (для тех, кто понимает в секундах) и на следующей строке (для тех кто не понимает) должна выводиться фраза о количестве полных часов, содержащихся в n секундах.
//package org.example;
//
//import java.time.LocalTime;
//
//public class Main {
//    public static void main(String[] args) {
//        LocalTime currentTime = LocalTime.now();
//
//        LocalTime endWorkDay = LocalTime.of(17, 0);
//
//        int remainingSeconds = (endWorkDay.getHour() * 60 + endWorkDay.getMinute()) * 60
//                - (currentTime.getHour() * 60 + currentTime.getMinute()) * 60 + currentTime.getSecond();
//
//        int remainingHours = remainingSeconds / 3600;
//
//        if (remainingHours <= 0) {
//            System.out.println("Рабочий день закончился");
//        } else if (remainingHours == 1) {
//            System.out.println("Остался 1 полный час");
//        } else {
//            System.out.println("Осталось " + remainingHours + " полных часов");
//        }
//    }
//}
//


    // 3. Реализуйте метод isLeapYear(), которая определяет, является ли год високосным.
    //   Если год високосный, функция должна вернуть true, если нет – false.
    //   Год считается високосным, если он кратен (то есть делится без остатка) 400 или он одновременно кратен 4
    //   и не кратен 100. Как видите, в определении уже заложена вся необходимая логика, осталось только переложить
    //   её на код:
    //    isLeapYear(2018); // false
    //    isLeapYear(2017); // false
    //     isLeapYear(2016); // true

//package org.example;
//public class Main {
//    public static boolean isLeapYear(int year) {
//        if (year % 400 == 0) {
//            return true;
//        } else if (year % 4 == 0 && year % 100 != 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println(isLeapYear(2018));
//        System.out.println(isLeapYear(2017));
//        System.out.println(isLeapYear(2016));
//    }
//}

//


// 4.Реализуйте метод getLetter(), которая извлекает из переданной строки указанный символ
// (по порядковому номеру, а не индексу) и возвращает его наружу. Если такого символа нет,
// то функция возвращает пустую строку.
//
//Примеры вызова:
//string name = "qwerty";
//
//// Обычное обращение вызывает exception
//*name[11]; // exception
//
//// 11 символ соответствует 10 индексу
//getLetter(name, 11); // ""
//
//getLetter(name, 1); // "q"
//getLetter(name, 0); // ""
//getLetter(name, 6); // "y"

package org.example;

public class Main {

    public static String getLetter(String string, int number) {
        if (number >= 1 && number <= string.length()) {
            return String.valueOf(string.charAt(number - 1));
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        String name = "qwerty";

        System.out.println(getLetter(name, 11));
        System.out.println(getLetter(name, 1));
        System.out.println(getLetter(name, 0));
        System.out.println(getLetter(name, 6));
    }
}
