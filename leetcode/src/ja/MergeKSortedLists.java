package ja;

import org.w3c.dom.NodeList;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
 Merge all the linked-lists into one sorted linked-list and return it.
 */
/*
algorithm will go throw each element in array and will always compare the first element of each array with each
other. Each time when the linkedlist has a min number the pointer will be moved to the next element. When the
array will have all elements empty a program will be terminated.
 */
public class MergeKSortedLists {
    public static class ListNode extends MergeKSortedListsTest.ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val){this.val=val;}
        ListNode(int val, ListNode next){this.val=val;this.next=next;}

    }
//    public ListNode mergeKLists(ListNode[] lists){
//        ListNode n  = new ListNode();
//        int min = 0;
//        for(int i =0;i <lists.length;i++){
//            min = lists[i].val;
//
//        }
//    }
public static List<Integer> test(ListNode[] lists){
        int count=0;
        int min = lists[0].val;
        ListNode output = new ListNode();
        ListNode temp = new ListNode();
        temp = output;

        List result = new ArrayList();
        for(int j=0;j<3;j++){
   for(int i = 0;i<lists.length;i++) {
       if (lists[i].val < min) {
           min = lists[i].val;
           count = i;
       }
   }
            result.add(min);
            lists[count] = lists[count].next;

   }


//        output.val=min;
//
//        ListNode prossimo = new ListNode();
//        output.next = prossimo;
//

   return result;
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
        ListNode l2 = new ListNode(4);
        ListNode l21 = new ListNode(4);
        ListNode l22 = new ListNode(6);

        l2.next = l21;
        l21.next= l22;

        //////
        ListNode l3 = new ListNode(4);
        ListNode l31 = new ListNode(3);
        ListNode l32 = new ListNode(7);

        l3.next = l31;
        l31.next = l32;

        ListNode[] lists = new ListNode[]{l1,l2,l3};

        System.out.println(test(lists));




}
}
