(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
      (cond (= x false) false
      (= x nil) false
      :else true))

(defn abs [x]
  (if (>= x 0) x (- x)))

(defn divides? [divisor n]
  (= (mod n divisor) 0))

(defn fizzbuzz [n]
	  (if 
	  	  (divides? 15 n)
		  "gotcha!"
		  (cond (divides? 3 n) "fizz"
		  		(divides? 5 n) "buzz"
		  		:else ""
			)
		)
)

(defn teen? [age]
  (if (<= 13 age 19) true false))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
	  (if (number? x)
				(* 2 x)
				(if (empty? x)
						nil
						(if (vector? x)
								(* 2 (count x))
								(if (list? x)
										(* 2 (count x))
										true
								)
						)
				)
		)
)
				
(defn leap-year? [year]
		(or (= (mod year 400) 0)
				(and (not (= (mod year 100) 0))
						 (= (mod year 4) 0)
				)
		)
)

; '_______'
