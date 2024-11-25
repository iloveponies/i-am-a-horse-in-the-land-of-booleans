(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

 
(defn boolean [x]
  (if x true false))


(defn teen? [age]
  (if (< age 20)
    (if (> age 12)
      true
      false)
    false))

(defn abs [n]
  (if (< 0 n)
    n
    (* n -1)
    ))

(defn divides? [divisor n]
  (if (== divisor 0)
    false
    (if (== (mod n divisor) 0)
      true
      false
      )))

(defn fizzbuzz [n]
  (if (divides? 15 n)
    "gotcha!"
    (if (divides? 5 n)
      "buzz"
      (if (divides? 3 n)
        "fizz"
        ""
        ))))

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (or (list? x) (vector? x)) (* 2 (count x))
    :else true
    ))

(defn not-teen? [age]
  (if (teen? age)
    false
    true
    ))

(defn leap-year? [year]
  (and
   (if (== (mod year 4) 0)
     true
     false)
   (if (== (mod year 100) 0)
     (if (== (mod year 400) 0)
       true
       false)
     true)
   ))

  

; '_______'
