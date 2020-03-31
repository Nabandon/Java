package Test90;

class ArrayList {
    private Object[] data;
    private int size=1;

    public ArrayList(){
           Object data = new Object[size];
    }

    public int size(){
        return size;
    }

    public Object get(int x){
        if(x<0||x>size) return null;
        return data[x];
    }

    public void add(Object obj){
        if(data.length == size){
            Object[] temp = new Object[size *  2 ];
            for(int i=0;i<size;i++){
                temp[i]=data[i];
            }
            data = temp;
            data[size] = obj;
        }else{
            data[size] = obj;
        }
        size++;
    }

    public void remove(int x) {
        System.arraycopy(data, x + 1, data, x, size - x - 1);
        size--;
    }

    public void remove(Object obj){
        for(int x = 0;x < size;x++){
            if(obj.equals(data[x])){
                remove(x);
            }
        }
    }
}






