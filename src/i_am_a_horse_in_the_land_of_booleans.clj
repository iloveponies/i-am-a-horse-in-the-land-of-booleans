(ns i-am-a-horse-in-the-land-of-booleans)

(defn my-boolean [x]
  (if x true false)
)

(defn abs [x]
  (if (< x 0)
    (- x)
    x
  )
)

(defn divides? [divisor n]
  (== 0 (mod n divisor))
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
  (<= 13 age 19)
)

(defn not-teen? [age]
  (not (teen? age))
)

(defn generic-doublificate [x]
	(cond
     (number? x) (+ x x)
	 (list? x) 
	 (vector? x) 
     (empty? x) nil
     :else true
	)
)

(defn leap-year? [year]
  (cond 
     (divides? 400 year) true
     (divides? 100 year) false
     (divides? 4 year) true
     :else false
  )
)