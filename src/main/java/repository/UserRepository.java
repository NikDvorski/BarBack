package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import repository.entity.UserEntity;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    @Override
    List<UserEntity> findAll();

    @Override
    Optional<UserEntity> findById(Integer integer);

    @Override
    <S extends UserEntity> S save(S entity);

    @Override
    void delete(UserEntity entity);
}

