package co.com.vitic.apivitic.repository;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.vitic.apivitic.model.Model;

@Repository("modelRepository")
public interface ModelRepository extends JpaRepository<Model, Long> {
    @Transactional
    void deleteById(Long id);
}
