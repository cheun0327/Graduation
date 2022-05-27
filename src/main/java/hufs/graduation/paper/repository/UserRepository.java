package hufs.graduation.paper.repository;

import hufs.graduation.paper.entity.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("select distinct u from User u join u.orders")
    List<User> findAllJPQLJoin();

    @Query("select distinct u from User u join fetch u.orders")
    List<User> findAllJPQLFetch();

    @EntityGraph(attributePaths = "orders")
    @Query("select distinct u from User u")
    List<User> findAllEntityGraph();

}
