class MyQueue {
    
    Stack<Integer> stack;

    public MyQueue() {this.stack = new Stack<>();}
    
    public void push(int x) {
        Stack<Integer> st2=new Stack<>();
        while(!stack.isEmpty()) st2.push(stack.pop());
        stack.push(x);
        while(!st2.isEmpty()) stack.push(st2.pop());
    }
    
    public int pop() { return stack.pop();}
    
    public int peek() { return stack.peek();}
    
    public boolean empty() { return stack.isEmpty();}
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */