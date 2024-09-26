(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))


(defn abs [x]
  (if (< x 0)
    (* x -1)
    x))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0)
    true
    false))

(defn fizzbuzz [n]
  (if (and  (= (mod n 3) 0) (= (mod n 5) 0))
    "gotcha!"
    (if (= (mod n 5) 0)
      "buzz"
      (if (= (mod n 3) 0)
        "fizz"
        ""))))

(defn teen? [age]
  (< 12 age 20)
  )

(defn not-teen? [age]
  (if (not (teen? age))
    true
    false
    ))

(defn generic-doublificate [x]
  (if (number? x)
    (* 2 x)
    (if (coll? x)
      (if (empty? x)
        nil
        (if (or (list? x) (vector? x))
          (* 2 (count x))
          true)))))

(defn leap-year? [year]
  (if (= (mod year 400) 0)
    true
    (if (= (mod year 100) 0)
      false
      (if (= (mod year 4) 0)
        true
        false))))
