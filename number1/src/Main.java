import java.util.Random;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Pervoe1();
        Vtoroe2();
        Tretbe3();
        Chetblre4();
        Pyatoe5();
        Shestoe6();
        Sedbmoe7();
        Vosbmoe8();
        Devyatoe9();
        Desyatoe10();
        OdinOdin11();
        Dvenad12();
        Trenad13();
        Chitblrn14();
        Pyatnad15();
        Shestnad16();
        Semnad17();
        Vosemnad18();
        Devyatnad19();
        Dvadnad20();
        Dota24();
        Cs26();
    }

    public static void Pervoe1() {
        int num = 20;
        System.out.println("Вывод числа>>> " + num);
    }

    public static void Vtoroe2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Напишите любое число>>> ");
        int num = sc.nextInt();
        System.out.println("Выше число: " + num);
    }

    public static void Tretbe3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Напишите три числа и мы найдем среднее арифметическое>>> ");
        int num = sc.nextInt();
        System.out.println();
        int num1 = sc.nextInt();
        System.out.println();
        int num2 = sc.nextInt();
        System.out.println("Ваше среднее арифметичское >>> " + (num + num1 + num2) / 3);
    }

    public static void Chetblre4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Найдем площадь треугольника!");
        System.out.println("Напишите высоту треугольника>>> ");
        double hight = (double)sc.nextInt();
        System.out.println("Напишите ширину треугольника>>> ");
        double width = (double)sc.nextInt();
        System.out.println("Площадь треугольника равна>>> " + hight * width / 2.0);
    }

    public static void Pyatoe5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Напишите число, является ли оно четным или не четным>>> ");
        double num = (double)sc.nextInt();
        if (num % 2.0 == 0.0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число не четное");
        }

    }

    public static void Shestoe6() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = sc.nextInt();
        long factorial = 1L;

        for(int i = 1; i <= num; ++i) {
            factorial *= (long)i;
        }

        System.out.println("Факториал " + num + "равеееен: " + factorial);
    }

    public static void Sedbmoe7() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите организационное число: ");
        int num = sc.nextInt();
        boolean real = true;
        if (num <= 1) {
            real = false;
        } else {
            for(int i = 2; (double)i <= Math.sqrt((double)num); ++i) {
                if (num % i == 0) {
                    real = false;
                    break;
                }
            }
        }

        if (real) {
            System.out.println("" + num + "- простое число, вы молодеццц:))) ");
        } else {
            System.out.println("" + num + "- это не простое число, как так:( ");
        }

    }

    public static void Vosbmoe8() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число для таблицы умножения>>> ");
        int num = sc.nextInt();

        for(int i = 1; i <= 10; ++i) {
            System.out.println("Таблица умножения: " + num + " * " + i + " = " + num * i);
        }

    }

    public static void Devyatoe9() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Число в бинарном формате>> ");
        int num = sc.nextInt();
        String binary = Integer.toBinaryString(num);
        System.out.println("Ваше число в бинарном формате: " + binary);
    }

    public static void Desyatoe10() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Напишите три числа, для вычесления самого большого>>> ");
        int num = sc.nextInt();
        System.out.println();
        int num1 = sc.nextInt();
        System.out.println();
        int num2 = sc.nextInt();
        System.out.println();
        int max = num;
        if (num1 > max) {
            max = num1;
        }

        if (num2 > max) {
            max = num2;
        }

        System.out.println("Самое большое число>>> " + max);
    }

    public static void OdinOdin11() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Напишите любое число>>> ");
        int num = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= num; ++i) {
            sum += i;
            System.out.println("Сумма чисел от 1 до " + i + " равна: " + sum);
        }

    }

    public static void Dvenad12() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        String sum = sc.nextLine();
        if (isPalindrome(sum)) {
            System.out.println(sum + " является палиндромом.");
        } else {
            System.out.println(sum + " не является палиндромом.");
        }

    }

    public static boolean isPalindrome(String str) {
        String reversedStr = (new StringBuilder(str)).reverse().toString();
        return str.equals(reversedStr);
    }

    public static void Trenad13() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Вычесляем квадратный корень из вашего числа>>> ");
        int num = sc.nextInt();
        Double math = Math.sqrt((double)num);
        System.out.println(math);
    }

    public static void Chitblrn14() {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Введите любое целое число для вычесления суммы ");
        int num = sc.nextInt();

        int sum;
        for(sum = 0; num > 0; num /= 10) {
            int digit = num % 10;
            sum += digit;
        }

        System.out.println(" Сумма всех цифр целого числа: " + sum);
    }

    public static void Pyatnad15() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Введите число, чтобы перевернуть его ");
        int number = scanner.nextInt();
        int reversedNumber = 0;

        while(number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
            System.out.println(" Число сделало кувырок " + reversedNumber);
        }

    }

    public static void Shestnad16() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Введите число, чтобы узнать совершенное ли оно ");
        int number = scanner.nextInt();
        if (isPerfect(number)) {
            System.out.println("" + number + " Число совершенное ");
        } else {
            System.out.println("" + number + " Число не совершенное");
        }

    }

    public static void Semnad17() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Введите первое число ");
        int num1 = scanner.nextInt();
        System.out.print(" Введите второе число ");
        int num2 = scanner.nextInt();
        int nod = findNOD(num1, num2);
        System.out.println(" НОД чисел " + num1 + " и " + num2 + " равен " + nod);
    }

    public static boolean isPerfect(int number) {
        if (number <= 1) {
            return false;
        } else {
            int sum = 1;

            for(int i = 2; (double)i <= Math.sqrt((double)number); ++i) {
                if (number % i == 0) {
                    sum += i;
                    if (i != number / i) {
                        sum += number / i;
                    }
                }
            }

            return sum == number;
        }
    }

    public static void Vosemnad18() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Введите первое ");
        int num1 = scanner.nextInt();
        System.out.print(" Введите число ");
        int num2 = scanner.nextInt();
        int minimum = findMinimum(num1, num2);
        System.out.println(" Меньшее число " + minimum);
    }

    public static int findNOD(int num1, int num2) {
        while(num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }

        return num1;
    }

    public static void Devyatnad19() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Введите число, чтобы изменить на противоположное ");
        int number = scanner.nextInt();
        int qwe = -number;
        System.out.println(" Противоположное значение = " + qwe);
    }

    public static int findMinimum(int num1, int num2) {
        return num1 < num2 ? num1 : num2;
    }

    public static void Dvadnad20() {
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Ну что, поиграем?  загадал число от 1 до 100, попробуйте отгадать)");
        int attempts = 0;
        boolean guessed = false;

        while(!guessed) {
            System.out.println(" Введите ваше число: ");
            int guess = scanner.nextInt();
            ++attempts;
            if (guess == secretNumber) {
                guessed = true;
                System.out.println(" Умнички, вы угадали число;) " + attempts + " попыток! ");
            } else if (guess < secretNumber) {
                System.out.println(" Ваше число слишком маленькое, попробуйте побольше :(");
            } else {
                System.out.println(" Ваше число гигантское, меньше нужно, срочно");
            }
        }

    }

    public static void Dota24() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Введите первое число ");
        int num1 = scanner.nextInt();
        System.out.print(" Введите второе число ");
        int num2 = scanner.nextInt();
        System.out.print(" Введите третье число ");
        int num3 = scanner.nextInt();
        int sum = (2 * num1 + num2 * (num3 - 1)) / 2 * num3;
        System.out.println(" Арифметическая прогрессия равна " + sum);
    }

    public static void Cs26() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Введите целое число ");
        int number = scanner.nextInt();
        int evenCount = 0;

        int oddCount;
        for(oddCount = 0; number != 0; number /= 10) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                ++evenCount;
            } else {
                ++oddCount;
            }
        }

        System.out.println(" Количество чётных цифр: " + evenCount);
        System.out.println(" Количество нечётных цифр:" + oddCount);
    }
}
