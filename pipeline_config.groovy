sdp_image_repository = "http://0.0.0.0:5000"
sdp_image_repository_credential = "sdp-docker-registry"
application_image_repository = "0.0.0.0:5000"
application_image_repository_credential = "sdp-docker-registry"

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
