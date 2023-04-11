# dijkstra's algorithm #

### Dijkstra.java
This file contains a program called Dijkstra. This program
has various methods including: computeEuclideanDistance, computeAllEuclidean
Distances, doDijkstra, and getDijkstraPath. The method computeAllEuclideanDistances 
calls the method computeEuclideanDistance which calculates the distance
between two cities using their x and y coordinates and the Euclidean
distance formula. The method getDijkstraPath calls doDijkstra which
then assigns every vertex object a distance and a previous field. The
distance assigned to each vertex is the smallest distance to get to that
vertex and the previous field is the vertex through which it is reached.
getDijkstraPath then creates the path using the starting city and the end
city, using the shortest path possible. It accesses the vertices' previous
fields. 
To run and compile this program you need to compile Display.java,
Vertex.java, Edge.java, and Dijkstra.java. To do this enter commands:
```
javac Display.java
javac Vertex.java
javac Edge.java
javac Dijkstra.java
```
To run this program enter command: 
```
java Display
```
This will pop up the GUI. In this window, press the 'Compute all Euclidean Distances' button, then
select the start and end city and press the 'Draw Dijkstra's path' button.
Make sure the files in the boxes are cityxy.txt and citypairs.txt respectively.
Press the Load / Reset button to delete all the information visible on the map.
