package StackQueue;

public class MinStack {
    static class Node{
        int val;
        Node next;
        int min;
        public Node(int val,int min){
            this.val = val;
            this.min = min;
        }
    }
    Node top;
    public MinStack() {
        this.top = null;
    }
    public boolean isEmpty(){
        return top == null;
    }
    public void push(int val) {
        if(top == null){
            top = new Node(val, val);
        }else{
            Node newNode = new Node(val, Math.min(val, top.min));
            newNode.next = top;
            top = newNode;
        }
    }

    public void pop() {
        if(top!=null){
            top = top.next;
        }
    }

    public int top() {
        return top.val;
    }

    public int getMin() {
        return top.min;
    }
}
