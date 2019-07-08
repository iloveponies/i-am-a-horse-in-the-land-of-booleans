(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (cond
   (nil? x) false
   (false? x) false
   :else true))

(defn abs [x]
  (if (< x 0) (* -1 x) x))

(defn divides? [divisor n]
  (if (= 0 (mod n divisor)) true false))

(defn fizzbuzz [n]
  (cond
   (and (divides? 3 n) (divides? 5 n)) "gotcha!"
   (divides? 3 n) "fizz"
   (divides? 5 n) "buzz"
   :else ""))

(defn teen? "returns truthy if age is at least 13 and at most 19. " [age]
  (>= 19 age 13))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  "takes one argument and
  doubles it if it is a number,
  returns nil if it is an empty collection,
  if it is a list or a vector, returns two times the length of it
  returns true otherwise."
  (cond
   (number? x) (* x 2)
   (empty? x) nil
   (or (list? x) (vector? x)) (* 2 (count x))
   :else true
   ))

(defn leap-year? [year]
  (cond
   (divides? 4 year) (cond
                      (divides? 100 year) (divides? 400 year)
                      :else true)
   :else false))

; '_______'
