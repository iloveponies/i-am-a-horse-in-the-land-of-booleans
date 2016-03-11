(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (nil? x)
    false
    (not (false? x))))

(defn abs [x]
  (if (< x 0)
    (- x)
    x))

(defn divides? [divisor n]
  (= (mod n divisor) 0))

(defn fizzbuzz [n]
  (cond
    (= (mod n 15) 0) "gotcha!"
    (= (mod n 3) 0) "fizz"
    (= (mod n 5) 0) "buzz"
    :else           ""
       ))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (empty? x) nil
    (vector? x) (generic-doublificate (count x))
    (list? x) (generic-doublificate (count x))
    :else true
            ))

(defn leap-year? [year]
  (or
    (= (mod year 400) 0)
    (and
      (= (mod year 4) 0)
      (not (= (mod year 100) 0))
    )
  ))

; '_______'
