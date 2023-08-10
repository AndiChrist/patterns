# Entwurfsmuster
Eine kleine Sammlung von GoF(⭐️)- und anderen Entwurfsmustern, für meinen Hausgebrauch.

## Erzeugungsmuster (creational patterns)
- ⭐️ [Abstrake Fabrik (Abstract factory)](patterns/src/main/java/io/github/andichrist/creational/abstractFactory)
- ⭐️ [Erbauer (Builder)](patterns/src/main/java/io/github/andichrist/creational/builder)
- ⭐️ [Fabrikmethode (Factory method)](patterns/src/main/java/io/github/andichrist/creational/factory)
- ⭐️ [Prototyp (Prototype)](patterns/src/main/java/io/github/andichrist/creational/prototype)
- ⭐️ [Singleton (Singleton)](patterns/src/main/java/io/github/andichrist/creational/singleton)
- [Multiton](patterns/src/main/java/io/github/andichrist/creational/multiton)

## Strukturmuster (structural design patterns)
- ⭐️ [Klassenadapter (Adapter)](patterns/src/main/java/io/github/andichrist/structural/adapter)
- ⭐️ [Objektadapter (Adapter)](patterns/src/main/java/io/github/andichrist/structural/adapter2)
- ⭐️ [Brücke (Bridge pattern)](patterns/src/main/java/io/github/andichrist/structural/bridge)
- ⭐️ [Dekorierer (Decorator)](patterns/src/main/java/io/github/andichrist/structural/decorator)
- ⭐️ [Fassade (Facade)](patterns/src/main/java/io/github/andichrist/structural/facade)
- ⭐️ [Fliegengewicht (Flyweight)](patterns/src/main/java/io/github/andichrist/structural/flyweight)
- ⭐️ [Kompositum (Composite oder Whole-Part)](patterns/src/main/java/io/github/andichrist/structural/composite)
- ⭐️ [Stellvertreter (Proxy)](patterns/src/main/java/io/github/andichrist/structural/proxy)
- [Container](patterns/src/main/java/io/github/andichrist/structural/container)

## Verhaltensmuster (behavioral design patterns)
- ⭐️ [Befehl (Command)](patterns/src/main/java/io/github/andichrist/behavioral/command)
- ⭐️ [Beobachter (Observer)](patterns/src/main/java/io/github/andichrist/behavioral/observer)
- ⭐️ [Besucher (Visitor)](patterns/src/main/java/io/github/andichrist/behavioral/visitor)
- ⭐️ [Interpreter](patterns/src/main/java/io/github/andichrist/behavioral/interpreter)
- ⭐️ [Iterator](patterns/src/main/java/io/github/andichrist/behavioral/iterator)
- ⭐️ [Memento](patterns/src/main/java/io/github/andichrist/behavioral/memento)
- ⭐️ [Schablonenmethode (Template method)](patterns/src/main/java/io/github/andichrist/behavioral/templateMethod)
- ⭐️ [Strategie (Strategy)](patterns/src/main/java/io/github/andichrist/behavioral/strategy)
- ⭐️ [Vermittler (Mediator)](patterns/src/main/java/io/github/andichrist/behavioral/mediator)
- ⭐️ [Zustand (State)](patterns/src/main/java/io/github/andichrist/behavioral/state)
- ⭐️ [Zuständigkeitskette (Chain of responsibility)](patterns/src/main/java/io/github/andichrist/behavioral/chainOfResponsibility)
- [State/Event](patterns/src/main/java/io/github/andichrist/behavioral/stateEvent)

## Objektrelationale Abbildung (object-relational mapping, ORM)
- [Lazy Loading](patterns/src/main/java/io/github/andichrist/objectRelationalMapping/lazyLoading)
- [Datentransferobjekt (Data Transfer Object, DTO)](patterns/src/main/java/io/github/andichrist/objectRelationalMapping/dataTransferObject)
- [Active Record](patterns/src/main/java/io/github/andichrist/objectRelationalMapping/activeRecord)
- [Unit of Work](patterns/src/main/java/io/github/andichrist/objectRelationalMapping/unitOfWork)
- [Table Data Gateway](patterns/src/main/java/io/github/andichrist/objectRelationalMapping/tableDataGateway)
- [Row Data Gateway](patterns/src/main/java/io/github/andichrist/objectRelationalMapping/rowDataGateway)
- [Identity Map](patterns/src/main/java/io/github/andichrist/objectRelationalMapping/identityMap)
- [Identity Field](patterns/src/main/java/io/github/andichrist/objectRelationalMapping/identityField)
- Dependent Mapping
- [Embedded Value](patterns/src/main/java/io/github/andichrist/objectRelationalMapping/embeddedValue)
- [Serialized LOB](patterns/src/main/java/io/github/andichrist/objectRelationalMapping/serializedLOB)

## Sonstige
- [Data Access Object](patterns/src/main/java/io/github/andichrist/other/dataAccessObject)
- [Dependency Injection](patterns/src/main/java/io/github/andichrist/other/dependencyInjection)
- [Fluent Interface](patterns/src/main/java/io/github/andichrist/other/fluentInterface)
- [Inversion of Control (IoC)](patterns/src/main/java/io/github/andichrist/other/inversionOfControl)
- [Nullobjekt](patterns/src/main/java/io/github/andichrist/other/nullObject)
- [Publish–subscribe](patterns/src/main/java/io/github/andichrist/other/observerObservable)
- [Remote Command](patterns/src/main/java/io/github/andichrist/other/remoteCommand)
- [Repository](patterns/src/main/java/io/github/andichrist/other/repository)
- [Service-Locator](patterns/src/main/java/io/github/andichrist/other/serviceLocator)
- [Specification](patterns/src/main/java/io/github/andichrist/other/specification)
- [Business Delegate](patterns/src/main/java/io/github/andichrist/other/businessDelegate)

## Tests und Qualitätsprüfung (QA)

- Test-Driven Development (TDD)
: _Bei dieser Praxis schreiben Entwickler zuerst Tests, bevor sie den eigentlichen Code schreiben. Dies fördert die Planung, führt zu besserer Testabdeckung und hilft bei der Gestaltung von Code, der einfacher zu testen ist._

- Behavior-Driven Development (BDD)
: Eine Erweiterung von TDD, bei der Tests in einer natürlicheren Sprache geschrieben werden, um das Verhalten der Anwendung zu beschreiben. Dies erleichtert die Kommunikation zwischen Entwicklern, Testern und Nicht-Technikern.

- Page Object Pattern
: Dieses Muster wird oft in der Testautomatisierung verwendet. Es beinhaltet die Erstellung von Klassen, die das Verhalten von Webseiten oder UI-Elementen repräsentieren. Dadurch wird der Testcode wartbarer und verständlicher.

- Test Doubles
: Hierzu gehören Mocks, Stubs, Fakes und andere Arten von Testobjekten, die dazu verwendet werden, externe Abhängigkeiten zu simulieren oder zu isolieren, um Tests unabhängig und wiederholbar zu machen.

- Data-Driven Testing
: Tests werden mit unterschiedlichen Datensätzen ausgeführt, um verschiedene Szenarien abzudecken und die Robustheit der Anwendung sicherzustellen.

- Continuous Integration (CI) und Continuous Deployment (CD)
: Automatisierung von Build-, Test- und Bereitstellungsprozessen, um eine schnellere und zuverlässigere Bereitstellung von Software sicherzustellen.

- Regression Testing
: Das regelmäßige Ausführen von Tests, um sicherzustellen, dass neue Codeänderungen keine bestehende Funktionalität beeinträchtigen.

- Load Testing und Performance Testing
: Prüfen der Leistung und Skalierbarkeit einer Anwendung unter verschiedenen Belastungsbedingungen.

- Exploratory Testing
: Manuelles Testen, bei dem Tester die Anwendung erkunden und unerwartete Fehler oder Schwachstellen entdecken.

- Test Prioritization
: Festlegen der Reihenfolge, in der Tests ausgeführt werden sollen, um kritische Bereiche zuerst abzudecken.

- Code Reviews
: Gemeinsame Überprüfung des Codes durch mehrere Entwickler, um Fehler zu finden und Best Practices zu fördern.

- Pair Testing
: Gemeinsames Testen durch zwei Tester oder ein Tester-Entwickler-Paar, um unterschiedliche Perspektiven und Ideen einzubringen.
 
