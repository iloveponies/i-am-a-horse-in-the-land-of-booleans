(ns i-am-a-horse-in-the-land-of-booleans)

(defn my-boolean [x]
  (if (= nil x) false (if (= false x) false true))
  )

(defn abs [x]
  (if (< x 0) (* -1 x) x))

(defn divides? [divisor n]
  (if (= 0 (mod n divisor)) true false))

(defn fizzbuzz [n]
  (cond
  	(divides? 15 n) "gotcha!"
   	(divides? 5 n) "buzz"
   	(divides? 3 n) "fizz"
   	:else ""))

(defn teen? [age]
  (if (< 12 age 20) true false))

(defn not-teen? [age]
  (cond 
  	(> age 19) true
   	(< age 13) true
   	:else false))

(defn generic-doublificate [x]
  (cond 
   	(number? x) (* x 2)
   	(empty? x) nil
   	(list? x) (* (count x) 2)
   	(vector? x) (* (count x) 2)
   	:else true))

(defn leap-year? [year]
  (if (divides? 4 year) 
    (if (divides? 100 year) 
      (if (divides? 400 year) true false)
      true)
    false))