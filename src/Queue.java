/**
 *   @author Reymark Molo Tion
 */
public class Queue {
	
	public Queue() {
		front = null;
		rear = null;
	}

	class queueNode {
		String data;
		queueNode next, prev;
		queueNode(String data) {
			this.data = data;
			next = prev = null;
		}
	}
	
	private queueNode front, rear;
			
	public void queue(String data) {
		if(rear == null) {
			front = rear = new queueNode(data);
		} else {
			queueNode n = new queueNode(data);
			rear.next = n;
			n.prev = rear;
			rear = n;
		}
	}
	
	public String deQueue() {
		String data = null;
		if(front == null) {
			System.out.println("Queue is empty!");
		} else {
			data = front.data;
			front = front.next;
		}
		return data;
	}
	
	public void display() {
		queueNode temp = null;
		temp = rear;
		while(temp != null) {
			System.out.println(" >> "+temp.data);
			temp = temp.prev;
		}	
	}
	
}





