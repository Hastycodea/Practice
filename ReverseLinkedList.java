public class ReverseLinkedList {
    public static void main(String[] args) {

        ListNode five = new ListNode(5);
        ListNode four = new ListNode(4, five);
        ListNode three = new ListNode(3, four);
        ListNode two = new ListNode(2, three);
        ListNode one = new ListNode(1, two);

        ListNode result = reverseList(one);
        printList(result);

        
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            
            if (head.next != null) {
                System.out.print(" => ");
            } 
            head = head.next;
        }

        System.out.println();
    }

}
