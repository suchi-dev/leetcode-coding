package org.example;

/*
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order, and each of their nodes contains a
 single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except
 the number 0 itself.
 */
public class AddTwoSum {


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while(l1 != null || l2 != null || carry !=0){
            int v1 = l1 != null ? l1.val : 0;
            int v2 = l2 != null ? l2.val : 0;
            int value = v1 + v2 + carry;
            carry = value /10;
            value = value % 10;
            ListNode result = new ListNode(value);
            current.next = result;

            // update the pointers
            l1 = l1 != null? l1.next: null;
            l2 = l2 != null ? l2.next : null;
            current = current.next;

        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = addTwoNumbers(l1, l2);
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }


    }
}

