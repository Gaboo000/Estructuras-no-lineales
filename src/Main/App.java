package main;

import main.Materia.Controllers.AVLTree;
import main.Materia.Controllers.ArbolesBinarios;
import main.Materia.Controllers.Graph;
import main.Materia.Controllers.Sets;
import main.Materia.Models.Node;
import main.Materia.Models.NodeGraph;

public class App {
    public static void main(String[] args) throws Exception {
        /*ArbolesBinarios arbolBinario = new ArbolesBinarios();
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
        int[] values = { 10, 20, 15, 24, 9, 8, 21, 23, 50, 25 };

        AVLTree tree = new AVLTree();

        for (int value : values) {
            tree.insert(value);
        }
        System.out.println("Estructuras no Lineales");
        runGraph();*/
        runSets();
    }

    


    private static void runSets() {
        new Sets();
    }



    /* 
    private static void runGraph() {
        Graph graph = new Graph();

        //agregar nodos
        //NodeGraph node1 = new NodeGraph(1);


        NodeGraph node1 = graph.addNode(1);
        NodeGraph node2 = graph.addNode (2);
        NodeGraph node3 = graph.addNode(3);
        NodeGraph node4 = graph.addNode(4);
        NodeGraph node5 = graph.addNode(5);

        graph.addEdge(node1, node2);
        graph.addEdge(node3, node1);
        graph.addEdge(node2, node4);
        graph.addEdge(node4, node5);



        graph.printGraph();

    }*/

    


}
