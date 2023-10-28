package lectures;


import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.function.Predicate;
import org.junit.Test;

public class Lecture6 {

  final Predicate<Integer> numbersLessThan10 = n -> n > 5 && n < 10;

  @Test
  public void findAny() throws Exception {
    Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    for (int i = 0; i < 110055500 ; i++) {

    Integer in = Arrays.stream(numbers)
            .filter(c -> c<10 && c< 9 && c > 1 && c>2 && c<8)
            .findAny()
            .get();
    if(in!=3)
    System.out.println(in);
    }

  }

  @Test
  public void findFirst() throws Exception {
    Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

  }
}

