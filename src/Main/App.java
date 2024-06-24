package main;

import main.Materia.Controllers.ArbolesBinarios;
import main.Materia.Models.Node;

public class App {
    public static void main(String[] args) throws Exception {
        ArbolesBinarios arbolBinario = new ArbolesBinarios();
        Node nodeRoot = new Node(1);
    
        nodeRoot.setLeft(new Node(2));
        nodeRoot.setRight(new Node(3));

        nodeRoot.getLeft().setLeft(new Node(4));
        nodeRoot.getLeft().setRight(new Node(5));

        nodeRoot.getRight().setRight(new Node(6));
        nodeRoot.getLeft().getLeft().setLeft(new Node(7));

        nodeRoot.getLeft().getRight().setLeft(new Node(8));

        System.out.println("\n pretOrder - Loop");
        arbolBinario.preOrderLoop(nodeRoot);
        System.out.println("\n PreOrder - Recursivo");
        arbolBinario.preOrderRecursivo(nodeRoot);
        System.out.println("\n postOrder - Loop");
        arbolBinario.postOrderLoop(nodeRoot);
        System.out.println("\n postOrder - Recursivo");
        arbolBinario.postOrderRecursivo(nodeRoot);
        System.out.println("\n inOrder - Recursivo");
        arbolBinario.inOrderRecursivo(nodeRoot);
        






    
    }

    


}
