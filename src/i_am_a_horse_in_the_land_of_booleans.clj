(ns i-am-a-horse-in-the-land-of-booleans)

(defn my-boolean [x]
	(if x true false)
) ;1

(defn abs [x]
	(if (> x 0) x (* x -1) )
) ;2

(defn divides? [divisor n]
	(if (= (mod n divisor) 0) true false )
) ;3

(defn fizzbuzz [n]
	(cond
	 (divides? 15 n) "gotcha!"
	 (divides? 5 n) "buzz"	 
	 (divides? 3 n) "fizz"
	 :else ""
	)  
) ;4

(defn teen? [age] 
	(if (> age 12) 
	  (if (< age 20) 
		true false)
	  false)
) ;5

(defn not-teen? [age]
	(if (not (teen? age)) true false)
) ;6

(defn generic-doublificate [x]
	(cond
	 (number? x) (* 2 x)
	 (empty? x) nil
	 (list? x) (* 2 (count x))
	 (vector? x) (* 2 (count x))
	 :else true
	)
) ;7

(defn leap-year? [year]
	(cond
	 (= (mod year 400) 0) true
	 (= (mod year 100) 0) false
	 (= (mod year 4) 0) true
	 :else false
	)
) ;8

; '_______'
