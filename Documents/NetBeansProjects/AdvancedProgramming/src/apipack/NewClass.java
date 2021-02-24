package apipack;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class NewClass {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();

        LocalDate birthDay = LocalDate.of(1990, Month.DECEMBER, 15);
        System.out.println(birthDay);

        LocalDateTime inJune = LocalDateTime.now().withMonth(Month.JANUARY.getValue());
        System.out.println("INJUNE: "+inJune);

        GregorianCalendar calendar = new GregorianCalendar();
        calendar.set(Calendar.MONTH, Calendar.JUNE);
        Date inJune2 = calendar.getTime();
        System.out.println("INJUNE 2 "+inJune2);
        long milliseconds
                = 999999000;
        Instant instant
                = Instant.ofEpochMilli(milliseconds);
        
        System.out.println("epoch " + instant);

        ZonedDateTime da = ZonedDateTime.now();
        System.out.println(da);

        ZonedDateTime nextFriday = LocalDateTime.now()
                .plusHours(1)
                .with(TemporalAdjusters.firstDayOfNextMonth())
                .atZone(ZoneId.of("CET"));

        System.out.println("NEXTFRIDAY: "+nextFriday);
        int daysInMonth = YearMonth.of(2020, 3).lengthOfMonth();

        System.out.println(daysInMonth);
        ZoneId zoneIdFromTimeZone = TimeZone.getTimeZone("PST").toZoneId();
        System.out.println(zoneIdFromTimeZone);

        LocalDate todayKolkata = LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current Date in IST=" + todayKolkata);
        LocalDate dateFromBase = LocalDate.ofEpochDay(365);
        System.out.println("365th day from base date= " + dateFromBase);
        LocalDate hundredDay2014 = LocalDate.ofYearDay(2014, 100);
        System.out.println("100th day of 2014=" + hundredDay2014);

        ZoneId defaultZone = TimeZone.getDefault().toZoneId();
        System.out.println(defaultZone);

        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println(localDate);
        System.out.println(localDateTime);

        LocalDate now = LocalDate.now();
        System.out.println("NOW: " + now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d,yyyy");
        String formattedDate = now.format(formatter);
        LocalDate parsedDate = LocalDate.parse(formattedDate, formatter);

        System.out.println("PAAARSEDD " + parsedDate);
        
        
        DateFormat df = new SimpleDateFormat("MMM d,yyyy");
        String requiredDate = df.format(new Date());
        System.out.println("DDD m yyyy: ->"+requiredDate);
        
        
        DateTimeFormatter format
                = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        
        
        
         LocalDateTime current = LocalDateTime.now(); 
    System.out.println("current date and time : "+ 
                        current); 
   
   
    DateTimeFormatter format2 =  
      DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");   
    
    String formatedDateTime = current.format(format2);   
     
    System.out.println("in foramatted manner "+ 
                        formatedDateTime); 

        
    
    
    DateTimeFormatter form = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    String formatedDatenTime = current.format(form);
        System.out.println(formatedDatenTime);
        
    }
}
