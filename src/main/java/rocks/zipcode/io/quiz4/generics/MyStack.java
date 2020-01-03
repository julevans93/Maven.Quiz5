package rocks.zipcode.io.quiz4.generics;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> {
    private Stack<SomeType> stack;

    public MyStack() {

        this.stack = new Stack<>();
    }

    public Boolean isEmpty() {

        return stack.isEmpty();
    }

    public void push(SomeType i) throws EmptyStackException {
        stack.push(i);
    }

    public SomeType peek() {
        if (stack.isEmpty()){
            return null;
        }
        return stack.peek();
    }

    public SomeType pop() {
        return stack.pop();
    }
}
