public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1 ");
        int i= 0;
        for (i =0; i<=10; i++) {
            System.out.println(i);
        }

        System.out.println("         ");
        System.out.println("Задача 2 ");
        int I= 10;
        for (I =10; I>=0; I--) {
            System.out.println(I);
        }

        System.out.println("         ");
        System.out.println("Задача 3 ");
        int A= 0;
        for (A =0; A<=17; A++) {
            if (A%2==0) {
                System.out.println(A);
            }
        }

        System.out.println("         ");
        System.out.println("Задача 4 ");
        int B= 10;
        for (B =10; B>=-10; B--) {
            System.out.println(B);
        }


        System.out.println("         ");
        System.out.println("Задача 5 ");
        int C= 1904;
        for (C =1904; C<=2096; C=C+4) {
            System.out.println(C+" год является високосным");
        }


        System.out.println("         ");
        System.out.println("Задача 6 ");
        int D = 7;
        for (D=7; D<=98; D=D+7) {
            System.out.println(D);
        }


        System.out.println("         ");
        System.out.println("Задача 7 ");
        int E = 1;
        for (int e=0; e<9; e++) {
            E=E*2;
            System.out.println(E);
        }

        System.out.println("         ");
        System.out.println("Задача 8 ");
        int saving = 29000;
        int month = 0;
        for (month=0; month<=12; month=month+1 ) {
            saving = saving + saving;
            System.out.println("Месяц "+month+" сумма накоплений равна "+saving+" рублей");
        }

        System.out.println("         ");
        System.out.println("Задача 9 ");
        int total = 29000;
        int month1 = 0;
        for (int iI=0; iI <= 12; iI=iI+1 ) {
            total = (total/100)+total+total ;
            System.out.println("Месяц "+month1+" сумма накоплений равна "+total+" рублей");
        }
    }
}