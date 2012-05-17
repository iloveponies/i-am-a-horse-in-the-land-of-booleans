(ns structured-data-test
  (:use structured-data
        midje.sweet))

(facts "do-a-thing"
  (do-a-thing 3) => 46656.0
  (do-a-thing 1) => 4.0
  (do-a-thing 0) => 1.0)

(facts "spiff"
  (spiff [1 2 3])         => 4
  (spiff [1 2 -34 4 5 6]) => -33)

(facts "spiff-destructuring"
  (spiff-destructuring [1 2 3])         => 4
  (spiff-destructuring [1 2 -34 4 5 6]) => -33)

(facts "element-lengths"
  (element-lengths ["foo" "bar" "" "quux"])  => [3 3 0 4]
  (element-lengths ["x" [:a :b :c] {:y 42}]) => [1 3 1])

(facts "second-elements"
  (second-elements [[1 2] [2 3] [3 4]])               => [2 3 4]
  (second-elements [[1 2 3 4] [1] ["a" "s" "d" "f"]]) => [2 nil "s"])

