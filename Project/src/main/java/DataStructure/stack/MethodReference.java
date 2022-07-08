package datastructure.stack;

public class MethodReference {

    public void abc () {
        MyStack myStack = new MyStack();
        myStack.push(10);
        efg(myStack);
    }

    public void efg(MyStack myStack) {
        myStack.display();
    }
}
