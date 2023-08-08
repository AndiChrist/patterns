package io.github.andichrist.other.repository;

import java.util.List;

/*
 Das Repository-Muster ermöglicht es, die Datenzugriffslogik in einer Klasse zu kapseln
 und eine einheitliche Schnittstelle für den Zugriff auf Daten in einer Datenquelle, wie
 beispielsweise einer Datenbank, bereitzustellen. Hier ist ein einfaches Java-Beispiel
 für das Repository-Muster.

 Im Beispiel haben wir das Repository-Muster implementiert, um eine einfache Datenquelle
 (eine Liste im Speicher) zu verwenden. Sie können die konkrete Implementierung des
 Repositorys leicht ändern, um eine echte Datenbank oder einen anderen Speichermechanismus
 zu verwenden, ohne den Code der Main-Klasse ändern zu müssen.

 Das Repository-Muster bietet eine klare Abstraktion für den Datenzugriff und macht es
 einfacher, den Datenzugriff in Ihrem Code auszutauschen oder zu testen.
 */
public class Main {
  public static void main(String[] args) {
    PersonRepository repository = new InMemoryPersonRepository();

    Person person1 = new Person();
    person1.setName("Alice");
    person1.setAge(30);
    repository.save(person1);

    Person person2 = new Person();
    person2.setName("Bob");
    person2.setAge(25);
    repository.save(person2);

    // Personen ausgeben
    List<Person> allPersons = repository.findAll();
    for (Person person : allPersons) {
      System.out.println("ID: " + person.getId() + ", Name: " + person.getName() + ", Age: " + person.getAge());
    }

    // Eine Person aktualisieren
    Person personToUpdate = repository.findById(1);
    if (personToUpdate != null) {
      personToUpdate.setName("Updated Alice");
      personToUpdate.setAge(35);
      repository.update(personToUpdate);
    }

    // Personen nach dem Update ausgeben
    allPersons = repository.findAll();
    for (Person person : allPersons) {
      System.out.println("ID: " + person.getId() + ", Name: " + person.getName() + ", Age: " + person.getAge());
    }
  }
}
