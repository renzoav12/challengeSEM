package com.challenge.sem;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ChallengeSem {


    public List<Pair> getResult(int[] arrayElements) {

        if ( arrayElements == null || arrayElements.length == 0) {
            return new ArrayList<>();
        }
        List<Pair> arrayResult = new ArrayList<>();

        Stack<Integer> stack = new Stack<>();
        stack.push(Integer.valueOf(arrayElements[0]));

        for (int x=1; x < arrayElements.length; x++) {
            Integer elementActual = Integer.valueOf(arrayElements[x]);
            Integer topElement = stack.peek();

            if ( elementActual < topElement ) {
                stack.push(elementActual);
            }else {

                while(stack.size() > 0 && stack.peek() < elementActual) {
                    Integer elementStack = stack.peek();
                    stack.pop();
                    arrayResult.add(Pair
                            .builder().value(elementStack)
                            .nextGreaterValue(elementActual).build());
                }
                if ( stack.size() == 0) {
                    stack.push(elementActual);
                }

                if ( elementActual < stack.peek()) {
                    stack.push(elementActual);
                }
            }
        }
        while(stack.size() > 0) {
            Integer y = stack.peek();
            stack.pop();
            arrayResult.add(Pair.builder().value(y).nextGreaterValue(-1).build());
        }
        return arrayResult;
    }


    public void printResult(List<Pair> result) {
        result.stream().forEach( p -> System.out.println(p.getValue() + " --> " + p.getNextGreaterValue()));
    }
}
