package com.tts.WeatherApp;

//import com.tts.WeatherApp.domain.ZipCode;
//import com.tts.WeatherApp.repository.ZipCodeRepository;
//import org.apache.catalina.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Random;

@Service
public class WeatherService {
    @Value("${api_key}")
    private String apiKey;

    public Response getForecast(String zipCode) {

            String url = "http://api.openweathermap.org/data/2.5/weather?zip=" +
                    zipCode + "&units=imperial&appid=" + apiKey;
            RestTemplate restTemplate = new RestTemplate();

            try {
                return restTemplate.getForObject(url, Response.class);

             } catch (HttpClientErrorException ex) {
           Response response = new Response();
            response.setName("error");
                String[] myArr = {"Asheville", "Raleigh", "Chapel Hill", "Mooresville", "Davidson"};
                int rnd = new Random().nextInt(myArr.length);
                response.setName(myArr[rnd]);

                String[] forecast = {"67 with Thunderstorms", "32 and Snowy", "77 and Rainy", "101 and Sunny"};
                Random random = new Random();
                int index = random.nextInt(forecast.length);
                System.out.println(forecast[index]);
                return response;
            }

    }
}
