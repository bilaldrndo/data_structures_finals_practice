public class DSBinarySearchTree<Key extends Comparable<Key>, Value> extends BinarySearchTree<Key, Value> {

    public Key findMax() {
        if (root == null) {
            return null;
        }
        Node<Key, Value> maxNode = findMax(root);
        return maxNode.key;
    }

    private Node<Key, Value> findMax(Node<Key, Value> x) {
        if (x.right == null) {
            return x;
        }
        return findMax(x.right);
    }
}
