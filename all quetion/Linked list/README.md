# ================================
# 📌 Linked List Cheat Sheet
# ================================

type ListNode {
  val: Int
  next: ListNode | null
}

# ================================
# 🔹 BASICS
# ================================

LinkedList {
  definition: "A linear data structure where elements are stored in nodes and each node points to the next node."
  memory: "Non-contiguous"
  access: "Sequential (no index access)"
}

Node {
  val: "Stores the data"
  next: "Reference to the next node"
}

Head {
  description: "First node of the linked list"
}

Null {
  description: "Indicates end of linked list"
}

# ================================
# 🔹 NODE CREATION
# ================================

CreateNode {
  java: """
  class ListNode {
      int val;
      ListNode next;

      ListNode(int val) {
          this.val = val;
          this.next = null;
      }
  }
  """
}

# ================================
# 🔹 TRAVERSAL
# ================================

Traversal {
  logic: "Move node by node using next reference"
  timeComplexity: "O(n)"
  code: """
  ListNode curr = head;
  while (curr != null) {
      System.out.print(curr.val + " ");
      curr = curr.next;
  }
  """
}

# ================================
# 🔹 INSERTION
# ================================

InsertAtBeginning {
  timeComplexity: "O(1)"
  steps: [
    "Create new node",
    "Point newNode.next to head",
    "Move head to newNode"
  ]
  code: """
  ListNode newNode = new ListNode(5);
  newNode.next = head;
  head = newNode;
  """
}

InsertAtEnd {
  timeComplexity: "O(n)"
  steps: [
    "Traverse to last node",
    "Attach new node to last.next"
  ]
  code: """
  ListNode curr = head;
  while (curr.next != null) {
      curr = curr.next;
  }
  curr.next = new ListNode(40);
  """
}

# ================================
# 🔹 DELETION
# ================================

DeleteHead {
  timeComplexity: "O(1)"
  code: """
  head = head.next;
  """
}

DeleteByValue {
  timeComplexity: "O(n)"
  rule: "Always change previous node’s next"
  code: """
  ListNode curr = head;

  while (curr.next != null && curr.next.val != target) {
      curr = curr.next;
  }

  if (curr.next != null) {
      curr.next = curr.next.next;
  }
  """
}

# ================================
# 🔹 TWO POINTER TECHNIQUE
# ================================

TwoPointers {
  slow: "Moves one step"
  fast: "Moves two steps"
}

FindMiddle {
  code: """
  ListNode slow = head;
  ListNode fast = head;

  while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
  }
  return slow;
  """
}

DetectCycle {
  algorithm: "Floyd’s Cycle Detection"
  code: """
  ListNode slow = head;
  ListNode fast = head;

  while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;

      if (slow == fast) return true;
  }
  return false;
  """
}

# ================================
# 🔹 REVERSE LINKED LIST
# ================================

ReverseLinkedList {
  technique: "3 pointers (prev, curr, next)"
  timeComplexity: "O(n)"
  spaceComplexity: "O(1)"
  code: """
  ListNode prev = null;
  ListNode curr = head;

  while (curr != null) {
      ListNode next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
  }
  head = prev;
  """
}