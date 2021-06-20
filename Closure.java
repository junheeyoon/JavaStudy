public class ClosureTest {
  
  private Integer b = 2;
  
  private Stream<Integer> calculate(Stream<Integer> stream, Integer a) {
    return stream.map(t -> t * a + b);
  }

  public static void main(String... args) {
    
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> result = new ClosureTest()
      .calculate(list.stream(), 3)
      .collect(Collectors.toList());
    System.out.println(result); // [5, 8, 11, 14, 17]
  }
}
