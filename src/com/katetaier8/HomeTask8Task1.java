package com.katetaier8;

public class HomeTask8Task1 {

    public static void main(String[] args) {

        /*Электронные часы показывают время в формате от 00:00 до 23:59.
        Подсчитать сколько раз за сутки случается так, что слева от двоеточия показывается симметричная комбинация
         для той, что справа от двоеточия (например, 02:20, 11:11 или 15:51).
         */
        int count = getCount();
        System.out.println(count);

        /*Найти количество счастливых билетиков на трамвай от 000001 до 999999 - те у которых сумма первых 3 цифр
          равна сумме последних 3*/
        int countTickets = 0;
        System.out.println("The number of happy tickets is " + happyTickets(countTickets) + ".");


    }

    private static int getCount() {
        int count = 0;
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j <= 59; j++) {
                //Let's compare hours and minutes
                if (i / 10 % 10 == j % 10 && i % 10 == j / 10 % 10) {
                    count++;
                }
            }
        }
        return count;
    }

    private static int happyTickets(int countTickets) {
        for (int i = 0; i <= 999; i++) {
            for (int j = 0; j <= 999; j++) {
                if (i / 100 + i / 10 % 10 + i % 10 == j / 100 + j / 10 % 10 + j % 10) {
                    countTickets++;
                }
            }
        }
        return countTickets;
    }
}



