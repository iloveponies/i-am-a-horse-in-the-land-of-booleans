(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x] (if (= x nil) false (if (= x false) false true)))

(defn abs [x] (if (> x 0) x (* x -1)))

(defn divides? [divisor n] (if (= 0 (mod n divisor)) true false))

(defn fizzbuzz [n] (cond (= 0 (mod n 15)) "gotcha!"
                         (= 0 (mod n 5)) "buzz"
                         (= 0 (mod n 3)) "fizz"
                         :else ""))

(defn teen? [age] (if (<= 13 age 19) true false))

(defn not-teen? [age] (not (teen? age)))

(defn generic-doublificate [x] (cond
                                 (number? x) (* 2 x)
                                 (empty? x) nil
                                 (list? x) (* 2 (count x))
                                 (vector? x) (* 2 (count x))
                                 :else true))


(defn leap-year? [year] (cond
                               (= 0 (mod year 400)) true
                               (= 0 (mod year 100)) false
                               (= 0 (mod year 4)) true
                               :else false))
; '_______'

(teen? 15)

(abs -3)

(divides? 2 4)

(fizzbuzz 30)

(generic-doublificate '(65 21))

(not-teen? 19)
