package devPilot.backend.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.*;

import java.time.Instant;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@Builder
public class User {
    private UUID id;
    private Long githubId;
    private String githubUsername;
    private String displayName;
    private String avatarUrl;

    private String accessToken;
    private String tokenScopes;

    private Instant createdAt;

    // when user is created in db and if createdAt is null then automatically call a function assign a time
    @PrePersist
    void onCreate() {
        if(createdAt == null) {
            createdAt = Instant.now();
        }
    }


}
