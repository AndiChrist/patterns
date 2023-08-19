package io.github.andichrist.objectRelationalMapping.dataTransferObject.fowler;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AlbumAssembler {

  public AlbumDTO writeDTO(Album subject) {
    AlbumDTO result = new AlbumDTO();
    result.setTitle(subject.title());
    result.setArtist(subject.artist().name());
    writeTracks(result, subject);
    return result;
  }

  private void writeTracks(AlbumDTO result, Album subject) {
    List<TrackDTO> newTracks = new ArrayList<>();
    Iterator it = subject.tracks().iterator();
    while (it.hasNext()) {
      TrackDTO newDTO = new TrackDTO();
      Track thisTrack = (Track) it.next();
      newDTO.setTitle(thisTrack.title());
      writePerformers(newDTO, thisTrack);
      newTracks.add(newDTO);
    }
    result.setTracks((TrackDTO[]) newTracks.toArray(new TrackDTO[0]));
  }

  private void writePerformers(TrackDTO dto, Track subject) {
    List<String> result = new ArrayList();
    Iterator it = subject.performers().iterator();
    while (it.hasNext()) {
      Artist each = (Artist) it.next();
      result.add(each.name());
    }
    dto.setPerformers((String[]) result.toArray(new String[0]));
  }


}
