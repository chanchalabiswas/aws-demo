node {
	    def mvnHome = tool 'maven-3.5.2'

	    def dockerImage
	 
	    def dockerImageTag = "aws-demo${env.BUILD_NUMBER}"
	    
	    stage('Clone Repo') { 
	      git 'https://github.com/chanchalabiswas/aws-demo.git'
	      mvnHome = tool 'maven-3.5.2'
	    }    
	  
	    stage('Build Project') {
	      sh "'${mvnHome}/bin/mvn' clean install"
	    }
			
	    stage('Build Docker Image') {
	      dockerImage = docker.build("aws-demo:${env.BUILD_NUMBER}")
	    }
	   
	    stage('Deploy Docker Image'){
			
	      echo "Docker Image Tag Name: ${dockerImageTag}"
		  
		  sh "docker stop aws-demo"
		  
		  sh "docker rm aws-demo"
		  
		  sh "docker run --name aws-demo -d -p 2222:2222 aws-demo:${env.BUILD_NUMBER}"
	      
	    }
	}