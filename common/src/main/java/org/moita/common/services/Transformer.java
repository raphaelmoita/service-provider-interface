package org.moita.common.services;

public interface Transformer
{
    TransformationType type();

    String transform(String input);
}
