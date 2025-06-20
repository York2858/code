import java.util.HashMap;
import java.util.PriorityQueue;

public class LRUCache_146 {
    private static class Node{
        int key;
        int value;

        Node next;
        Node pre;
        public Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }

    private final int capacity;
    private Node dumpNode = new Node(0, 0);
    HashMap<Integer,Node> map = new HashMap<Integer,Node>();

    public LRUCache_146(int capacity) {
        this.capacity = capacity;
        dumpNode.next = dumpNode;
        dumpNode.pre = dumpNode;
    }

    public int get(int key) {
        Node node = getNode(key);
        return node != null ? node.value:-1;
    }

    public void put(int key, int value) {
        Node node = getNode(key);
        if(node != null){
            node.value = value;
            return;
        }
        node = new Node(key, value);
        map.put(key, node);
        pushFront(node);
        if(map.size() > capacity){
            Node backNode = dumpNode.pre;
            map.remove(backNode.key);
            remove(backNode);
        }
    }
    private Node getNode(int key) {
        if(!map.containsKey(key)){
            return null;
        }
        Node node = map.get(key);
        remove(node);
        pushFront(node);
        return node;
    }
    private void remove(Node node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }
    private void pushFront(Node node) {
        node.pre = dumpNode;
        node.next = dumpNode.next;
        dumpNode.next.pre = node;
        dumpNode.next = node;
    }
}
