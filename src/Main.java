public class Main {
    public static void main(String[] args) {;
        int i = 1;
        byte b = 2;
        short s =3;
        long l = 4;
        float f = 1;
        double d = 2.22;
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);
// Задача 2
        float q = (float) 27.12;
        long w = 987678965549L;
        byte e = 2;
        short r = 786;
        boolean z = 5 < 10;
        short t = 569;
        short y = -159;
        short u = 27897;
        byte a = 67;
        char c = 36;
// Задача 3
        byte lp = 23;
        byte as = 27;
        byte ea = 30;
        byte all = (byte) (lp + as + ea);
        short paperStudent = (short) (480 / all);
        System.out.println("На каждого ученика рассчитано " + paperStudent + " листов бумаги");
// Задача 4
        int twentyMinutes = 16 * 20 / 2;
        int oneDay = 16 * 24 * 60 / 2;
        int threeDays = 16 * 3 * 24 * 60 / 2;
        int oneMonth = 16 * 30 * 24 * 60 / 2;
        System.out.println("За 20 минут машины произвела бутылок " + twentyMinutes + " штук");
        System.out.println("За сутки машины произвела бутылок " + oneDay + " штук");
        System.out.println("За 3 дня машины произвела бутылок " + threeDays + " штук");
        System.out.println("За 1 месяц машины произвела бутылок " + oneMonth + " штук ");
    }
}