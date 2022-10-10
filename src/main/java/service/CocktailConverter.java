package service;

import controller.dto.CocktailDto;
import repository.entity.CocktailEntity;

public class CocktailConverter {

    public CocktailDto convertToCocktailDto (CocktailEntity cocktailEntity){
        CocktailDto cocktailDto = new CocktailDto();
        cocktailDto.setId(cocktailEntity.getId());
        cocktailDto.setName(cocktailEntity.getName());
        return cocktailDto;
    }

    public CocktailEntity convertToCocktailEntity (CocktailDto cocktailDto){
        CocktailEntity cocktailEntity = new CocktailEntity();
        cocktailEntity.setId(cocktailDto.getId());
        cocktailEntity.setName(cocktailDto.getName());
        return cocktailEntity;
    }
}
