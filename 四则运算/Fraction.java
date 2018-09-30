/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;
/**
 *
 * @author Administrator
 */

public class Fraction {
    private int a; //鍒嗗瓙
    private int b; //鍒嗘瘝
    
     public Fraction(String string) { 
        string = string.trim();
        int char1 = string.indexOf("'"); 
        int char2 = string.indexOf("/"); 
        if (char1 != -1) { // 鏁板瓧涓哄甫鍒嗘暟
            int z = Integer.valueOf(string.substring(0, char1));
            b = Integer.valueOf(string.substring(char2 + 1));
            a = z * b + Integer.valueOf(string.substring(char1 + 1, char2));
        } else if (char2 != -1) { // 鏁板瓧涓虹湡鍒嗘暟
            b = Integer.valueOf(string.substring(char2 + 1));
            a = Integer.valueOf(string.substring(0, char2));
        } else { // 鏁板瓧涓烘暣鏁�
            a = Integer.valueOf(string);
            b = 1;
        }
        build(a, b);
    }

    public Fraction(int a, int b) {
        build(a, b);
    }

    // 鏁板瓧褰㈠紡杞崲涓哄瓧绗︿覆褰㈠紡
    public String toString() {
        if (b == 1) {
            return String.valueOf(a);
        } else {
            int i = a / b;
            if (i != 0) {
                return String.format("%d'%d/%d", i, a - b * i, b);
            } else {
                return String.format("%d/%d", a, b);
            }
        }
    }

    // 缁欏畾鍒嗗瓙鍒嗘瘝鏋勯�犲垎鏁�
    private void build(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("鍒嗘瘝涓嶈兘涓�0");
        }
        int c = comfactor(a, b);
        this.a = a / c;
        this.b = b / c;
    }

    // 姹傚叕鍥犲瓙
    private int comfactor(int a, int b) {
        int mod = a % b;
        return mod == 0 ? b : comfactor(b, mod);
    }

    // 鍔犳硶 a + b
    public Fraction add(Fraction fraction) {
        return new Fraction(this.a * fraction.b + fraction.a * this.b, this.b * fraction.b);
    }

    // 鍑忔硶 a - b
    public Fraction subtraction(Fraction fraction) {
        return new Fraction(this.a * fraction.b - fraction.a * this.b, this.b * fraction.b);
    }

    // 涔樻硶 a x b
    public Fraction multiplication(Fraction fraction) {
        return new Fraction(this.a * fraction.a, this.b * fraction.b);
    }

    // 闄ゆ硶a/b
    public Fraction division(Fraction fraction) {
        return new Fraction(this.a * fraction.b, b * fraction.a);
    }

    public double getDouble() {
        return a / b;
    }





}
    
    

