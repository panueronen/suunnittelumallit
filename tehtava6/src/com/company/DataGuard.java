package com.company;

import java.util.Objects;

public abstract class DataGuard implements IDataAccess{
    protected IDataAccess data;

    public DataGuard(IDataAccess data){
        this.data=data;
    }
    public IDataAccess getData(){
        return data.getData();
    }
}
