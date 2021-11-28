package com.company.visitor;

import com.company.state.Dying;
import com.company.state.HealthState;
import com.company.state.Healthy;
import com.company.state.Injured;

public class BonusVisitor implements Visitor{

    @Override
    public int visit(Dying dying) {
        return 0;
    }

    @Override
    public int visit(Injured injured) {
        return 5;
    }

    @Override
    public int visit(Healthy healthy) {
        return 10;
    }
}
