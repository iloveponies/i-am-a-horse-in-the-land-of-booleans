(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
	(cond
		(nil? x) false
		(false? x) false
		:else true
		) 
  )

(defn abs [x]
  (cond
  	(pos? x) x
  	(neg? x) (- x x x)
  )
)

(defn divides? [divisor n]
  (= 0 (mod n divisor))
 )

(defn fizzbuzz [n]
	(cond
    (divides? 15 n) "gotcha!"
    (divides? 3 n) "fizz"
    (divides? 5 n) "buzz"
    :else "")
    )


(defn teen? [age]
  (<= 13 age 19)
)

(defn not-teen? [age]
	(if-not (teen? age) true false) 
)

(defn generic-doublificate [x]
	(cond
		(number? x) (* x 2)
		(empty? x) nil
		(list? x) (* 2 (count x))
		(vector? x) (* 2 (count x))
		:else true

	)
)

(defn leap-year? [year]
  (and (divides? 4 year) (or (not (divides? 100 year)) (divides? 400 year)))
)
