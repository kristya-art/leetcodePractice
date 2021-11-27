package ja;
/**
 You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
 Merge all the linked-lists into one sorted linked-list and return it.
 */
import java.util.ArrayList;
import java.util.List;

public class MergeKSortedLists extends ListNode {

    public static int getLength(ListNode[] lists) {

        return lists.length;
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        List<Integer> output = new ArrayList<>();
        int min = 0;
        int indexFormin = 0;
        int end = 0;
        int count = indexFormin;
        int l = lists.length;


        while (end != lists.length) {
             if(l==1 && isNull(lists[0])){break;}
          //  if(l == 1){output.add(lists[0].val);break;}
             else if(isNull(lists[indexFormin])&& indexFormin==l-1) {
                 break;
             }
            if (isNull(lists[indexFormin])&&indexFormin<l) {
                indexFormin = indexFormin + 1;
                continue;
            } else {
                min = lists[indexFormin].val;
            }

            for (int i = indexFormin; i < lists.length; i++) {
                if (!isNull(lists[i]) && min >= lists[i].val) {
                    min = lists[i].val;
                    count = i;
                }
            }
            output.add(min);

            if (!isNull(lists[count])) {
                lists[count] = lists[count].next;
            }
            if (isNull(lists[count])) {
                end += 1;
            }
        }
System.out.println(output + "this is output");
        int j = 1;
        int arrayLength = output.size();
        if(arrayLength==0){return null;}
        ListNode head = new ListNode();
        if (arrayLength > 0) {
            head.val = output.get(0);

        ListNode temp = head;
        while (j < arrayLength) {
            ListNode temptemp = new ListNode();
            temp.next = temptemp;
            temp = temptemp;
            temp.val = output.get(j);
            j++;

        }
    }
           return head;
    }

    public static void main(String args[]) {
        ListNode l1 = new ListNode(1);
        ListNode l11 = new ListNode(3);
        ListNode l12 = new ListNode(5);

        l1.next = l11;
        l11.next = l12;
        //////
        ListNode l2 = new ListNode(4);
        ListNode l21 = new ListNode(4);
        ListNode l22 = new ListNode(6);

        l2.next = l21;
        l21.next = l22;

        //////
        ListNode l3 = new ListNode(4);


        ListNode[] lists = new ListNode[]{l1, l2, l3};

        printLinkedList(mergeKLists(lists));

        ////////check for empty list
        ListNode l4 = new ListNode();
        l4.val=1;

       ListNode[] lists2 = new ListNode[]{};

      // printLinkedList(mergeKLists(lists2));
       ///
        ////////check for empty list
        ListNode l5 = new ListNode();
        ListNode l6 = new ListNode();


        ListNode[] lists3 = new ListNode[]{l5,l6};

        printLinkedList(mergeKLists(lists3));



    }
}