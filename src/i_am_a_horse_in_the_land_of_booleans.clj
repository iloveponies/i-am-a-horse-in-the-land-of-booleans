(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (= x nil) false
    (if (= x false) false true))

  )

(defn abs [x]
   (if (< x 0)
     (- x)
     x
     )
  )

(defn divides? [divisor n]
  (if (= (mod n divisor) 0)
    true
    false
    )
  )


(defn fizzbuzz [n]
  (cond
   (divides? 15 n)  "gotcha!"
   (divides? 5 n)   "buzz"
   (divides? 3 n)   "fizz"
   :else            ""
   )
  )

(defn teen? [age]
   (if (< 12 age 20) true false)
  )

(defn not-teen? [age]
  (not (teen? age))
  )

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (empty? x) nil
   (list? x) (* 2 (count x))
   (vector? x) (* 2 (count x))
   :else true
  )
  )


(defn leap-year? [year]
  (if (= (mod year 4) 0) (
                        if (= (mod year 100) 0) (
                                                 if (= (mod year 400) 0) true false
                                                 )
                          true

                        )
    false
  )
  )
(leap-year? 100) ;=> false
(leap-year? 200) ;=> false
(leap-year? 400) ;=> true
(leap-year? 12)  ;=> true
(leap-year? 20)  ;=> true
(leap-year? 15)  ;=> false
