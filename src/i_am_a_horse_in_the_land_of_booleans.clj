(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x
    true
    false
    ))

(defn abs [x]
  (if (> 0 x)
    (- x)
    x))

(defn divides? [divisor n]
  (= (mod n divisor) 0))

(defn fizzbuzz [n]
  (if (divides? 15 n)
    "gotcha!"
    (if (divides? 3 n)
      "fizz"
      (if (divides? 5 n)
        "buzz"
        ""))
    ))

(defn teen? [age]
  (> 20 age 12))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (if (number? x)
    (* x 2)
    (if (empty? x)
      nil
      (if (or (vector? x)
              (list? x))
          (* 2 (count x))
        true))))

(defn leap-year? [year]
  (and (divides? 4 year)
       (or (not (divides? 100 year))
            (divides? 400 year))))

; '_______'
