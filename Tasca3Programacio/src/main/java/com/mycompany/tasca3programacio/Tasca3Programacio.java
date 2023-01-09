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
        
        System.out.println("Introdueix la longitud en cm del radi:");
        double radi = sc.nextDouble();
        
        double area = Math.PI*Math.pow(radi, 2);
        
        System.out.println("L'àrea del cercle de radi:" + radi + " és: " + area);
        
    }
}
