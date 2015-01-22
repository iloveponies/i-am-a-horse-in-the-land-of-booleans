(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))



(defn abs [x]
  (if (< x 0)
  (- x)
  x
    )
  )

(defn teen? [age]
  (if (< 12 age 20)
    true
    false
  )
  )

(defn boolean [x]

  (if (nil? x)
   false
    (if (= false x)
      false
      true
    )
    )
)


(defn divides? [divisor n]
  (if (or (nil? n) )
    false

    (if (== 0 (mod n divisor))
     true
     false
 )
    )
)

(defn fizzbuzz [n]
  (if (divides? 15 n)
    "gotcha!"
    ( if(divides? 3 n)
      "fizz"
      (if (divides? 5 n)
        "buzz"
        ""
      )
  )
  )
)


(defn not-teen? [age]
  (if (or (< age 13) (> age 19))
    true
    false
    )
  )

(defn generic-doublificate [x]
  (if (number? x)
    (+ x x)
    (if (empty? x)
      nil
      (if (or (list? x) (vector? x))
        (* 2 (count x))
        true
        )
      )
  )
)

(defn leap-year? [year]
 ( if (divides? 400 year)
   true
   (if (divides? 100 year)
     false
     (if (divides? 4 year)
       true
       false
       )
     )
   )
  )

; '_______'
