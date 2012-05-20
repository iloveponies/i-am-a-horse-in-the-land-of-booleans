(ns i-am-a-horse-in-the-land-of-booleans-test
  (:use [i-am-a-horse-in-the-land-of-booleans-test
         midje.sweet]))

(facts "abs"
  (abs -2) => 2
  (abs 42) => 42)

(facts "fizzbuzz"
  (fizzbuzz 45) => "gotcha!"
  (fizzbuzz 48) => "fizz"
  (fizzbuzz 70) => "buzz")
