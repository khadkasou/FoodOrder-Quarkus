package org.souraj.model;

import java.time.LocalDateTime;

public interface IAbstractClass {
    Long getId();

    void setId(Long id);

    LocalDateTime getCreatedAt();

    void setCreatedAt(LocalDateTime creadtedAt);

    LocalDateTime getUpdatedAt();

    void setUpdatedAt(LocalDateTime updatedAt);

}
