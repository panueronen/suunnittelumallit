package com.company;

public class Data implements IDataAccess{
    private final String secretData;

    public Data(String data){
        this.secretData=data;
    }

    @Override
    public IDataAccess getData() {
        return this;
    }

    @Override
    public String toString() {
        return secretData;
    }
}
