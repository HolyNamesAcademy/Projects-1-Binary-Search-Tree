import com.company.BST;
import com.company.Node;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit Tests for BST
 */
public class BSTTest{
    /**
     * Provided example: builds a small tree with setters (does not call add),
     * then checks contains for a value that is present.
     */
    @Test
   public void containsTestContainsTheSearchValue() {
        //        9
        //       /
        //      5
        //     /
        //    2
        //     \
        //      4
        Node root = new Node(9);
        Node five = new Node(5);
        Node two = new Node(2);
        Node four = new Node(4);
        root.setLeft(five);
        five.setLeft(two);
        two.setRight(four);

        BST tree = new BST(root);
        assertTrue(tree.contains(4));
    }

    @Test
    public void containsTestDoesNotContainTheSearchValue() {
        // Arrange: build a small tree (with setters and/or add once add works)
        // Act: call contains with a value that is NOT in the tree
        // Assert: assertFalse(...)
    }

    /**
     * TO DO: add a number that is already in the tree; the second add should return false
     */
    @Test
    public void addNumberAlreadyInTree(){
        // Arrange: create a tree and add a value once
        // Act: add the same value again
        // Assert: assertFalse(...)
    }

    /**
     * TO DO: remove a value that exists — require BOTH:
     * assertTrue(tree.remove(...)) and assertFalse(tree.contains(...))
     */
    @Test
    public void removeAValueInTree() {
        // Arrange: tree that contains a known value
        // Act: remove that value
        // Assert: assertTrue(removed) AND assertFalse(contains) — both required
    }

    /**
     * TO DO: remove a value that is not in the tree; should return false
     */
    @Test
    public void removeAValueNotInTree() {
        // Arrange: tree without the target value
        // Act: remove a missing value
        // Assert: assertFalse(...)
    }
}
