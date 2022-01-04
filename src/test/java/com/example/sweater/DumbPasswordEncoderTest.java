package com.example.sweater;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class DumbPasswordEncoderTest {

    @Test
    void encode() {
        DumbPasswordEncoder dumbPasswordEncoder = new DumbPasswordEncoder();

        Assert.assertEquals("secret: 'mypwd'", dumbPasswordEncoder.encode("mypwd"));
        Assert.assertThat(dumbPasswordEncoder.encode("mypwd"), Matchers.containsString("mypwd"));
    }
}