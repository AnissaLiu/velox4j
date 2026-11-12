package io.github.zhztheplayer.velox4j.stateful;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.github.zhztheplayer.velox4j.type.Type;

import java.util.List;

public class KeyedStateSpec {
  private final List<Integer> keyChannels;
  private final List<Type> keyTypes;

  @JsonCreator
  public KeyedStateSpec(
      @JsonProperty("keyChannels") List<Integer> keyChannels,
      @JsonProperty("keyTypes") List<Type> keyTypes) {
    this.keyChannels = keyChannels;
    this.keyTypes = keyTypes;
  }

  @JsonGetter("keyChannels")
  public List<Integer> getKeyChannels() {
    return keyChannels;
  }

  @JsonGetter("keyTypes")
  public List<Type> getKeyTypes() {
    return keyTypes;
  }
}
