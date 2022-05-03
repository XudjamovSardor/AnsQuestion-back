package net.idrok.ansquestion.repository;

import net.idrok.ansquestion.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {

    @Query(value = "FROM Subject s WHERE UPPER(s.name) LIKE '%' || UPPER(:key) || '%'")
    List<Subject> findAllByName(@Param("key") String key);
}
