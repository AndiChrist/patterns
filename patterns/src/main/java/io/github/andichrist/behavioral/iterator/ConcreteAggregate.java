package io.github.andichrist.behavioral.iterator;

// Die konkrete Implementierung des Aggregats
public class ConcreteAggregate<T> implements Aggregate<T> {
  private T[] elements;

  public ConcreteAggregate(T[] elements) {
    this.elements = elements;
  }

  @Override
  public Iterator<T> iterator() {
    return new ConcreteIterator<>(elements);
  }
}
