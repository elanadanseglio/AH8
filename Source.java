import java.util.ArrayList;

class Node<T> {
    T val;
    Node<T> next;
    
    public Node(T val) {
      this.val = val;
      this.next = null;
    }
  }
  
  class Source {
    public static <T> boolean linkedListFind(Node<T> head, T target) {
      // todo
      ArrayList<T> newLink = new ArrayList<>();
      while (head != null) {
        newLink.add(head.val);
        head = head.next;
      }

      for (T t : newLink){
        if (t == target){
          return true;
        }
      }
      return false;
    }
    
    public static void main(String[] args) {
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");

        a.next = b;
        b.next = c;
        c.next = d;

        // a -> b -> c -> d

        System.out.println(Source.linkedListFind(a, "a"));
        System.out.println(Source.linkedListFind(a, "b"));
        System.out.println(Source.linkedListFind(a, "c"));
        System.out.println(Source.linkedListFind(a, "d"));
        System.out.println(Source.linkedListFind(a, "e"));

        Node<Integer> node1 = new Node<>(42);
        System.out.println(Source.linkedListFind(node1, 100)); // false
        
    }

  }
