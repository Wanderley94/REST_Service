package com.denisk.web_services.Controllers;

import com.denisk.web_services.Exceptions.MonthNotFoundException;
import com.denisk.web_services.Services.GetService;
import com.denisk.web_services.Services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/findMonth")
public class ConrollerMonth {

    private final GetService getService;

    @Autowired
    public ConrollerMonth(GetService getService) {
        this.getService = getService;
    }

    @GetMapping()
    public ResponseEntity findMonth(@RequestParam(value ="month", required=true) Integer month) throws MonthNotFoundException {

        if (month >= 1 && month <= 12){
            return getService.findMonth(month);
        }
        else {
            throw new MonthNotFoundException("INCORRECT INPUT DATA");
        }
    }

    @ExceptionHandler
    public ResponseEntity<?> handleException(MonthNotFoundException exc) {
        return new ResponseEntity<>(exc.getMessage(), HttpStatus.NOT_FOUND);
    }



}
