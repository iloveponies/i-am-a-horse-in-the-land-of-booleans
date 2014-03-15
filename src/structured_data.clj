(ns structured-data)

(defn do-a-thing [x]
  (let [xx (+ x x)]
    (Math/pow xx xx)
    )
  )

(defn spiff [v]
  (let [first (get v 0)
        third (get v 2)]
      (if (and first third)
        (+ first third)
        first
        )
    )
  )

(defn cutify [v]
  (conj v "<3")
  )

(defn spiff-destructuring [v]
  (let [[first second third] v]
    (if (and first third)
      (+ first third)
      first
      )
    )
  )

(defn point [x y]
  [x y])

(defn rectangle [bottom-left top-right]
  [bottom-left top-right])

(defn width [rectangle]
  (let [ [[x1 y1][x2 y2]] rectangle ]
    (- x2 x1)
    )
  )

(defn height [rectangle]
  (let [ [[x1 y1][x2 y2]] rectangle ]
    (- y2 y1)
    )
  )

(defn square? [rectangle]
  (= (width rectangle) (height rectangle))
  )

(defn area [rectangle]
  (let [rwidth (width rectangle)
        rheight (height rectangle)]
    (* rwidth rheight)
    )
  )

(defn contains-point? [rectangle point]
  (let [ [[x1 y1][x2 y2]] rectangle
         [px py] point]
    (and (<= x1 px x2) (<= y1 py y2))
    )
  )

(defn contains-rectangle? [outer inner]
  (let [[point1 point2] inner]
    (and (contains-point? outer point1)
    (contains-point? outer point2) )
    )
  )

(defn title-length [book]
  :-)

(defn author-count [book]
  :-)

(defn multiple-authors? [book]
  :-)

(defn add-author [book new-author]
  :-)

(defn alive? [author]
  :-)

(defn element-lengths [collection]
  :-)

(defn second-elements [collection]
  :-)

(defn titles [books]
  :-)

(defn monotonic? [a-seq]
  :-)

(defn stars [n]
  :-)

(defn toggle [a-set elem]
  :-)

(defn contains-duplicates? [a-seq]
  :-)

(defn old-book->new-book [book]
  :-)

(defn has-author? [book author]
  :-)

(defn authors [books]
  :-)

(defn all-author-names [books]
  :-)

(defn author->string [author]
  :-)

(defn authors->string [authors]
  :-)

(defn book->string [book]
  :-)

(defn books->string [books]
  :-)

(defn books-by-author [author books]
  :-)

(defn author-by-name [name authors]
  :-)

(defn living-authors [authors]
  :-)

(defn has-a-living-author? [book]
  :-)

(defn books-by-living-authors [books]
  :-)

; %________%
