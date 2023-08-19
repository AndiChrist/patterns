package io.github.andichrist.objectRelationalMapping.dataTransferObject.fowler;

import java.util.List;

public record Album(String title, Artist artist, List<Track> tracks) {
}
