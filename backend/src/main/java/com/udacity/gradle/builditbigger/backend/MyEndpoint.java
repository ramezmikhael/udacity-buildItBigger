package com.udacity.gradle.builditbigger.backend;

import com.example.joketeller.JokeFactory;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;

/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    @ApiMethod(name = "getJoke")
    public MyBean getJoke() {
        JokeFactory jokes = new JokeFactory();
        MyBean response = new MyBean();

        String joke = jokes.getRandomJoke();
        System.out.println(joke);
        response.setData(joke);

        return response;
    }
}
