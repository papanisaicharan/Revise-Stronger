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
 
 ### Load balancing with AWS
 
 <img width="1440" alt="Screen Shot 2022-01-01 at 5 00 23 PM" src="https://user-images.githubusercontent.com/25131591/147884089-f9e573a3-7078-4e54-ba5e-de3145c8ea71.png">

**Load Balancer types:**
- Application load balancer (HTTP/HTTPS)
- Network load Balancer (TCP/UDP/TLS)
- Classic load Balancer
 
**Steps:**
- Configure load balancer
  - VPC, Availabilty zones, subnets
- Configure security settings
- Configure security groups
- Configure routing
- Register targets and review

As a demo(view video for clear understanding):
- Create load balancer with above steps
- Create an s3 instance for accessing the objects
- Create a launch template for auto scaling groups with access role to above s3 instance (By pasting the below image code into user data)
- Then create and auto scaling group by following the creatin steps and configure load balancer and ELB in advance options step.
- view in target group: for instance the above load balancing is responsible for
- Copy the DNS name of the load balancer and try it out in browser (we get different response on each refresh - it indicates that they are connecting to different instances as the load is balanced)


### AWS storage services

- Object based
- Block based
- File based

<img width="1440" alt="Screen Shot 2022-01-03 at 12 35 30 PM" src="https://user-images.githubusercontent.com/25131591/147974048-c51a55bb-b369-47b4-b263-3939791a83f0.png">

**Services:**
- Amazon s3
- Amazon EBS
- Amazon EFS

#### EBS (Elastic block store):

<img width="1440" alt="Screen Shot 2022-01-03 at 12 36 16 PM" src="https://user-images.githubusercontent.com/25131591/147974131-bdf4fee0-869e-449d-8c15-cf53bbfef20c.png">

<img width="1440" alt="Screen Shot 2022-01-03 at 12 36 24 PM" src="https://user-images.githubusercontent.com/25131591/147974147-95d31337-8f13-4676-bbb2-75451e5e5ce5.png">

**Test:** (Try Creating Instance and storage in the same availability zone (later we see with different availability zone))
- Create a volume by clicking on volume of EBS in new EC2 experience.
- Fill in details like Volume Type, Size, IOPS, Availability Zone etc.
- Create new EC2 Instance (Windows) as describe previously.
- Try logging into the instance and check - we see only C drive.
- Now go to IAM instance console > volume, add the available volume to instance.
- Now again check back in the EC2 instance by logging in, You will see a new drive in windows.

 
 #### Instance store
 
 <img width="1440" alt="Screen Shot 2022-01-03 at 1 21 37 PM" src="https://user-images.githubusercontent.com/25131591/147976653-05f51ac6-daff-43a9-aa05-a469688fcd0e.png">

You can see the instance stores in the storage section of EC2 creation.

**EBS snapshots and AMI's:**
 <img width="1440" alt="Screen Shot 2022-01-03 at 1 28 20 PM" src="https://user-images.githubusercontent.com/25131591/147977495-dfda7bdb-95f6-46be-8db3-c31860fc01c6.png">
 
Snapshots are more of back up kind of thing.
We have created a volume in previous test and attached to a EC2 which is in the same availability zone(A). Now create a snapshot of it and later create a volume out of the snapshot in a new availabilty zone(B) and attach newly created volume from snapshot to an instance created in availabilty zone(B).

AMI are can be created from snapshots and used to created instances in various availabilty zones.

#### Elastic file system (EFS):

<img width="1440" alt="Screen Shot 2022-01-03 at 4 06 09 PM" src="https://user-images.githubusercontent.com/25131591/148078349-39524f37-52f1-49e7-b0fc-96a8c4f12b69.png">

<img width="1440" alt="Screen Shot 2022-01-03 at 4 13 41 PM" src="https://user-images.githubusercontent.com/25131591/148078376-f9a6bb54-2fee-4af4-b28f-e7808935b632.png">

- Create a File system which will be available in each availability zone and have security group which as a inbound NFT included.
- Creata two EC2 instance in different availability zones.
- Attach the file system through the above commands.

Now the two instances which are in different avaialbility zones have access to file system (They see the same content).

### S3 buckets

#### Create S3 bucket and make public 
<img width="1440" alt="Screen Shot 2022-01-04 at 8 06 06 AM" src="https://user-images.githubusercontent.com/25131591/148080228-fd9a5b16-da75-4760-9e8a-7aa6833d6183.png">

Create S3 bucket with default options and add files
**Explore various clasess of storage:**
<img width="1440" alt="Screen Shot 2022-01-04 at 8 13 55 AM" src="https://user-images.githubusercontent.com/25131591/148080532-cf8227ee-3211-48f8-ac6c-f05c36f3bbe5.png">

And copy the URL of an image and try accessing the image. we are restricted from public access. So change the permissions.
<img width="1440" alt="Screen Shot 2022-01-04 at 8 16 43 AM" src="https://user-images.githubusercontent.com/25131591/148080886-6916a3f7-388c-4057-a3d1-9117ff75b988.png">

<img width="1440" alt="Screen Shot 2022-01-04 at 8 10 57 AM" src="https://user-images.githubusercontent.com/25131591/148080914-9ad7d75b-3750-4007-9a7b-bbe8900897ed.png">

Try accessing it now.





