package com.abd.movies.controller;

import com.abd.movies.model.Movie;
import com.abd.movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping("/all")
    public List<Movie> findAllMovies() {
        return movieService.getAllMovies();
    }

    @GetMapping("/find/{id}")
    public Movie findMovie(@PathVariable Long id) {
        return movieService.getMovie(id);
    }

    @PostMapping("/create")
    public Movie createMovie(@RequestBody Movie movie) {
        return movieService.saveMovie(movie);
    }

    @PutMapping("/update")
    public Movie updateMovie(@RequestBody Movie movie) {
        return movieService.saveMovie(movie);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteMovie(@PathVariable Long id) {
        movieService.deleteMovie(id);
    }
}
