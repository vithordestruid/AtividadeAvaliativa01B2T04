package fag;

public class temperatura {
	 private double celsius;

	    public temperatura(double celsius) {
	        setCelsius(celsius);
	    }

	    public double getCelsius() {
	        return celsius;
	    }

	    public void setCelsius(double celsius) {
	        if (celsius < -273.15) {
	            System.out.println("temperatura não pode ser menor que -273.15°C");
	            this.celsius = -273.15;
	        } else {
	            this.celsius = celsius;
	        }
	    }

	    public double paraFahrenheit() {
	        return (celsius * 9/5) + 32;
	    }

	    public double paraKelvin() {
	        return celsius + 273.15;
	    }
	}