(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (= x nil) (= x false)) false true))

(defn abs [x]
  (Math/abs x))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0) true false))

(defn fizzbuzz [n]
  (cond
    (= (mod n 15) 0) "gotcha!"
    (= (mod n 5) 0) "buzz"
    (= (mod n 3) 0) "fizz"
    :else ""))

(defn teen? [age]
  (let [lower 12
       upper 20]
  (if (and (< age upper) (> age lower)) true false)))

(defn not-teen? [age]
  (let [lower 13
        upper 19]
    (if (or (< age lower) (> age upper)) true false)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (empty? x) nil
    (or (list? x) (vector? x)) (* 2 (count x))
    :else true))

(defn leap-year? [year]
  (let [div-4 (= (mod year 4) 0)
        div-100 (= (mod year 100) 0)
        div-400 (= (mod year 400) 0)]
    (cond (and div-100 div-400) true
          (and div-100 div-4) false
          div-4 true
          :else false)))
; '_______'
