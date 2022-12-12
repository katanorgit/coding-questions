	class ListNode {
		int val;
		ListNode next;

		public ListNode(int val,ListNode next) {
			super();
			this.val = val;
			this.next = next;
		}

		@Override
		public String toString() {
			return "ListNode [val=" + val + ", next=" + next + "]";
		}
		
		

	}
public class PalindromeLinkedList {


	public static void main(String[] args) {
			ListNode head=new ListNode(1, null);
			head.next=new ListNode(2, null);
			
			System.out.println(head);
			
			
	}
}
