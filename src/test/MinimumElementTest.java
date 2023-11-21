import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumElementTest {

    @Test
    void findMin() {

        //Given
        int[] numbers = {1,2,3,4,5,0,12,-1,1,4,5};

        //When
        int minValue =  MinimumElement.findMin(numbers);

        //Then
        assertEquals(-1, minValue);

    }
}