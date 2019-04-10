package singleLinkedListImpl;

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
        this.data = data;
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