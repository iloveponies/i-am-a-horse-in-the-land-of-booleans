(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (>= x 0) x (- x)))

(defn divides? [divisor n]
  (if (==(mod n divisor) 0) true false))

(defn fizzbuzz [n]
  (cond
   (not (==(mod n 15) 0))
     (cond
        (==(mod n 3) 0) "fizz"
        (==(mod n 5) 0) "buzz"
        :else ""
      )
    (==(mod n 15) 0) "gotcha!"
    :else ""))

(defn teen? [age]
  (and (<= 13 age) (<= age 19)))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
     (number? x) (+ x x)
     (empty? x) nil
     (list? x) (* (count x) 2)
     (vector? x) (* (count x) 2)
     :else true))

(defn leap-year? [year]
  (cond
     ;(not (number? (mod year 4))) false
     ;(and (number? (mod year 100)) (not (number? (mod year 400)))) false
     ;(not (number? (mod year 400))) false
     (== (mod year 400) 0) true
     (== (mod year 100) 0) false
     (== (mod year 4) 0) true
     :else false ))

; '_______'
