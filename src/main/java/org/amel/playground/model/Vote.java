package org.amel.playground.model;

import java.time.OffsetDateTime;

public record Vote(OffsetDateTime date, String name, Boolean participating) {
}
