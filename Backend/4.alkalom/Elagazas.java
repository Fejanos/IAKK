/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package elagazas;

import java.util.Scanner;

/**
 *
 * @author János
 */
public class Elagazas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int szam = 5;
        
        // Elágazások if-else
        // if(feltétel) { utasítás }
        // else{ utasítás }
        if(szam >= 0){
            System.out.println("A szám pozitív!");
        }
        else{
            System.out.println("A szám negatív");
        }
        
        boolean feltetel = (szam >= 0);
        // Ha igaz
        // feltetel = true
        // !feltetel = false
        if(feltetel){
            System.out.println("A szám pozitív!");
        }
        // Különben
        else{
            System.out.println("A szám negatív!");
        }
        
        // Összehasonlító műveletek
        /*
        Egyenlőség: ==
        Tagadtás: !
        Nem egyenlő: !=
        Kisebb: a < b
        Kisebb vagy egyenlő: a <= b
        Nagyobb: a > b
        Nagyobb vagy egyenlő: a >= b
        */
        
        // Kérjünk be két számot, írjuk ki a nagyobbat
        // Adatbekérés
        System.out.println("Kérek egy számot: ");
        Scanner be = new Scanner(System.in); // Adatbekéréshez
        int a = be.nextInt(); // be.nextInt() számot vár a felhasználótól
        System.out.println("Kérek egy másik számot: ");
        int b = be.nextInt();
        // Döntsük el, hogy melyik nagyobb
        if(a < b){
            // %d - egész szám helymegörző
            // formázott kiírás
            System.out.printf("A %d nagyobb, mint %d", b, a);
        }
        else{
            System.out.printf("A %d nagyobb, mint %d", a, b);
        }
        
        // Logikai műveletek
        /*
        !: tagadás, nem -> SHIFT 4
        &&: logikai ÉS -> ALTGR C
        ||: logikai VAGY -> ALTGR W
        */
        
        // (2 > 3) && (3 > 2) => HAMIS
        // (3 > 2) || (2 > 3) => IGAZ
        
        int egesz = 30;
        if(egesz % 10 == 0 && egesz % 3 == 0){
            System.out.println("A 30 osztható 10-zel és 3-mal maradéknélkül.\n");
        }
        else{
            System.out.println("A 30 nem osztható maradéknélkül 10-zel és 3-mal.\n");
        }
        
        egesz = 27;
        if(egesz % 10 == 0 || egesz % 3 == 0){
            System.out.println("A 27 oszható 10-zel vagy 3-mal maradéknélkül.");
        }
        else{
            System.out.println("A 27 nem osztható maradéknélkül 10-zel és 3-mal sem.");
        }
        
        // Egybeágyazott elágazások
        /*
        if(){
            
        }
        else{
            if()
            {
                
            }
            else{
                if()
                {
                    
                }
            }
        }
        */
        
        // Célszerű - if - else if - else
        double szazalek = 60.0;
        // 0-39 elégtelen
        // 40-49 elégséges
        // 50-59 közepes
        // 60-79 jó
        // 80-100 jeles
        if(szazalek >= 80){
            System.out.println("Jeles");
        }
        else if(szazalek >= 60 && szazalek < 80){
            System.out.println("Jó");
        }
        else if(szazalek >= 50 && szazalek < 60){
            System.out.println("Közepes");
        }
        else if(szazalek >= 40 && szazalek < 50){
            System.out.println("Elégséges");
        }
        else{
            System.out.println("Elégtelen");
        }
        
        // Ternáris operátor
        // (feltétel) ? igaz : hamis
        boolean res = (szazalek % 2 == 0); // true | false
        // true = Páros | false = Páratlan
        String eredmeny = (szazalek % 2 == 0) ? "Páros" : "Páratlan";
        System.out.println(eredmeny);
        
        // Esetszétválasztás - Switch-case
        String honap = "Február";
        // switch(érték) ÉRTÉK alapján vizsgál
        // tulajdonképpen egyenlőséget vizsgák ==
        switch(honap){
            // if(honap == "Január")
            case "Január":
                System.out.println("01");
                break;
            // else if(honap == "Február")
            case "Február":
                System.out.println("02");
                break;
            // else if(honap == "Március")
            case "Március":
                System.out.println("03");
                break;
            // else ág
            default:
                System.out.println("Nincs ilyen hónap");
                break; // nem kötelező itt a break
        }
        
        // Felhasználó megad egy sorszámot, válaszul megkapja az melyik hónap
        // 1-12 , többi "nincs ilyen hónap"
    }
    
}
