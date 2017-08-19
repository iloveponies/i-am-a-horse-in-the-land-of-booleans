(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean "Check boolean value." [value] (if value true false))

(defn abs [value] (if (< value 0) (- value) value))

(defn divides? [divisor n] (if (== (mod n divisor) 0) true false))

(defn fizzbuzz [n] (cond (divides? 15 n) "gotcha!" (divides? 3 n) "fizz" (divides? 5 n) "buzz" :else ""))

(defn teen? "Check age" [value] (<= 13 value 19))

(defn not-teen? [age] (not (<= 13 age 19)))

(defn generic-doublificate [x] (cond
                                 (number? x) (* x 2)
                                 (empty? x) nil
                                 (list? x) (* (count x) 2)
                                 (vector? x) (* (count x) 2)
                                 :else true))

(defn leap-year? [year] (cond
                          (> (mod year 4) 0) false
                          (> (mod year 100) 0) true
                          (> (mod year 400) 0) false
                          :else true))

; '_______'
