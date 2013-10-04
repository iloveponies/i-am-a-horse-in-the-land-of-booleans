(ns structured-data-test
  (:use structured-data
        midje.sweet))

(facts "do-a-thing" {:exercise 1
                     :points 1}
  (do-a-thing 3) => 46656.0
  (do-a-thing 1) => 4.0
  (do-a-thing 0) => 1.0)

(facts "spiff" {:exercise 2
                :points 1}
  (spiff [1 2 3])         => 4
  (spiff [1 2 -34 4 5 6]) => -33)

(facts "cutify" {:exercise 3
                 :points 1}
  (cutify [])        => ["<3"]
  (cutify [1 2 3])   => [1 2 3 "<3"]
  (cutify ["a" "b"]) => ["a" "b" "<3"])

(facts "spiff-destructuring" {:exercise 4
                              :points 1}
  (spiff-destructuring [1 2 3])         => 4
  (spiff-destructuring [1 2 -34 4 5 6]) => -33)

(facts {:exercise 5
        :points 1}
  (tabular
   (facts "width"
     (width (rectangle ?bottom-left ?top-right)) => ?width)
   ?bottom-left ?top-right ?width
   [1 1]        [5 1]      4
   [1 1]        [1 1]      0
   [3 1]        [10 4]     7
   [-1 -1]      [0 0]      1
   [-5 2]       [0 2]      5)

  (tabular
   (facts "height"
     (height (rectangle ?bottom-left ?top-right)) => ?height)
   ?bottom-left ?top-right ?height
   [1 1]        [5 1]      0
   [-1 -1]      [0 0]      1
   [2 -7]       [4 4]      11
   [1 1]        [5 5]      4
   [0 0]        [2 3]      3))

(tabular
  (facts "square?" {:exercise 6
                    :points 1}
    (square? (rectangle ?bottom-left ?top-right)) => ?square?)
  ?bottom-left ?top-right ?square?
  [1 1]        [2 2]      true
  [1 1]        [2 3]      false
  [1 1]        [1 1]      true
  [3 2]        [1 0]      true
  [3 2]        [1 1]      false
  [-1 -1]      [0 0]      true
  [-2 -4]      [0 -2]     true
  [-2 -3]      [1 1]      false)

(tabular
  (facts "area" {:exercise 7
                 :points 1}
    (area (rectangle ?bottom-left ?top-right)) => ?area)
  ?bottom-left ?top-right ?area
  [1 1]        [5 1]      0
  [0 0]        [1 1]      1
  [0 0]        [4 3]      12
  [-1 -1]      [3 7]      32
  [-2 -7]      [-1 -2]    5
  [3 1]        [10 4]     21)

(tabular
  (facts "contains-point?" {:exercise 8
                            :points 1}
    (contains-point? (rectangle ?bottom-left ?top-right)
                      ?point)
         => ?contains?)
  ?bottom-left ?top-right ?point  ?contains?
  [0 0]        [2 2]     [1 1]   true
  [0 0]        [2 2]     [2 1]   true
  [0 0]        [2 2]     [-3 1]  false
  [-2 -5]      [1 5]     [-2 -1] true
  [-2 -5]      [1 5]     [-3 -1] false
  [0 0]        [2 2]     [1 3]   false
  [1 1]        [2 2]     [1 1]   true
  [1 1]        [1 1]     [1 1]   true

  [-1 2]       [3 7]     [-6 10] false
  [-1 2]       [3 7]     [0 10]  false
  [-1 2]       [3 7]     [5 11]  false
  [-1 2]       [3 7]     [5 4]   false
  [-1 2]       [3 7]     [6 1]   false
  [-1 2]       [3 7]     [0 0]   false
  [-1 2]       [3 7]     [-2 0]  false
  [-1 2]       [3 7]     [-5 5]  false)

(tabular
  (facts "contains-rectangle?" {:exercise 9
                                :points 1}
    (contains-rectangle? (rectangle ?x1 ?y1)
                         (rectangle ?x2 ?y2)) => ?contains?)
  ?x1     ?y1     ?x2     ?y2     ?contains?
  [0 0]   [3 3]   [1 1]   [2 2]   true
  [0 0]   [2 2]   [1 1]   [3 3]   false
  [0 0]   [1 1]   [0 0]   [1 1]   true
  [0 0]   [1 1]   [1 1]   [2 2]   false
  [-2 -2] [2 2]   [-1 -1] [1 1]   true
  [-2 -2] [2 2]   [0 0]   [3 4]   false)

(def china {:name "China Miéville", :birth-year 1972})
(def octavia {:name "Octavia E. Butler"
              :birth-year 1947
              :death-year 2006})
(def friedman {:name "Daniel Friedman" :birth-year 1944})
(def felleisen {:name "Matthias Felleisen"})

(def cities {:title "The City and the City" :authors [china]})
(def wild-seed {:title "Wild Seed", :authors [octavia]})
(def embassytown {:title "Embassytown", :authors [china]})
(def little-schemer {:title "The Little Schemer"
                     :authors [friedman, felleisen]})

(def books [cities, wild-seed, embassytown, little-schemer])

(let [china {:name "China Miéville", :birth-year 1972}
      octavia {:name "Octavia E. Butler"
               :birth-year 1947
               :death-year 2006}
      friedman {:name "Daniel Friedman" :birth-year 1944}
      felleisen {:name "Matthias Felleisen"}
      cities {:title "The City and the City" :authors [china]}
      wild-seed {:title "Wild Seed", :authors [octavia]}
      embassytown {:title "Embassytown", :authors [china]}
      little-schemer {:title "The Little Schemer"
                      :authors [friedman, felleisen]}
      books [cities, wild-seed, embassytown, little-schemer]]

  (facts "title-length" {:exercise 10
                         :points 1}
    (title-length cities)         => 21
    (title-length wild-seed)      => 9
    (title-length little-schemer) => 18)
  
  (facts "author-count" {:exercise 11
                         :points 1}
    (author-count cities)         => 1
    (author-count wild-seed)      => 1
    (author-count little-schemer) => 2)

  (facts "multiple-authors?" {:exercise 12
                              :points 1}
         (multiple-authors? cities)         => false
         (multiple-authors? wild-seed)      => false
         (multiple-authors? little-schemer) => true)
  
  (facts "add-author" {:exercise 13
                       :points 1}
    (add-author little-schemer {:name "Gerald J. Sussman"})
      => {:title "The Little Schemer"
          :authors [{:birth-year 1944, :name "Daniel Friedman"}
                    {:name "Matthias Felleisen"}
                    {:name "Gerald J. Sussman"}]}
    (add-author {:authors [{:name "Juhana"}]} {:name "Jani"})
      => {:authors [{:name "Juhana"} {:name "Jani"}]})
  
  (facts "alive?" {:exercise 14
                   :points 1}
    (alive? china)   => true
    (alive? octavia) => false)
  
  (facts "element-lengths" {:exercise 15
                            :points 1}
    (element-lengths ["foo" "bar" "" "quux"])  => [3 3 0 4]
    (element-lengths ["x" [:a :b :c] {:y 42}]) => [1 3 1])
  
  (facts "second-elements" {:exercise 16
                            :points 1}
    (second-elements [[1 2] [2 3] [3 4]])               => [2 3 4]
    (second-elements [[1 2 3 4] [1] ["a" "s" "d" "f"]]) => [2 nil "s"])
  
  (facts "titles" {:exercise 17
                   :points 1}
    (titles [cities]) => ["The City and the City"]
    (titles books)    => (just ["The City and the City"
                                "Wild Seed"
                                "Embassytown"
                                "The Little Schemer"]
                               :in-any-order)))

(facts "stars" {:exercise 18
                :points 1}
  (stars 1) => "*"
  (stars 7) => "*******"
  (stars 3) => "***")

(facts "monotonic?" {:exercise 19
                     :points 1}
       (monotonic? [1 2 3])     => true
       (monotonic? [0 1 10 11]) => true
       (monotonic? [3 2 0 -3])  => true
       (monotonic? [3 2 2])     => true
       (monotonic? [1 2 1 0])   => false)

(facts "toggle" {:exercise 20
                 :points 1}
  (toggle #{:a :b :c} :d) => #{:a :b :c :d}
  (toggle #{:a :b :c} :a) => #{:b :c})

(facts "contains-duplicates?" {:exercise 21
                               :points 1}
  (contains-duplicates? [1 1 2 3 -40])   => true
  (contains-duplicates? [1 2 2 3 -40])   => true
  (contains-duplicates? [1 2 3 -40])     => false
  (contains-duplicates? [1 2 3 "a" "a"]) => true)

(facts "old-book->new-book" {:exercise 22
                             :points 1}
  (old-book->new-book {:title "The Little Schemer"
                       :authors [friedman, felleisen]})
    => {:title "The Little Schemer" :authors #{friedman, felleisen}}
  (old-book->new-book {:title "Wild Seed", :authors [octavia]})
    => {:title "Wild Seed", :authors #{octavia}}
  (old-book->new-book
    {:awards ["Hugo" "World Fantasy Award" "Arthur C. Clarke Award"
              "British Science Fiction Award"]
     :title "The City and the City"
     :authors [{:birth-year 1972, :name "China Miéville"}]})
    => {:awards ["Hugo" "World Fantasy Award" "Arthur C. Clarke Award"
                 "British Science Fiction Award"]
        :title "The City and the City"
        :authors #{{:birth-year 1972, :name "China Miéville"}}})


(let [china {:name "China Miéville", :birth-year 1972}
      octavia {:name "Octavia E. Butler"
               :birth-year 1947
               :death-year 2006}
      friedman {:name "Daniel Friedman" :birth-year 1944}
      felleisen {:name "Matthias Felleisen"}
      jrrtolkien {:name "J. R. R. Tolkien" :birth-year 1892 :death-year 1973}
      christopher {:name "Christopher Tolkien" :birth-year 1924}
      kay {:name "Guy Gavriel Kay" :birth-year 1954}
      dick {:name "Philip K. Dick", :birth-year 1928, :death-year 1982}
      zelazny {:name "Roger Zelazny", :birth-year 1937, :death-year 1995}

      authors-set #{china, felleisen, octavia, friedman}

      cities {:title "The City and the City" :authors #{china}}
      wild-seed {:title "Wild Seed", :authors #{octavia}}
      embassytown {:title "Embassytown", :authors #{china}}
      little-schemer {:title "The Little Schemer"
                     :authors #{friedman, felleisen}}
      silmarillion {:title "Silmarillion"
                    :authors #{jrrtolkien, christopher, kay}}
      deus-irae {:title "Deus Irae", :authors #{dick, zelazny}}

      books [cities, wild-seed, embassytown, little-schemer]]

  (facts "has-author?" {:exercise 23
                        :points 1}
    (has-author? cities china)             => true
    (has-author? cities felleisen)         => false
    (has-author? little-schemer felleisen) => true
    (has-author? little-schemer friedman)  => true
    (has-author? little-schemer octavia)   => false)

  (facts "authors" {:exercise 24
                    :points 1}
    (authors [cities, wild-seed])              => #{china, octavia}
    (authors [cities, wild-seed, embassytown]) => #{china, octavia}
    (authors [little-schemer, cities])         => #{china, friedman, felleisen})

  (facts "all-author-names" {:exercise 25
                             :points 1}
    (all-author-names []) => #{}
    (all-author-names [cities, wild-seed])
      => #{"China Miéville" "Octavia E. Butler"}
    (all-author-names books)
      => #{"Matthias Felleisen" "China Miéville"
           "Octavia E. Butler" "Daniel Friedman"})

  (facts "author->string" {:exercise 26
                           :points 1}
    (author->string felleisen) => "Matthias Felleisen"
    (author->string friedman)  => "Daniel Friedman (1944 - )"
    (author->string octavia)   => "Octavia E. Butler (1947 - 2006)")

  (facts "authors->string" {:exercise 27
                            :points 1}
    (authors->string (:authors little-schemer))
         => (every-checker (contains "Daniel Friedman (1944 - )")
                           (contains "Matthias Felleisen")
                           (contains ", "))
    (authors->string #{octavia})                => "Octavia E. Butler (1947 - 2006)"
    (authors->string #{})                       => ""
    (authors->string #{octavia, friedman})
        => (every-checker (contains "Octavia E. Butler (1947 - 2006)")
                          (contains "Daniel Friedman (1944 - )")
                          (contains ", ")))

  (facts "book->string" {:exercise 28
                         :points 1}
         (book->string wild-seed)
         => "Wild Seed, written by Octavia E. Butler (1947 - 2006)"
    (book->string little-schemer)
      => (every-checker (has-prefix "The Little Schemer, written by ")
                        (has-suffix #"Daniel Friedman \(1944 - \), Matthias Felleisen|Matthias Felleisen, Daniel Friedman \(1944 - \)")))

  (facts "books->string" {:exercise 29
                          :points 1}
    (books->string []) => "No books."
    (books->string [cities])
      => "1 book. The City and the City, written by China Miéville (1972 - )."
    (books->string [little-schemer, cities, wild-seed])
      => #"3 books. The Little Schemer, written by (Daniel Friedman \(1944 - \), Matthias Felleisen|Matthias Felleisen, Daniel Friedman \(1944 - \)). The City and the City, written by China Miéville \(1972 - \). Wild Seed, written by Octavia E. Butler \(1947 - 2006\).")

  (facts "books-by-author" {:exercise 30
                            :points 1}
    (books-by-author china books)   => (just [cities embassytown])
    (books-by-author octavia books) => (just [wild-seed]))

  (facts "author-by-name" {:exercise 31
                           :points 1}
    (author-by-name "Octavia E. Butler" authors-set)            => octavia
    (author-by-name "Octavia E. Butler" #{felleisen, friedman}) => nil
    (author-by-name "China Miéville" authors-set)               => china
    (author-by-name "Goerge R. R. Martin" authors-set)          => nil)

  (facts "living-authors" {:exercise 32
                           :points 1}
    (living-authors authors-set)         => (just #{china, felleisen, friedman})
    (living-authors #{octavia})          => (just #{})
    (living-authors #{china, felleisen}) => (just #{china, felleisen}))

  (facts "has-a-living-author?" {:exercise 33
                                 :points 1}
    (has-a-living-author? wild-seed)      => false
    (has-a-living-author? silmarillion)   => true
    (has-a-living-author? little-schemer) => true
    (has-a-living-author? cities)         => true
    (has-a-living-author? deus-irae)      => false)
  
  (facts "books-by-living-authors" {:exercise 34
                                    :points 1}
    (books-by-living-authors books) => (just #{little-schemer cities embassytown})
    (books-by-living-authors (concat books [deus-irae, silmarillion]))
    => (just #{little-schemer cities embassytown silmarillion})))
