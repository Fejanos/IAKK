/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tombok_listak;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author János
 */
public class Tombok_Listak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a = 2;
        int b = 3;
        
        // Tömb 1D
        // lineáris: ([1][2][3][4]....)
        // Fix méretűek, mérete nem változtatható a futás során
        // Indexelés
        /*
            [10 3 5 7 9] => 5 elemű
             0. 1 2 3 4  => elemszám -1
             5. index --> hiba
        */
        
        // Tömb létrehozása
        // típus[] neve = new tipus[maxelemszám];
        int[] szamok = new int[2]; // 2 elemű tömb
        // ilyenkor 0-kat tartalmaz
        
        // tomb[index] - ez egy érték
        szamok[0] = a; // tömb első eleme = az 'a' értékben lévő elem
        szamok[1] = b; // tömb második eleme
        //szamok[2] = 4; // ez egy hibás sor, mivel csak 2 elemű!
        
        // %d - egész érték helymegörző
        // \n - sortörés
        System.out.printf("számok[0] = %d\n", szamok[0]);
        System.out.printf("számok[1] = %d\n", szamok[1]);
        
        // tömb elemszáma, hossza
        int hossz = szamok.length;
        System.out.println("A számok tömb hossza: " + hossz);
        
        /*
        float[]
        int[]
        String[]
        double[]
        char[]
        object[]
        bool[]
        */
        
        String szo = "almafa";
        // szo[3] = a
        char[] szo_bontva = new char[6];
        szo_bontva = szo.toCharArray();
        
        /*
        Hozzon létre egy három egész számot tároló tömböt, 
        majd számítsa ki az összegüket és írja ki az eredményt!
        */
        // Létrehozás
        int[] t = new int[3];
        t[0] = 3;
        t[1] = 2;
        t[2] = 9;
        int eredmeny = t[0] + t[1] + t[2];
        System.out.println("Összeg: " + eredmeny);
        
        // String tömb
        String[] szavak = new String[3];
        szavak[0] = "alma";
        szavak[1] = "körte";
        szavak[2] = "eper";
        
        // konkrét értékek az indexen
        String[] szavak2 = {"alma", "körte", "eper"}; // 3 elemű
        
        // Tömbökd 2D - mátrixok/táblázatok
        // Létrehozás
        int[][] matrix = new int[3][3]; // [sor][oszlop] 3x3 üres
        int[][] matrix2 = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        }; // 3x3 konkrét elemekkel
        // [0][0] = 1   [0][1] = 2  [0][2] = 3
        // [1][0] = 4   [1][1] = 5  [1][2] = 6
        // [2][0] = 7   [2][1] = 8  [2][2] = 9
        // Sorok számának lekérdezése
        int sor = matrix2.length;
        // Oszlopok számának lekérdezése
        int oszlop1 = matrix2[0].length; // első sor oszlopainak száma
        int oszlop2 = matrix2[1].length; // 2. sor oszlopainak száma
        int oszlop3 = matrix2[2].length; // 3. sor oszlopainak száma
        
        /*
        Hozzon létre egy 3x2-es tömböt, amely tartalmazza bolti termékek nevét és azok árát! 
        Ezután írja ki a második termék nevét és az árát!
        */
        String[][] termekek = {
            {"Kenyér", "1000 Ft"},
            {"Tej", "520 Ft"},
            {"Parizer", "600 Ft"}
        };
        System.out.println("Termék neve: " + termekek[1][0] + " - " + termekek[1][1]);
        
        
        // Listák - dinamikus tömbök
        // Létrehozása
        // int - Integer
        List<Integer> szamLista = new ArrayList<>();
        // indexelés 0-ról indul itt is
        // Lista metódusok
        // Elem hozzáadása
        szamLista.add(10); // {10}
        szamLista.add(4); // {10, 4}
        szamLista.add(6); // {10, 4, 6}
        // a lista végére fűzi az elemeket
        
        // Lista mérete
        int listaMeret = szamLista.size(); // 3
        
        // Elem lekérdezése
        int kivalasztott = szamLista.get(0); // 10
        
        // Elem törlése
        szamLista.remove(1); // 4-es elem törlése
        // {10, 6}
        
        // Elem módosítása
        szamLista.set(1, 9); // 1. indexen lévő elemet módosítja 9-re
        // {10, 9}
        
        // Lekérdezés elem alapján, indexet adja vissza
        int index = szamLista.indexOf(10); // 10-es elem indexe = 0
        // 0
        
        // Tartalmaz x -et?
        boolean tartalmaz = szamLista.contains(10); // true
        
        // Lista ellenőrzés, hogy üres-e
        boolean ures = szamLista.isEmpty();
        
        // Lista törlése, tisztítása
        szamLista.clear(); // {} üres lista

        /*
        Hozzon létre egy ArrayList-et, amely három nevet tárol! 
        Ezután:
        - Írja ki a második nevet!
        - Adjon hozzá egy új nevet a listához!
        - Írja ki a lista teljes méretét!
        */
        //List<String> nevek = List.of("Zoltán", "Emese", "Gábor");
        List<String> nevek = new ArrayList<>();
        nevek.add("Zoltán");
        nevek.add("Emese");
        nevek.add("Gábor");
        // Írjuk ki a 2. nevet
        System.out.println("Név: " + nevek.get(1));
        //  Adjunk hozzá új nevet
        nevek.add("Márió");
        // Írjuk ki az aktuális lista méretet
        System.out.println("A lista mérete: " + nevek.size());
    }
    
}
