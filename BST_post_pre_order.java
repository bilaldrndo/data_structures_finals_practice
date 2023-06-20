public class DSBinarySearchTree<Key extends Comparable<Key>, Value> extends BinarySearchTree<Key, Value> {

    public void inorder() {
        inorder(root);
    }

    private void inorder(Node<Key, Value> x) {
        if (x == null) {
            return;
        }

        inorder(x.left);
        System.out.println(x.key);
        inorder(x.right);
    }

    public void preorder() {
        preorder(root);
    }

    private void preorder(Node<Key, Value> x) {
        if (x == null) {
            return;
        }

        System.out.println(x.key);
        preorder(x.left);
        preorder(x.right);
    }

    public void postorder() {
        postorder(root);
    }

    private void postorder(Node<Key, Value> x) {
        if (x == null) {
            return;
        }

        postorder(x.left);
        postorder(x.right);
        System.out.println(x.key);
    }
}
