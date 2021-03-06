package com.example.rishabhkhanna.minor.models;

import java.util.ArrayList;

/**
 * Created by rishabhkhanna on 25/11/16.
 */

public class MovieHalls {

    public static class Halls {
        String name;
        int platinum[][];
        int gold[][];
        int silver[][];
        String url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public Halls(String name, int[][] platinum, int[][] gold, int[][] silver, String url) {
            this.name = name;
            this.platinum = platinum;
            this.gold = gold;
            this.silver = silver;
            this.url = url;

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int[][] getPlatinum() {
            return platinum;
        }

        public void setPlatinum(int[][] platinum) {
            this.platinum = platinum;
        }

        public int[][] getGold() {
            return gold;
        }

        public void setGold(int[][] gold) {
            this.gold = gold;
        }

        public int[][] getSilver() {
            return silver;
        }

        public void setSilver(int[][] silver) {
            this.silver = silver;
        }
    }

    public static ArrayList<Halls> getHalls() {
        ArrayList<Halls> halls = new ArrayList();

        halls.add(new Halls("JAM Shipra Mall", new int[2][10], new int[4][10], new int[3][10], "http://image3.mouthshut.com/images/imagesp/925741867s.png"));
        halls.add(new Halls("SRS Aditya Mall", new int[2][10], new int[4][10], new int[3][10], "http://dhoom.popkorn.in/media//theatrelogo/2015/Aug/1438689609-srslogo.jpg"));
        halls.add(new Halls("SRS Jaipurya", new int[2][10], new int[4][10], new int[3][10], "http://dhoom.popkorn.in/media//theatrelogo/2015/Aug/1438689609-srslogo.jpg"));
        halls.add(new Halls("M2k", new int[2][10], new int[4][10], new int[3][10], "http://image3.mouthshut.com/images/imagesp/925670799s.jpg"));

        return halls;
    }

}

