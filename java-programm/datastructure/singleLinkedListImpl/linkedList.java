class linkedList{

    Node start, end;
    int size;

    public linkedList()
    {
        start = null;
        end = null;
        size = 0;
    }

    public boolean isEmpty()
    {
        return start == null;
    }

    public void inserAtStart(int val)
    {
        Node nptr = new Node(val, null);
        size++;
        if(isEmpty())
        {
            start = nptr;
            end = start;
        }else{
            nptr.setLink(start);
            start = nptr;
        }
    }

    public void insertAtEnd(int val)
    {
        Node nptr = new Node(val , null);
        size++;
        if(isEmpty())
        {
            start = nptr;
            end = start;
        }else{
            end.setLink(nptr);
            end =nptr;
        }
    }

    public void display()
    {
        System.out.print("\nSingly Linked List = ");
        if (size == 0) 
        {
            System.out.print("empty\n");
            return;
        }    
        if (start.getLink() == null) 
        {
            System.out.println(start.getData() );
            return;
        }
        Node ptr = start;
        System.out.print(start.getData()+ "->");
        ptr = start.getLink();
        while (ptr.getLink() != null)
        {
            System.out.print(ptr.getData()+ "->");
            ptr = ptr.getLink();
        }
        System.out.print(ptr.getData()+ "\n");
    }

    public void insertAtPosition(int val, int pos)
    {
        Node nptr = new Node(val,null);
        Node ptr = start;
        
        pos = pos -1;
        for(int i=0; i<size; i++) 
        {
            if(pos == i)
            {
                Node tmp = ptr.getLink();
                ptr.setLink(nptr);
                nptr.setLink(tmp);
                break;
            }
            ptr = ptr.getLink();
        }
        size++;
    }

    public static void main(String[] args)
    {
        System.out.println("MAin class.. !!");
        linkedList l = new linkedList();
        l.inserAtStart(12);
        l.inserAtStart(69);
        l.inserAtStart(89);
        l.insertAtEnd(32);
        l.insertAtEnd(63);
        l.insertAtPosition(33,4);
        l.insertAtEnd(75);
        l.display();
    }

}

class Node{
    int data;
    Node link;

    public Node()
    {
        data = 0;
        link = null;

    }

    public Node(int data, Node link)
    {
        this.data= data;
        this.link = link;
    }

    public void setData(int d)
    {
        data = d;
    }
    public int getData()
    {
        return data;
    }

    public void setLink(Node n)
    {
        link = n;
    }

    public Node getLink()
    {
        return link;
    }

}