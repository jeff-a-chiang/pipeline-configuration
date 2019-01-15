stages{
  continuous_integration{
    static_code_analysis
    build
  }
}

libraries{
  sdp
  sonarqube{
    enforce_quality_gate = true
  }
  docker
}
