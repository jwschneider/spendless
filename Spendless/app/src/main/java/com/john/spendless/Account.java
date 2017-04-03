package com.john.spendless;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by john on 4/2/17.
 */

public class Account {

    private String _name;
    private double _budget;
    private int _month;
    private int _day;
    private double _totalSpending;
    private ArrayList<Double> _dailySpending;
    private HashMap<String, Double> _catSpending;

    public Account(String name, double budget) {
        _name = name;
        _budget = budget;
        _totalSpending = 0;
    }

    public void setMonth(int month){
        _month = month;
    }

    public void setDay(int day){
        _day = day;
    }

    public void initDaily() {
        _dailySpending = new ArrayList<>(_month);
    }

    public void initCat() {
        _catSpending = new HashMap<>();
    }

    public void updateSpending(double amnt, String cat) {
        _dailySpending.add(_day, amnt);
        _catSpending.put(cat, amnt);
    }

    public String getName() {
        return _name;
    }

    public double getBudget() {
        return _budget;
    }

    public double getTotal() {
        return _totalSpending;
    }

    public double getDaily(int day) {
        return _dailySpending.get(day);
    }

    public double getCat(String cat) {
        return _catSpending.get(cat);
    }

}
