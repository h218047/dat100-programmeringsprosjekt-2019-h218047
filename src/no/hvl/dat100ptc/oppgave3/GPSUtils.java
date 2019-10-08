package no.hvl.dat100ptc.oppgave3;

import no.hvl.dat100ptc.TODO;
import no.hvl.dat100ptc.oppgave1.GPSPoint;
import no.hvl.dat100ptc.oppgave2.GPSDataFileReader;


public class GPSUtils {

	public static double findMax(double[] da) {

		double max; 
		
		max = da[0];
		
		for (double d : da) {
			if (d > max) {
				max = d;
			}
		}
		
		return max;
	}

	public static double findMin(double[] da) {

		double min;
		
		min = da[0];
		
		for (double d : da) {
			if (d < min) {
				min = d;
			}
		}
		
		return min;
		
	}
		

	public static double[] getLatitudes(GPSPoint[] gpspoints) {

		// TODO - START
		double[] latitudes = new double[gpspoints.length];
		for (int i = 0; i < latitudes.length; i++) {
			latitudes[i] = gpspoints[i].getLatitude();
			
		}
		
		return latitudes;
		
	}

	public static double[] getLongitudes(GPSPoint[] gpspoints) {

		

		double[] longitudes = new double[gpspoints.length];
		for (int i = 0; i < longitudes.length; i++) {
			longitudes[i] = gpspoints[i].getLongitude();
			
		}
		
		return longitudes;
		
		

	}

	private static int R = 6371000; // jordens radius

	public static double distance(GPSPoint gpspoint1, GPSPoint gpspoint2) {

		double d;
		double latitude1, longitude1, latitude2, longitude2;


		latitude1 = gpspoint1.getLatitude();
		longitude1 = gpspoint1.getLongitude();
		latitude2 = gpspoint2.getLatitude();
		longitude2 = gpspoint2.getLongitude();
		
		double phi1 = Math.toRadians(latitude1);
		double phi2 = Math.toRadians(latitude2);
		
		double dphi = Math.toRadians(latitude2 - latitude1);
		double ddelta = Math.toRadians(longitude2 - longitude1);
		
		double a = Math.pow(Math.sin(dphi/2), 2) + Math.cos(phi2) * Math.cos(phi2) * Math.pow(Math.sin(ddelta/2),2);
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt (1-a));
		d = R*c;
		
		return d;

	}

	public static double speed(GPSPoint gpspoint1, GPSPoint gpspoint2) {

		int secs;
		double speed;

		// TODO - START
		
		secs = (gpspoint2.getTime()-gpspoint1.getTime());
		
		double strekning = distance(gpspoint1, gpspoint2);
		
		double hr = (secs/60)/60;
		
		strekning = strekning * 1000;
		
		speed = strekning/hr;
		
		return speed;

		

		// TODO - SLUTT

	}

	public static String formatTime(int secs) {

		String timestr;
		String TIMESEP = ":";

		// TODO - START

		throw new UnsupportedOperationException(TODO.method());
		
		// TODO - SLUTT

	}
	private static int TEXTWIDTH = 10;

	public static String formatDouble(double d) {

		String str;

		// TODO - START

		throw new UnsupportedOperationException(TODO.method());

		// TODO - SLUTT
		
	}
}
