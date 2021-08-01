public class Path{
    
    static class Node{
        Node next;
        int x;
        int y;
		Node(int a,int b){
			x= a;
			y=b;
			next = null;
		}
    }
	Node head;
	Node tail;
	Node temp;
	int count = 0;
	public void insert(int x, int y){
		count++;
		if(head == null){
			head = new Node(x,y);
			tail = head;
		}else{
			Node current = new Node(x,y);
			if(head == tail){
				tail = current;
				tail.next = head;
			}
			else{
				current.next = tail;
				tail = current;
			}
		}
	}
	public void walk(int x)
	{
		if(x==1){//move left
			
			head.x = head.x - 1;
			insert(head.x+1,head.y);	//previous location is saved in linkedlist
		}
		else if(x==2){//move right
			head.x = head.x + 1;
			insert(head.x-1,head.y);
		}
		else if(x==3){//move up
			head.y =head.y -1;
			insert(head.x,head.y+1);
		}
		else if(x==4){//move down
			head.y = head.y +1;
			insert(head.x,head.y-1);
		}
	}
}