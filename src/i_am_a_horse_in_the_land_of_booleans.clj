(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
	(try
		(if (neg? x) (* -1 x) x)
		(catch Exception e (str "caught exception: " (.getMessage e)))))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0)
		true
		false))

(defn fizzbuzz [n]
  (cond
		(= 0 (mod n 15)) "gotcha!"
		(= 0 (mod n 3)) "fizz"
		(= 0 (mod n 5)) "buzz"
		:else ""))

(defn teen? [age]
  (if (<= 13 age 19) true false))

(defn not-teen? [age]
  (if-not (<= 13 age 19) true false))

(defn generic-doublificate [x]
  (cond
		(number? x) (* 2 x)
		(empty? x) nil
		(list? x) (* 2 (count x))
		(vector? x) (* 2 (count x))
		:else true))

(defn leap-year? [year]
  (cond
		(= 0 (mod year 400)) true
		(= 0 (mod year 100)) false
		(= 0 (mod year 4)) true
		:else false))

; '_______'
