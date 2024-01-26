package com.nima.module3.three;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static ArrayList<Node> graph;
    private static final Queue<Integer> visitingQueue = new LinkedList<>();

    public static void main(String[] args) throws FileNotFoundException {
        setupTree();
        BFS();
    }

    private static void BFS() {
        if (visitingQueue.isEmpty()) {
            // If it's empty, it means that we have either finished traversing or haven't started yet
            Node root = graph.getFirst();
            if (root.isVisited()) {
                System.out.println("Done traversing");
                return;
            } else {
                visitingQueue.add(root.getKey());
            }
        }

        Integer currentKey = visitingQueue.poll();
        if (currentKey == null) {
            System.out.println("Current node is null (shouldn't happen)");
            return;
        }
        // currentKey: 1 because the graph arraylist has id of 1 greater than the entry 0
        Node currentNode = graph.get(currentKey - 1);
        currentNode.setVisited(true);
        for (Integer nodeId : currentNode.getNodes()) {
            if (visitingQueue.contains(nodeId)) continue;
            if (graph.get(nodeId - 1).isVisited()) continue;
            visitingQueue.add(nodeId);
        }
        System.out.println("Queue contains: " + visitingQueue);
        BFS();
    }

    private static void setupTree() throws FileNotFoundException {
        graph = new ArrayList<>();
        Scanner scan = new Scanner(new File("tree.txt"));
        while (scan.hasNext()) {
            String line = scan.nextLine();
            parseLine(line);
        }
    }

    private static void parseLine(String line) {
        String[] keys = line.split(" ");
        int key = Integer.parseInt(keys[0]);
        ArrayList<Integer> points = new ArrayList<>();
        for (int i = 1; i < keys.length; i++) {
            points.add(Integer.parseInt(keys[i]));
        }
        graph.add(new Node(key, points));
    }
}