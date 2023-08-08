package io.github.andichrist.other.specification.record;

// Das Interface für die Spezifikation
interface Specification<T> {
  boolean isSatisfied(T item);
}
