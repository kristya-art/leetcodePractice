package ja;

public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val){this.val=val;}
        ListNode(int val, ListNode next){this.val=val;this.next=next;}

    public static void printLinkedList(ListNode listNode){
        System.out.println("[");
        while(listNode!=null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
        System.out.println("]");
    }

    public static boolean isNull(ListNode ln) {
        if (ln == null) {
            return true;
        }
        return false;
    }
}
