<a name="readme-top"></a>






<!-- PROJECT LOGO -->
<br />
<div align="center">
  <!-- <a href="https://github.com/othneildrew/Best-README-Template">
    <img src="images/logo.png" alt="Logo" width="80" height="80">
  </a> -->

  <h3 align="center">Spring boot with Resilience4j</h3>

</div>



<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <!-- <li><a href="#roadmap">Roadmap</a></li> -->
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
    <li><a href="#acknowledgments">Acknowledgments</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project


The Circuit Breaker design pattern is a software design pattern that helps protect a system from failures in external services. It works by monitoring the number of errors in calls to an external service. If the number of errors exceeds a certain threshold, the Circuit Breaker will shut down the service and prevent it from making further calls. This helps protect the system from failures in the external service and prevents the failure from spreading to the rest of the system.

The Circuit Breaker design pattern is commonly used in microservices architectures. In a microservices architecture, a system is divided into small, independent services. This makes the system more flexible and scalable, but also more vulnerable to failures. The Circuit Breaker design pattern can help protect a system from failures in external services in a microservices architecture.

The Circuit Breaker design pattern has three states:

* Closed state: This is the default state of the Circuit Breaker. In the closed state, the Circuit Breaker allows calls to be made to the external service.
* Open state: If the number of errors in calls to an external service exceeds a certain threshold, the Circuit Breaker will switch to the open state. In the open state, the Circuit Breaker will block all calls to the external service.
* Half-open state: After a certain period of time, the Circuit Breaker will switch to the half-open state. In the half-open state, the Circuit Breaker will allow a limited number of calls to be made to the external service. If all calls are successful, the Circuit Breaker will switch back to the closed state. If any call fails, the Circuit Breaker will switch back to the open state.

![alt text](https://files.readme.io/39cdd54-state_machine.jpg)


### Built With


* Spring boot
* [Resilience4j](https://resilience4j.readme.io/docs/circuitbreaker)

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- GETTING STARTED -->
## Getting Started


In order for this project to make sense, you will need to run this additional [service concurrently](https://github.com/pedrop3/circuit-breaker-client).


### Prerequisites

* Java 11
* Maven 

### Installation

_Below is an example of how you can instruct your audience on installing and setting up your app. This template doesn't rely on any external dependencies or services._

1. Get a free API Key at [https://example.com](https://example.com)
2. Clone the repo
   ```sh
   git clone https://github.com/pedrop3/circuit-breaker.git
   ```
3. Install dependencs
   ```sh
   mvn clean install compile
   ```
4. If you're using Visual Studio Code, you can simply run the project by configuring the `launch.json`


<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- USAGE EXAMPLES -->
## Usage

To effectively demonstrate the Circuit Breaker in action, please run both services. The main service consumes resources from the secondary service. You can use the `circuit-breaker.postman_collection.json` file to make the API requests like "patients/2". 

If the secondary service doesn't respond correctly within the Circuit Breaker's defined rules, the state will be altered, for this stop the service "circuit-breaker-client" 

To monitor the state transitions, you can use the "/actuator/health" endpoint. The main service should continue to function without causing significant issues for the end client.

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- ROADMAP
## Roadmap

- [x] Add Changelog
- [x] Add back to top links
- [ ] Add Additional Templates w/ Examples
- [ ] Add "components" document to easily copy & paste sections of the readme
- [ ] Multi-language Support
    - [ ] Chinese
    - [ ] Spanish

See the [open issues](https://github.com/othneildrew/Best-README-Template/issues) for a full list of proposed features (and known issues).

<p align="right">(<a href="#readme-top">back to top</a>)</p> -->



<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also simply open an issue with the tag "enhancement".
Don't forget to give the project a star! Thanks again!

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- LICENSE -->
## License

Distributed under the MIT License.
<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- CONTACT -->
## Contact

Linkedin: [https://www.linkedin.com/in/pedrohmsantos/](https://www.linkedin.com/in/pedrohmsantos/)

<p align="right">(<a href="#readme-top">back to top</a>)</p>



