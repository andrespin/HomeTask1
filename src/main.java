import java.util.ArrayList;

public class main {

    /*
1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
 */

    public static void main(String[] args) {
        System.out.println(Calculate(10, 20, 30, 40));
        System.out.println(checknumbers(5, 7));
        isPositive(-6);
        System.out.println(isitPositive(2));
        print("Alex");
        bissextile(2016);
    }

   

 //   2. Создать переменные всех пройденных типов данных, и инициализировать их значения;

    // примитивные типы данных
    byte aByte = 126;
    short aShort = 32101;
    int anInt = 2147483641;
    long aLong = 2147483641121232L;
    float aFloat = 123.1f;
    double aDouble = 3621.123;
    char aChar = 'А';
    boolean aBoolean = false;

    // Ссылочные
    String aString = "Ссылочный тип";

    /*
    3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    где a, b, c, d – входные параметры этого метода;
     */
    static int Calculate(int a, int b, int c, int d)
    {
        return a * (b + (c / d));
    }

    /*
    4. Написать метод, принимающий на вход два числа,
     и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
     если да – вернуть true, в противном случае – false;
     */

    static boolean checknumbers(int a, int b)
    {
     if ( (a + b) < 20 && (a + b) > 10)
     {
         return true;
     }
     else return false;
    }

    /*
    5. Написать метод, которому в качестве параметра передается целое число,
     метод должен напечатать в консоль положительное ли число передали, или отрицательное;
     Замечание: ноль считаем положительным числом.
     */

    static void isPositive(int i)
    {
        if (i >= 0)
        {
            System.out.println("Положительное");
        }
        else System.out.println("Отрицательное");
    }

    /*
    6. Написать метод, которому в качестве параметра передается целое число,
     метод должен вернуть true, если число отрицательное;
    */

    static boolean isitPositive(int i)
    {
        if (i >= 0)
        {
            return false;
        }
        else return true;
    }

    /*
    7. Написать метод, которому в качестве параметра передается строка,
     обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    */

    static void print(String name)
    {
        System.out.println("Привет, " + name +"!");
    }

    /*
    8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
     Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    */

    static void bissextile(int year)
    {
        double y = (double) year;
        double t = y%4;

        if ( (y%4 == 0.0) && (y%100 == 0.0) && (y%400 == 0.0))
        {
            System.out.println("Високосный");
        }
        else
         {
             if ((y%4 == 0.0) && (y%100 != 0.0)){System.out.println("Високосный");}
             else System.out.println("не високосный");
         }
    }
}
