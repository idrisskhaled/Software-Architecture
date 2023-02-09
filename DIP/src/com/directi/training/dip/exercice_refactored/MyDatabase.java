package com.directi.training.dip.exercice_refactored;

import java.util.HashMap;
import java.util.Map;

public class MyDatabase implements IMyDatabase
{
    private static Map<Integer, String> _data = new HashMap<>();
    private static int _count = 0;

    @Override
    public int write(String inputString)
    {
        _data.put(++_count, inputString);
        return _count;
    }
}
