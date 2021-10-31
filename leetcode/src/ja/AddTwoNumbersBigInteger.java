package ja;

import java.math.BigInteger;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class AddTwoNumbersBigInteger {

    public static class ListNode{
        int val;
        ListNode next;
        public ListNode(){}
        public ListNode(int data){
            this.val = data;
        }
        public ListNode(int data, ListNode next){
            this.val = data;
            this.next = next;
        }
    }

    public static void main(String []args){
        long startTime = System.nanoTime();
        ListNode l = new ListNode(1);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(1);

        l.next= l2;
        l2.next=l3;

        ListNode l4 = new ListNode(1);
        ListNode l5 = new ListNode(1);
        ListNode l6 = new ListNode(1);

        l3.next=l4;
        l4.next=l5;
        l5.next=l6;

        ListNode l7 = new ListNode(1);
        ListNode l8 = new ListNode(1);
        ListNode l9 = new ListNode(1);
        ListNode l10= new ListNode(1);
        ListNode l11= new ListNode(1);
        l6.next = l7;
        l7.next=l8;
        l8.next=l9;
        l9.next=l10;
        l10.next=l11;

///////////////////////
        ListNode m = new ListNode(1);
        ListNode m2 = new ListNode(1);
        ListNode m3 = new ListNode(1);

        m.next= m2;
        m2.next=m3;

        ListNode m4 = new ListNode(1);
        ListNode m5 = new ListNode(1);
        ListNode m6 = new ListNode(1);

        m3.next=m4;
        m4.next=m5;
        m5.next=m6;

        ListNode m7 = new ListNode(1);
        ListNode m8 = new ListNode(1);
        ListNode m9 = new ListNode(1);
        ListNode m10= new ListNode(1);
        ListNode m11= new ListNode(1);
        m6.next = m7;
        m7.next=m8;
        m8.next=m9;
        m9.next=m10;
        m10.next=m11;

        BigInteger test = linkedlistToInt(l);
        BigInteger test2 = linkedlistToInt(m);
        System.out.println(test);
        System.out.println(test2);

        ListNode lm = addTwoNumbers(l,m);
        printListNode(lm);

        long endTime = System.nanoTime();

        System.out.println(endTime-startTime);

    }

    public static BigInteger linkedlistToInt(ListNode l){
        BigInteger result = BigInteger.valueOf(0);
        String resultS = "";
        StringBuilder strB = new StringBuilder("");
        ListNode temp = new ListNode();
        temp=l;
        while(temp!=null){
            strB.append(temp.val);
            temp  = temp.next;
        }
        String resultString = strB.reverse().toString();
        result = new BigInteger(resultString);
        return result;
    }
    public static ListNode intToListNode(BigInteger number){
        BigInteger ten = new BigInteger("10");
        BigInteger test = number.mod(ten);
        int data  = test.intValue();
        number = number.divide(ten);

        ListNode head = new ListNode(data);

        ListNode temp = head;
        while(number.compareTo(BigInteger.ZERO) > 0){
            ListNode ln = new ListNode();
            test =number.mod(ten);
            data  = test.intValue();


            ln.val = data;
            number = number.divide(ten);
            temp.next = ln;
            temp = ln;

        }

        return head;
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){

        BigInteger sum = linkedlistToInt(l1).add(linkedlistToInt(l2));
        ListNode finalListNode = intToListNode(sum);
        return finalListNode;

    }
    static void printListNode(ListNode ln){
        System.out.println('[');
        while(ln!=null){
            System.out.println(ln.val);
            ln=ln.next;
        }
        System.out.println(']');
    }
}
