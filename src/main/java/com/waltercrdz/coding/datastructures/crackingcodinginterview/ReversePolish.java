package com.waltercrdz.coding.datastructures.crackingcodinginterview;

import com.personal.datastructures.my.implement.Stack;

import java.util.HashMap;
import java.util.Map;

public class ReversePolish {

    private Stack<Integer> stack;
    private Map<String, MathOperation> operations;

    public ReversePolish() {
        this.initialize();
        this.stack = new Stack<>();
    }

    public Integer calculate(String v) {
        String[] values = v.split(" ");
        for (int i = 0; i < values.length; i++) {
            String value = values[i];
            if(!isOperator(value))
                stack.push(Integer.parseInt(value));
            else {
                int o2 = stack.pop(), o1 = stack.pop(), result = operate(o1, o2, value);
                stack.push(result);
            }
        }
        return stack.pop();
    }

    private Integer operate(Integer o1, Integer o2, String value) {
        MathOperation operation = this.operations.get(value);
        System.out.println(String.format("%s %s %s", o1, value, o2));
        return operation.execute(o1, o2);
    }

    private boolean isOperator(String value) {
        return this.operations.containsKey(value);
    }

    public interface MathOperation {
        Integer execute(Integer o1, Integer o2);
    }

    private void initialize() {
        this.operations = new HashMap<>();
        this.operations.put("+", (a, b) -> a + b);
        this.operations.put("-", (a, b) -> a - b);
        this.operations.put("*", (a, b) -> a * b);
        this.operations.put("/", (a, b) -> a / b);
    }

    public static void main(String[] args) {
        ReversePolish calc = new ReversePolish();
        // 3 + 4 - 7
        System.out.println("Result : " + calc.calculate("15 7 1 q1 + - / 3 * 2 1 1 + + -"));
    }
}
