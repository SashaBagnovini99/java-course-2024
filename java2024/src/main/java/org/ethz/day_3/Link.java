package org.ethz.day_3;

public class Link {
    Node fromNode;
    Node toNode;
    String id;
    String[] modes;
    double length;
    int allowedSpeed;
    double capacity;

    public Link(Node fromNode, Node toNode, String id) {
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
