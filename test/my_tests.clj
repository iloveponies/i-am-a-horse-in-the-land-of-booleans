(ns my-tests
  (:refer-clojure :exclude [boolean])
  (:use
    midje.sweet
    i-am-a-horse-in-the-land-of-booleans)
)

  (fact "boolean"
    (boolean []) => true
    (boolean false) => false
    (boolean nil) => false
    (boolean "") => true
  )

  (fact "abs"
    (abs -1) => 1
    (abs 1) => 1
    (abs 0) => 0
  )

  (fact "divides?"
    (divides? 1 2) => true
    (divides? 2 4) => true
    (divides? 2 1) => false
    (divides? 5 10) => true
  )

  (fact "teen?"
    (teen? 12) => false
    (teen? 13) => true
    (teen? 19) => true
    (teen? 20) => false
  )

  (fact "not-teen?"
    (not-teen? 12) => true
    (not-teen? 13) => false
    (not-teen? 19) => false
    (not-teen? 20) => true
  )

  (fact "fizzbuzz"
    (fizzbuzz 2) => ""
    (fizzbuzz 3) => "fizz"
    (fizzbuzz 48) => "fizz"
    (fizzbuzz 70) => "buzz"
    (fizzbuzz 45) => "gotcha!"
    (fizzbuzz 5) => "buzz"
  )

  (fact "generic-doublificate"
    (generic-doublificate 1)        => 2
    (generic-doublificate [1 2])    => 4
    (generic-doublificate '(65 21)) => 4
    (generic-doublificate {})       => nil
    (generic-doublificate [])       => nil
    (generic-doublificate {:a 1})   => true
  )

  (fact "leap-year?"
    (leap-year? 100) => false
    (leap-year? 200) => false
    (leap-year? 400) => true
    (leap-year? 12)  => true
    (leap-year? 20)  => true
    (leap-year? 15)  => false
  )


