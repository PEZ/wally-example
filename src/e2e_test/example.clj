(ns e2e-test.example
  (:require [wally.main :as w]
            [wally.selectors :as ws]
            [garden.selectors :as s]))

(comment
  ;; Copy jsonista deps.edn dep.
  (do
    ;; When some command is run for the first time, Playwright
    ;; will kick in and open a browser.
    (w/navigate "https://clojars.org/metosin/jsonista")
    (w/click [(ws/text "Copy") (ws/nth= "1")]))

  ;; Check number of downloads for reitit.
  (do
    (w/fill :#search "reitit")
    (w/keyboard-press "Enter")
    (w/click (s/a (s/attr= :href "/metosin/reitit")))
    (.textContent (w/-query (ws/text "Downloads"))))

  ;; Get the Playwright page object.
  ;; https://playwright.dev/docs/api/class-page.
  (w/get-page)
  
  :rcf)

