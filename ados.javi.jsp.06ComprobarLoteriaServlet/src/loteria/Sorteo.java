/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loteria;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author javi
 */
public class Sorteo {
    private Map<String,Double> numerosPremiados;
    public Sorteo(){
        numerosPremiados = new HashMap<>();
        numerosPremiados.put("00000",1000.0);
        numerosPremiados.put("11111",1000.0);
        numerosPremiados.put("22222",3000.0);
        numerosPremiados.put("33333",4000.0);
        numerosPremiados.put("44444",5000.0);
        numerosPremiados.put("55555",6000.0);
        numerosPremiados.put("66666",7000.0);
        numerosPremiados.put("77777",8000.0);
        numerosPremiados.put("88888",9000.0);
        numerosPremiados.put("99999",10000.0);
    }
    public double getPremio(String numero,double cantidad){
        Double premio = numerosPremiados.get(numero);
        if(premio != null){
            return cantidad * premio /20;
        } else return 0;
    }
    
}
