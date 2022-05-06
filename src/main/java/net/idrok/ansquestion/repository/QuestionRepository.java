package net.idrok.ansquestion.repository;

import net.idrok.ansquestion.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
    @Query(value = "FROM Question q WHERE UPPER(q.questionString) like '%' || UPPER(:key) || '%' ")
    List<Question> findByQuestion(@Param("key") String key);
}
