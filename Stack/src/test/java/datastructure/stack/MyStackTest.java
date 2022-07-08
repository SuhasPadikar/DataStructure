package datastructure.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyStackTest {

    @Test
    void push() {
        MyStack myStack = new MyStack();
        myStack.push(10);
        Assertions.assertEquals(20,myStack.push(10));
    }

    @Test
    public void testPushFailure() {
        MyStack myStack = new MyStack();
        Assertions.assertThrows(StackException.class,() -> myStack.pop());
//        myStack.pop();
    }



    @Test
    void pop() {
        MyStack myStack = new MyStack();
        myStack.pop();
        Assertions.assertEquals(20,myStack.pop());
    }
    @Test
    public void voidtestPopFailure()
    {
        System.out.println("Pop Failure");
    }

}