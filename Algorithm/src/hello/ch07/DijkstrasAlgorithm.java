package hello.ch07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DijkstrasAlgorithm {

    private static Map<String, Map<String, Integer>> graph = new HashMap<>();
    private static List<String> processed = new ArrayList<>();


    public static void main(String[] args) {
        
//        // graph table
//        graph.put("start", new HashMap<>());
//        graph.get("start").put("a", 6);
//        graph.get("start").put("b", 2);
//
//        graph.put("a", new HashMap<>());
//        graph.get("a").put("fin", 1);
//
//        graph.put("b", new HashMap<>());
//        graph.get("b").put("a", 3);
//        graph.get("b").put("fin", 5);
//
//        graph.put("fin", new HashMap<>());
//
//        // cost table
//        Map<String, Integer> costs = new HashMap<>();
//        costs.put("a", 6);
//        costs.put("b", 2);
//        costs.put("fin", Integer.MAX_VALUE);
//
//        // parents table
//        Map<String, String> parents = new HashMap<>();
//        parents.put("a", "start");
//        parents.put("b", "start");
//        parents.put("fin", null);
//
//        System.out.println(graph.get("start").get("a"));

        // 연습 문제 01
        // graph table
        graph.put("start", new HashMap<>());
        graph.get("start").put("a", 5);
        graph.get("start").put("b", 2);

        graph.put("a", new HashMap<>());
        graph.get("a").put("c", 4);
        graph.get("a").put("d", 2);

        graph.put("b", new HashMap<>());
        graph.get("b").put("a", 8);
        graph.get("b").put("d", 7);

        graph.put("c", new HashMap<>());
        graph.get("c").put("fin", 3);
        graph.get("c").put("d", 6);

        graph.put("d", new HashMap<>());
        graph.get("d").put("fin", 1);

        graph.put("fin", new HashMap<>());

        // cost table
        Map<String, Integer> costs = new HashMap<>();
        costs.put("a", 5);
        costs.put("b", 2);
        costs.put("c", Integer.MAX_VALUE);
        costs.put("d", Integer.MAX_VALUE);
        costs.put("fin", Integer.MAX_VALUE);

        // parents table
        Map<String, String> parents = new HashMap<>();
        parents.put("a", "start");
        parents.put("b", "start");
        parents.put("c", null);
        parents.put("d", null);
        parents.put("fin", null);

        System.out.println(graph.get("start").get("a"));

        String node = findLowestCostNode(costs);

        while (node != null){
            Integer cost = costs.get(node);
            Map<String, Integer> neighbors = graph.get(node);
            for(String n : neighbors.keySet()){
                Integer newCost = cost + neighbors.get(n);
                if(costs.get(n) > newCost){
                    costs.put(n, newCost);
                    parents.put(n, node);
                }
            }
            processed.add(node);

            node = findLowestCostNode(costs);
        }

//        5, 2, 6
        System.out.println(costs);
    }

    public static String findLowestCostNode(Map<String, Integer> costs){
        Integer lowestCost = Integer.MAX_VALUE;
        String lowestCostNode = null;

        for(Map.Entry<String, Integer>  node : costs.entrySet()){
            Integer cost = node.getValue();
            if(cost < lowestCost && !processed.contains(node.getKey())){
                lowestCost = cost;
                lowestCostNode = node.getKey();
            }
        }
        return lowestCostNode;
    }


}
