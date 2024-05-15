public class DSA{
    int top= -1;
    char stk[];
    int size;

    DSA(int size){
        this.size=size;
        stk=new char[size];
    }

    boolean isEmpty(){
        return top==-1;
    }
    boolean isFull(){
        return top==size-1;
    }

    void push(char data){
        if(isFull()){
            System.out.println("Stack overflow");
            return;
        }
        // top+=1;
        stk[++top]=data;
    }

    char pop(){
        if(isEmpty()){
            return 'f'; 
        }
        return stk[top--];
    }

    char peek(){
        return stk[top];
    }

    int size(){
        return top+1;
    }

}