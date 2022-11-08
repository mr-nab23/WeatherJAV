
public class WeatherList{
    private final int NUMDATA = 100;
    
    Main readings[] = new Main[NUMDATA];
    
    public void Readweather()
    {
        float TempRange[] ={20,45};
        float HumiRange[] ={0,50};
        float PreciRange[] ={0,100};
        float WindRange[]= {0,20};
        for (int i =0 ;i<readings.length ;i++){
            readings[i] = new Main();
            readings[i].generate(TempRange, WindRange,PreciRange,HumiRange);
        }
    }
    public float minTemp()
    {
        float min = readings[0].temperature;
        for (int i =0 ; i<readings.length ; i++ ){
            if (min > readings[i].temperature) {
                min = readings[i].temperature;
            }
        }
        return min;
    }
    public float minHumid()
    {
        float min = readings[0].humidity;
        for (int i =0 ; i<readings.length ; i++ ){
            if (min > readings[i].humidity) {
                min = readings[i].humidity;
            }
        }
        return min;
    }
    public float minPreci()
    {
        float min = readings[0].precipitation;
        for (int i =0 ; i<readings.length ; i++ ){
            if (min > readings[i].precipitation) {
                min = readings[i].precipitation;
            }
        }
        return min;
    }
    public float minWind()
    {
        float min = readings[0].wind;
        for (int i =0 ; i<readings.length ; i++ ){
            if (min > readings[i].wind) {
                min = readings[i].wind;
            }
        }
        return min;
    }
    public float maxTemp()
    {
        float max = readings[0].temperature;
        for (int i =0 ; i<readings.length ; i++ ){
            if (max < readings[i].temperature) {
                max = readings[i].temperature;
            }
        }
        return max;
    }
    public float maxWind()
    {
        float max = readings[0].wind;
        for (int i =0 ; i<readings.length ; i++ ){
            if (max < readings[i].wind) {
                max = readings[i].wind;
            }
        }
        return max;
    }
    public float maxHumid()
    {
        float max = readings[0].humidity;
        for (int i =0 ; i<readings.length ; i++ ){
            if (max < readings[i].humidity) {
                max = readings[i].humidity;
            }
        }
        return max;
    }
    public float maxPreci()
    {
        float max = readings[0].precipitation;
        for (int i =0 ; i<readings.length ; i++ ){
            if (max < readings[i].precipitation) {
                max = readings[i].precipitation;
            }
        }
        return max;
    }
    public float avgTemp()
    {
        float sum = 0;
        for (int i=0; i<NUMDATA; i++) {
            sum += readings[i].temperature;
        }    
        float avg = sum / NUMDATA;
        
        return avg;
    }
    public float avgHumid()
    {
        float sum = 0;
        for (int i=0; i<NUMDATA; i++) {
            sum += readings[i].humidity;
        }    
        float avg = sum / NUMDATA;
        
        return avg;
    }
    public float avgPreci(){
        float sum = 0;
        for (int i=0; i<NUMDATA; i++) {
            sum += readings[i].precipitation;
        }    
        float avg = sum / NUMDATA;
        
        return avg;
    }
    public float avgWind(){
        float sum = 0;
        for (int i=0; i<NUMDATA; i++) {
            sum += readings[i].wind;
        }    
        float avg = sum / NUMDATA;
        
        return avg;
    }
    public double stdDevWindSpeed(float avg) {
            float Standard_D=0;
            double SD_ans= 0;
            for (int i=0;i<NUMDATA;i++){
            Standard_D +=Math.pow((readings[i].wind - avg),2);
            }
            SD_ans = Math.sqrt(Standard_D/NUMDATA);
            return SD_ans;
    }
    public double stdDevHumidity (float avg) {
            float Standard_D=0;
            double SD_ans= 0;
            for (int i=0;i<NUMDATA;i++){
            Standard_D +=Math.pow((readings[i].humidity - avg),2);
            }
            SD_ans = Math.sqrt(Standard_D/NUMDATA);
            return SD_ans;
    }
    public double stdDevTemp (float avg) {
            float Standard_D=0;
            double SD_ans= 0;
            for (int i=0;i<NUMDATA;i++){
            Standard_D +=Math.pow((readings[i].temperature - avg),2);
            }
            SD_ans = Math.sqrt(Standard_D/NUMDATA);
            return SD_ans;
    }
    public double stdDevPrecipitation(float avg) {
            float Standard_D=0;
            double SD_ans= 0;
            for (int i=0;i<NUMDATA;i++){
            Standard_D +=Math.pow((readings[i].precipitation - avg),2);
            }
            SD_ans = Math.sqrt(Standard_D/NUMDATA);
            return SD_ans;
    }
    
  
    public static void main(String args[]){
        WeatherList list = new WeatherList();
        list.Readweather();
        
        float Mintemp = list.minTemp();System.out.println("Minimum Temperature: " + Mintemp );
        float Minwind = list.minWind(); System.out.println("Minimum Wind: " + Minwind );
        float Minhumid = list.minHumid(); System.out.println("Minimum Humidity: " + Minhumid );
        float Minpreci = list.minPreci(); System.out.println("Minimum Precipitation: " + Minpreci );
        float Maxtemp = list.maxTemp();System.out.println("Maximum Temperature: "+ Maxtemp);
        float Maxwind = list.maxWind();System.out.println("Maximum Wind: " + Maxwind);
        float Maxhumid = list.maxHumid();System.out.println("Maximum Humidity: "+ Maxhumid);
        float Maxpreci = list.maxPreci();System.out.println("Maximum Precipitation: "+ Maxpreci);
        float Avgtemp = list.avgTemp();System.out.println("Average of Temperature: "+ Avgtemp);
        float Avgwind = list.avgWind();System.out.println("Average of Wind: "+ Avgwind);
        float Avghumid = list.avgHumid();System.out.println("Average of Humidity: "+ Avghumid);
        float Avgpreci = list.avgPreci();System.out.println("Average of Precipitation: "+ Avgpreci);
        double Stdtemp = list.stdDevTemp(Avgtemp);System.out.println("Standard deviation of Temperature: "+ Stdtemp);
        double Stdwind = list.stdDevWindSpeed(Avgwind);System.out.println("Standard deviation of Wind: "+ Stdwind);
        double Stdpreci = list.stdDevPrecipitation(Avgpreci);System.out.println("Standard deviation of Precipitation: "+ Stdpreci);
        double Stdhumid= list.stdDevHumidity(Avghumid);System.out.println("Standard deviation of Humidity: "+ Stdhumid);
    }
}
