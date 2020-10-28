package com.yyc.learnLeetcode.learnAlgorithms.a1603;

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 * 这里可以用一个数组来封装这三个变量。int[] count, 因为题干里规定了对应关系，可以取巧来用下标来对应carType。也可以用一个枚举类型。
 * addCar的参数必须是枚举类型，里面的switch case才能用枚举
 *
 * @author yuechao
 */
public class ParkingSystem {

    private int big;
    private int medium;
    private int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        switch (carType) {
            case 1:
                if (big == 0) {
                    return false;
                }
                big--;
                return true;
            case 2:
                if (medium == 0) {
                    return false;
                }
                medium--;
                return true;
            case 3:
                if (small == 0) {
                    return false;
                }
                small--;
                return true;
            default:
                System.out.println("the carType is incorrect");
                return false;
        }
    }

//    int[] count;
//    public ParkingSystem(int big, int medium, int small) {
//        count = new int[]{big, medium, small};
//    }
//    public boolean addCar(int carType) {
//        return count[carType - 1] -- > 0;
//    }

}
