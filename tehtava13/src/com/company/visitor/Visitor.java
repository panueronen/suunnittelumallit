package com.company.visitor;

import com.company.state.Dying;
import com.company.state.Healthy;
import com.company.state.Injured;

public interface Visitor {
    public int visit(Dying dying);
    public int visit(Injured injured);
    public int visit(Healthy healthy);
}
