package com.youtube.hempfest.clans.util;

public enum RankPriority {

    NORMAL(0),
    HIGH(1),
    HIGHER(2),
    HIGHEST(3);

    private int priNum;

    RankPriority(int priNum) {
        this.priNum = priNum;
    }

    public int toInt() {
        int result = 0;
        switch (this) {
            default:
                result = priNum;
                break;
        }
        return result;
    }

}
