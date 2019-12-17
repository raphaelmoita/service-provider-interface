package org.moita.complex.service;

import org.moita.common.services.TransformationType;
import org.moita.common.services.Transformer;

public class ComplexTransformerService implements Transformer
{
    @Override
    public TransformationType type()
    {
        return TransformationType.COMPLEX;
    }

    @Override
    public String transform(String input)
    {
        return "Complex " + input;
    }
}
