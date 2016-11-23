(ns i-am-a-horse-in-the-land-of-booleans-test
  (:use i-am-a-horse-in-the-land-of-booleans
        iloveponies.tests.i-am-a-horse-in-the-land-of-booleans
        midje.sweet))

(facts "generic-doublificate (additional)"
  (generic-doublificate nil) => nil)