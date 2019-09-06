package com.company.U1M4SummativeUzokaFrank.Controller;

import com.company.U1M4SummativeUzokaFrank.Model.Answers;
import com.company.U1M4SummativeUzokaFrank.Model.Definitions;
import com.company.U1M4SummativeUzokaFrank.Model.Quotes;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class Controller {

    List<Quotes> quoteList = new ArrayList<>();
    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Quotes randomQuote() {

        Quotes quote1 = new Quotes("Ralph Waldo Emerson", "A great man is always willing to be little.");
        Quotes quote2 = new Quotes("Plato", "The greatest wealth is to live content with little.");
        Quotes quote3 = new Quotes("Malcolm X", "The future belongs to those who prepare for it today.");
        Quotes quote4 = new Quotes("Bruce Lee", "The successful warrior is the average man, with laser-like focus.");
        Quotes quote5 = new Quotes("Nelson Mandela", "It always seems impossible until it’s done.");
        Quotes quote6 = new Quotes("Socrates", "The unexamined life is not worth living.");
        Quotes quote7 = new Quotes("Henry David", "Our life is frittered away by detail… simplify, simplify.");
        Quotes quote8 = new Quotes("Albert Einstein", "Try not to become a man of success but rather to become a man of value.");
        Quotes quote9 = new Quotes("Barack Obama", "No matter who you are or what you look like, how you started off, or how and who you love, America is a place where you can write your own destiny.");
        Quotes quote10 = new Quotes("Oprah Winfrey", "Turn your wounds into wisdom.");
        quoteList.add(quote1);
        quoteList.add(quote2);
        quoteList.add(quote3);
        quoteList.add(quote4);
        quoteList.add(quote5);
        quoteList.add(quote6);
        quoteList.add(quote7);
        quoteList.add(quote8);
        quoteList.add(quote9);
        quoteList.add(quote10);
        Random random = new Random();
        int i = random.nextInt(quoteList.size());
        return quoteList.get(i);
    }

    List<Definitions> definitionList = new ArrayList<>();
    @RequestMapping(value = "/word", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Definitions randomDefinition() {

        Definitions d1 = new Definitions("capitulate", "surrender under agreed conditions");
        Definitions d2 = new Definitions("clairvoyant", "someone who can perceive things not present to the senses");
        Definitions d3 = new Definitions("collaborate", "work together on a common enterprise or project");
        Definitions d4 = new Definitions("compromise", "an accommodation in which both sides make concessions");
        Definitions d5 = new Definitions("condescending", "characteristic of those who treat others with arrogance");
        Definitions d6 = new Definitions("conditional", "imposing or depending on or containing an assumption");
        Definitions d7 = new Definitions("conformist", "someone who follows established standards of conduct");
        Definitions d8 = new Definitions("conundrum", "a difficult problem");
        Definitions d9 = new Definitions("convergence", "the act of coming closer");
        Definitions d10 = new Definitions("deleterious", "harmful to living things");

        definitionList.add(d1);
        definitionList.add(d2);
        definitionList.add(d3);
        definitionList.add(d4);
        definitionList.add(d5);
        definitionList.add(d6);
        definitionList.add(d7);
        definitionList.add(d8);
        definitionList.add(d9);
        definitionList.add(d10);
        Random random = new Random();
        int i = random.nextInt(definitionList.size());
        return definitionList.get(i);
    }

    List<Answers> answerList = new ArrayList<>();
    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public Answers randomAnswer(@RequestBody @Valid String str) {

        List<String> answers = new ArrayList<>();
        answers.add("Today is the day.");
        answers.add("Probably a good deal.");
        answers.add("Not tonight");
        answers.add("In the near future!");
        answers.add("Not a good sign");
        answers.add("Think about it them ask again");

        Random random = new Random();
        int i = random.nextInt(answers.size());
        Answers a = new Answers(str,answers.get(i));
        return a;
    }

}


