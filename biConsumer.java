import java.util.function.Consumer;

public class biConsumer{

    public static void main(String[] args) {

      BiConsumer<Integer, Integer> addingNum = (x, y) -> System.out.println(x + y);
      addingNum.accept(10, 20);    

    }

}