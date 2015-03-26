
public class DoublyLinkedList<T>
{
	//Pre: header points to the header node of a circular doubly-linked list
	//Return:"null if list is empty; "[dat1,data2,...]" otherwise
	public static <T> String toString(DNode<T> header)
	{
		if(header.next==header)return "null";
		DNode<T> p=header.next;
		String s="["+p.value;
		while(p.next!=header)
		{
			p=p.next;
			s+=","+p.value;
		}
		s+="]";
		return s;
	}
	//Pre: header points to the header node of a circular doubly-linked list
	//Return: null if key not in list; the node in list that matches key otherwise
	public static <T> DNode<T> seqSearch(DNode<T> header,T key)
	{
		DNode<T> p=header.next;
		while(p!=header)
		{
			if(p.value.equals(key)) return p;
			p=p.next;
		}
		return null;
	}
	//Post: item inserted after the node referenced by p
	//Return: The new node inserted
	public static <T> DNode<T> insertAfter(DNode<T> p, T item)
	{
		DNode<T> newNode=new DNode<T>(item);
		newNode.next=p.next;
		newNode.prev=p;
		p.next.prev=newNode;
		p.next=newNode;
		return newNode;
	}
	//Post: item inserted before the node referenced by p
	//Return: The new node inserted
	public static <T> DNode<T> insertBefore(DNode<T> p,T item)
	{
		DNode<T> newNode=new DNode<T>(item);
		newNode.next=p;
		newNode.prev=p.prev;
		p.prev.next=newNode;
		p.prev=newNode;
		return newNode;
	}
	//Pre: p points to a data node in this DoublyLinkedList
	//Post:node p removed from list
	public static <T>void remove(DNode<T> p)
	{
		p.prev.next=p.next;
		p.next.prev=p.prev;
	}
	//Pre: header points to the header node of a circular doubly-linked list
	//Return:The number of data nodes in the list
	public static <T> int size(DNode<T> header)
	{
		int count=1;
		DNode<T> newNode=new DNode<T>();
		newNode.next=header.next;
		while(newNode.next!=header)
		{
			count++;
			newNode=newNode.next;
			newNode.next=newNode.next.next;
		}
		return count;
	}
	//Pre: list referenced by header cannot be empty
	//Post: First element removed from list
	public static <T>void removeFirst(DNode<T> header)
	{
		header.next.prev=header.prev;
		header.prev.next=header.next;
		header=header.next;
	}
	//Pre: list referenced by header cannot be empty
	//Post:Last element removed from list
	public static <T> void removeLast(DNode<T> header)
	{
		header.prev.prev.next=header;
		header.prev=header.prev.prev;
	}
	//Post: item inserted as first element of list
	public static <T> void insertFirst(DNode<T> header,T item)
	{
		DNode<T> newNode=new DNode<T>(item);
		
	}
	//Post: item inserted as last element of list
	public static <T> void insertLast(DNode<T> header,T item)
	{
		
	}
}
