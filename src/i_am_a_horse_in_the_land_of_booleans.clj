(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (= x nil)
    (true? nil)
    (if (= x false)
      (true? nil)
      (true? true)
      )
    )
  )

(defn abs [x]
  (if (< x 0)
    (* -1 x)
    (* 1 x)
    )
  )

(defn divides? [divisor n]
  ":(")

(defn fizzbuzz [n]
  ":(")

(defn teen? [age]
  (< 12 age 20))

(defn not-teen? [age]
  ":(")

(defn generic-doublificate [x]
  ":(")

(defn leap-year? [year]
  ":(")

; '_______'
