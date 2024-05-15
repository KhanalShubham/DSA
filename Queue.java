public class Queue {
    int [] queue;
    int front=-1;
    int rear=-1;
    int size;

    Queue(int size){
        this.size=size;
        queue=new int[size];
    }

    boolean isFull(){
        return rear==size-1;
    }
    boolean isEmpty(){
        return rear==-1 && front==-1;
    }

    void queue(int data){
        if (isFull()){
            System.out.println("Queue is full");
        }
        else{
            if(front==-1){
                front=0;
            }
            rear+=1;
            queue[rear]=data;
        }
    }

    int dequeue(){
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        if(front==rear){
            int temp=front;
            front=rear-1;
            return queue[temp];

        }
        return queue[front++];
    }

}
