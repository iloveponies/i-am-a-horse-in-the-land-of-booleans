(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))


(boolean "foo")
(boolean nil)
(boolean (+ 2 3))
(boolean true)
(boolean false)

(defn teen? [age]
  (if (<= 13 age 19) true false))
(teen? 12)
(teen? 13)
(teen? 15)
(teen? 19)
(teen? 20)
(teen? 27)

(defn abs [x]
  (if (< x 0) (* x -1) x))
(abs -2)
(abs 42)

(defn divides? [divisor n]
  (if (== (mod n divisor) 0) true false) )
(divides? 2 4)
(divides? 4 2)
(divides? 5 10)
(divides? 2 5)
(defn fizzbuzz [n]
  (cond
    (divides? 15 n)   "gotcha!"
    (divides? 5 n)   "buzz"
    (divides? 3 n)   "fizz"
    :else            ""))
(fizzbuzz 2)
(fizzbuzz 45)
(fizzbuzz 48)
(fizzbuzz 70)


(defn not-teen? [age]
  (not (teen? age)))
(not-teen? 13)

(defn generic-doublificate [x]
  (cond
    (number? x)   (* 2 x)
    (empty? x)   nil
    (list? x)     (* 2 (count x))
    (vector? x)     (* 2 (count x))
    :else          true))

(generic-doublificate 1)
(generic-doublificate [1 2])
(generic-doublificate '(65 21))
(generic-doublificate {})
(generic-doublificate [])
(generic-doublificate {:a 1})

(defn leap-year? [year]
  (and
    (divides? 4 year)
    (or
      (not
        (divides? 100 year))
      (divides? 400 year)
      )
    ))
(leap-year? 1604)

; '_______'
