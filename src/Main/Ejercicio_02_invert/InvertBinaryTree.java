package main.Ejercicio_02_invert;

import main.Materia.Models.Node;

public class InvertBinaryTree {

    public Node invertTree(Node root) {
        if (root == null){
            return null;

        }
        Node left = invertTree(root.getLeft());
        Node rigth = invertTree(root.getRight());
        root.setLeft(left);
        root.setRight(rigth);
        return root;
    }
    
}
