node('linux')
{
  stage('Build') {
    build job: 'Port-Pipeline', parameters: [string(name: 'PORT_GITHUB_REPO', value: 'https://github.com/ZOSOpenTools/gpgrtport.git'), string(name: 'PORT_DESCRIPTION', value: 'This contains common error codes and error handling' )]
  }
}
