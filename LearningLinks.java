public class LearningLinks{
    public static void main(String[] args){
        Node one = new Node(20);
        System.out.println(one);
        
        Node two = new Node(33);
        one.setLink(two);
        System.out.println(one);
        System.out.println(one.next);
        Node three = new Node(1);
        two.setLink(three);
        System.out.println(one.getNext().getNext());
        Node temp = one;
        while(temp != null){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
        temp = one;
        while(temp.getNext() != null){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
        temp.setLink(new Node(5));
        while(temp != null){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
        Node temp2 = new Node(4);
        temp2.setLink(one);
        temp = temp2;
        while(temp != null){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
        temp = temp2;
        while(temp2.getNext().getNext() != null)
        {
            temp2 = temp2.getNext();
        }
        temp2.setLink(null);
        while(temp != null){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }



    }
}