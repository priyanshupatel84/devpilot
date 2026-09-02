package devpilot.backend.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(
    name = "repositories",
    uniqueConstraints = @UniqueConstraint(columnNames = {"user_id", "github_repo_id"})
)
public class Repository{
    private UUID id;

    private UUID userId;
    private Long githubRepoId;
    private String owner;
    private String name;
    private String fullName;
    private boolean isPrivate;
    private String defaultbranch;
    private String language;
    private String htmlUrl;
    private String description;

    private IndexStatus indexStatus = IndexStatus.PENDING;
}