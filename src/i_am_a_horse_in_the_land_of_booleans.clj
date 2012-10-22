(ns i-am-a-horse-in-the-land-of-booleans)

(defn 
  my-boolean 
  "Copies the functionality of the built in boolean"
  [x]
  (if x true false)
)

(defn abs [x]
  (*(if (< x 0) -1 1) x)
)

(defn 
  divides? 
  "Returns True if divisor divides n"
  [divisor n]
  (if (== (mod n divisor) 0) true false)
)

(defn fizzbuzz [n]
  (cond
     (divides? 15 n) "gotcha!"
     (divides? 3 n) "fizz"
     (divides? 5 n) "buzz"
     :else ""
  )
)

(defn 
  teen? 
  "Returns true if the age is between 13 and 19"
  [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age))
)

(defn generic-doublificate [x]
  (cond
     (number? x) (* 2 x)
     (empty? x) nil
     (or (list? x) (vector? x)) (map (fn [y] (* 2 y)) x)
     :else true
   )
)

(defn leap-year? [year]
  (or (divides? 400 year) (and (not (divides? 100 year)) (divides? 4 year)))
)