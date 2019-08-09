<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<pre>
so index???

1. building the search form , with text and category

	category
	- title
		https://api.themoviedb.org/3/search/movie?api_key=fbcf98951251b4a93b1e8101ed89bd95&
			query=hello

	- episodes
		https://api.themoviedb.org/3/search/tv?api_key=fbcf98951251b4a93b1e8101ed89bd95&
			query=soso
			
	- names
		https://api.themoviedb.org/3/search/person?api_key=fbcf98951251b4a93b1e8101ed89bd95
			&query=soso
			
	- companies
		https://api.themoviedb.org/3/search/company?api_key=fbcf98951251b4a93b1e8101ed89bd95
			&query=soso
			
	- keywords
		https://api.themoviedb.org/3/search/keyword?api_key=fbcf98951251b4a93b1e8101ed89bd95
		&query=soso
		
	- all
		https://api.themoviedb.org/3/search/multi?api_key=fbcf98951251b4a93b1e8101ed89bd95
		&query=soso
</pre>

	<form method="POST">
		<label>Search</label>
		<input type="text" name="searchText" />
		<select name="cars" size="4">
		    <option value="movie">Movies</option>
		    <option value="tv-shows">Tv-Shows</option>
		    <option value="ppl-names">People</option>
		    <option value="companies">Companies</option>
		    <option value="keywords">Keyword</option>
		    <option value="all">All</option>
		</select>
		<input type="submit" />
	</form>

</body>
</html>