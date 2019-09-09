package uk.gov.justice.digital.hmpps.cattool.pages

import geb.Page

class LandingPage extends Page {

  static url = '/'

  static at = {
    historyHeading.text() == 'Check previous category reviews'
  }

  static content = {
    initialButton(required: false) { $('#initialButton') }
    recatButton(required: false) { $('#recatButton') }
    warning(required: false) { $('div.govuk-warning-text') }
    historyButton { $('#historyButton') }
    historyHeading { $('#previousCategoryHeading') }
    checkbox { $('#refer') }
    securityButton { $('#securityButton') }
  }
}
