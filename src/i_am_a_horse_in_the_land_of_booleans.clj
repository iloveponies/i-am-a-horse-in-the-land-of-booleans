(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))


(defn boolean
  "This implement the boolean function"
  [x]
  (if (= x nil)
    false
    (if (= x false)
      false
      true
    )
  )
)


(defn abs
  "This returns the absolute value of the given parameter"
  [x]
  (if (< x 0)
    (- 0 x)
    x
  )
)


(defn divides?
  "This tests if d can divides n"
  [d n]
  (if (= (mod n d) 0)
    true
    false
  )
)


(defn fizzbuzz
   "This returns
     'fizz' when n is divisible by 3,
     'buzz' when n is divisible by 5,
     'gotcha!' when n is divisible by 15,
      the empty string '' otherwise."
  [n]
  (cond
     (divides? 15 n) "gotcha!"
     (divides? 5 n) "buzz"
     (divides? 3 n) "fizz"
     :else ""
   )
)


(defn teen?
  "This tests if provided parameter is teen age"
  [age]
  (if (<= 13 age 19)
    true
    false
  )
)


(defn not-teen?
  [age]
  (not (teen? age))
)


(defn generic-doublificate
  [x]
  (cond
   (number? x) (* 2 x)
   (empty? x) nil
   (or (list? x) (vector? x)) (* 2 (count x))
   :else true
  )
)


(defn leap-year?
  [year]
  (cond
   (divides? 400 year) true
   (divides? 100 year) false
   (divides? 4   year) true
   :else false
  )
)

; '_______'
