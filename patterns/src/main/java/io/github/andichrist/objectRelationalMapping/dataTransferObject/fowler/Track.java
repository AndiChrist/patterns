package io.github.andichrist.objectRelationalMapping.dataTransferObject.fowler;

import java.util.List;

public record Track(String title, List<Artist> performers) {
}
