(ns i-am-a-horse-in-the-land-of-booleans
    (:refer-clojure :exclude [boolean]))

(defn boolean [x]
    ((if x nil)
        ("falsy")

        ((if x false)
            ("falsy")
            ("truthy")
        )
    )
)

(defn abs [x]
  ":(")

(defn divides? [divisor n]
  ":(")

(defn fizzbuzz [n]
  ":(")

(defn teen? [age]
    (and (<= age 19) (>= age 13))
)

(defn not-teen? [age]
    (not (teen? age))
)

(defn generic-doublificate [x]
  ":(")

(defn leap-year? [year]
  ":(")

; '_______'
