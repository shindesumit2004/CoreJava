

package OOPs.Methodoverriding;

import OOPs.MethodOverloading.Main;

public class RuleNo9 extends Main {
    @Override
    protected void show() {
        System.out.println("method after override");
    }

    public static void main(String[] args) {
        RuleNo9 R = new RuleNo9();
        R.show();
    }

}