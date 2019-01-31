import java.util.*;
class TreeSetEx{
    public static void main(String args[]){
        
       
      Set<Integer> s=new TreeSet<Integer>();
     s.add(5);
     s.add(4);
      s.add(3);
       s.add(1);
       s.add(19);
        s.add(10);
        Iterator iterator=s.iterator();
        while(iterator.hasNext()){
            Object ob=iterator.next();
       System.out.println(ob);
    }
}
}