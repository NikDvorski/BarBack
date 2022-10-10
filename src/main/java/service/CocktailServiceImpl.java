package service;

import controller.dto.CocktailDto;
import exception.BusinessException;
import repository.CocktailRepository;

import java.util.List;

public class CocktailServiceImpl implements CocktailService {
    private final CocktailRepository cocktailRepository;
    private final CocktailConverter cocktailConverter;

    public CocktailServiceImpl(CocktailRepository cocktailRepository, CocktailConverter cocktailConverter) {
        this.cocktailRepository = cocktailRepository;
        this.cocktailConverter = cocktailConverter;
    }

    @Override
    public CocktailDto getCocktailById(Integer id) {
        return cocktailConverter.convertToCocktailDto(cocktailRepository.findById(id)
                .orElseThrow(() -> new BusinessException("Не удалось найти юзера")));
    }

    @Override
    public List getAllCocktails() {
        return cocktailRepository.findAll();
    }

    @Override
    public void deleteCocktailById(CocktailDto cocktailDto) {
        cocktailRepository.delete(cocktailConverter.convertToCocktailEntity(cocktailDto));
    }

    @Override
    public void saveCocktail(CocktailDto cocktailDto) {
        cocktailRepository.save(cocktailConverter.convertToCocktailEntity(cocktailDto));
    }
}
