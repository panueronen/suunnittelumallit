package com.company;

import com.company.Parts.Cpu;
import com.company.Parts.HardDrive;
import com.company.Parts.Memory;

public class ComputerFacade {
    Cpu comput;
    HardDrive hardDrive;
    Memory memory;

    public ComputerFacade(){
        comput = new Cpu();
        hardDrive = new HardDrive();
        memory = new Memory();
    }

    public void start(){
        comput.freeze();
        memory.load(2,hardDrive.read(4,6));
        comput.jump(2L);
        comput.execute();
    }
}
