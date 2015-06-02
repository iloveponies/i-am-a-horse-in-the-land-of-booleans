(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0) 
    (* -1 x) 
    x
  )
)

(defn divides? [divisor n]
  (= (mod n divisor) 0)
)

; ------------------------------------------

(defn fizz? [n]
  (divides? 3 n)
)

(defn buzz? [n]
  (divides? 5 n)
)

(defn fizzbuzz? [n]
  (and (fizz? n) (buzz? n))
)

(comment
(defn fizzbuzz [n]
  (if (and (fizz? n) (buzz? n)) 
    "gotcha!"
    (if (fizz? n)
      "fizz"
      (if (buzz? n)
        "buzz"
        "" 
      )
    )
  )
)
)

(defn fizzbuzz [n]
  (cond
    (fizzbuzz? n) "gotcha!"
    (fizz? n) "fizz"
    (buzz? n) "buzz"
    :else ""
  )
)

; ------------------------------------------

(defn teen? [age]
  (<= 13 age 19)
)

(defn not-teen? [age]
  (not (teen? age))
)

; -------------------------------------------

(defn double-num [x] 
  (* 2 x)
)

(defn double-count [coll]
  (double-num (count coll))
)

(defn collection? [coll] 
  (or (list? coll) (vector? coll))
)

(defn generic-doublificate [x]
  (cond
    (number? x)     (double-num x)
    (empty? x)      nil
    (collection? x) (double-count x)
    :else           true
  )    
)

(defn leap-year? [year]
  (if (not (divides? 4 year))
    false
    (if (not (divides? 100 year))
      true
      (if (divides? 400 year)
        true
        false
      )
    ) 
  )
) 


; '_______'
