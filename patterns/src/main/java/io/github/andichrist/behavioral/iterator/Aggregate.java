package io.github.andichrist.behavioral.iterator;

// Das Aggregate-Interface
public interface Aggregate<T> {
  Iterator<T> iterator();
}
