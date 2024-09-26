(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false)
  )

(defn sign [x]
  (if (< x 0)
    "-"
    "+"))


(defn abs [x]
  (if (< x 0)
        (* -1 x)
        x
  ))

(defn divides? [divisor n]
  (== (mod n divisor) 0)
)

(defn fizzbuzz [n]
  (cond
    (==(mod n 15) 0) "gotcha!"
    (==(mod n 5) 0) "buzz"
    (==(mod n 3) 0) "fizz"
    :else         ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
	(if (teen? age)
	false
	true
	))

(defn generic-doublificate [x]
   (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (or (list? x) (vector? x)) (* 2 (count x))
    :else         true))

(defn leap-year? [year]
  (and
   (divides? 4 year)
   (or (not(divides? 100 year))
   (divides? 400 year))
))


; '_______'
