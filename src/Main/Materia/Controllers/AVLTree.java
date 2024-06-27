package main.Materia.Controllers;

import main.Materia.Models.Node;

public class AVLTree {
    private Node root;


    //Obtener la altura de un node 
    private int height(Node node){
        if (node == null){
            return 0;
        }
        return node.getHeight();
    }

    // Metodo que obtenga el factor de balanceo o equilibrio de un nodo
    private int getBalance(Node node){
        if (node == null){
            return 0;
        }
        return height(node.getLeft()) - height(node.getRight());
    }

    public Node insert (Node node, int value){
        if (node == null){
            return new Node(value);
        }

        if (value > node.getValue()){
            node.setRight((insert(node.getRight(),value)));
        }else if (value < node.getValue()){
            node.setLeft(insert(node.getLeft(), value));
        }else {
            return node;
        }
        

        //Actualizar la altura del predecesor o el antecesor
        node.setHeight(1+Math.max(height(node.getLeft()),height(node.getRight())));

        ///calcular el balance
        int balance = getBalance(node);

        /// si el nondo esta desbalanceado se tiene 3 casos

        //caso izquierda - izquierda
        if(balance > 1 && value < node.getLeft().getValue()){
            return rightRotate(node);

        }

        /// caso derecha - derecha 
        if ( balance <- 1 && value > node.getRight().getValue()){
            return leftRotate(node);
        }


        //caso izquierda derecha
        if ( balance >1 && value > node.getLeft().getValue()){
            node.setLeft(leftRotate(node.getLeft()));
            return leftRotate(node);

        }


        /// caso derecha - izquierda 
        if (balance <-1 && value < node.getRight().getValue()){
            node.setLeft(rightRotate(node.getRight()));
            return rightRotate(node);

        }
        System.out.println("Nodo a insertar: "+node.getValue()+", Balance: "+ balance);
        return node;
    }

    private Node rightRotate(Node nodeR){
        System.out.println("Rotacion derecha en: "+nodeR.getValue()+", Balance "+getBalance(nodeR));
        Node x = nodeR.getLeft();
        
        Node temp = x.getRight();


        /////
        

        //realizar la rotacion
        x.setRight(nodeR);
        nodeR.setLeft(temp);


        //actualizando las alturas
        nodeR.setHeight(Math.max(height(x.getLeft()),height(nodeR.getRight()))+1 );
        //devolder nueva raiz

        return x;

    }

    private Node leftRotate(Node nodeR){
        System.out.println("Rotacion izquierda en: "+nodeR.getValue()+", Balance "+getBalance(nodeR));

        Node y = nodeR.getRight();
        Node temp = y.getLeft();
        // Realizar la rotación
        y.setLeft(nodeR);
        nodeR.setRight(temp);

        // Actualizar las alturas
        nodeR.setHeight(Math.max(height(nodeR.getLeft()), height(nodeR.getRight()))+1);
        y.setHeight(Math.max(height(y.getLeft()), height(y.getRight()))+1);
    
        // Devolver una raíz
        return y;
    }
    

    public void insert(int value){
        System.out.println("Nodo a insertar sera el "+value);
        root = insert(root,value);
        printTree();
        System.out.println("\n-------\n");
    }

    public void printTree(){
        printTreeNode2(root,"",true);

    }

    public void printTreeNode2(Node root, String prefix, boolean isLeft) {

        if (root != null) {
            System.out.println(prefix + (isLeft ? "├── " : "└── ") + root.getValue());
            if (root.getLeft() != null || root.getRight() != null) {
                if (root.getLeft() != null) {
                    printTreeNode2(root.getLeft(), prefix + (isLeft ? "│   " : "    "), true);
                } else {
                    System.out.println(prefix + (isLeft ? "│   " : "    ") + "├── null");
                }
                if (root.getRight() != null) {
                    printTreeNode2(root.getRight(), prefix + (isLeft ? "│   " : "    "), false);
                } else {
                    System.out.println(prefix + (isLeft ? "│   " : "    ") + "└── null");
                }
            }
        }
    }

    
}
