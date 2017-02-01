(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (= x nil) (= x false))
      false
      true
  )
)



(defn abs [x]
  (if (< x 0)
      (- x)
       x
  )
)



(defn divides? [divisor n]
  (if (== (mod n divisor) 0)
      true
      false
  )
)

(defn fizzbuzz [n]
  (def d3 (divides? 3 n))
  (def d5 (divides? 5 n))
  (cond
    (and d3 d5) "gotcha!"
     d3         "fizz"
     d5         "buzz"
     :else      ""
  )
)


(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age))
)

(defn generic-doublificate [x]
  (cond
    (number? x)                  (* 2 x)
    (empty? x)                   nil
    (or (vector? x) (list? x))    (* 2 (count x))
    :else                        true
  )
)




(defn leap-year? [year]
  (cond
    (divides? 400 year) true
    (divides? 100 year) false
    (divides? 4 year)   true
    :else               false
  )
)

; '_______'



(generic-doublificate 1)        ;=> 2
(generic-doublificate [1 2])    ;=> 4
(generic-doublificate '(65 21)) ;=> 4
(generic-doublificate {})       ;=> nil
(generic-doublificate [])       ;=> nil
(generic-doublificate {:a 1})   ;=> true
