public class Queue_test {
    public static void main(String[] args) {
        Queue q= new Queue(5);
        q.queue(10);
        q.queue(15);
        q.queue(20);

        System.out.println(q.queue);


    }
}
