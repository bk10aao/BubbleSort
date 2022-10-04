# Bubblesort Algorithm

This is an algorithm to go through an array of integers and sort them from lowest to highest using the simple bubble sort algorithm.

A simple example is as follows:

```     
BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm(100_000, 1_000_000);
System.out.printf("Before: %s", bubbleSortAlgorithm);
bubbleSortAlgorithm.sort();
System.out.printf("After:  %s\n", Arrays.toString(bubbleSortAlgorithm.numbers));
```
