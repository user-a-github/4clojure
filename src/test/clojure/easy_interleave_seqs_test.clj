(ns easy-interleave-seqs-test
  (:use [clojure.test]
        [easy :only [interleave_seqs]])
  )

(deftest should-interleave-sequences
  (is (interleave_seqs [1 2] [3 4 5 6]) '(1 3 2 4))
  (is (interleave_seqs [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c))
  (is (interleave_seqs [1 2 3 4] [5]) [1 5])
  (is (interleave_seqs [30 20] [25 15]) [30 25 20 15]))

(deftest should-interleave-empty-sequences
  (is (interleave_seqs [] [3 4 5 6]) '())
  (is (interleave_seqs [1 2 3] []) '())
  (is (interleave_seqs [] []) []))

(deftest should-interleave-nil-sequences
  (is (interleave_seqs nil [3 4 5 6]) '())
  (is (interleave_seqs [1 2 3] nil) '())
  (is (interleave_seqs nil nil) '())
  (is (interleave_seqs nil nil) []))
