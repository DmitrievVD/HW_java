
public class HW2 {

    public static String reverse(String str) { // метод чтобы перевернуть строку с помощью рекурсии
        if (str.length() <= 1) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) {
//        1.Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).

        String str1 = "Hello world!!!";
        String str2 = "llo";
        int t = 0;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(t)){
                if (str1.charAt(i + str2.length() - 1) == str2.charAt(str2.length() - 1)){
                    t = i;
                    break;
                }
            }
        }


        System.out.println(str1.contains(str2));
        System.out.println("Вхождение с " + t);




//        2.Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).

        String string1 = "ABD";
        String string2 = "BDA";

        if ((string1.length() == string2.length()) && ((string1 + string1).indexOf(string2) != -1)) {
            System.out.println("Являются");

        }else {
            System.out.println("Не являются");
        }


//        3.*Напишите программу, чтобы перевернуть строку с помощью рекурсии.

        String str_hi = "Hello world";
        System.out.println(reverse(str_hi));




//        4.Дано два числа, например 3 и 56, необходимо составить следующие строки:
//        3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().

        int x = 3;
        int y = 56;

        int sum_i = x + y;
        StringBuilder sum = new StringBuilder();
        sum.append(x + " + " + y + " = " + sum_i);
        System.out.println(sum);

        int diff_i = x - y;
        StringBuilder diff = new StringBuilder();
        diff.append(x + " - " + y + " = " + diff_i);
        System.out.println(diff);

        int mt_i = x * y;
        StringBuilder mt = new StringBuilder();
        mt.append(x + " * " + y + " = " + mt_i);
        System.out.println(mt);

        float div_i = (float) x / y;
        StringBuilder div = new StringBuilder();
        div.append(x + " / " + y + " = " + div_i);
        System.out.println(div);


//        5.Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().

//        sum.insert(8, "равно");
//        sum.deleteCharAt(7);
//        System.out.println(sum);
//
//        diff.insert(8, "равно");
//        diff.deleteCharAt(7);
//        System.out.println(diff);
//
//        mt.insert(8, "равно");
//        mt.deleteCharAt(7);
//        System.out.println(mt);
//
//        div.insert(8, "равно");
//        div.deleteCharAt(7);
//        System.out.println(div);


//        6.*Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().

        sum.replace(7,8, "равно");
        System.out.println(sum);

        diff.replace(7,8, "равно");
        System.out.println(diff);

        mt.replace(7,8, "равно");
        System.out.println(mt);

        div.replace(7,8, "равно");
        System.out.println(div);

//        7.**Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.

        String str = "";

        long begin1 = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            str += "a";
        }
        long end1 = System.currentTimeMillis();

        System.out.println("Строка: " + (end1 - begin1));

        StringBuilder str_b = new StringBuilder();

        long begin2 = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            str_b.append("a");
        }

        long end2 = System.currentTimeMillis();

        System.out.println("Строка билд: " + (end2 - begin2));

        System.out.println("Разница: " + ((end1 - begin1) - (end2 - begin2)));

    }
}
