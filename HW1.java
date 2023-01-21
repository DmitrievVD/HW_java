import java.util.Arrays;
import java.util.Random;

public class HW1 {

    public static void main(String[] args) {
        //1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
        int i = new Random().nextInt(2000);
        System.out.println(i);
        //2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        int n = i >> 7;
        System.out.println(n);
        int num = i;

        //3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        if (n != 0) {
            int[] m1 = new int[(Short.MAX_VALUE / n) - (i / n) + 10];
            int score = 0;
            for (; i < Short.MAX_VALUE; i++) {
                if (i % n == 0) {
                    m1[score] = i;
                    score++;
                }
            }



            System.out.println(Arrays.toString(m1));
        }
        else{
            System.out.println("Попробуйте снова!");
        }



        //4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
        //int i = new Random().nextInt(k); //это кидалка случайных чисел!)

        i = num;
        if (n != 0) {
            int[] m2 = new int[Short.MAX_VALUE + i - ((Short.MAX_VALUE / n) - (i / n))];
            int score = 0;
            for (int j = Short.MIN_VALUE; j < i; j++) {
                if (j % n != 0) {
                    m2[score] = j;
                    score++;
                }
            }


            System.out.println(Arrays.toString(m2));
        }
        else{
            System.out.println("Попробуйте снова!");
        }


    }

}
