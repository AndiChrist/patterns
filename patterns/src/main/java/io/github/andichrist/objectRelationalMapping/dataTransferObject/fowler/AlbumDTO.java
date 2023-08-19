package io.github.andichrist.objectRelationalMapping.dataTransferObject.fowler;

public class AlbumDTO {
  String title;
  String artist;
  TrackDTO[] tracks;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getArtist() {
    return artist;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }

  public TrackDTO[] getTracks() {
    return tracks;
  }

  public void setTracks(TrackDTO[] tracks) {
    this.tracks = tracks;
  }
}
