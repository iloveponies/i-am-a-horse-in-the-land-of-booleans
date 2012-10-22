(ns i-am-a-horse-in-the-land-of-booleans)

(defn my-boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0) (* x -1) x))

(defn divides? [divisor n]
  (= 0 (mod n divisor)))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 3 n) "fizz"
    (divides? 5 n) "buzz"
    :else ""
    ))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (coll? x) (cond 
                (empty? x) nil
                (or (list? x) (vector? x)) (map generic-doublificate x)
                :else true)
    :else true))

(defn leap-year? [year]
  (and (divides? 4 year)
       (or (not (divides? 100 year))
           (divides? 400 year))))

; '_______'

