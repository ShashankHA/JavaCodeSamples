import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

	public static void main(String args[]) {
		Queue<Book> queue = new PriorityQueue<Book>();

		Book b1 = new Book(100, "Book1", "Author1", "BPB", 8);
		Book b2 = new Book(101, "Book2", "Author2", "Wiley", 6);
		Book b3 = new Book(102, "Book3", "Author3", "Mc Graw Hill", 4);

		queue.add(b1);
		queue.add(b2);
		queue.add(b3);

		System.out.println(queue); // [Book [id=102, name=Book3] , Book [id=101,name=Book2] ,Book [id=100, name=Book1]  ]
		System.out.println(queue.peek()); // Book [id=102, name=Book3]
		System.out.println(queue.remove()); // Book [id=102, name=Book3]
		System.out.println(queue); // [Book [id=101, name=Book2] , Book [id=100, name=Book1] ]
	}

}

class Book implements Comparable<Book> {

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + "] ";
	}

	int id;
	String name, author, publisher;
	int quantity;

	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}

	public int compareTo(Book b) {
		if (id > b.id) {
			return -1;
		} else if (id < b.id) {
			return 1;
		} else {
			return 0;
		}
	}
}
