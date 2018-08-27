package net.darksky.project.numberone;

import java.io.IOException;
import java.util.Scanner;

import javax.security.auth.callback.LanguageCallback;

import tk.plogitech.darksky.api.jackson.DarkSkyJacksonClient;
import tk.plogitech.darksky.forecast.ForecastException;
import tk.plogitech.darksky.forecast.ForecastRequest;
import tk.plogitech.darksky.forecast.ForecastRequestBuilder;
import tk.plogitech.darksky.forecast.ForecastRequestBuilder.Language;
import tk.plogitech.darksky.forecast.model.Forecast;

public class App {
	public static void main(String[] args) throws IOException, ForecastException {
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"Welcome to my Forecast application.\r\n" + "Please provide your current latitude and longtitude:");
		// ReadAFile readAFile = new ReadAFile("welcome.properties");
		CreateForecast createForecast = new CreateForecast();
		EnterInput enterInput = new EnterInput();

		// readAFile.readWords();
		createForecast.setLatitude(enterInput.getLatitude());
		createForecast.setLongitude(enterInput.getLongitude());
		createForecast.setAPIKey("462aefd9f99c6cda185c40262313a9d7");

		ForecastRequest forecastRequest = new ForecastRequestBuilder().key(createForecast.getAPIKey())
				.location(createForecast.getGeoCoordinates()).language(Language.ru).build();
		DarkSkyJacksonClient darkSkyJacksonClient = new DarkSkyJacksonClient();
		Forecast forecast = darkSkyJacksonClient.forecast(forecastRequest);
		System.out.println("Now, you will get the forecast");
		// readAFile.readRemainingWords();
		System.out.println("the current weather is: " + forecast.getCurrently().getSummary());
		System.out.println("daily weather is: " + forecast.getDaily().getSummary());
		System.out.println("hourly weather is: " + forecast.getHourly().getSummary());

	}
}
