(ns app
  (:require ["moment$default" :as moment]
            ["inquirer$default" :as inquirer]
            [promesa.core :as p]))

(println "Questionaire ")

(def questions (clj->js[{ :name "name" 
                          :type "input"
                          :message "Who's birthday is it?"}
                        {:name "day"
                         :type "number"
                         :message "What day is their birthday?"
                         :validate (fn [v](< 0 v 32))}
                        {:name "month"
                         :type "list"
                         :choices (moment/months)}]))

(p/let [_answers (inquirer/prompt questions)
        answers (js->clj _answers :keywordize-keys true) 
        {:keys [name day month]} answers] 
  (prn "Saving birthday for" name day month))

(comment
  (moment/months) 
  moment () .year ()
  (.year (moment))
  )
