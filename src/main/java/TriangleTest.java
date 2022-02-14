import exception.ExceptionArgumentTriangle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

// echo ${LEVEL}
// export LEVEL=TRACE
// mvn test -Dtest=TriangleTest

public class TriangleTest {
    Logger logger = LoggerFactory.getLogger(TriangleTest.class);


    @BeforeEach
    void logging() {
        logger.error("Log error");
        logger.trace("Log trace");
    }

    @Test
    @DisplayName("Проверка площади Equals ассертом")
    void checkAreaEquals() throws ExceptionArgumentTriangle {
        assertEquals(6.0, Triangle.areaTriangle(3, 4, 5));
    }

    @Test
    @DisplayName("Проверка площади ")
    void checkAreaPositive() {
        assertAll(() -> assertEquals(5.332682, Triangle.areaTriangle(3, 4, 6)),
                () -> assertEquals(0.0, Triangle.areaTriangle(3, 4, 7)),
                () -> assertEquals(10.256096, Triangle.areaTriangle(3, 7, 7)),
                () -> assertEquals(6.495191, Triangle.areaTriangle(3, 5, 7)),
                () -> assertEquals(3.49106, Triangle.areaTriangle(1, 7, 7)));

    }

}