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
  (teen? 27) => false)
