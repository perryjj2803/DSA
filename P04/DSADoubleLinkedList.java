import java.util.*;
public class DSALinkedList
{
    private class DSAListNode
    {
        public Object value;
        public DSAListNode next;

        public DSAListNode(Object inValue)
        {
            value = inValue;
            next = null;
        }

        public Object getValue()
        {
            return value;
        }

        public void setValue(Object inValue)
        {
            value = inValue;
        }

        public DSAListNode getNext()
        {
            return next;
        }

        public void setNext(DSAListNode newNext)
        {
            next = newNext;
        }
    }
    
    public LinkedList<Object> list = new LinkedList<Object>();
    public DSAListNode head;
    public DSAListNode tail;
    private DSAListNode newNd;
    private DSAListNode currNd;
    private Object nodeValue;
    private boolean empty;
                

    public DSALinkedList()
    {
        head = null;
        tail = null;
    }

    public void insertFirst(Object newValue)
    {
        newNd = new DSAListNode(newValue);
        if(isEmpty())
        {
            tail = newNd;
        }
        else
        {
            newNd.setNext(head);
            head = newNd;
        }
    }

    public void insertLast(Object newValue)
    {
        newNd = new DSAListNode(newValue);
        if(isEmpty())
        {
            head = newNd;
        }    
        else
        {
            tail.setNext = newNd;
            tail = newNd;
        }
    }    

    public boolean isEmpty()
    {
        return empty = (head==null);
    }

    public Object peekFirst()
    {
        if(isEmpty())
        {
            throw new IllegalArgumentException( "List is empty" );
        }
        else
        {
            nodeValue = head.getValue();
        }     
        return nodeValue;   
    }

    public Object peekLast()
    {
        if(isEmpty())
        {
            throw new IllegalArgumentException( "List is empty" );
        } 
        else
        {
            currNd = head;
            while(currNd.getNext()!=null)
            {    
                currNd = currNd.getNext();
            }
            nodeValue = currNd.getValue();
        }
        return nodeValue;
    }

    public Object removeFirst()
    {
        nodeValue = head.getValue();
        if(isEmpty())
        {
            throw new IllegalArgumentException( "List is empty" );
        }
        else if(head.getNext == null)
        {
            tail = null;
        }
        else
        {
            head = head.getNext();
        }
        return nodeValue;
    }    

    public Object removeLast()
    {
        if(isEmpty())
        {
            throw new IllegalArgumentException( "List is empty" );
        }
        else if(head.getNext() == null)
        {
            nodeValue = head.getValue();
            head = null;
        }
        else
        {
            currNd = tail;
            currNd = currNd.getNext();
        }
        tail.setNext(null);
        nodeValue = currNd.getValue();

        return nodeValue;
    }
}
    














