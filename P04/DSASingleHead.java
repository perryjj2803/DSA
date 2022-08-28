import java.util.*;
public class DSASingleHead
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
    private DSAListNode newNd;
    private DSAListNode currNd;
    private DSAListNode prevNd;
    private Object nodeValue;
    private boolean empty;
                

    public DSALinkedList()
    {
        head = null;
    }

    public void insertFirst(Object newValue)
    {
        newNd = new DSAListNode(newValue);
        if(isEmpty())
        {
            head = newNd;
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
            currNd = head;
            while(currNd.getNext()!=null)
            {
                currNd = currNd.getNext();
            }
            currNd.setNext(newNd);
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
        if(isEmpty())
        {
            throw new IllegalArgumentException( "List is empty" );
        }
        else
        {
            nodeValue = head.getValue();
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
            prevNd = null;
            currNd = head;
            while(currNd.getNext()!= null);
            {
                prevNd = currNd;
                currNd = currNd.getNext();
            }
            prevNd.setNext(null);
            nodeValue = currNd.getValue();
        }
        return nodeValue;
    }
}
    






