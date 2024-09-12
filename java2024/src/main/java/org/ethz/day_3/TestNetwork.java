package org.ethz.day_3;

public class TestNetwork {
    public static void main(String[] args) {
        Network network = new Network();

        for (int i = 0; i < network.nodes.length; i++) {
            System.out.println(network.getNodes()[i].getId() + " is at Coordinates: (" + network.getNodes()[i].getX() + ", " + network.getNodes()[i].getY() + ")");
        }
    }
}
