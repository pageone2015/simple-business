package com.page.simplebusiness.dto;

public class SatisfyRateEvent {

    private String userName;

    private int logisticRate;

    private int hygieneRate;

    private int foodRate;

    private int estateRate;

    private String suggestion;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getLogisticRate() {
        return logisticRate;
    }

    public void setLogisticRate(int logisticRate) {
        this.logisticRate = logisticRate;
    }

    public int getHygieneRate() {
        return hygieneRate;
    }

    public void setHygieneRate(int hygieneRate) {
        this.hygieneRate = hygieneRate;
    }

    public int getFoodRate() {
        return foodRate;
    }

    public void setFoodRate(int foodRate) {
        this.foodRate = foodRate;
    }

    public int getEstateRate() {
        return estateRate;
    }

    public void setEstateRate(int estateRate) {
        this.estateRate = estateRate;
    }

    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }
}
