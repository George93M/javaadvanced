package com.sda.george.advanced.recap;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.*;

public class CollectionsMain {

    public static void main(String[] args) {
           Profesor profesor = new Profesor(55, "Dan", Gender.MALE, 2500, "Math");
           Profesor profesor2 = new Profesor(50, "Ana", Gender.FEMALE, 3000, "History");
           Profesor profesor3 = new Profesor(51, "Paul", Gender.MALE, 5000, "Chemestry");



           List<Profesor> listOfProfesors = new ArrayList<>();
        listOfProfesors.add(profesor);
        listOfProfesors.add(profesor2);
        listOfProfesors.add(profesor3);
        System.out.println(listOfProfesors);

        System.out.println(listOfProfesors.get(listOfProfesors.size()-1));

        Set<Profesor> setOfProfesor = new HashSet<>(listOfProfesors);
 //     setOfProfesor.addAll(listOfProfesors);
        System.out.println(setOfProfesor);

        Map<String, Profesor> profesorMap= new HashMap<>();
        profesorMap.put("Cluj-Napoca",profesor);
        profesorMap.put("Dej",profesor2);
        profesorMap.put("Bucuresti",profesor3);
        System.out.println(profesorMap);

        // entrySet cand nu stim valoarea
        //cand vreau sa parcurg elementele si nu stiu care
        //entry = un element din map de forma cheie si valoare

        for (Map.Entry<String,Profesor> entry : profesorMap.entrySet()) {
            System.out.println(entry.getValue());
            System.out.println(entry.getKey());
            // daca sterg printurile nu mai apare unu sub altu
        }
        try{  //incepem blocul de try in care codul POATE SA ARUNCE exceptia
            File file= new File(new URI(" ")); // instructiunea de cod care poate sa arunce exceptia
        }catch (URISyntaxException exception) { //exceptia care ne asteptam sa fie aruncata
            System.out.println("ERROR IN OPENING FILE"); //codul care vrem sa ruleze in caz de exceptie
        }

    }
}



//implementeaza hashcode si equals altfel am avea elemente duplicate
// setu se foloseste cand vrem sa avem elemente unice si sa nu avem duplicate
// stack trace - urmarirea exceptiei in consola de jos in sus
//exceptiile unchecked extind runtimeexception
//checked extind exception
//codul din catch re ruleaza doar in momentul in care a fost aruncata o exceptie + tipul de exceptie care ne asteptam sa apara
// exceptiile trebuie prinse cu try and catch