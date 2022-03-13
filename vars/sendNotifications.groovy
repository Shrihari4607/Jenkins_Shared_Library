def call(def result)
{
  emailext body: '''${SCRIPT, template="groovy_html.template"}''', 
  subject: result + " : " + env.JOB_NAME, 
  to: 'shrihari4607@gmail.com'
}
