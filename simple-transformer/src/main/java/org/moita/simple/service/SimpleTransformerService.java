package org.moita.simple.service;

import org.moita.common.services.TransformationType;
import org.moita.common.services.Transformer;

public class SimpleTransformerService implements Transformer
{
    @Override
    public TransformationType type()
    {
        return TransformationType.SIMPLE;
    }

    @Override
    public String transform(String input)
    {
        return "Simple " + input;
    }
}
