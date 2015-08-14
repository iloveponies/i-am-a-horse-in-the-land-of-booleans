(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (cond
  (= x nil) false
  (= x false) false
  :else true)
)

(defn abs [x]
  (cond
   (< x 0) (- x)
   :else x
   )
)

(defn divides? [divisor n]
  (if (= (mod n divisor) 0)
   true false)
)

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 5 n) "buzz"
    (divides? 3 n) "fizz"
    :else ""
  )
)


(defn teen? [age]
  (cond
   (< age 13) false
   (> age 19) false
   :else true
   )
)

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (empty? x) nil
   (list? x) (* 2 (count x))
   (vector? x) (* 2(count x))
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

; '_______'
