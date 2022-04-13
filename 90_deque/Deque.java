/***
Team PJOLLN: Neil Lin, Lior Polischouk, Joseph Othman
APCS pd7
HW90 --
2022-04-12
time spent: 0.5 hrs
DISCO:
- 
QCC:
- Do we need methods on the interface such as offer and poll?

**/
public interface Deque<T> {
  public void addFirst(T x);

  public void addLast(T x);

  public T removeFirst();

  public T removeLast();

  public T getFirst();

  public T getLast();

  public int size();
}
public class QQKachoo<T> implements Deque<T> {
  
}
