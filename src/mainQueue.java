
/**
 *   @author Reymark Molo Tion
 */
import java.io.IOException;

public class mainQueue {
	
	public static void main(String[] args) throws IOException {
		Queue q = new Queue();
		
		q.queue("output");
		q.queue("Sample");
		
		q.display();
	}

}
