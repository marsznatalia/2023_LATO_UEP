package pl.psi;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import org.junit.jupiter.api.Test;

public class ShortestPathAlgorythmTest {
    @Test
    void shouldFindShortestPathWithoutAnyObstacles(){
        /*
        ShortestPathAlgorythm pathAlgorythm = new ShortestPathAlgorythm(grid);

        List<Point> path = pathAlgorythm.findPath(new Point(0, 1), new Point(1, 3));
        assertThat(path).isNotEmpty();
         */
        int [][] grid = new int[5][5];
        for( int x = 0; x < 5; x++ ){
            for( int y = 0; y < 5; y++ )
            {
                grid[x][y] = 1;
            }
        }
        ShortestPathAlgorythm pathAlgorythm = new ShortestPathAlgorythm();
        List<Point> path = pathAlgorythm.findPath(grid,new Point(0, 0), new Point(1, 3));
        assertThat(path).isNotEmpty();
        assertThat(path).hasSize(5);
    }
}
