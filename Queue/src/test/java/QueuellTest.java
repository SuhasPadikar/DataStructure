import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class QueuellTest
{

    @Test
    void enqueue()
    {
      System.out.println("Testing enqueue");
      Queue s = new Queue();
      int expected = 20;
      Queuell.Node actual = new Queuell.Node(20);
      assertEquals(10,20);
    }



    @Test
    void dequeue()
    {
        System.out.println("Testing dequeue");
        Queue s = new Queue();
        int expected = 100;
        Queuell.Node actual = new Queuell.Node(20);
        assertEquals(100,20);

    }

    @Test
    void display()
    {
        System.out.println("Testing display");
    }
}