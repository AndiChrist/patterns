package io.github.andichrist.other.remoteCommand;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/*
 Das "Remote Command" Muster ist ein Entwurfsmuster, das verwendet wird, um die Ausführung
 von Befehlen oder Aktionen über ein Netzwerk oder eine entfernte Schnittstelle zu
 ermöglichen. Es wird oft verwendet, um die Kommunikation zwischen verschiedenen
 Komponenten oder Systemen zu erleichtern, indem Befehle oder Aktionen von einem Ort zum
 anderen übertragen werden.

 Das Muster umfasst normalerweise folgende Komponenten:

 1. Client: Der Client initiiert die Anfrage zur Ausführung eines Befehls. Er erstellt ein
    Befehlsobjekt, setzt seine Parameter und sendet es an den Server.

 2. Befehlsobjekt: Dieses Objekt enthält alle Informationen, die zur Ausführung des Befehls
    erforderlich sind. Es kann Parameter, Methodenreferenzen oder andere Informationen
    enthalten, die benötigt werden, um den Befehl auszuführen.

 3. Invoker: Der Invoker ist verantwortlich für die Ausführung des Befehls. Er ruft die
    entsprechende Methode auf dem Befehlsobjekt auf und führt den Befehl aus.

 4. Receiver: Der Receiver ist der tatsächliche Empfänger des Befehls. Er führt die
    eigentliche Aktion oder Operation aus, die durch den Befehl definiert ist.

 5. Server: Der Server empfängt die Befehle vom Client, führt sie über den Invoker aus und
    leitet die Aktionen an den entsprechenden Receiver weiter.

 Das "Remote Command" Muster ist besonders nützlich, wenn verschiedene Teile eines Systems
 auf unterschiedlichen Servern oder in unterschiedlichen Prozessen ausgeführt werden. Es
 ermöglicht eine flexible und lose Kopplung zwischen den Komponenten und erleichtert die
 Skalierbarkeit und Wartbarkeit des Systems.

 In Java könnte das Muster durch die Verwendung von Schnittstellen, abstrakten Klassen und
 Serialization (Serializable) implementiert werden, um Befehlsobjekte über das Netzwerk zu
 übertragen. Es gibt auch Frameworks und Bibliotheken, die dieses Muster unterstützen und
 die Implementierung erleichtern können.

 In diesem Beispiel wird eine einfache Schnittstelle Calculator definiert, die zwei
 Methoden für die Addition und Subtraktion bereitstellt. Eine Implementierung
 CalculatorImpl erweitert UnicastRemoteObject und implementiert die Schnittstelle. Der
 Server registriert dann die Implementierung bei der RMI-Registry, und der Client ruft das
 entfernte Objekt über die Registry auf.
 */
public class Server {
  public static void main(String[] args) {
    try {
      Calculator calculator = new CalculatorImpl();
      Registry registry = LocateRegistry.createRegistry(1099);
      registry.rebind("CalculatorService", calculator);

      System.out.println("Server is running...");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
