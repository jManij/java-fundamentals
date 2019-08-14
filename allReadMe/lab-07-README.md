#Architecture
- There are five classes: Restaurant, Shop, Theater, Review & MovieReview.  
- Restaurant, Shop and Theater can have reviews. 
- Movie Review is an extension of Review class.
- When adding review to theater, movie review could be passed to signifying review about the movie.
- When adding review to theater, only a super class review could be passed.


#How to run it
- Clone the repo: https://github.com/jManij/java-fundamentals

Testing from terminal:
   - cd to java-fundamentals/inheritance
   - run the following command: './gradlew test'
   - All the tests should pass.
   
Testing from IJ:
  - Via import project, choose "inheritance"
  - run the following command: './gradlew test'
  - All the tests should pass.

