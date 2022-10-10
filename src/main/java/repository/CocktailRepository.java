package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import repository.entity.CocktailEntity;


import java.util.List;

@Repository
public interface CocktailRepository extends JpaRepository<CocktailEntity, Integer> {

    @Override
    List findAll();

    @Override
    List findAllById(Iterable iterable);

    @Override
    <S extends CocktailEntity> S save(S entity);

    @Override
    void delete(CocktailEntity entity);
}

