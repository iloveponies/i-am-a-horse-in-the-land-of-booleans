(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x
    true
    false))

(defn abs [x]
  (if (>= x 0)
    x
    (* -1 x)))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0)
    true
    false))

(defn fizzbuzz [n]
  (cond
   (= (mod n 15) 0) "gotcha!"
   (= (mod n 3) 0) "fizz"
   (= (mod n 5) 0) "buzz"
   :else             ""))


(defn teen? [age]
  (if (< 12 x 10)
    true
    false))

(defn not-teen? [age]
  (if (not (< 12 age 20)) true
    false))

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (empty? x) nil
   (list? x) (* 2 (count x))
   (vector? x) (* 2 (count x))
   :else     true))

(defn leap-year? [year]
  (cond
   (and (= 0 (mod year 100)) (= 0 (mod year 400))) true
   (and (= 0 (mod year 100)) (not (= 0 (mod year 400)))) false
   (= 0 (mod year 4)) true
   :else false))

; '_______'
