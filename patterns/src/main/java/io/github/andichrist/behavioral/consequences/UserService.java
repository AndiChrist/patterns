package io.github.andichrist.behavioral.consequences;

import java.sql.Connection;
import java.sql.SQLException;

/*
 Bei "Consequences" handelt es sich um ein Konzept, das in dem Buch "Functional Design
 Patterns" von Stuart Sierra diskutiert wird. Dieses Konzept betrifft die Berücksichtigung
 der Auswirkungen (Consequences) von Designentscheidungen und die bewusste Abwägung von
 Vor- und Nachteilen bei der Gestaltung von Software.

 In "Functional Design Patterns" legt Stuart Sierra großen Wert darauf, dass
 Designentscheidungen oft nicht nur positive Auswirkungen haben, sondern auch Konsequenzen
 und Trade-offs mit sich bringen können. Indem Entwickler sich dieser Konsequenzen bewusst
 sind und ihre Entscheidungen basierend auf einem tiefen Verständnis der Auswirkungen
 treffen, können sie besser abwägen, welche Entwurfsentscheidungen am besten zu den
 Anforderungen der Software passen.

 Die Idee hinter dem Konzept der "Consequences" ist es, Entwicklern zu helfen, fundierte
 Entscheidungen zu treffen und mögliche negative Auswirkungen zu antizipieren. Es ermutigt
 dazu, sorgfältig darüber nachzudenken, wie sich eine bestimmte Designentscheidung auf
 Aspekte wie Wartbarkeit, Leistung, Skalierbarkeit, Testbarkeit und andere
 Qualitätsattribute auswirken kann.

 Dieses Konzept betont, dass es keine absoluten "richtigen" oder "falschen" Entscheidungen
 gibt, sondern dass Designentscheidungen immer mit Trade-offs verbunden sind. Indem
 Entwickler die Konsequenzen ihrer Entscheidungen berücksichtigen, können sie besser
 informierte und ausgewogenere Designentscheidungen treffen, die zu hochwertigerer und
 besser wartbarer Software führen können.

 Das Konzept der "Consequences" ist daher eher ein Leitprinzip und ein Denkansatz, als ein
 spezifisches Entwurfsmuster oder eine konkrete Implementierung.

 Stellen Sie sich vor, Sie entwickeln eine Anwendung, die eine Datenbank verwendet, um
 Benutzerinformationen zu speichern. Sie stehen vor der Entscheidung, wie Sie die
 Verbindung zur Datenbank verwalten wollen. Hier ist ein Beispiel, wie Sie das Prinzip der
 "Consequences" anwenden könnten.

 In diesem Beispiel haben Sie die Entscheidung getroffen, die Datenbankverbindung in der
 UserService-Klasse zu öffnen und zu schließen, um einen Benutzer zu speichern. Diese
 Entscheidung hat Konsequenzen. Das Öffnen und Schließen der Verbindung in jeder Methode
 kann ineffizient sein, da mehrere Methoden nacheinander dieselbe Verbindung öffnen und
 schließen könnten. Sie könnten dies optimieren, indem Sie die Verbindung auf einer höheren
 Ebene öffnen und auf einer höheren Ebene schließen.

 Das Beispiel zeigt, wie die bewusste Abwägung von Vor- und Nachteilen bei
 Designentscheidungen dazu beitragen kann, die Struktur und Effizienz des Codes zu
 verbessern. Es verdeutlicht, wie die Berücksichtigung der "Consequences" zu einer besseren
 Software führen kann, indem mögliche Vor- und Nachteile sorgfältig abgewogen werden.
 */
public class UserService {
  private DatabaseManager dbManager;

  public UserService(DatabaseManager dbManager) {
    this.dbManager = dbManager;
  }

  public void saveUser(User user) {
    Connection connection = null;
    try {
      connection = dbManager.openConnection();

      // Hier Code zum Speichern des Benutzers in der Datenbank

    } catch (SQLException e) {
      System.err.println("Fehler beim Speichern des Benutzers: " + e.getMessage());
    } finally {
      if (connection != null) {
        try {
          dbManager.closeConnection(connection);
        } catch (SQLException e) {
          System.err.println("Fehler beim Schließen der Datenbankverbindung: " + e.getMessage());
        }
      }
    }
  }
}
