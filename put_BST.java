public class DSBinarySearchTree<Key extends Comparable<Key>, Value> extends BinarySearchTree<Key, Value> {

    public void put(Key key, Value value) {
        root = put(root, key, value);
    }

    private Node<Key, Value> put(Node<Key, Value> x, Key key, Value value) {
        if (x == null) {
            return new Node<>(key, value);
        }

        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            x.left = put(x.left, key, value);
        } else if (cmp > 0) {
            x.right = put(x.right, key, value);
        } else {
            x.value = value;
        }

        return x;
    }
}
