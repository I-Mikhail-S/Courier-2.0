package org.example.randomGenerateOrder;

import com.github.javafaker.Faker;
import org.apache.commons.lang3.RandomUtils;
import org.example.abstractOrder.Order;
import org.example.abstractPerson.Person;
import org.example.enumType.EnumCourier;
import org.example.enumType.EnumOrder;
import org.example.fabricOrder.BuilderOrder;
import org.example.fabricPerson.BuilderPerson;
import org.example.point.Point;
import org.example.time.TimeBuilder;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RandomOrder {
    private List<Order> orderList = new ArrayList<>();
    public static <T extends Enum<?>> T randomEnum(Class<T> clazz){
        Random random = new Random();
        int x = random.nextInt(clazz.getEnumConstants().length);
        return clazz.getEnumConstants()[x];
    }
    private int generateId(){
        Random random = new Random();
        return random.nextInt();
    }
    private int generateNumber(int min,int max){
        Random rn = new Random();
        int range = max - min + 1;
        int randomNum =  rn.nextInt(range) + min;
        return randomNum;
    }
    public List<String> generateTime(){
        List<String> time = new ArrayList<>();
        String timeParseOne;
        String timeParseTwo;
        do {
            final Random random = new Random();
            final int millisInDayOne = 24 * 60 * 60 * 1000;
            final int millisInDayTwo = 24 * 60 * 60 * 1000;
            Time timeOne = new Time((long) random.nextInt(millisInDayOne));
            Time timeTwo = new Time((long) random.nextInt(millisInDayTwo));
            timeParseOne = timeOne.toString().substring(0, 5);
            timeParseTwo = timeTwo.toString().substring(0, 5);
            time.clear();
        }
        while(TimeBuilder.getTime(timeParseTwo,timeParseOne)>0);
        time.add(timeParseOne);
        time.add(timeParseTwo);
        return time;
    }
    public List<Order> getAllList() throws Exception {
        for (int i = 0; i < 100; i++) {
            orderList.add(new BuilderOrder(randomEnum(EnumOrder.class)).id(generateId()).
                            pointStart(new Point(generateNumber(0,100),generateNumber(0,100))).
                            pointFinish(new Point(generateNumber(0,100),generateNumber(0,100))).
                    time(new org.example.time.Time(generateTime().get(0),generateTime().get(1))).build());
        }
        return orderList;
    }
}
