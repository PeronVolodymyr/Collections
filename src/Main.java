import Model.Apple;
import Model.CurrentApple;
import Model.SomeCurrentApple;

import java.util.*;

public class Main {

    //Непараметризовані колекції (без дженериків)
//    //Відключення попередження компілятора (попередження у вигляді жовтих квадратиків на смузі прокрутки справа)
//    @SuppressWarnings("unchecked")
//    public static void main(String[] args) {
//        ArrayList list = new ArrayList<>(Arrays.asList(
//                new Model.Apple(1,"Red apple"),
//                new Model.Orange(1,"Blue orange")
//        ));
//        list.forEach(System.out::println);
//        Model.Apple apple = (Model.Apple) list.get(0);
//        System.out.println(apple);
//    }

    //Параметризовані колекції
//    public static void main(String[] args) {
//        ArrayList<Model.Apple> list = new ArrayList<>();
//        list.add(new Model.CurrentApple(1,"Red Model.Apple","Very tasty apples"));
//        list.add(new Model.CurrentApple(2,"Yellow Model.Apple","Very nice apples"));
//        list.add(new Model.Apple(3,"Yellow Model.Apple"));
//
//        list.forEach(System.out::println);
//
//        Model.CurrentApple currentApple = (Model.CurrentApple) list.get(0);
//        System.out.println(currentApple);
//    }

//    public static void main(String[] args) {
//        ArrayList<Model.Apple> firstList = new ArrayList<>(Arrays.asList(
//                new Model.Apple(1,"a"),
//                new Model.Apple(2,"b")
//
//        ));
//
//        firstList.add(new Model.Apple(3,"c"));
//
//        ArrayList<Model.Apple> list = new ArrayList<>();
//        list.addAll(firstList);
//
//        list.forEach(System.out::println);
//    }

//    public static void main(String[] args) {
//        List<Model.Apple> firstList = Arrays.asList(
//                new Model.Apple(1, "a"),
//                new Model.Apple(2, "b")
//
//        );
//        firstList.set(1,new Model.Apple(2,"bb"));
////        firstList.add(new Model.Apple(3, "c")); //помилка виконання оскільки розмір закладеного масиву не можна змінити
//        firstList.forEach(System.out::println);
//    }

    //Iterator---------------------------------------
//    public static void main(String[] args) {
//        List<Model.Apple> list = new ArrayList<>(Arrays.asList(
//                new Model.SomeCurrentApple(1,"a","a"),
//                new Model.SomeCurrentApple(2,"b","b"),
//                new Model.SomeCurrentApple(3,"c","c")
//        ));
//        Iterator<Model.Apple> it = list.iterator();
//        while (it.hasNext())
//        {
//            Model.SomeCurrentApple someCurrentApple = (Model.SomeCurrentApple) it.next();
//            System.out.println(someCurrentApple);
//        }
//        for (int i = 0; i < 3; i++){
//            it.next();
//            it.remove();
//        }
//        System.out.println(list);
//    }


    //Iterator-----------------------------
//    public static void display(Iterator<Model.Apple> it)
//    {
//        while (it.hasNext())
//        {
//            System.out.println(it.next());
//        }
//    }
//    public static void main(String[] args) {
//
//        List<Model.Apple> list1 = new ArrayList<>(Arrays.asList(
//                new Model.SomeCurrentApple(1,"a","a"),
//                new Model.SomeCurrentApple(2,"b","b"),
//                new Model.SomeCurrentApple(3,"c","c")
//        ));
//        List<Model.Apple> list2 = new LinkedList<>(Arrays.asList(
//                new Model.SomeCurrentApple(1,"a","a"),
//                new Model.SomeCurrentApple(2,"b","b"),
//                new Model.SomeCurrentApple(3,"c","c")
//        ));
//        Set<Model.Apple> set1 = new HashSet<>(Arrays.asList(
//                new Model.SomeCurrentApple(1,"a","a"),
//                new Model.SomeCurrentApple(2,"b","b"),
//                new Model.SomeCurrentApple(3,"c","c")
//        ));
//        Set<Model.Apple> set2 = new TreeSet<>(Arrays.asList(
//                new Model.SomeCurrentApple(2,"b","b"),
//                new Model.SomeCurrentApple(1,"a","a"),
//                new Model.SomeCurrentApple(3,"c","c")
//        ));
//
//        display(list1.iterator());
//        System.out.println();
//        display(list2.iterator());
//        System.out.println();
//        display(set1.iterator());
//        System.out.println();
//        display(set2.iterator());
//    }

//    public static void main(String[] args) {
//        List<Apple> list = new ArrayList<>(Arrays.asList(
//                new SomeCurrentApple(1,"a","a"),
//                new SomeCurrentApple(2,"b","b"),
//                new SomeCurrentApple(3,"c","c")
//        ));

//        ListIterator<Apple> iterator1 = list.listIterator(0);
//        ListIterator<Model.Apple> iterator2 = list.listIterator(3);
//        while (iterator1.hasNext())
//        {
//            System.out.println(iterator1.next());
//        }
//        while (iterator1.hasPrevious())
//        {
//            System.out.println(iterator1.previous());
//        }

//        while (iterator2.hasPrevious())
//        {
//            iterator2.previous();
//            iterator2.set(new Model.Apple(3,"sdfsdfs"));
//        }
//        System.out.println(list);
//
//        while (iterator1.hasNext())
//        {
//            iterator1.next();
//            iterator1.set(new Model.Apple(3,"sdfsdfs"));
//        }
//        System.out.println(list);
//    }

    //Stack
//    public static void main(String[] args) {
//        Stack stack = new Stack();
//        stack.push(1);
//        stack.push(new Apple(1,"asd"));
//        stack.push(new Apple(2,"ass"));
//        stack.push(new Apple(3,"asm"));
//
//        System.out.println(stack);
//
//        Apple apple1 = (Apple) stack.pop();
//        Apple apple2 = (Apple) stack.pop();
//
//        System.out.println(stack);
//    }

    //Set
//    public static void main(String[] args) {
//        //needs to override methods equals and hashcode
//        Set<Apple> set = new HashSet<>();
//        set.add(new Apple(1,"A"));
//        set.add(new Apple(2,"A"));
//        set.add(new Apple(2,"A"));
//        set.add(new Apple(3,"B"));
//        set.add(new Apple(3,"B"));
//        set.add(new Apple(3,"C"));
//        System.out.println(set);
//
//        //needs one more override method compareTo
//        Set<Apple> sortedSet = new TreeSet<>();
//        sortedSet.add(new Apple(1,"A"));
//        sortedSet.add(new Apple(2,"A"));
//        sortedSet.add(new Apple(2,"A"));
//        sortedSet.add(new Apple(3,"B"));
//        sortedSet.add(new Apple(3,"B"));
//        sortedSet.add(new Apple(3,"C"));
//        System.out.println(sortedSet);
//
//        System.out.println(set.containsAll(sortedSet));
//        System.out.println(set.contains(new Apple(3,"asm")));
//
//        set.remove(new Apple(3,"C"));
//        System.out.println(set);
//    }

//    public static void main(String[] args) {
//        Random random = new Random();
//        Map<Integer,Integer> map = new HashMap<>();
//        for(int i = 0; i < 100; i++)
//        {
//            int number = random.nextInt(10);
//            Integer freq = map.get(number);
//            map.put(number, freq == null ? 1 : freq+1);
//        }
//        System.out.println(map);
//
//        Map<String,Apple> firstMap = new HashMap<>();
//        firstMap.put("apple",new Apple(1,"Apple"));
//        firstMap.put("current apple",new CurrentApple(1,"Current apple","Very tasty"));
//        firstMap.put("some current apple",new SomeCurrentApple(1,"Some current apple","Very nice"));
//        System.out.println(firstMap);
//        Apple apple = firstMap.get("current apple");
//        System.out.println(apple);
//        System.out.println(firstMap.containsKey("apple"));
//        System.out.println(firstMap.containsValue(new Apple(1, "Apple")));
//        System.out.println(firstMap.keySet());
//        System.out.println(firstMap.values());
//
//        //rewrite record which has "apple" key
//        firstMap.put("apple", new Apple(1,"New apple"));
//        System.out.println(firstMap);
//
//        firstMap.entrySet().stream()
//                .filter(entry -> entry.getKey().equals("apple"))
//                .forEach(entry -> {entry.setValue(new Apple(33,"sd")); System.out.println(entry.getKey() + " : " + entry.getValue());});
//    }

    //Queue
//    public static void main(String[] args) {
//
//        //offer - add element in the end of the queue
//        //peek - return first element in the queue without removing
//        //poll - delete and return first element in the queue
//        Queue<Apple> queue = new LinkedList<>();
//        queue.offer(new Apple(1,"A"));
//        queue.offer(new Apple(2,"B"));
//        queue.offer(new Apple(3,"C"));
//        queue.offer(new Apple(4,"D"));
//        System.out.println(queue);
//
//        if(queue.peek() != null) {
//            Apple apple = queue.poll();
//            System.out.println(apple);
//        }
//        System.out.println(queue);
//
//        while (queue.peek() != null)
//        {
//            System.out.println(queue.remove());
//        }
//        System.out.println(queue);
//    }

    //String split
//    public static void main(String[] args) {
//        String s = new String("Peron - los, - xaxa. I think.");
//        for (String str : s.split(" ")) {
//            System.out.println(str);
//        }
//    }

    //PriorityQueue
//    public static void main(String[] args) {
//        //priorityQueue doesn't store our elements in order according to Comparator,
//        //but when we will be to extract our elements from priorityQueue we get them in the right order
//        //according to Comparator
//        PriorityQueue<Apple> priorityQueue = new PriorityQueue<>(new PriorityQueueComparator());
//        priorityQueue.offer(new Apple(1,"E"));
//        priorityQueue.offer(new Apple(2,"D"));
//        priorityQueue.offer(new Apple(3,"C"));
//        priorityQueue.offer(new Apple(4,"B"));
//        priorityQueue.offer(new Apple(5,"A"));
//        System.out.println(priorityQueue);
//        while (priorityQueue.peek() != null)
//        {
//            System.out.println(priorityQueue.poll());
//        }
//    }

//    //Instance of
//    public static void main(String[] args) {
//        Apple firstApple = new Apple(1,"C");
//        Apple apple = new SomeCurrentApple(1,"A","d");
//        SomeCurrentApple someCurrentApple = new SomeCurrentApple(1,"B","d");
//
//        System.out.println(apple instanceof Apple);
//        System.out.println(apple instanceof CurrentApple);
//        System.out.println(apple instanceof SomeCurrentApple);
//
//        System.out.println(someCurrentApple instanceof Apple);
//        System.out.println(someCurrentApple instanceof CurrentApple);
//        System.out.println(someCurrentApple instanceof SomeCurrentApple);
//
//        System.out.println(firstApple instanceof Apple);
//        System.out.println(firstApple instanceof CurrentApple);
//        System.out.println(firstApple instanceof SomeCurrentApple);
//
//
//    }
}