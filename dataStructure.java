
public class myQueue {
  int SIZE = 5;
  int front, back;
  int items[] = new int[SIZE];///

  CQueue() {
    front = -1;
    back = -1;
  }

  boolean isFull() {
    if (front == 0 && back == SIZE - 1) {
      return true;
    }
    if (front == back + 1) {
      return true;
    }
    return false;
  }

  boolean isEmpty() {
    if (front == -1){
      return true;
      } else{
      return false;
      }
  }

  void enQueue(int element) {
    if (isFull()) {
      System.out.println("Queue is full");
    } else {
      if (front == -1){
        front = 0;
        }
      back = (back + 1) % SIZE;
      items[back] = element;
      System.out.println("Inserted " + element);
    }
  }

  int deQueue() {
    int element;
    if (isEmpty()) {
      System.out.println("Queue is empty");
      return (-1);
    } else {
      element = items[front];
      if (front == back) {
        front = -1;
        back = -1;
      } else {
        front = (front + 1) % SIZE;
      }
      return (element);
    }
  }

  }

