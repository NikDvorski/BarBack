package service;

import controller.dto.CocktailDto;
import repository.entity.CocktailEntity;

import java.util.List;

public interface CocktailService {
    CocktailDto getCocktailById(Integer id) ;

    List<CocktailEntity> getAllCocktails();

    void deleteCocktailById(CocktailDto cocktailDto);

    void saveCocktail (CocktailDto cocktailDto);
}
