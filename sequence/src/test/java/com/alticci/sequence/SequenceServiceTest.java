package com.alticci.sequence;

import com.alticci.sequence.service.SequenceService;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SequenceServiceTest {
    private SequenceService service = new SequenceService();

    @Test
    public void whenEnter0shouldReturn0() {
        Integer output = service.sequence(0);
        assertEquals(0, output);
    }

    @Test
    public void whenEnter1ShouldReturn1() {
        Integer output = service.sequence(1);
        assertEquals(1, output);
    }

    @Test
    public void whenEnter2ShouldReturn1() {
        Integer output = service.sequence(2);
        assertEquals(1, output);
    }

    @Test
    public void whenEnter3ShouldReturn1() {
        Integer output = service.sequence(3);
        assertEquals(1, output);
    }

    @Test
    public void whenEnter4ShouldReturn2() {
        Integer output = service.sequence(4);
        assertEquals(2, output);
    }

    @Test
    public void whenEnterFiveShouldReturnTwo() {
        Integer output = service.sequence(4);
        assertEquals(2, output);
    }

    @Test
    public void testSequence() {
        List outputs = List.of(
                service.sequence(0),
                service.sequence(1),
                service.sequence(2),
                service.sequence(3),
                service.sequence(4),
                service.sequence(5),
                service.sequence(6),
                service.sequence(7),
                service.sequence(8),
                service.sequence(9)
        );
        List expected = List.of(0,1,1,1,2,2,3,4,5,7);
        assertEquals(expected, outputs);
    }
}
