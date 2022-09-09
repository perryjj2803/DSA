import java.util.*;
public class DSALinkedListTestHarness
{
    public static void main(String[] args)
    {
        DSALinkedList LinkedList = new DSALinkedList();
        LinkedList.insertFirst("one");
        LinkedList.insertFirst("two");
        LinkedList.iterateOverList(LinkedList);

        LinkedList.removeFirst();
        LinkedList.iterateOverList(LinkedList);
    }
}