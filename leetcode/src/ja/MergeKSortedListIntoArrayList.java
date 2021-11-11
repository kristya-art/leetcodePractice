package ja;
/**
 You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
 Merge all the linked-lists into one sorted linked-list and return it.
 */
import java.util.ArrayList;
import java.util.List;

public class MergeKSortedListIntoArrayList extends ListNode {

    public static int getLength(ListNode[] lists) {

        return lists.length;
    }

    public static List<Integer> printNumbers(ListNode[] lists){
        List<Integer> output = new ArrayList<>();
        int min = 0;
        int indexFormin = 0;
        int end = 0;
        int count = indexFormin;
        int l = lists.length;
        while (end != lists.length) {
            if (isNull(lists[indexFormin])) {
                indexFormin = indexFormin+1;
                continue;
            } else {
                min = lists[indexFormin].val;}

            for (int i = indexFormin; i < lists.length; i++) {
                if (!isNull(lists[i]) && min >= lists[i].val) {
                    min = lists[i].val;
                    count = i;
                }
            }
            output.add(min);

            if (!isNull(lists[count])){lists[count] = lists[count].next;}
            if (isNull(lists[count])) {end += 1;}
        }
        printLinkedList(lists[0]);
        printLinkedList(lists[1]);
        printLinkedList(lists[2]);
        return output;

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
//       ListNode l31 = new ListNode(3);
//      ListNode l32 = new ListNode(7);
//
//        l3.next = l31;
//        l31.next = l32;

        ListNode[] lists = new ListNode[]{l1, l2, l3};

      System.out.println(printNumbers(lists));
//       printLinkedList(lists[0]);
//
//        lists[0] = lists[0].next;
//        System.out.println(lists[0].val+"3");
//
//        lists[0] = lists[0].next;
//        System.out.println(lists[0].val + "5");
//        printLinkedList(lists[0]);
//
//        lists[0] = lists[0].next;
//        printLinkedList(lists[0]);
//
//        printLinkedList(lists[2]);
//        lists[2] = lists[2].next;
//        printLinkedList(lists[2]);
//
//

    }
}