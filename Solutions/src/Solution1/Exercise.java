class MyCircularDeque {
    int[] elsments;
    int size=0;
    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        elsments=new int[k];
    }

    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if(size>=elsments.length) return false;
        for(int i=size-1;i>=0;i--){
            elsments[i+1]=elsments[i];
        }
        elsments[0]=value;
        size++;
        return true;
    }

    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if(size>=elsments.length) return false;
        elsments[size]=value;
        size++;
        return true;
    }

    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if(size==0) return false;
        for(int i=0;i<size-1;i++){
            elsments[i]=elsments[i+1];
        }
        size--;
        return true;
    }

    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if(size==0) return false;
        size--;
        return true;
    }

    /** Get the front item from the deque. */
    public int getFront() {
        return size==0?-1:elsments[0];
    }

    /** Get the last item from the deque. */
    public int getRear() {
        return size==0?-1:elsments[size-1];
    }

    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return size==0;
    }

    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return size==elsments.length;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */