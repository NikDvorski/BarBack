package controller;

import controller.dto.CocktailDto;
import controller.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import repository.entity.CocktailEntity;
import repository.entity.UserEntity;
import service.CocktailService;
import service.UserService;

import java.util.List;
@Controller
@RequestMapping
public class CocktailController {

    private final CocktailService cocktailService;

    public CocktailController(CocktailService cocktailService) {
        this.cocktailService = cocktailService;
    }

    public CocktailDto getCocktail(Integer Id) {
        return cocktailService.getCocktailById(Id);
    }

    public List<CocktailEntity> getAllCocktails() {
        return cocktailService.getAllCocktails();
    }

    public void saveCocktail(CocktailDto cocktailDto){
        cocktailService.saveCocktail(cocktailDto);
    }

    public void deleteCocktail(CocktailDto cocktailDto){
        cocktailService.deleteCocktailById(cocktailDto);
    }
}
