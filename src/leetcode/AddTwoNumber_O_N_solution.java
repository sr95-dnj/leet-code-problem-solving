package leetcode;

public class AddTwoNumber_O_N_solution {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            if (l1 == null){
                return l2;
            }
            if (l2 == null) {
                return l1;
            }

            int carry = 0;
            ListNode dummyHead = new ListNode(-1);
            ListNode resultTail = dummyHead;

            while (l1 != null || l2 != null) {
                int num1 = l1 != null ? l1.val : 0;
                int num2 = l2 != null ? l2.val : 0;

                int sum = num1 + num2 + carry;
                carry = sum / 10;
                sum = sum % 10;

                resultTail.next = new ListNode(sum);
                resultTail = resultTail.next;

                if (l1 != null) l1 = l1.next;
                if (l2 != null) l2 = l2.next;
            }

            if (carry == 1) {
                resultTail.next = new ListNode(1);
                resultTail = resultTail.next;
            }

            return dummyHead.next;
        }
    }
}
