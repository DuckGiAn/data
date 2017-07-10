package list;

/**
 * Created by adg on 2017-07-10.
 */
public class Node extends Data{
    private Node nextNode;

    public Node(String title, String author, String publisher) {
        super(title, publisher, author);
        nextNode = null;
    }

    public Node() {
        nextNode = null;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
