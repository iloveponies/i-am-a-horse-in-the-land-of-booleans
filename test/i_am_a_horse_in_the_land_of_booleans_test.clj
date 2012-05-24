(ns i-am-a-horse-in-the-land-of-booleans-test
  (:use i-am-a-horse-in-the-land-of-booleans
        midje.sweet))

(facts "abs"
  (abs -2) => 2
  (abs 42) => 42)

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
