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
        final double PREU_KG_POMES = 2.35;
        final double PREU_KG_PERES = 1.95;
        
        System.out.println("Introdueix els quilos de pomes del primer trimestre:");
        int kgPomesPrimerTrimestre = sc.nextInt();
        
        System.out.println("Introdueix els quilos de pomes del segon trimestre:");
        int kgPomesSegonTrimestre = sc.nextInt();
        
        System.out.println("Introdueix els quilos de pomes del tercer trimestre:");
        int kgPomesTercerTrimestre = sc.nextInt();
        
        int totalKgPomes = kgPomesPrimerTrimestre + kgPomesSegonTrimestre + kgPomesTercerTrimestre;
        double totalIngresosPomes = totalKgPomes * PREU_KG_POMES;
        
        System.out.println("Introdueix els quilos de peres del primer trimestre:");
        int kgPeresPrimerTrimestre = sc.nextInt();
        
        System.out.println("Introdueix els quilos de peres del segon trimestre:");
        int kgPeresSegonTrimestre = sc.nextInt();
        
        System.out.println("Introdueix els quilos de peres del tercer trimestre:");
        int kgPeresTercerTrimestre = sc.nextInt();
        
        int totalKgPeres = kgPeresPrimerTrimestre + kgPeresSegonTrimestre + kgPeresTercerTrimestre;
        double totalIngresosPeres = totalKgPeres * PREU_KG_PERES;
        
        double totalIngresos = totalIngresosPomes + totalIngresosPeres;
        System.out.println("El total d'ingresos de pomes i peres és: " + totalIngresos);
    }
}
