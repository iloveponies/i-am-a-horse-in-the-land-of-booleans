(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (cond
    (= "foo" x) true
    (= nil x) false
    (= (+ 2 3) x) true
    (= true x) true
    (= false x) false 
    ) 
  )

(defn abs [x]
  (if (< x 0) (- x) x)
  )

(defn divides? [divisor n]
  (= 0 (mod n divisor)))

(defn fizzbuzz [n]
  (cond 
    (divides? 15 n) "gotcha!"
    (divides? 3 n) "fizz"
    (divides? 5 n) "buzz"
    :else ""
    )
  )

(defn teen? [age]
  (cond
    (and (>= age 13) (<= age 19)) true
    :else false))

(defn not-teen? [age]
  (cond
    (or (< age 13) (> age 19)) true
    :else false))

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (list? x) (* 2 (count x))
    (vector? x) (* 2 (count x))
    :else true
    )
  )

(defn leap-year? [year]
  (cond 
    (and (= 0 (mod year 4)) (not= 0 (mod year 100))) true
    (= 0 (mod year 400)) true
    :else false
    )
  )

; '_______'
