Feature: Browse  doifinder, uidfinder, articlefinder, abstractpagefinder, pdffinder urls 

@cleanbrowser
Scenario Outline: As a user I want to use nature.com finder urls to browse to article page
Given I am user on nature.com
When  I navigate to "<finder>" url with doi "<doi>"
Then  I should see the nature.com article "<article>"

Examples:

| finder             | doi                 		| article                                	  |
| doifinder          | 10.1038/444520a     		| nature/journal/v444/n7119/full/444520a.html |
| cifinder           | 10.1038/nchembio705      | nchembio/journal/v1/n1/compound/nchembio705_ci.html 	 |
| compfinder         | 10.1038/nchembio705_comp1| nchembio/journal/v1/n1/compound/nchembio705_comp1.html |
| sifinder           | 10.1038/cddis.2009.3     | cddis/journal/v1/n1/suppinfo/cddis20093s1.html |
| uidfinder          | 10.1038/444520a     		| nature/journal/v444/n7119/full/444520a.html |
| articlefinder      | 10.1038/444520a 	   		| nature/journal/v444/n7119/full/444520a.html |
| abstractpagefinder | 10.1038/nchembio705 		| nchembio/journal/v1/n1/abs/nchembio705.html |
| pdffinder			 | 10.1038/nature05304 		| nature/journal/v444/n7119/pdf/nature05304.pdf |

