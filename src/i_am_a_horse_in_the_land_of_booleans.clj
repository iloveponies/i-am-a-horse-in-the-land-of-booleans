(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
	(if (= x nil) false
		(if (= x false) false true
		)
	)
)

(defn abs [x]
	(if (> x 0) x (- x)
	)
)

(defn divides? [divisor n]
	(if (= (mod n divisor) 0) true
	false
	)
)

(defn fizzbuzz [n]
	(cond
    (divides? 15 n) "gotcha!"
	  (divides? 3 n) "fizz"
	  (divides? 5 n) "buzz"
	  :else ""
	)
)

(defn teen? [age]
	(if (>= 19 age 13) true
    false
	)
)

(defn not-teen? [age]
	(not (teen? age))
)

(defn generic-doublificate [n]
	(cond
	  (number? n) (* n 2)
	  (empty? n) nil
	  (list? n) (* (count n) 2)
	  (vector? n) (* (count n) 2)
	  :else true
  )
)

(defn leap-year? [year]
	(cond
		(zero? (mod year 400)) true
    (zero? (mod year 100)) false
    (zero? (mod year 4)) true
   :default false
	)
)

; '_______'
