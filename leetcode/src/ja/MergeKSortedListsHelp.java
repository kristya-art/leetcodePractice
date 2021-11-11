package ja;

import java.util.List;

public class MergeKSortedListsHelp {

    public static int test(MergeKSortedLists.ListNode[] lists){

        return lists.length;
    }
    public static boolean isNull(MergeKSortedLists.ListNode ln){
        if(ln==null){return true;}
        return false;
    }

    public static void main (String args[]){
        MergeKSortedLists.ListNode l1 = new MergeKSortedLists.ListNode();
        MergeKSortedLists.ListNode[] lists = new MergeKSortedLists.ListNode[]{l1};
        boolean isnull = false;
        isnull = isNull(l1);
        System.out.println(isnull);

        l1=l1.next;
        isnull=isNull(l1);
        System.out.println(isnull);
    }
}
