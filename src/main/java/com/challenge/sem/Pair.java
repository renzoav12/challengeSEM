package com.challenge.sem;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@AllArgsConstructor
@Getter
@Setter
public class Pair {

    private Integer value;

    private Integer nextGreaterValue;
}
