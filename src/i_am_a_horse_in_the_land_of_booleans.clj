(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

#(boolean false)


(defn abs [x]
  (if (> x 0) x (- 0 x)))

#(abs -2)

(defn divides? [divisor n]
  (if (== (mod n divisor) 0) true false))

(divides? 3 2)

(defn fizzbuzz [n]
  (cond
  (= (mod n 15) 0) "gotcha!"
  (= (mod n 3) 0) "fizz"
  (= (mod n 5) 0) "buzz"
  :else ""))
(fizzbuzz 30)
(defn teen? [age]
  (< 12 age 20))

#(teen? 20)

(defn not-teen? [age]
  (not (teen? age)))

 (not-teen? 20)

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (vector? x) (* 2(count x))
    (list? x) (* 2 (count x))))

 (not-teen? 20)

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (vector? x) (* 2(count x))
    (list? x) (* 2 (count x))
    :else true))

(generic-doublificate 3)


(defn leap-year? [year]
  (cond
    (= (mod year 400) 0) true
    (= (mod year 100) 0) false
    (= (mod year 4) 0) true
  :else false))

(leap-year? 2000)

; '_______'
