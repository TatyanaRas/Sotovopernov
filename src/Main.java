import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int a = 100;//средства на счете
        int b = 1100;// сумма пополнения
        int e = 0;//начальная сумма бонусов
        int d = b / 100 * 1;//бонусы за пополнение
        int f = e + d;//итоговая сумма бонусов
        int c = a + b + f;//итоговая сумма на счете с бонусами
        if (b > 1000) {
            System.out.println(f);//колличество бонусных рублей
            System.out.println(c);//сумма на счете
        } else {
            System.out.println(e);//бонусы
            System.out.println(a + b);//сумма на счете

        }


    }
}