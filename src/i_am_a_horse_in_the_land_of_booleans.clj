(ns i-am-a-horse-in-the-land-of-booleans)

(defn my-boolean [x]
  (if (or (= x false) (= x nil))
    false
    true)
  )

(defn abs [x]
  (if (< 0 x)
    x
    (* x -1))
  )

(defn divides? [divisor n]
  (if (= (mod n divisor) 0)
    true
    false))

(defn fizzbuzz [n]
  (cond
   (divides? 15 n) "gotcha!"
   (divides? 5 n) "buzz"
   (divides? 3 n) "fizz"
   :else "")
  )

(defn teen? [age]
  (if (< 12 age 20)
	true
    false
    ))

(defn not-teen? [age]
  (not(teen? age))
  )

(defn generic-doublificate [x]
  (cond 
   (number? x) (* 2 x)
   (empty? x) nil
   (or (list? x) (vector? x)) (for [y x](* y 2))
   :else true
   )
  )

(defn leap-year? [year]
  (cond
   (divides? 400 year) true
   (and (divides? 4 year) (not (divides? 100 year))) true
   :else false)
  )