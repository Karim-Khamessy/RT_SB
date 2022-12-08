job('seed') {
  scm {
    git ('https://github.com/Karim-Khamessy/RT_DevOps.git')
  }
  steps {
    dsl {
      external('jobs/*.groovy')  
      // default behavior
      // removeAction('IGNORE')      
      removeAction('DELETE')
    }
  }
}