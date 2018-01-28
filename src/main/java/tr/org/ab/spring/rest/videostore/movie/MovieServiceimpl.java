package tr.org.ab.spring.rest.videostore.movie;

import java.util.Collection;

public interface MovieServiceimpl {
    Movie getMovie(String uuid);

    Movie addMovie(Movie movie);

    void updateMovie(String id, Movie movie);

    void deleteMovie(String id);

    Collection<Movie> getAllMovies();
}
