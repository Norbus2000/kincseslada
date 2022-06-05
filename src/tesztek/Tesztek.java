package tesztek;

import nezet.gui;

public class Tesztek {
        
        public void visszaJelzesTeszt(){
        System.out.println();
        nezet.gui ablak = new gui();
        
        assert ablak.visszajelzes(0) == false : "Nem mukodik a visszajelzes";
        System.out.println("Mukodik");

        assert ablak.visszajelzes(1) == true : "Nem mukodik a visszajelzes";
        System.out.println("Mukodik");
        
        assert ablak.visszajelzes(2) == false : "Nem mukodik a visszajelzes";
        System.out.println("Mukodik");
        

        }
    }



