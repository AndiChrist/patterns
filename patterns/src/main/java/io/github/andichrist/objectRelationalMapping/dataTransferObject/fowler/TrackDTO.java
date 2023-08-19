package io.github.andichrist.objectRelationalMapping.dataTransferObject.fowler;

public class TrackDTO {
  String title;
  String[] performers;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String[] getPerformers() {
    return performers;
  }

  public void setPerformers(String[] performers) {
    this.performers = performers;
  }
}
