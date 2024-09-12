package org.ethz.day_3;

public class Network {
    public Node[] nodes;
    public Link[] links;

    public Network() {
        nodes = new Node[4];
        links = new Link[4];

        Node n1 = new Node(0, 0, "Node 1");
        Node n2 = new Node(1, 0, "Node 2");
        Node n3 = new Node(1, 1, "Node 3");
        Node n4 = new Node(0, 1, "Node 4");

        nodes[0] = n1;
        nodes[1] = n2;
        nodes[2] = n3;
        nodes[3] = n4;

        Link l1 = new Link(n1, n2, "Link 1");
        Link l2 = new Link(n2, n3, "Link 2");
        Link l3 = new Link(n3, n4, "Link 3");
        Link l4 = new Link(n4, n1, "Link 4");

        links[0] = l1;
        links[1] = l2;
        links[2] = l3;
        links[3] = l4;
    }

    public Node[] getNodes() {
        return nodes;
    }

    public Link[] getLinks() {
        return links;
    }
}
