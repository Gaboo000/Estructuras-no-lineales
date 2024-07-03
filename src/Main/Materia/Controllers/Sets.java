package main.Materia.Controllers;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class Sets {
    public Sets(){
        construirHashSet();
        construirLinkedHashSet();
        contruirTreeSet();
        construirTreeSetConComparador();

    }

    public void construirHashSet(){
        HashSet <String> conjunto = new HashSet<>();
        
        conjunto.add("Manzana");
        System.out.println(conjunto);
        conjunto.add("Banana");
        System.out.println(conjunto);
        conjunto.add("Naranja");
        System.out.println(conjunto);
        conjunto.add("Manzana"); // Duplicado, no se añadirá
        System.out.println(conjunto);
        conjunto.add("Uvas");
        System.out.println(conjunto);
        conjunto.add("Pera");
        System.out.println(conjunto);
        System.out.println("HashSet: " + conjunto);

        boolean contieneNaranja = conjunto.contains("Naranja");
        System.out.println("HashSet contiene Narnaja? "+conjunto);
        
        
        //obtener el tamaño del conjunto 
        int tamano = conjunto.size();
        System.out.println("Tamaño del HashSet: "+tamano);

    }

    // Construir y mostrar un HashSet
    public void construirLinkedHashSet (){
        LinkedHashSet <String> conjunto = new LinkedHashSet<>();
        conjunto.add("Manzana");
        System.out.println(conjunto);
        conjunto.add("Banana");
        System.out.println(conjunto);
        conjunto.add("Naranja");
        System.out.println(conjunto);
        conjunto.add("Manzana"); // Duplicado, no se añadirá
        System.out.println(conjunto);
        conjunto.add("Uvas");
        System.out.println(conjunto);
        conjunto.add("Pera");
        System.out.println(conjunto);
        System.out.println("LinkedHashSet: " + conjunto);


        
    }


    public void contruirTreeSet (){
        TreeSet <String> conjunto = new TreeSet<>();
        conjunto.add("Manzana");
        conjunto.add("Banana");
        conjunto.add("Naranja");
        conjunto.add("Manzana"); // Duplicado, no se añadirá
        conjunto.add("Uvas");
        conjunto.add("Pera");
        System.out.println("TreeSet: " + conjunto);

    }

    public void construirTreeSetConComparador(){
        Comparator<String> ComparadorOrdenInverso = new Comparator <String> () {
            @Override 
            public int compare(String s1, String s2){
                return s2.compareTo(s1);
            }
            
        };
        TreeSet <String> conjunto = new TreeSet<>(ComparadorOrdenInverso);
        conjunto.add("Manzana");
        conjunto.add("Banana");
        conjunto.add("Naranja");
        conjunto.add("Manzana"); // Duplicado, no se añadirá
        conjunto.add("Uvas");
        conjunto.add("Pera");
        System.out.println("TreeSetComparator: " + conjunto);

    }

    
}
