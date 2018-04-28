package com.example.joketeller;

import java.util.Random;

public class JokeFactory {

    /*
    Jokes list come from http://www.short-funny.com/
     */
    private String[] jokes = new String[] {
            "Can a kangaroo jump higher than a house? \n" +
                    "-\n" +
                    "Of course, a house doesn't jump at all.",

            "A man asks a farmer near a field, \"Sorry sir, would you mind if I crossed your field instead of going around it? You see, I have to catch the 4:23 train.\"\n" +
                    "\n" +
                    "The farmer says, \"Sure, go right ahead. And if my bull sees you, you'll even catch the 4:11 one.\"",

            " Anton, do you think I'm a bad mother?\n" +
                    "\n" +
                    "My name is Paul.",

            "My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away.",

            "Mother: \"How was school today, Patrick?\"\n" +
                    "\n" +
                    "Patrick: \"It was really great mum! Today we made explosives!\"\n" +
                    "\n" +
                    "Mother: \"Ooh, they do very fancy stuff with you these days. And what will you do at school tomorrow?\"\n" +
                    "\n" +
                    "Patrick: \"What school?\""

    };

    public String getRandomJoke() {
        Random random = new Random();
        int r = random.nextInt(jokes.length - 1);
        return jokes[r];
    }
}
