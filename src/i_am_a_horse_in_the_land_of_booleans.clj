(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
 (if x true false))

(defn abs [x]
  (if (< x 0) (* x -1) x))

(defn divides? [divisor n]
 (if ((== mod n divisor) 0)
  true
  false))

(defn fizzbuzz [n]
  (if (divides? 15 n)
    "gotcha!"
    (if (divides? 3 n)
      "fizz"
      (if (divides? 5 n)
         "buzz"
         ""))))


(defn teen? [age]
  (if (and (>= age 13) (<= age 19))
    true
    false))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
    (if (number? x)
        (* x 2)
        (if (empty? x)
            nil
            (if (or (vector? x) (list? x))
                (* 2 (count x))
                true))))

(defn leap-year? [year]
 (if (== (mod year 100) 0)
     (if (== (mod year 400) 0)
         true
         false)
     (if (== (mod year 4) 0)
         true
         false)))


; '_______'
