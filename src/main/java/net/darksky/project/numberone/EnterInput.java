package net.darksky.project.numberone;

import java.util.Scanner;

public class EnterInput {
	private Scanner scanner = new Scanner(System.in);
	private double latitude;
	private double longitude;

	public double getLatitude() {
		this.latitude = scanner.nextDouble();
		if (latitude < -90 && latitude > 90) {
			throw new IllegalArgumentException("provide a latitude between 0 and 90");
		} else {
			return this.latitude;
		}
	}

	public double getLongitude() {
		this.longitude = scanner.nextDouble();
		if (longitude < -180 && longitude > 180) {
			throw new IllegalArgumentException("provide a latitude between 0 and 90");
		} else {
			return this.longitude;
		}
	}

}
