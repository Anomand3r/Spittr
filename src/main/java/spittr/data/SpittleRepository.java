package spittr.data;

import spittr.Spittle;

import java.util.List;

/**
 * Created by Alexandru on 11/8/2015.
 */
public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);
}
