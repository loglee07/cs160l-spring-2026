package edu.sdsu.cs160l.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.when;

//TODO add Extension for Mockito and Test Suite
@ExtendWith(MockitoExtension.class)
class MathOperationsTest {

    @InjectMocks
    private MathOperations mathOperations;

    @Mock
    private SimpleCalculator calculator;

    /**
     * Any test function is always "public void <testScenarioName>()"
     * and annotated with @Test
     * the general syntax for stubbing a mock is
     * doAnswer(invocation -> {
     * // mock logic goes here
     * }).when(<mockobject>).functionCall()
     */
    @Test
    public void testFactorial() {
        doAnswer(invocation -> {
            int a = invocation.getArgument(0);
            int b = invocation.getArgument(1);
            return a * b;
        })
                .when(calculator)
                .mul(anyInt(), anyInt());
        assertEquals(6, mathOperations.factorial(3));
    }

    @Test
    public void testAverage() {
        doAnswer(invocation -> {
            int a = invocation.getArgument(0);
            int b = invocation.getArgument(1);
            return a + b;
        }).when(calculator).add(anyInt(), anyInt());
        doAnswer(invocation -> {
            int a = invocation.getArgument(0);
            int b = invocation.getArgument(1);
            return a / b;
        }).when(calculator).div(anyInt(), anyInt());
        assertEquals(2, mathOperations.average(new int[]{1, 2, 3}));
    }

    @Test
    public void testPower() {
        doAnswer(invocation -> {
            int a = invocation.getArgument(0);
            int b = invocation.getArgument(1);
            return a * b;
        }).when(calculator).mul(anyInt(), anyInt());
        assertEquals(8, mathOperations.power(2, 3));
    }

    @Test
    public void testMidValue() {
        doAnswer(invocation -> {
            int a = invocation.getArgument(0);
            int b = invocation.getArgument(1);
            return a + b;
        }).when(calculator).add(anyInt(), anyInt());
        doAnswer(invocation -> {
            int a = invocation.getArgument(0);
            int b = invocation.getArgument(1);
            return a / b;
        }).when(calculator).div(anyInt(), anyInt());
        assertEquals(10, mathOperations.midValue(5, 15));
    }

    @Test
    public void testFToC() {
        doAnswer(invocation -> {
            int a = invocation.getArgument(0);
            int b = invocation.getArgument(1);
            return a - b;
        }).when(calculator).sub(anyInt(), anyInt());
        doAnswer(invocation -> {
            int a = invocation.getArgument(0);
            int b = invocation.getArgument(1);
            return a * b;
        }).when(calculator).mul(anyInt(), anyInt());
        doAnswer(invocation -> {
            int a = invocation.getArgument(0);
            int b = invocation.getArgument(1);
            return a / b;
        }).when(calculator).div(anyInt(), anyInt());
        assertEquals(0, mathOperations.fahrenheitToCelsius(32));
    }


}