package com.yyc.learnLeetcode.learnAlgorithms.a1603;

/**
 * carType枚举类
 *
 * @author yuechao
 */

public enum CarTypeEnum {

    /**
     * big -- 1
     * medium -- 2
     * small -- 3
     */
    BIG("big", 1),
    MEDIUM("medium", 2),
    SMALL("small", 3);

    private String carType;
    private int carTypeNum;

    CarTypeEnum(String carType, int carTypeNum) {
        this.carType = carType;
        this.carTypeNum = carTypeNum;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public int getCarTypeNum() {
        return carTypeNum;
    }

    public void setCarTypeNum(int carTypeNum) {
        this.carTypeNum = carTypeNum;
    }
}
