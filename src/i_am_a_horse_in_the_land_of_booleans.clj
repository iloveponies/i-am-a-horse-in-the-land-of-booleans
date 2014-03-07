(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (nil? x) (= x false)) false true))

(defn abs [x]
  (if (< 0 x) x (- x)))

(defn divides? [divisor n]
  (= (mod n divisor) 0))

(defn fizzbuzz [n]
  (cond
	(divides? 15 n) "gotcha!"
	(divides? 3 n) "fizz"
	(divides? 5 n) "buzz"
	:else ""))

(defn teen? [age]
  (< 12 age 20))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (if (number? x) (* 2 x)
	(if (empty? x) nil
		(if (vector? x) (* 2 (count x))
			(if (list? x) (* 2 (count x)) true)))))
		

(defn leap-year? [year]
  (if (divides? 400 year) true
        (if (divides? 100 year) false 
          (if (divides? 4 year) true false))))

; '_______'
