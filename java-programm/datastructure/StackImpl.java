import java.util.NoSuchElementException;

class StackImpl{
int array[];
int size, len, top;

    public StackImpl(int n)
    {
        size = n;
        array = new int[size];
        len = 0;
        top=-1;
    }

    public boolean isFull(){

        return top == size -1;
    }
    public boolean isEmpty(){
        return top == -1;
    }

    public void push(int x)
    {
        if(isFull())
        {
            // throw new IndexOutOfBoundsException("Overflow Exception..!!");
            System.out.println("Stack is full capacity gona increase..!!");
            increaseCapacity();
        }
            array[++top] = x;
            len++;
        
    }

    public int pop() {
        if(isEmpty())
        {
            throw new NoSuchElementException("Underflow Exceptions..!!");
        }else{
            len--;
            return array[top--];
        }
        
    }

    public int peek(){
        if(isEmpty())
        {
            throw new NoSuchElementException("Underflow Exception");
        }else{
            return array[top];
            
        }
    }

    public void increaseCapacity(){
        int[] newArray  = new int[size*2];
        for(int i=0; i<len; i++)
        {
            newArray[i] = array[i];
            
        } 

        size = size*2;
        array = newArray;
    }

    public void display()
    {
        System.out.print("Stack =");
        if(isEmpty())
        {
            System.out.println("Stack Empty..!!");
        }else{

            for(int i=0; i<len; i++)
            {
                System.out.print(array[i]);
                System.out.print(" ");

            }

        }
    }

    public static void main(String args[])
    {
       StackImpl s = new StackImpl(5);
        s.push(96);
        s.push(65);
        s.push(53);
        s.push(03);
        s.push(35);
        s.push(23);
        s.push(69);
        s.push(78);
        s.push(52);
        // s.push(35);

        s.display();

    }

    
}