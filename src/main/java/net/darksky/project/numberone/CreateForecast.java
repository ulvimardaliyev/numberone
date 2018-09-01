package net.darksky.project.numberone;

import java.io.IOException;

import tk.plogitech.darksky.forecast.APIKey;
import tk.plogitech.darksky.forecast.ForecastRequest;
import tk.plogitech.darksky.forecast.ForecastRequestBuilder;
import tk.plogitech.darksky.forecast.GeoCoordinates;
import tk.plogitech.darksky.forecast.model.Forecast;
import tk.plogitech.darksky.forecast.model.Latitude;
import tk.plogitech.darksky.forecast.model.Longitude;

public class CreateForecast {
	private Forecast forecast;
	private APIKey apiKey;
	private Latitude latitude;
	private Longitude longitude;
	private GeoCoordinates geoCoordinates;
	
	
	public void setLatitude(double latitude) {
		this.latitude = new Latitude(latitude);
	}
	
	public Latitude getLatitude() {
		return this.latitude;
	}
	
	public void setLongitude(double longitude) {
		this.longitude = new Longitude(longitude);
		
	}
	public Longitude getLongitude() {
		return this.longitude;
	}
	
	public void setAPIKey(String apiKey) {
		this.apiKey = new APIKey(apiKey);
	}
	public APIKey getAPIKey() {
		return this.apiKey;
	}
	
	private void setGeoCoordinates(Longitude longitude, Latitude latitude) {
		this.geoCoordinates = new GeoCoordinates(longitude, latitude);
	}
	
	public GeoCoordinates getGeoCoordinates() {
		setGeoCoordinates(longitude, latitude);
		return this.geoCoordinates;
	}
}
