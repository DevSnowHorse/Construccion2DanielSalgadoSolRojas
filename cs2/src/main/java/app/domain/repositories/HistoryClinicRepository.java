package app.domain.repositories;

import app.domain.models.HistoryClinic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryClinicRepository extends JpaRepository<HistoryClinic, Long> {
    // Consultas personalizadas si es necesario
}
