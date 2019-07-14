package core.controller;

import core.model.NumberToConvert;
import core.service.NumberConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/convert"})
public class ConvertController {

    @Autowired
    private NumberConverterService numberConverterService;

    @GetMapping(path = {"/{number}"})
    public String covertNum(@PathVariable("number") int number){

        return numberConverterService.convert2Words(number, "sk");
    }

    @PostMapping()
    public String covertNum(NumberToConvert numberToConvert){
        return numberConverterService.convert2Words(numberToConvert.getNumber(), numberToConvert.getLanguage());
    }


}
