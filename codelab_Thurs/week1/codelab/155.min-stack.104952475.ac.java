public class MinStack {

    /** initialize your data structure here. */
    Deque<Integer> normal_stack;
    Deque<Integer> min_stack;
    public MinStack() {
	normal_stack = new ArrayDeque<Integer>();
	min_stack = new ArrayDeque<Integer>();
    }
    
    public void push(int x) {
	if (!min_stack.isEmpty()) {
	    if (x < min_stack.peek()) {
		min_stack.push(x);
	    } else {
		min_stack.push(min_stack.peek());
	    }
	} else {
	    min_stack.push(x);
	}
	normal_stack.push(x);
	
    }
    
    public void pop() {
        normal_stack.pop();
	min_stack.pop();
    }
    
    public int top() {
	return normal_stack.peek();
    }
    
    public int getMin() {
	return min_stack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj  v = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
