(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (= x nil)
    false
    (if (= x false)
      false
      true)
    ))

(defn abs [x]
  (if (< x 0)
    (- x)
    x))

(defn divides? [divisor n]
  (= (mod n divisor) 0))

(defn fizzbuzz [n]
  (if (= (mod n 3) 0)
    (if (= (mod n 5) 0)
      (str "gotcha!")
      (str "fizz")
    )
    (if (= (mod n 5) 0)
      (str "buzz")
      (str "")
    )
  ))

(defn teen? [age]
  (< 12 age 20))

(defn not-teen? [age]
  (or (< age 13) (> age 19)))

(defn generic-doublificate [x]
  (if (number? x)
    (* 2 x)
    (if (or (list? x) (vector? x) (map? x))
      (if (empty? x)
        nil
        (if (or (list? x) (vector? x))
          (* (count x) 2)
          true))
      true)))

(defn leap-year? [year]
  (if (== (mod year 4) 0)
    (if (== (mod year 100) 0)
      (if (== (mod year 400) 0)
        true
        false)
      true)
    false
  )
)


; '_______'
