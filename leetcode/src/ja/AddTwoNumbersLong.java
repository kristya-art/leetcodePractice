package ja;
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
public class AddTwoNumbersLong {

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
        ListNode l = new ListNode(9);
//        ListNode l2 = new ListNode(0);
//        ListNode l3 = new ListNode(0);
//        l.next= l2;
//        l2.next=l3;

        ListNode m = new ListNode(1);
        ListNode m2 = new ListNode(9);
        ListNode m3 = new ListNode(9);

        m.next= m2;
        m2.next=m3;

        ListNode m4 = new ListNode(9);
        ListNode m5 = new ListNode(9);
        ListNode m6 = new ListNode(9);

        m3.next=m4;
        m4.next=m5;
        m5.next=m6;

        ListNode m7 = new ListNode(9);
        ListNode m8 = new ListNode(9);
        ListNode m9 = new ListNode(9);
        ListNode m10= new ListNode(9);
        m6.next = m7;
        m7.next=m8;
        m8.next=m9;
        m9.next=m10;

        long test = linkedlistToInt(l);
        long test2 = linkedlistToInt(m);
        System.out.println(test);
        System.out.println(test2);

       ListNode lm = addTwoNumbers(l,m);
       printListNode(lm);

    }

    public static long linkedlistToInt(ListNode l){
        long result = 0;
        String resultS = "";
        StringBuilder strB = new StringBuilder("");
        ListNode temp = new ListNode();
        temp=l;
        while(temp!=null){
            strB.append(temp.val);
            temp  = temp.next;
        }
        String resultString = strB.reverse().toString();
        result = Long.parseLong(resultString);
        return result;
    }
    public static ListNode intToListNode(long number){
        long test = number%10;
        int data = (int)test;


        ListNode head = new ListNode(data);
        number = number/10;
        ListNode temp = head;
       while(number>0){
           ListNode ln = new ListNode();
           test=number%10;

           data = (int)test;

           ln.val = data;
           number=number/10;
           temp.next = ln;
           temp = ln;

       }

        return head;
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){

        long sum = linkedlistToInt(l1)+linkedlistToInt(l2);
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
