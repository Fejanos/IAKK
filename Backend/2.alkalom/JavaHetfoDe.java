/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javahetfode;

/**
 *
 * @author János
 */
public class JavaHetfoDe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        /*
        többsoros
        komment
        */
        // egysoros komment
        
        // sout(kiirandó szövveg, tartalom); - konzolra írás
        System.out.println("Hello World!");
        System.out.println(2+3);
        
        // Primitív típusok
        
        // Számtípus
        int a; // Deklaráció
        a = 3; // Definiálás
        int b = 2;
        int eredmeny = a+b;
        System.out.println(eredmeny);
        
        // Aritmetikai művletek
        // Összeadás +
        // Kivonás -
        // Szorzás *
        // Osztás (valós) /
        // Maradékos osztás %
        
        int kivonas = a-b;
        System.out.println(a + " - " + b + " = " + kivonas);
        
        //System.out.format("%d",a);
        System.out.format("%d * %d = %d", a, b, (a*b));
        
        // \n sortörés
        System.out.println("\nsortörés");
        
        System.out.println(a%b); // 1
        System.out.println(a/b); //
        
        // Nem egész típus
        float c = 3;
        float eredmeny2 = c / b; // 3 / 2
        System.out.println(eredmeny2); // 1.5
        
        double d1 = c / b; // precízebb mint a float, több tizedest képes tárolni
        System.out.println(d1);
        
        // Karakter típus
        char karakter = 'a'; // aposztrof közé egyetlen karakter
        System.out.println(karakter);
        
        // Szöveg típus - Nem primitív típus
        String szoveg = "Hello, World!";
        System.out.println(szoveg);
        // + konkatenáció - összefűzés
        String szo1 = "alma";
        String szo2 = "fa";
        String szo3 = szo1 + szo2;
        System.out.println(szo3);
        
        String szam1 = "6";
        String szam2 = "7";
        System.out.println(szam1 + szam2);
        
        // Konstans - értéke nem változtatható
        final double PI = 3.14; // Konstansok elnevezési konveció NAGYBETŰ - SNAKE_CASE
        
        // Konvenciók
        String szemelyiIgazolvany = "....."; // camelCase - metódusok esetén is
        
        // Feladat: aritmetikai műveletek megjelenítése: operandus művelet operátor = eredmény;
        int num1 = 2; int num2 = 4;
        System.out.printf("%d + %d = %d%n", num1, num2, (num1+num2));
        // %d - egész szám
        // %f - float, lebegőpontos szám --> kettőtizedes %.2f
        //System.out.printf("%.2f", 3.123456);
        // %n - új sor (\n)
        // %s - String, szöveg
    }
    
}
