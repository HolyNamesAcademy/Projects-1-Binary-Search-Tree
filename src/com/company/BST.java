package com.company;

public class BST {
    /**
     * head for the BST
     */
    private Node head;

    /**
     * Default constructor
     */
    public BST(){
        head = null;
    }

    /**
     * Constructor that takes in a node to start
     * @param n the node to set for BST
     */
    public BST(Node n){
        head = n;
    }

    /**
     * TO DO: Checks to see that the integer value can be found in the BST, returns true if found, false if not
     * @param: the number to search for in BST
     */

    public boolean contains(int num){
        throw new UnsupportedOperationException();
    }

    /**
     * TO DO: returns a String the pre-order version of the BST
     */

    public void displayPreOrder(){

    }

    /**
     * TO DO: helper recursive method to display preorder
     * @param curr the current node to print
     */

    private void displayPreOrder(Node curr){

    }

    /**
     * TO DO : prints the in-order version of the BST
     */

    public void displayInOrder(){

    }

    /**
     *  TO DO : helper recursive method to display in-order
     * @param curr the current node to print
     */
    private void displayInOrder(Node curr){

    }

    /**
     * TO DO: prints the post order version of the BST
     */
    public void displayPostOrder(){

    }
    /**
     *  TO DO : helper recursive method to display post order
     * @param curr the current node to print
     */

    private void displayPostOrder(Node curr){

    }

    /**
     * TO DO: Adds the node to the BST at the proper location. Returns true if element is not initially
     * contained, and therefore can be added to the BST. Returns false if number is already contained in BST.
     * @param n the number to add to the BST
     * @return true when Node is added, false if the integer is already in the BST and can't be added
     */

    public boolean add(int n){
        throw new UnsupportedOperationException();
    }

    /**
     * TO DO : helper recursive method to add the Node to the BST
     * @param curr the current node to check
     * @param n the node to add
     */

    private void add(Node curr, Node n){

    }

    /**
     * TO DO : Removes the node, if contained, from the BST, returns true if removed, false if not contained and not removed
     * @param n the number to remove from the BST
     * @return true if a Node with the number is removed, false if the number is not in the BST
     */

    public boolean remove(int n){
        throw new UnsupportedOperationException();
    }

    /**
     * TO DO: helper recursive method to remove the Node to the BST
     * @param curr the current node
     * @param n the number to remove from the BST
     */

    private void remove(Node curr, int n){

    }

    /**
     * TO DO: helper that returns the subtree that should replace node n after deleting it.
     *
     * Important Java tip: writing {@code n = n.getRight()} only changes the local parameter.
     * It does NOT update the parent's left/right link. Return the replacement node, and have
     * the caller use setLeft/setRight (or update head when deleting the root).
     *
     * Cases to handle when n is not null:
     * - no left child → return right child
     * - no right child → return left child
     * - two children → copy the inorder successor's value into n, then remove that successor
     *
     * @param n the node to remove from the tree structure
     * @return the node that should take n's place in the tree (may be null)
     */
    private Node makeDeletion(Node n){
        // Implement the cases above and remove the line below
        throw new UnsupportedOperationException();
    }
}
