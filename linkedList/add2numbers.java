package linkedList;



// add 2 numbers
// leetcode 2



// whenever you are asked to give the final answer in a new list, use a dummy list.



public class add2numbers {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node add2nums(Node l1 , Node l2){
        Node dummy = new Node(0); // initialized with 0. so currently it only has one node, that is 0.
        Node pointer = dummy;

        int carry = 0;

        // Using && means the loop stops as soon as either l1 or l2 becomes null.
        // But LeetCode 2 requires you to keep adding nodes as long as either list has nodes left.
        while(l1 != null || l2 != null){
            int sum = carry;
            
            if(l1 != null){ // number from first list
                sum += l1.data;
                l1 = l1.next;
            }

            if(l2 != null){ // number from second list
                sum += l2.data;
                l2 = l2.next;
            }

            carry = sum / 10;
            sum = sum % 10; // if l1 + l2 = 18, then 8 is added to the sum, and 1 is added to the carry.
            pointer.next = new Node(sum); // making a new node for the sum we just got, and adding it to the dummy list.
            pointer = pointer.next;
        }

        if(carry > 0){
            pointer.next = new Node(carry);
        }

        return dummy.next; // the answer is dummy.next and not dummy because we initialized dummy with 0, so the first node is 0. so the answer will be the next node.
    }
    public static void main(String[] args) {
        // add2numbers list = new add2numbers();

        // System.out.println(list.add2nums()); // give 2 LLs as input.
    }
}
