import java.util.Scanner;
public class WeatherStations {
    public String location;
    public String Reportingbody;
    public int NumSensors;
    WeatherList Data = new WeatherList();
    
    public void readWeatherStationData(){
        Scanner loc = new Scanner(System.in);
        System.out.println("Please enter your location: ");
        location = loc.nextLine();
        Scanner report = new Scanner(System.in);
        System.out.println("Please enter the reporting body: ");
        Reportingbody = report.nextLine();
        Scanner no = new Scanner(System.in);
        System.out.println("Please enter the no. of sensors : ");
        NumSensors = no.nextInt();
        
        Data.Readweather();
    }
    public static void main(String args[]){
        int NUM_LOC = 2 ;
        WeatherStations stats[] = new WeatherStations[NUM_LOC];
        for (int i =0 ; i<NUM_LOC;i++){
            stats[i]= new WeatherStations();        
            stats[i].readWeatherStationData();
        }
    }
    
}
