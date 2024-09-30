package com.company;

/**
 *  This is a good class
 */

public class cwh_107_method_tags {
    /**
     *
     * @param args These are Arguments supplied to the command line
     */
    public static void main(String[] args) {
        System.out.println("I am main method");
    }

    /**
     * Hello this is the method and this is the most beautiful method of this class
     * @param i This is the first number to add
     * @param j THis is the second number to add
     * @return Sum of two numbers as an integer
     * @throws Exception if i is 0
     * @deprecated This method is deprecated please use + operator
     */
    public int add(int i,int j) throws Exception{
        if(i==0){
            throw new Exception();
        }
        int c;
        c = i + j;
        return c;
    }
}