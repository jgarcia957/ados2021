/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _01ejercicios._01basicos;
import java.util.Scanner;
import java.time.*;
import java.util.Date;
import java.time.temporal.ChronoUnit;
/**
 *
 * @author radha
 */
public class _07TiempoViaje {
    public static void main(String[] args) {
        Scanner tec = new Scanner (System.in);
        //LocalTime eixida_old, arrivada_old;
        LocalTime arrivada_new;
        LocalTime eixida_old, arrivada_old;
        int hora, minuts;        
        double millora; //15%
        long diferencia;
        
        
        System.out.print("Introdueix l'hora d'eixida (hora:minuts): ");
        //hora = tec.nextInt();
        //minuts = tec.nextInt();tec.nextLine();
        //eixida_old = LocalTime.of(hora, minuts);
        eixida_old = LocalTime.parse(tec.nextLine());
        
        System.out.print("Introdueix l'hora d'arribada (hora:minuts): ");
        //hora = tec.nextInt();
        //minuts = tec.nextInt();tec.nextLine();              
        //arrivada_old = LocalTime.of(hora, minuts);
        arrivada_old = LocalTime.parse(tec.nextLine());
        
        
        
        System.out.println(eixida_old) ;
        System.out.println(arrivada_old) ;
        
        diferencia = eixida_old.until(arrivada_old, ChronoUnit.MINUTES);
        
        System.out.println(diferencia);
        //Una altra forma de calcular la diferència de temps entre instants
        System.out.println(ChronoUnit.MINUTES.between(eixida_old, arrivada_old));
        
        millora = diferencia * 0.15;
        
        //arrodonim cap amunt i no tenim en compte els segons
        arrivada_new = arrivada_old.minus((long)Math.ceil(millora), ChronoUnit.MINUTES);
        
        
        System.out.println(millora);
        System.out.println(arrivada_new);
    }
}
