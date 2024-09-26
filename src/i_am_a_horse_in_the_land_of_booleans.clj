(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean "This is the implementation of boolean !" [x]

  (cond
    (= x false) false
    (= x nil) false
    :else true
    )
  )

(defn abs "Finding the absolute values !" [x]

  (cond (neg? x) (- x)
   :else x)
  )

(defn divides? "Implementation of Divisor !" [divisor n]
(if (== (mod n divisor) 0)
      true
      false)
)

(defn fizzbuzz "This will find if it is fizz or buzz or gotcha !" [n]
  (cond
    (== (mod n 15) 0) "gotcha!"
    (== (mod n 5) 0) "buzz"
    (== (mod n 3) 0) "fizz"
    :else "")
  )

(defn teen? "This will find if a given peron is teen aged or not !" [age]
 (<= 13 age 19)
  )

(defn not-teen? [age]
    (cond
      (== (or 13) age) false
      (== (or 19) age) false
      :else true )
    )

(defn generic-doublificate "This is generic generic-doublificate !" [x]
  (cond
    (number? x) (+ x x)
    (empty? x) nil
    (list? x) (+ (count x)(count x))
    (vector? x) (+ (count x) (count x))
    :else true)
  )

(defn leap-year? "This is to find if an year is leap or not !" [year]
  (cond
    (not= (mod year 4) 0) false
    (not= (mod year 100) 0) true
    (not= (mod year 400) 0) false
    :else true)
  )

; '_______'
