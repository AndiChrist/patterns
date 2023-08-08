package io.github.andichrist.behavioral.iterator;

// Die konkrete Implementierung des Iterators
public class ConcreteIterator<T> implements Iterator<T> {
  private T[] elements;
  private int position = 0;

  public ConcreteIterator(T[] elements) {
    this.elements = elements;
  }

  @Override
  public boolean hasNext() {
    return position < elements.length;
  }

  @Override
  public T next() {
    return elements[position++];
  }
}
