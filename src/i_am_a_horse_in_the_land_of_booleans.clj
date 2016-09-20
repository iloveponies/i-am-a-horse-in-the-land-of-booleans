(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x] (max x (- x)))

(defn divides? [divisor n]
  (if (== 0 (mod n divisor))true false))

(defn fizzbuzz [n]
  (cond
    (== 0(mod n 15)) "gotcha!"
    (== 0(mod n 3)) "fizz"
    (== 0(mod n 5)) "buzz"
    :else ""))

(defn teen? [age]
  (if (< 12 age 20)true false))

(defn not-teen? [age]
  (or (< age 13) (> age 19) ))

(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (empty? x) nil
    (list? x) (*(count x)2)
    (vector? x) (*(count x)2)
    :else true
    ))

(defn leap-year? [year]
  (cond
    (== 0 (mod year 400)) true
    (== 0 (mod year 100)) false
    (== 0 (mod year 4)) true
    :else false
    ))

; '_______'

(leap-year? 200)

(divides? 2 4)

(mod 45 15)
(mod 15 45)

(generic-doublificate 1)
(generic-doublificate [1 2])
(generic-doublificate [])
(generic-doublificate {})
(generic-doublificate {:a 1})
(generic-doublificate '(65 21))


(not-teen? 12)

(mod 100 400)

