package org.example.graphDepth;

import org.example.unused.vertexAndEdge.Vertex;

import java.util.*;

public class GraphDepth {
    private final int MAX_VERTS = 10;
    private ArrayList<Vertex> vertexArray; // массив вершин
    private int adjMat[][]; // матрица смежности
    private int nVerts; // текущее количество вершин
    private Stack<Integer> stack;
    private static Map<Object, ArrayList<Object>> adjacencyMatrix;

    public static Map<Object, ArrayList<Object>> create (Object object) {
        adjacencyMatrix = new HashMap<Object, ArrayList<Object>>();
        ArrayList<Object> listColumn = new ArrayList<Object>();
        listColumn.add(0, object);
        adjacencyMatrix.put(object, listColumn);
        return adjacencyMatrix;
    }

    public static int sizeMap () {
        int lengthMap = 0;
        for (Object o : adjacencyMatrix.keySet()) {
            lengthMap++;
        }
        return lengthMap;
    }

    public static Map<Object, ArrayList<Object>> addMap (Object object) {
        int lengthMap = GraphDepth.sizeMap();
        ArrayList<Object> listColumn = new ArrayList<Object>();
        listColumn.add(lengthMap, object);
        adjacencyMatrix.put(object, listColumn);
        return adjacencyMatrix;
    }

/*    public static Map<Double, List<Double>> create(int row, int column) {
        Map<Double, List<Double>> doubleMap = new HashMap<Double, List<Double>>();

        for (int x = 0; x < row; x++) {
            for (int y = 0; y < column; y++) {
                doubleMap.put(x, new ArrayList<Double>());
            }
        }
        return doubleMap;
    }*/

    public GraphDepth() { // инициализация внутрених полей
        vertexArray = new ArrayList<Vertex>();
        nVerts = 0;
        /*adjMat = new int[MAX_VERTS][MAX_VERTS];*/
        /*for (int j = 0; j < MAX_VERTS; j++) {
            for (int k = 0; k < MAX_VERTS; k++) {
                adjMat[j][k] = 0;
            }
        }*/
        stack = new Stack<>();
    }

    public void addVertex(Vertex lab) {
        vertexArray.add(nVerts, lab);
        nVerts++;
    }

/*    public void addEdge (Object start, Object end) {
        for (Object helpVariableMap : adjacencyMatrix.keySet()){
            if (helpVariableMap == start) {
                ArrayList<Object> helpVariableList = adjacencyMatrix.get(start);
                for (int i = 0; i < helpVariableList.size(); i++){
                    if (helpVariableList.get(i) == ){

                    }
                }
            }
        }



    }*/

    public void addEdge(int start, int end) { // начал переписывать выше, надо переписать переписанное
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    public void displayVertex(int v) {
        System.out.println(vertexArray.get(v));
    }

/*    public void dfs() { // обход в глубину
        vertexArray.get(0).setWasVisited(true); // берётся первая вершина
        displayVertex(0);
        stack.push(0);

        while (!stack.empty()) {
            int v = getAdjUnvisitedVertex(stack.peek()); // вынуть индекс смежной веришины, если есть 1, нету -1
            if (v == -1) { // если непройденных смежных вершин нету
                stack.pop(); // элемент извлекается из стека
            }
            else {
                vertexArray[v].setWasVisited(true);
                displayVertex(v);
                stack.push(v); // элемент попадает на вершину стека
            }
        }

        for (int j = 0; j < nVerts; j++) {  // сброс флагов
            vertexArray[j].wasVisited = false;
        }

    }*/

    private int getAdjUnvisitedVertex(int v) {
        for (int j = 0; j < nVerts; j++) {
            if (adjMat[v][j] == 1 && vertexArray.get(v).getWasVisited() == false) {
                return j; //возвращает первую найденную вершину
            }
        }
        return -1;
    }
}