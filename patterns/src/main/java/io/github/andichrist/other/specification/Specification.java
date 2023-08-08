package io.github.andichrist.other.specification;

// Das Interface für die Spezifikation
interface Specification<T> {
  boolean isSatisfied(T item);
}
