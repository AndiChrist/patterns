package io.github.andichrist.objectRelationalMapping.queryObject;

// Query Object
class Query {
  private String select;
  private String from;
  private String where;

  public Query(String select, String from, String where) {
    this.select = select;
    this.from = from;
    this.where = where;
  }

  public String generateSql() {
    return "SELECT " + select + " FROM " + from + " WHERE " + where;
  }
}
