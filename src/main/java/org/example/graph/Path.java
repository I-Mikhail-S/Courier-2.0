package org.example.graph;


import java.util.ArrayList;
import java.util.List;

class DistPar // Расстояние и родительская вершина
{ // Объекты сохраняются в массиве sPath
    public int distance; // Расстояние от начальной вершины до текущей
    public int parentVert; // Текущий родитель вершины
    // -------------------------------------------------------------
    public DistPar(int pv, int d) // Конструктор
    {
        distance = d;
        parentVert = pv;
    }
}