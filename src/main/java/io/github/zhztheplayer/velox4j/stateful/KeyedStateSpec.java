package io.github.zhztheplayer.velox4j.stateful;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.github.zhztheplayer.velox4j.serializable.ISerializable;
import io.github.zhztheplayer.velox4j.type.Type;

import java.util.List;

/** Mirror of velox's stateful::KeyedStateSpec. Registered under "KeyedStateSpec" so the C++ side can deserialize the nested plan-node field (the C++ ISerializable entry reads the "name" key). */
public class KeyedStateSpec extends ISerializable {
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
