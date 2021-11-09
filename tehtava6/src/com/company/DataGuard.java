package com.company;

import java.util.Objects;

public abstract class DataGuard implements IDataAccess{
    protected Data data;

    public DataGuard(Data data){
        this.data=data;
    }
    public Data getData(String password){
        return data.getData();
    }
}
