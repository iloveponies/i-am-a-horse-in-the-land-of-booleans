(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
	(if x true false)
)

(defn abs [x]
	(if (< x 0) (- x) x)
)

(defn divides? [divisor n]
	(= (mod n divisor) 0)
)

(defn fizzbuzz [n]
	(cond
		(= (mod n 15) 0) "gotcha!"
		(= (mod n 3) 0) "fizz"
		(= (mod n 5) 0) "buzz"
		:else ""
	)
)

(defn teen? [age]
	(<= 13 age 19)
)

(defn not-teen? [age]
	(or (< age 13) (< 19 age))
)

(defn generic-doublificate [x]
	(cond
		(number? x) (* 2 x)
		(empty? x) nil
		(or (list? x) (vector? x)) (* 2 (count x))
		:else true
	)
)

(defn leap-year? [year]
	(if (= (mod year 100) 0) (= (mod year 400) 0) (= (mod year 4) 0))
)

; '_______'
