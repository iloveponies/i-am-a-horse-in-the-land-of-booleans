(ns structured-data-test
  (:use structured-data
        midje.sweet))

(facts "do-a-thing"
  (do-a-thing 3) => 46656.0
  (do-a-thing 1) => 4.0
  (do-a-thing 0) => 1.0)

(facts "spiff"
  (spiff [1 2 3])         => 4
  (spiff [1 2 -34 4 5 6]) => -33)

(facts "cutify"
  (cutify [])        => ["<3"]
  (cutify [1 2 3])   => [1 2 3 "<3"]
  (cutify ["a" "b"]) => ["a" "b" "<3"])

(facts "width"
  (width (rectangle [1 1] [5 1]))  => 4
  (width (rectangle [1 1] [1 1]))  => 0
  (width (rectangle [3 1] [10 4])) => 7)

(facts "height"
  (height (rectangle [1 1] [5 1])) => 0
  (height (rectangle [1 1] [5 5])) => 4
  (height (rectangle [0 0] [2 3])) => 3)

(facts "square?"
  (square? (rectangle [1 1] [2 2])) => true
  (square? (rectangle [1 1] [2 3])) => false
  (square? (rectangle [1 1] [1 1])) => true
  (square? (rectangle [3 2] [1 0])) => true
  (square? (rectangle [3 2] [1 1])) => false)

(facts "area"
  (area (rectangle [1 1] [5 1]))  => 0
  (area (rectangle [0 0] [1 1]))  => 1
  (area (rectangle [0 0] [4 3]))  => 12
  (area (rectangle [3 1] [10 4])) => 21)

(facts "contains-point?"
  (contains-point? (rectangle [0 0] [2 2])
                   (point 1 1))            => true
  (contains-point? (rectangle [0 0] [2 2])
                   (point 2 1))            => true
  (contains-point? (rectangle [0 0] [2 2])
                   (point -3 1))           => false
  (contains-point? (rectangle [0 0] [2 2])
                   (point 1 3))            => false
  (contains-point? (rectangle [1 1] [2 2])
                   (point 1 1))            => true
  (contains-point? (rectangle [1 1] [1 1])
                   (point 1 1))            => true)

(facts "contains-rectangle?"
  (contains-rectangle? (rectangle [0 0] [3 3])
                       (rectangle [1 1] [2 2])) => true
  (contains-rectangle? (rectangle [0 0] [2 2])
                       (rectangle [1 1] [3 3])) => false
  (contains-rectangle? (rectangle [0 0] [1 1])
                       (rectangle [0 0] [1 1])) => true
  (contains-rectangle? (rectangle [0 0] [1 1])
                       (rectangle [1 1] [2 2])) => false)

(facts "spiff-destructuring"
  (spiff-destructuring [1 2 3])         => 4
  (spiff-destructuring [1 2 -34 4 5 6]) => -33)

(facts "element-lengths"
  (element-lengths ["foo" "bar" "" "quux"])  => [3 3 0 4]
  (element-lengths ["x" [:a :b :c] {:y 42}]) => [1 3 1])

(facts "second-elements"
  (second-elements [[1 2] [2 3] [3 4]])               => [2 3 4]
  (second-elements [[1 2 3 4] [1] ["a" "s" "d" "f"]]) => [2 nil "s"])

(facts "toggle"
  (toggle #{:a :b :c} :d) => #{:a :b :c :d}
  (toggle #{:a :b :c} :a) => #{:b :c})

(def china {:name "China Miéville", :birth-year 1972})

(def octavia {:name "Octavia E. Butler"
              :birth-year 1947
              :death-year 2006})

(def cities {:title "The City and the City" :author china})
(def wild-seed {:title "Wild Seed", :author octavia})
(def embassytown {:title "Embassytown", :author china})

(def books [cities, wild-seed, embassytown])

(facts "titles"
  (titles [cities]) => ["The City and the City"]
  (titles books)    => ["The City and the City" "Wild Seed" "Embassytown"])

(facts "books-by-author"
  (books-by-author "China Miéville" books) => [cities, embassytown])

(facts "book-titles-by-author"
  (book-titles-by-author "China Miéville" books)
    => ["The City and the City" "Embassytown"]
  (book-titles-by-author "Octavia E. Butler" books)
    => ["Wild Seed"])

(facts "author-names"
  (author-names [china octavia]) => #{"Octavia E. Butler" "China Miéville"})

(facts "authors"
  (authors books) => #{china octavia})

(facts "books->author-names"
  (books->author-names books) => #{"Octavia E. Butler" "China Miéville"})

; %____%
