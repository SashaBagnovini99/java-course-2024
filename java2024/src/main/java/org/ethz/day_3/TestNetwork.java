package org.ethz.day_3;

public class TestNetwork {
    public static void main(String[] args) {
        Node[] nodeArray = new Node[4];
        Link[] linksArray = new Link[4];

        Node n1 = new Node(0, 0, "Node 1");
        Node n2 = new Node(1, 0, "Node 2");
        Node n3 = new Node(1, 1, "Node 3");
        Node n4 = new Node(0, 1, "Node 4");

        nodeArray[0] = n1;
        nodeArray[1] = n2;
        nodeArray[2] = n3;
        nodeArray[3] = n4;

        Link l1 = new Link(n1, n2, "Link 1");
        Link l2 = new Link(n2, n3, "Link 2");
        Link l3 = new Link(n3, n4, "Link 3");
        Link l4 = new Link(n4, n1, "Link 4");

        linksArray[0] = l1;
        linksArray[1] = l2;
        linksArray[2] = l3;
        linksArray[3] = l4;

        for (int i = 0; i < nodeArray.length; i++) {
            System.out.println(nodeArray[i].getId() + " is at Coordinates: (" + nodeArray[i].getX() + ", " + nodeArray[i].getY() + ")");
        }
    }
}
class Node {
    double x;
    double y;
    String id;

    Node(double x, double y, String id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String getId() {
        return id;
    }
}

class Link {
    Node fromNode;
    Node toNode;
    String id;
    String[] modes;
    double length;
    int allowedSpeed;
    double capacity;

    Link(Node fromNode, Node toNode, String id) {
        this.fromNode = fromNode;
        this.toNode = toNode;
        this.id = id;
        length = Math.sqrt(Math.pow((toNode.getX() - fromNode.getX()), 2) + Math.pow((toNode.getY() - fromNode.getY()), 2));
    }

    public Node getFromNode() {
        return fromNode;
    }

    public Node getToNode() {
        return toNode;
    }

    public String getId() {
        return id;
    }

    public String[] getModes() {
        return modes;
    }

    public double getLength() {
        return length;
    }

    public int getAllowedSpeed() {
        return allowedSpeed;
    }

    public double getCapacity() {
        return capacity;
    }
}

class Network {
    Node[] nodes;
    Link[] links;

    public Node[] getNodes() {
        return nodes;
    }

    public Link[] getLinks() {
        return links;
    }
}
