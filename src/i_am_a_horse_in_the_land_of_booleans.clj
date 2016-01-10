(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs "Absolute val" [val]
  (if (< val 0)
    (- val)
    val))

(defn divides? "Does DIVISOR divide N?" [divisor n]
  (= 0 (mod n divisor)))

(defn fizzbuzz "Fizzbuzz test" [n]
  (cond
   (= 0 (mod n 15)) "gotcha!"
   (= 0 (mod n 3)) "fizz"
   (= 0 (mod n 5)) "buzz"
   :else ""))

(defn teen? "Is AGE a teenager?" [age] (< 12 age 20))

(defn not-teen? [age] (not (teen? age)))

(defn generic-doublificate "exercise 6" [x]
  (cond
   (number? x) (* 2 x)
   (empty? x) nil
   (or (list? x) (vector? x)) (* 2 (count x))
   :else true))

(defn leap-year? [year]
  (or (= 0 (mod year 400))
      (and (= 0 (mod year 4))
           (not (= 0 (mod year 100))))))


; '_______'
