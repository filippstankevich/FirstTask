package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLogic {

    public int findMax(Array array){
        List<Integer> elements = array.getElements();
        int max = elements.get(0);
        for(int element: elements){
            if(max < element){
                max = element;
            }
        }
        return max;
    }

    public int findMin(Array array){
        List<Integer> elements = array.getElements();
        int min = elements.get(0);
        for(int element: elements){
            if(min > element){
                min = element;
            }
        }
        return min;
    }

    public List<Integer> replaceWithZeroEachNegative(Array array){
        List<Integer> elements = new ArrayList<>();
        elements.addAll(array.getElements());
        for(int i = 0; i < elements.size(); i++){
            if(elements.get(i) < 0){
                elements.set(i, 0);
            }
        }
        return elements;
    }

    public double findAvg(Array array){
        List<Integer> elements = array.getElements();
        double sum = 0.0;
        for(int element: elements){
            sum += element;
        }
        return sum / elements.size();
    }

    public int findSum(Array array){
        List<Integer> elements = array.getElements();
        int sum = 0;
        for(int element: elements){
            sum += element;
        }
        return sum;
    }

    public int findPositives(Array array){
        List<Integer> elements = array.getElements();
        int count = 0;
        for(int element: elements){
            if(element > 0) {
                count += 1;
            }
        }
        return count;
    }

    public int findNegatives(Array array){
        List<Integer> elements = array.getElements();
        int count = 0;
        for(int element: elements){
            if(element < 0) {
                count += 1;
            }
        }
        return count;
    }
}
