# Algoritms Courses Practise
Here are my own implementations of practice exercises by [Algorithms Part I-II](https://www.coursera.org/learn/algorithms-part1) course by Princeton University.

To use this programs you need to install special [library](https://algs4.cs.princeton.edu/code/algs4.jar) to your IDEA, or you can just enjoy description with images.

# 1. Seam Carving
---

## Target:
Resize the given image without cuting important elements and without compressing it and losing content.
## Example:
![Example](https://coursera.cs.princeton.edu/algs4/assignments/seam/HJoceanSmall.png)
=>
![Example](https://coursera.cs.princeton.edu/algs4/assignments/seam/HJoceanSmallShrunk.png)
## What was used:
*    Specific Dijkstra algorithm with Topological order
*    Dual-gradient energy function
## How to use it:
1.    Make sure you have download library from the top of the description
2.    Start class ResizeDemo
3.    Follow the instructions

# 2. Word Net
---
![WordNet](https://coursera.cs.princeton.edu/algs4/assignments/wordnet/wordnet-event.png)
## Target:
*    Make a word net, that have majority English dictionary nouns and semantic connection between them.
*    Create a function that can find semantic distance between two words
*    Create a function that can find a common semantic ancestor of two words
*    Create opportunity for fast search for outcast in a set of words
*    Do it very fast
## What was used:
1.    Digraph
2.    Topological Sort
3.    Red-Black Binary Search Tree
4.    Breadth-First Directed Paths
5.    Depth-First Search

# 3. Collinear Points
![Example](https://coursera.cs.princeton.edu/algs4/assignments/collinear/lines2.png)
## Target:
Find all 4+ points, that are collinear and make it quick
## What was used:
*    Special slope function
*    Quicksort with special sort order
*    Bruteforce method for time-comparing

# 4. 8-puzzle solver
## Target:
Make a programm, that can solve 8-puzzle board, if it is solvable 
![Way_of_solving](https://coursera.cs.princeton.edu/algs4/assignments/8puzzle/4moves.png)
## What was used:
*    Priority functions, based on difference between final and current board
*    A* search algorythm
*    Priority queues, consisting of boards
*    Special board class and special neighbour methods
