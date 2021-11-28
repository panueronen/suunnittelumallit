package com.company.visitor;

import com.company.state.Dying;
import com.company.state.Healthy;
import com.company.state.Injured;

public class BonusVisitor implements Visitor{
    @Override
    public int visit(Dying dying) {
        System.out.println("Visiting dying");
        return 0;
    }

    @Override
    public int visit(Injured injured) {
        System.out.println("Visiting injured");
        return 5;
    }

    @Override
    public int visit(Healthy healthy) {
        System.out.println("Visiting healthy");
        return 10;
    }
}
