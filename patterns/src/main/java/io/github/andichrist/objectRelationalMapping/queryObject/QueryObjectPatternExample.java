package io.github.andichrist.objectRelationalMapping.queryObject;

import java.util.List;

/*
 Das "Query Object" ist ein Entwurfsmuster, das in der Softwareentwicklung verwendet wird, um die
 Erstellung und Verwaltung von Datenbankabfragen zu verbessern und zu vereinfachen. Es hilft, die
 Komplexität von Datenbankabfragen zu reduzieren und gleichzeitig den Code, der Datenbankzugriffen
 zugrunde liegt, sauber und wartbar zu halten.

 Das "Query Object" Muster besteht darin, eine separate Klasse (das "Query Object") zu erstellen, die
 die Logik und die Details einer Datenbankabfrage kapselt. Anstatt die SQL-Abfrage direkt in den Code
 zu schreiben, wird die Abfrage im Query Object erstellt und verwaltet. Dies erleichtert die
 Wartbarkeit, Testbarkeit und die Wiederverwendung von Abfragen.

 In diesem Beispiel verwenden wir das "Query Object" Muster, um die Erstellung und Verwaltung von
 Datenbankabfragen zu vereinfachen. Das Query-Objekt kapselt die Informationen über die Auswahl, die
 Tabelle und die WHERE-Klausel. Die Methode generateSql() generiert das SQL anhand dieser Informationen.

 Die UserRepository-Klasse nutzt das Query Object, um Benutzer mit einem Alter über einem bestimmten
 Wert abzurufen. Bitte beachten Sie, dass in diesem Beispiel das SQL nur generiert wird und nicht
 tatsächlich auf eine Datenbank zugegriffen wird.

 Das "Query Object" Muster ermöglicht eine saubere Trennung von Abfrage-Details und Geschäftslogik,
 was die Wartbarkeit und Lesbarkeit des Codes verbessert.
 */
public class QueryObjectPatternExample {
  public static void main(String[] args) {
    UserRepository userRepository = new UserRepository();
    List<String> users = userRepository.findUsersWithAgeGreaterThan(25);
    System.out.println("Users with age > 25: " + users);
  }
}
