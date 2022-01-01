## AWS
This info is gathered based on freecodecamp aws video

### AWS overview:
![Screenshot (4)](https://user-images.githubusercontent.com/25131591/146694358-c5acb783-027f-4575-8ad2-c91f02839e14.png)

### Thw AWS Global Infrastructure:
- https://aws.amazon.com/about-aws/global-infrastructure/
- https://aws.amazon.com/products/

### Pricing
- computing
- Storage
- Outbound Data transfer
- https://aws.amazon.com/pricing/
- https://calculator.aws/#/

### Account setup
https://portal.aws.amazon.com/billing/signup#/start

- Create billing alarm: to avoid overcharge

### IAM (Identity and access management) Overview

<img width="1440" alt="Screen Shot 2021-12-31 at 9 04 48 AM" src="https://user-images.githubusercontent.com/25131591/147832161-9b21b004-0196-40e6-b888-c2ab0f63ec06.png">

<img width="1440" alt="Screen Shot 2021-12-31 at 9 06 00 AM" src="https://user-images.githubusercontent.com/25131591/147832166-19887c71-9c1e-462e-8a4a-ac10cd59f5a4.png">

- Create IAM user by click on **IAM** under "Security, Identity & Compliance"

### Amazon Virtual Private Cloud(VPC)

<img width="1440" alt="Screen Shot 2021-12-31 at 9 27 21 AM" src="https://user-images.githubusercontent.com/25131591/147834026-8809ab29-0ded-438e-9367-162a32216412.png">

<img width="1440" alt="Screen Shot 2021-12-31 at 9 25 45 AM" src="https://user-images.githubusercontent.com/25131591/147834035-6c3ce06f-1e14-4736-9d29-6186f0c5d701.png">

### Security Groups and Network Access Control Lists (ACLs)

<img width="1440" alt="Screen Shot 2021-12-31 at 10 36 15 AM" src="https://user-images.githubusercontent.com/25131591/147834545-7f37e8c6-09e8-41a3-8b9b-1d39c6490547.png">

<img width="1440" alt="Screen Shot 2021-12-31 at 10 42 36 AM" src="https://user-images.githubusercontent.com/25131591/147834587-5aed9f52-b18d-4f79-9442-dfd96fde191f.png">

<img width="1440" alt="Screen Shot 2021-12-31 at 10 50 59 AM" src="https://user-images.githubusercontent.com/25131591/147834614-bca11b3d-3e2b-43fa-babf-1a549599f9ee.png">

### Install awscli

https://docs.aws.amazon.com/cli/v1/userguide/install-macos.html#awscli-install-osx-pip-pip

<img width="1440" alt="Screen Shot 2021-12-31 at 10 53 32 AM" src="https://user-images.githubusercontent.com/25131591/147835664-b80d8825-2412-49d8-9516-78729ecae699.png">


### Amazon Elastic Compute Cloud

<img width="1040" alt="Screen Shot 2021-12-31 at 11 29 12 AM" src="https://user-images.githubusercontent.com/25131591/147835679-8ed22b0e-2e1f-4a9c-86a9-04a75b989719.png">

<img width="1040" alt="Screen Shot 2021-12-31 at 11 36 01 AM" src="https://user-images.githubusercontent.com/25131591/147835713-4f347d9f-a441-4e01-b5a1-f24f847f7a53.png">

<img width="1040" alt="Screen Shot 2021-12-31 at 11 33 57 AM" src="https://user-images.githubusercontent.com/25131591/147835721-61ba35a1-1852-481a-93c1-8972a6fb266c.png">

### Lanuch Amazon EC2 instance:

<img width="1440" alt="Screen Shot 2021-12-31 at 11 42 34 AM" src="https://user-images.githubusercontent.com/25131591/147842360-a1dd88b4-b721-43ae-b88a-7caacac80170.png">

Steps:
- Choose AMI
- Choose Instance Type
- Configure Instance
- Add storage
- Add Tags
- Configure Security group
- Review

Create key pair and download it.

Public key is held by AWS and private key is held by user and used while authenticating.

Task:
- Create two instance (windows & linux) in different regions.
- connect to linux instance from windows instance using Putty software in windows machine.

In mac, we can use Microsoft remote desktop (https://apps.apple.com/us/app/microsoft-remote-desktop/id1295203466?mt=12) app for connecting to windows instance.

### Create a websie using user data (In EC2 instance)

<img width="1440" alt="Screen Shot 2021-12-31 at 9 27 41 PM" src="https://user-images.githubusercontent.com/25131591/147844096-ab497223-e28e-4bd5-8d2a-a43c579e4d71.png">

Paste the commands in the user data of "configure instance" of instance creation.

### Use IAM roles for an instance to access other resources.

<img width="1440" alt="Screen Shot 2021-12-31 at 9 38 44 PM" src="https://user-images.githubusercontent.com/25131591/147844182-98425b75-8290-4ecd-8797-495272e152f6.png">

<img width="1440" alt="Screen Shot 2021-12-31 at 9 42 00 PM" src="https://user-images.githubusercontent.com/25131591/147844185-721d75fb-74c0-400c-9cba-335746267bb0.png">

### Scale elastically with Amazon EC2 Auto Scaling
- if most of the instances is ideal, then the few instances are dropped off
- if an instance is failed, then it replaces the instance.
- if the pressure or usage of the instance is increased, then it adds more similar instances to handle the traffic

<img width="1440" alt="Screen Shot 2021-12-31 at 9 48 28 PM" src="https://user-images.githubusercontent.com/25131591/147844242-cfa0ac28-6376-44d0-baf1-7e213f4b3cdc.png">

Please go through the video for more info

#### Auto Scaling group
- Choose a template (create it way before choosing it)
- Configuration settings
  - VPC
  - Subnets
- Configure advance options
  - Load balancing
  - Health checks
- Configure group size and scaling policy
  - Group size
  - Scaling Policy
    - Target tracking scaling policy
  - Instance scale-in protection
- Add notifications
- Add tags
- Review

### Create a target tracking scaling policy

Auto scaling groups > Automatic scaling > add policy

To create the load on the instances use the following commands in each instance, As soon the overall CPU utilization reaches the threshold value then the new instances are created to handle the load and to bring down the overal CPU utlization to below threshold value.
 
 <img width="1440" alt="Screen Shot 2021-12-31 at 10 56 20 PM" src="https://user-images.githubusercontent.com/25131591/147845038-6e353af6-9846-4fe4-af0c-4f809f0cdc62.png">
 
 > stress -c 8

 To generate the stress on the instance.
 
 

