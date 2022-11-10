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
        System.out.println("За 1 месяц машины произвела бутылок " + oneMonth + " штук");
// Задача 5
        int cansClassroom = 2 + 4;
        int numberClassrooms = 120 / cansClassroom;
        int whiteCans = numberClassrooms * 2;
        int brownCans = numberClassrooms * 4;
        System.out.println("В школе, где " + numberClassrooms + " классов, нужно " + whiteCans + " банок белой краски и " + brownCans + " банок коричневой краски");
// Задача 6
        int banana = 5;
        int milk = 2;
        int iceCream = 2;
        int eggs = 4;
        banana = banana * 80;
        milk = milk * 105;
        iceCream = iceCream * 100;
        eggs = eggs * 70;
        float breakfast = banana + milk + iceCream + eggs;
        float breakfast1 = breakfast / 1000;
        System.out.println(breakfast1);
// Задача 7
        int maxDays = 7000 / 250;
        int minDays = 7000 / 500;
        int medium = (250 + 500) / 2;
        float mediumDays = (float) 7000 / medium ;
        System.out.println(maxDays);
        System.out.println(minDays);
        System.out.println(mediumDays);
// Задача 8
        double masha = 67760;
        double denis = 83690;
        double kristine = 76230;
        double mashaYear = masha * 12;
        double denisYear = denis * 12;
        double kristineYear = kristine * 12;
        double masha1 = masha * 1.1;
        double denis1 = denis * 1.1;
        denis1 = (int) denis1;
        double kristine1 = kristine * 1.1;
        double mashaYear1 = masha1 * 12;
        double denisYear1 = denis1 * 12;
        double kristineYear1 = kristine1 * 12;
        int masha2 = (int) (mashaYear1 - mashaYear);
        int denis2 = (int) (denisYear1 - denisYear);
        int kristine2 = (int) (kristineYear1 - kristineYear);
        System.out.println("Маша теперь получает " + masha1 + " рублей. Годовой доход вырос на " + masha2 + " рублей");
        System.out.println("Денис теперь получает " + denis1 + " рублей. Годовой доход вырос на " + denis2 + " рублей");
        System.out.println("Кристина теперь получает " + kristine1 + " рублей. Годовой доход вырос на " + kristine2 + " рублей");
    }
}