package net.idrok.ansquestion.repository;

import net.idrok.ansquestion.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    @Query(value = "FROM Person p WHERE UPPER(p.firstName) like '%' || UPPER(:key) || '%' or UPPER(p.lastName) like '%' || UPPER(:key) || '%' ORDER BY p.id")
    List<Person> findAllByFirstName(@Param("key") String key);
}
