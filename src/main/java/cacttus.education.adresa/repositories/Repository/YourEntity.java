package cacttus.education.adresa.repositories.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface YourEntity {

    @Repository
    public interface YourEntityRepository extends JpaRepository<YourEntity, Long> {
    }
}
