package org.moita.runner;

import java.util.Iterator;
import java.util.Optional;
import java.util.ServiceLoader;

import org.moita.common.services.TransformationType;
import org.moita.common.services.Transformer;

import static com.google.common.collect.Lists.newArrayList;

public class TransformerService
{
    private ServiceLoader<Transformer> loader;

    public static final TransformerService INSTANCE = new TransformerService();

    private TransformerService()
    {
        loader = ServiceLoader.load(Transformer.class);
    }

    public String transform(String text, TransformationType type)
    {
        Optional<Transformer> serviceOpt = newArrayList(loader).stream()
            .filter(service -> type.equals(service.type()))
            .findFirst();

        if (serviceOpt.isPresent())
        {
            return serviceOpt.get().transform(text);
        }
        else
        {
            return text;
        }
    }

    public static void main(String[] args)
    {
        System.out.println(TransformerService.INSTANCE.transform("Raphael", TransformationType.COMPLEX));
    }
}
