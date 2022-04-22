
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
@Transactional
public interface CarRepository extends JpaRepository<Car, Long> {

    public Optional<Car> findByCarId(Long id);
    public List<Car> findAll();
}
