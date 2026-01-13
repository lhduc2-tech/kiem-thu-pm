import java.util.List;

/**
 * Lớp phân tích dữ liệu điểm số học sinh
 * Cung cấp các phương thức để đếm học sinh giỏi và tính điểm trung bình hợp lệ
 */
public class StudentAnalyzer {
    
    /**
     * Phân tích điểm số và trả về số lượng học sinh đạt loại Giỏi.
     * @param scores danh sách điểm số từ 0 đến 10
     * @return số học sinh đạt loại Giỏi (>= 8.0)
     * - Bỏ qua điểm âm hoặc lớn hơn 10 (coi là dữ liệu sai)
     * - Nếu danh sách rỗng hoặc null, trả về 0
     */
    public int countExcellentStudents(List<Double> scores) {
        // Kiểm tra danh sách rỗng hoặc null
        if (scores == null || scores.isEmpty()) {
            return 0;
        }
        
        int count = 0;
        
        // Vòng lặp duyệt qua danh sách điểm để lọc học sinh giỏi
        for (Double score : scores) {
            // Bỏ qua giá trị null
            if (score == null) {
                continue;
            }
            
            // Điều kiện validate: bỏ qua điểm không hợp lệ (< 0 hoặc > 10)
            if (score < 0 || score > 10) {
                continue;
            }
            
            // Đếm học sinh đạt loại Giỏi (điểm >= 8.0)
            if (score >= 8.0) {
                count++;
            }
        }
        
        return count;
    }

    /**
     * Tính điểm trung bình hợp lệ (từ 0 đến 10)
     * @param scores danh sách điểm
     * @return điểm trung bình của các điểm hợp lệ
     * - Bỏ qua điểm âm hoặc lớn hơn 10 (coi là dữ liệu sai)
     * - Nếu danh sách rỗng hoặc không có điểm hợp lệ, trả về 0
     */
    public double calculateValidAverage(List<Double> scores) {
        // Kiểm tra danh sách rỗng hoặc null
        if (scores == null || scores.isEmpty()) {
            return 0.0;
        }
        
        double sum = 0.0;
        int validCount = 0;
        
        // Vòng lặp duyệt qua danh sách để tính trung bình hợp lệ
        for (Double score : scores) {
            // Bỏ qua giá trị null
            if (score == null) {
                continue;
            }
            
            // Điều kiện validate: bỏ qua điểm không hợp lệ (< 0 hoặc > 10)
            if (score < 0 || score > 10) {
                continue;
            }
            
            // Cộng dồn điểm hợp lệ
            sum += score;
            validCount++;
        }
        
        // Trả về 0 nếu không có điểm hợp lệ nào
        if (validCount == 0) {
            return 0.0;
        }
        
        // Tính và trả về điểm trung bình
        return sum / validCount;
    }
}
