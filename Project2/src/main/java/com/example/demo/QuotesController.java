package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;



@RestController
public class QuotesController {

    private static int id = 0;

    @Autowired
    private QuotesDbo quotesDbo;

    @RequestMapping(value="/addQuote", method= RequestMethod.POST)
    public Quotes addQuote(@RequestBody Quotes newQuote) throws IOException{
        quotesDbo.create(newQuote);
        return newQuote;
    }

    @RequestMapping(value="getQuote/{id}", method=RequestMethod.GET)
    public Quotes getQuote(@PathVariable("id") int id) throws IOException{
        return quotesDbo.getById(id);
    }

    @RequestMapping(value="updateQuote", method=RequestMethod.PUT)
    public Quotes updateQuote(@RequestBody Quotes newQuote) throws IOException{
        quotesDbo.updateQuote(newQuote);
        return newQuote;
    }

    @RequestMapping(value="deleteQuote/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<String> deleteQuote(@PathVariable("id") int id) throws IOException {
        quotesDbo.deleteQuote(id);
        return null;
    }


}
