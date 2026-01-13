import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

/**
 * Lớp kiểm thử đơn vị cho StudentAnalyzer
 * Bao gồm các test case cho cả hai phương thức: countExcellentStudents() và calculateValidAverage()
 */
public class StudentAnalyzerTest {
    
    private StudentAnalyzer analyzer;
    
    @BeforeEach
    public void setUp() {
        analyzer = new StudentAnalyzer();
    }
    
    // ================== TEST CHO countExcellentStudents() ==================
    
    @Test
    @DisplayName("Test đếm học sinh giỏi - Trường hợp bình thường với điểm hợp lệ và không hợp lệ")
    public void testCountExcellentStudents_MixedValidInvalid() {
        // Danh sách có nhiều điểm hợp lệ và không hợp lệ
        // 9.0 (giỏi), 8.5 (giỏi), 7.0 (không giỏi), 11.0 (không hợp lệ), -1.0 (không hợp lệ)
        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);
        assertEquals(2, analyzer.countExcellentStudents(scores), 
            "Phải đếm được 2 học sinh giỏi (9.0 và 8.5)");
    }
    
    @Test
    @DisplayName("Test đếm học sinh giỏi - Danh sách toàn bộ điểm hợp lệ")
    public void testCountExcellentStudents_AllValidScores() {
        List<Double> scores = Arrays.asList(8.0, 9.0, 10.0, 7.5, 6.0, 5.0);
        assertEquals(3, analyzer.countExcellentStudents(scores), 
            "Phải đếm được 3 học sinh giỏi (8.0, 9.0, 10.0)");
    }
    
    @Test
    @DisplayName("Test đếm học sinh giỏi - Danh sách trống")
    public void testCountExcellentStudents_EmptyList() {
        assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()), 
            "Danh sách trống phải trả về 0");
    }
    
    @Test
    @DisplayName("Test đếm học sinh giỏi - Danh sách null")
    public void testCountExcellentStudents_NullList() {
        assertEquals(0, analyzer.countExcellentStudents(null), 
            "Danh sách null phải trả về 0");
    }
    
    @Test
    @DisplayName("Test đếm học sinh giỏi - Chỉ chứa giá trị 0")
    public void testCountExcellentStudents_OnlyZero() {
        List<Double> scores = Arrays.asList(0.0, 0.0, 0.0);
        assertEquals(0, analyzer.countExcellentStudents(scores), 
            "Danh sách chỉ có điểm 0 phải trả về 0 học sinh giỏi");
    }
    
    @Test
    @DisplayName("Test đếm học sinh giỏi - Chỉ chứa giá trị 10")
    public void testCountExcellentStudents_OnlyTen() {
        List<Double> scores = Arrays.asList(10.0, 10.0, 10.0);
        assertEquals(3, analyzer.countExcellentStudents(scores), 
            "Danh sách chỉ có điểm 10 phải trả về 3 học sinh giỏi");
    }
    
    @Test
    @DisplayName("Test đếm học sinh giỏi - Giá trị biên 8.0")
    public void testCountExcellentStudents_BoundaryValue8() {
        List<Double> scores = Arrays.asList(7.99, 8.0, 8.01);
        assertEquals(2, analyzer.countExcellentStudents(scores), 
            "Chỉ 8.0 và 8.01 được tính là giỏi");
    }
    
    @Test
    @DisplayName("Test đếm học sinh giỏi - Toàn bộ điểm không hợp lệ")
    public void testCountExcellentStudents_AllInvalidScores() {
        List<Double> scores = Arrays.asList(-5.0, 15.0, 100.0, -0.1, 10.1);
        assertEquals(0, analyzer.countExcellentStudents(scores), 
            "Toàn bộ điểm không hợp lệ phải trả về 0");
    }
    
    @Test
    @DisplayName("Test đếm học sinh giỏi - Không có học sinh giỏi")
    public void testCountExcellentStudents_NoExcellentStudents() {
        List<Double> scores = Arrays.asList(5.0, 6.0, 7.0, 7.5, 7.99);
        assertEquals(0, analyzer.countExcellentStudents(scores), 
            "Không có điểm >= 8.0 phải trả về 0");
    }
    
    // ================== TEST CHO calculateValidAverage() ==================
    
    @Test
    @DisplayName("Test tính trung bình - Trường hợp bình thường với điểm hợp lệ và không hợp lệ")
    public void testCalculateValidAverage_MixedValidInvalid() {
        // 9.0 + 8.5 + 7.0 = 24.5, chia cho 3 = 8.166...
        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);
        assertEquals(8.17, analyzer.calculateValidAverage(scores), 0.01, 
            "Trung bình của 9.0, 8.5, 7.0 phải là 8.17");
    }
    
    @Test
    @DisplayName("Test tính trung bình - Danh sách toàn bộ điểm hợp lệ")
    public void testCalculateValidAverage_AllValidScores() {
        // 8.0 + 9.0 + 7.0 = 24.0, chia cho 3 = 8.0
        List<Double> scores = Arrays.asList(8.0, 9.0, 7.0);
        assertEquals(8.0, analyzer.calculateValidAverage(scores), 0.01, 
            "Trung bình của 8.0, 9.0, 7.0 phải là 8.0");
    }
    
    @Test
    @DisplayName("Test tính trung bình - Danh sách trống")
    public void testCalculateValidAverage_EmptyList() {
        assertEquals(0.0, analyzer.calculateValidAverage(Collections.emptyList()), 0.01, 
            "Danh sách trống phải trả về 0.0");
    }
    
    @Test
    @DisplayName("Test tính trung bình - Danh sách null")
    public void testCalculateValidAverage_NullList() {
        assertEquals(0.0, analyzer.calculateValidAverage(null), 0.01, 
            "Danh sách null phải trả về 0.0");
    }
    
    @Test
    @DisplayName("Test tính trung bình - Chỉ chứa giá trị 0")
    public void testCalculateValidAverage_OnlyZero() {
        List<Double> scores = Arrays.asList(0.0, 0.0, 0.0);
        assertEquals(0.0, analyzer.calculateValidAverage(scores), 0.01, 
            "Danh sách chỉ có điểm 0 phải có trung bình là 0.0");
    }
    
    @Test
    @DisplayName("Test tính trung bình - Chỉ chứa giá trị 10")
    public void testCalculateValidAverage_OnlyTen() {
        List<Double> scores = Arrays.asList(10.0, 10.0, 10.0);
        assertEquals(10.0, analyzer.calculateValidAverage(scores), 0.01, 
            "Danh sách chỉ có điểm 10 phải có trung bình là 10.0");
    }
    
    @Test
    @DisplayName("Test tính trung bình - Giá trị biên 0 và 10")
    public void testCalculateValidAverage_BoundaryValues() {
        List<Double> scores = Arrays.asList(0.0, 10.0);
        assertEquals(5.0, analyzer.calculateValidAverage(scores), 0.01, 
            "Trung bình của 0 và 10 phải là 5.0");
    }
    
    @Test
    @DisplayName("Test tính trung bình - Toàn bộ điểm không hợp lệ")
    public void testCalculateValidAverage_AllInvalidScores() {
        List<Double> scores = Arrays.asList(-5.0, 15.0, 100.0, -0.1, 10.1);
        assertEquals(0.0, analyzer.calculateValidAverage(scores), 0.01, 
            "Toàn bộ điểm không hợp lệ phải trả về 0.0");
    }
    
    @Test
    @DisplayName("Test tính trung bình - Một điểm hợp lệ duy nhất")
    public void testCalculateValidAverage_SingleValidScore() {
        List<Double> scores = Arrays.asList(7.5);
        assertEquals(7.5, analyzer.calculateValidAverage(scores), 0.01, 
            "Một điểm duy nhất 7.5 phải có trung bình là 7.5");
    }
    
    @Test
    @DisplayName("Test tính trung bình - Điểm có số thập phân dài")
    public void testCalculateValidAverage_DecimalPrecision() {
        // 8.333... là điểm trung bình của 5.0, 8.0, 10.0
        List<Double> scores = Arrays.asList(5.0, 8.0, 10.0, 11.0);
        assertEquals(7.67, analyzer.calculateValidAverage(scores), 0.01, 
            "Trung bình của 5.0, 8.0, 10.0 phải là 7.67");
    }
}
