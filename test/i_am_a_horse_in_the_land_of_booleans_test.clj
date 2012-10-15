(ns i-am-a-horse-in-the-land-of-booleans-test
  (:use i-am-a-horse-in-the-land-of-booleans
        midje.sweet))

(facts "my-boolean"
       (my-boolean "foo") => true
       (my-boolean nil) => false
       (my-boolean (+ 2 3)) => true
       (my-boolean true) => true
       (my-boolean false) => false)

(facts "abs"
  (abs -2) => 2
  (abs 42) => 42)

(facts "divides?"
       (divides? 2 4) => true
       (divides? 4 2) => false
       (divides? 5 10) => true
       (divides? 2 5) => false)

(facts "fizzbuzz"
  (fizzbuzz 2) => ""
  (fizzbuzz 45) => "gotcha!"
  (fizzbuzz 48) => "fizz"
  (fizzbuzz 70) => "buzz")

(facts "teen?"
  (teen? 12) => false
  (teen? 15) => true
  (teen? 13) => true
  (teen? 19) => true
  (teen? 20) => false
  (teen? 27) => false)

(facts "not-teen?"
  (not-teen? 13) => false
  (not-teen? 25) => true
  (not-teen? 12) => true
  (not-teen? 19) => false
  (not-teen? 20) => true)

(facts "generic-doublificate"
  (generic-doublificate 1)        => 2
  (generic-doublificate [1 2])    => [2 4]
  (generic-doublificate '(65 21)) => [130 42]
  (generic-doublificate {})       => nil
  (generic-doublificate [])       => nil
  (generic-doublificate {:a 1})   => true)
