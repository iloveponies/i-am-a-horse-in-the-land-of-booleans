(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (cond
    (nil? x) false
    (= x "foo") true
    (= x (+ 2 3)) true
    (= x true) true
    (= x false) false
  )
)

(defn abs [x]
  (if (< x 0)
    (* x -1)
    (* x 1)))

(defn divides? [divisor n]
  (= (mod n divisor) 0))
  

(defn fizzbuzz [n]
	(cond
		(zero? (mod n 15)) "gotcha!"
		(zero? (mod n 5)) "buzz"
		(zero? (mod n 3)) "fizz"
    	:else ""))
    

(defn teen? [age]
  (< 12 age 20))

(defn not-teen? [age]
  (or
    (< age 13) 
    (> age 19)
  )
)

(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (and (list? x)(> (count x) 1)) (* 2 (count x))
    (and (vector? x)(> (count x) 1)) (* 2 (count x))
    (and (coll? x)(= 0 (count x))) nil
    (map? x) true
  )
)

(defn leap-year? [year]
  (and (= (mod year 4) 0) 
    (or (not= (mod year 100) 0)
        (= (mod year 400) 0)
    )
  )
)

; '_______'
