package io.github.andichrist.objectRelationalMapping.queryObject;

import java.util.List;

// Repository, das das Query Object verwendet
class UserRepository {
  public List<String> findUsersWithAgeGreaterThan(int age) {
    Query query = new Query("username", "users", "age > " + age);
    String sql = query.generateSql();
    // Führe die Datenbankabfrage aus und gib die Ergebnisse zurück
    // Hier wird nur das SQL generiert und nicht tatsächlich ausgeführt
    return List.of("user1", "user2");
  }
}
