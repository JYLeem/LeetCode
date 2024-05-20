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

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answer = new ListNode();
        ListNode dummy = answer;

        int sum = 0;

        while (l1 != null || l2 != null || sum != 0){
            if (l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }

            if (sum < 10){
                dummy.next = new ListNode(sum);
                sum = 0;
            } else {
                dummy.next = new ListNode(sum % 10);
                sum = 1;
            }
            dummy = dummy.next;
        }
        return answer.next;
    }
}

/* -> int overflow
        int sum = 0;
        int power = 0;
        int ans = 0;
        
        while (true){
            sum += l1.val * Math.pow(10, power);
            power++;
            if (l1.next == null) break;
            l1 = l1.next;
        }
        
        power = 0;
        while (true){
            sum += l2.val * Math.pow(10, power);
            power++;
            if (l2.next == null) break;
            l2 = l2.next;
        }

        while (true){
            ListNode temp = new ListNode(sum % 10);
            dummy.next = temp;
            dummy = dummy.next;
            sum /= 10;
            if (sum == 0) break;
        }
        return answer.next;
    }
*/
