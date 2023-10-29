package matrimonio_red.repos;

import matrimonio_red.models.Invitato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvitatoRepository extends JpaRepository<Invitato, Long> {

}
