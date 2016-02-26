(ns iloveponies.tests.i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean])
  (:use i-am-a-horse-in-the-land-of-booleans
        midje.sweet))

(facts "boolean" {:exercise 1
                  :points 1}
  (boolean "foo") => true
  (boolean nil) => false
  (boolean (+ 2 3)) => true
  (boolean true) => true
  (boolean false) => false)

(facts "teen?" {:exercise 2
                :points 1}
  (teen? 12) => false
  (teen? 15) => true
  (teen? 13) => true
  (teen? 19) => true
  (teen? 20) => false
  (teen? 27) => false)

(facts "abs" {:exercise 3
              :points 1}
  (abs -2) => 2
  (abs 42) => 42)

(facts "divides?" {:exercise 4
                   :points 1}
       (divides? 2 4) => true
       (divides? 4 2) => false
       (divides? 5 10) => true
       (divides? 2 5) => false)

(facts "fizzbuzz" {:exercise 5
                   :points 1}
  (fizzbuzz 2) => ""
  (fizzbuzz 45) => "gotcha!"
  (fizzbuzz 48) => "fizz"
  (fizzbuzz 70) => "buzz")

(facts "generic-doublificate" {:exercise 6
                               :points 1}
  (generic-doublificate 1)        => 2
  (generic-doublificate [1 2])    => 4
  (generic-doublificate '(65 21)) => 4
  (generic-doublificate {})       => nil
  (generic-doublificate [])       => nil
  (generic-doublificate {:a 1})   => true)

(facts "not-teen?" {:exercise 7
                    :points 1}
  (not-teen? 13) => false
  (not-teen? 25) => true
  (not-teen? 12) => true
  (not-teen? 19) => false
  (not-teen? 20) => true)

(tabular "leap-year?" {:exercise 8
                       :points 1}
  (fact
    (leap-year? ?year) => ?expected)
    ?year   ?expected
    100     false
    200     false
    400     true
    800     true
    2000    true
    2200    false
    12      true
    20      true
    15      false
    1913    false)
