package ja;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
 Merge all the linked-lists into one sorted linked-list and return it.
 */
public class MergeKSortedListsTest {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val){this.val=val;}
        ListNode(int val, ListNode next){this.val=val;this.next=next;}

    }
    public static boolean isNull(ListNode ln){
        if(ln==null){return true;}
        return false;
    }


    public static List<Integer> test(ListNode[] lists){
        List output = new ArrayList();

        ListNode temp  = new ListNode();
        int min = 0;
        int count = 0;
        int startMin = 0;
        int NOfemptyLists = 0;
       // for(ListNode ln : lists){
            while(NOfemptyLists!=lists.length) {
                if(startMin<lists.length) {
                    if (isNull(lists[startMin]) == false) {
                        min = lists[startMin].val;
                    } else {
                        startMin += 1;
                        break;
                    }
                }else{return output;}

                for (int i = 0; i < lists.length; i++) {
                    if(isNull(lists[i])){break;}
                    if (lists[i].val < min) {
                        min = lists[i].val;
                        count=i;
                    }
                }
                if(!isNull(lists[count])){
                lists[count] = lists[count].next;
                if(!isNull(lists[count])){
                System.out.println(lists[count].val);}
                }
                if(isNull(lists[count])){NOfemptyLists+=1;}


                output.add(min);
            }
System.out.println(output);
        return output;
    }
    public static void printLinkedList(ListNode listNode){
        System.out.println("[");
        while(listNode!=null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
        System.out.println("]");
    }
    public static void main (String args[]){
        ListNode l1 = new ListNode(1);
        ListNode l11 = new ListNode(3);
        ListNode l12 = new ListNode(5);



        l1.next = l11;
        l11.next = l12;
        //////
        ListNode l2 = new ListNode(2);
        ListNode l21 = new ListNode(4);
        ListNode l22 = new ListNode(6);

        l2.next = l21;
        l21.next= l22;

        //////
        ListNode l3 = new ListNode(2);
        ListNode l31 = new ListNode(3);
        ListNode l32 = new ListNode(7);

        l3.next = l31;
        l31.next = l32;

        ListNode[] lists = new ListNode[]{l1,l2,l3};

        List result = test(lists);

        System.out.println(result+"result");

    }
}
