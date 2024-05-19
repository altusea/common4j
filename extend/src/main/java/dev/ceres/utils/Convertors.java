package dev.ceres.utils;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Convertors {

    public static <T, R> List<R> toUnmodifiableList(Collection<T> collection, Function<? super T, ? extends R> mapper) {
        if(CollectionUtils.isEmpty(collection)) {
            return List.of();
        }
        return collection.stream().map(mapper).collect(Collectors.toUnmodifiableList());
    }
}
