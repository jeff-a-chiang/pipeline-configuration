stages{
  continuous_integration{
    static_code_analysis
    build
  }
}

libraries{
  sonarqube{
    enforce_quality_gate = true
  }
  docker
}