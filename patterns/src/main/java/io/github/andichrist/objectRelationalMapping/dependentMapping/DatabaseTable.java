package io.github.andichrist.objectRelationalMapping.dependentMapping;

// Abstrakte Klasse für den Datenbankzugriff
abstract class DatabaseTable {
  abstract void fetch();
  abstract void save();
}
