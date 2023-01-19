/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tasca3programacio;

import java.util.Scanner;

/**
 *
 * @author Borja
 */
public class Tasca3Programacio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        //Primer programa: Un fruiter necessita calcular els beneficis anuals que obté de la venda de pomes i peres. Per aquest motiu, és necessari dissenyar una aplicació que demani les vendes (en quilos) de cada trimestre per cada fruita.
        System.out.println("Introdueix els quilos de pomes del primer trimestre:");
        int kgPomesPrimerTrimestre = sc.nextInt();
        
        System.out.println("Introdueix els quilos de pomes del segon trimestre:");
        int kgPomesSegonTrimestre = sc.nextInt();
        
        System.out.println("Introdueix els quilos de pomes del tercer trimestre:");
        int kgPomesTercerTrimestre = sc.nextInt();
        
        System.out.println("Introdueix el preu del quilo de pomes:");
        double preuKgPomes = sc.nextDouble();
        
        int totalKgPomes = kgPomesPrimerTrimestre + kgPomesSegonTrimestre + kgPomesTercerTrimestre;
        double totalIngresosPomes = totalKgPomes * preuKgPomes;
        
        System.out.println("Introdueix els quilos de peres del primer trimestre:");
        int kgPeresPrimerTrimestre = sc.nextInt();
        
        System.out.println("Introdueix els quilos de peres del segon trimestre:");
        int kgPeresSegonTrimestre = sc.nextInt();
        
        System.out.println("Introdueix els quilos de peres del tercer trimestre:");
        int kgPeresTercerTrimestre = sc.nextInt();
        
        int totalKgPeres = kgPeresPrimerTrimestre + kgPeresSegonTrimestre + kgPeresTercerTrimestre;
        
        System.out.println("Introdueix el preu del quilo de peres");
        double preuKgPeres = sc.nextDouble();
        double totalIngresosPeres = totalKgPeres * preuKgPeres;
        
        double totalIngresos = totalIngresosPomes + totalIngresosPeres;
        System.out.println("El total d'ingresos de pomes i peres és: " + totalIngresos);
        
        //Programa 2: Dissenyar una aplicació que calculi la longitud i l’àrea d’una circumferència. Per fer-ho, l’usuari ha d’introduir la longitud del radi.
        System.out.println("Introdueix la longitud en cm del radi:");
        double radi = sc.nextDouble();
        
        double area = Math.PI*Math.pow(radi, 2);
                
        double longitud = 2*Math.PI*radi;
        
        System.out.println("L'àrea del cercle de radi: " + radi + " és: " + area + ". I la seva longitud és: " + longitud);
        
        //Programa 3: Dissenyar una aplicació que sol·liciti a l’usuari una quantitat de segons. L’aplicació ha de mostrar quantes hores, minuts i segons hi ha en el nombre de segons introduïts per l’usuari.
        
        System.out.println("Introdueix una quantitat de segons:");
        
        int segonsIntroduits = sc.nextInt();
        int hores = segonsIntroduits / 3600;
        int minuts = (segonsIntroduits % 3600) / 60;
        int segons = (segonsIntroduits % 3600) % 60;
        //Aquí tenim la sortida representada en hores, minuts i segons
        System.out.println("Hores: " + hores + ". \n" + ". Minuts: " + minuts + ". \n" + "Segons: " + segons + ".");

    }
}
