package com.denisk.web_services.Services;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class GetService {
    public ResponseEntity<String> findMonth(Integer month) {

        String str = "";

        switch (month){
            case 1: str = "Я-Н-В-А-Р-Ь";
                break;
            case 2: str = "Ф-Е-В-Р-А-Л-Ь";
                break;
            case 3: str = "М-А-Р-Т";
                break;
            case 4: str = "А-П-Р-Е-Л-Ь";
                break;
            case 5: str = "М-А-Й";
                break;
            case 6: str = "И-Ю-Н-Ь";
                break;
            case 7: str = "И-Ю-Л-Ь";
                break;
            case 8: str = "А-В-Г-У-С-Т";
                break;
            case 9: str = "С-Е-Н-Т-Я-Б-Р-Ь";
                break;
            case 10: str = "О-К-Т-Я-Б-Р-Ь";
                break;
            case 11: str = "Н-О-Я-Б-Р-Ь";
                break;
            case 12: str = "Д-Е-К-А-Б-Р-Ь";
        }
         return new ResponseEntity<String>(str, HttpStatus.OK);
    }
}
