(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (nil? x) (false? x))
    false    
    true))

(defn abs [x]
  (if (< x 0)
    (* x -1)
    x))

(defn divides? [divisor n]
  (if (= 0 (mod n divisor))
    true
    false))

(defn fizzbuzz [n]
  (cond
    (= 0 (mod n 15)) "gotcha!"
     (= 0 (mod n 5)) "buzz"
     (= 0 (mod n 3)) "fizz"
     :else "")
     )

(defn teen? [age]
  (and (>= age 13) (<= age 19)))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x) (* x 2)
   (empty? x) nil
   (list? x) (* 2 (count x))
   (vector? x) (* 2 (count x))
   "else" true
   ))

(defn leap-year? [year]
  (if (and (= 0 (mod year 4))
           (not (= 0 (mod year 100))))
    true
    (if (= 0 (mod year 400))
      true
      false))
  )



; '_______'
