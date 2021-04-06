# CIELO SKYLINE LEAK ANALYSIS

Author:  Daniel Ribeiro - daniel.r.junior@oracle.com

## Introduction

## Softwares

1. Oracle Linux 7.8 
2. Oracle Virtual Box 6
3. Git 1.8.3
4. Maven 3.6+
5. Oracle K8S 1.18.6
6. Docker 19.03

## Setup Kubernetes Cluster

1. Requirements

Resource

> Confirme system resources 

> https://docs.oracle.com/en/operating-systems/oracle-linux/kubernetes/requirements-resource-ha.html#

Oracle Container Registry Requirements

> Confirms account active and access on Oracle Container Registry 

> https://docs.oracle.com/en/operating-systems/oracle-linux/kubernetes/requirements-registry-ha.html

Firewall and iptables Requirements

> Confirm kubernetes ports opened on firewall

> https://docs.oracle.com/en/operating-systems/oracle-linux/kubernetes/requirements-firewall-ha.html

SELinux Requirements 

> Confirm SELinux disabled

> https://docs.oracle.com/en/operating-systems/oracle-linux/kubernetes/requirements-selinux-ha.html

ETCD

> Install manually with RPM 

> https://yum.oracle.com/repo/OracleLinux/OL7/olcne11/x86_64/index.html

Script devops-k8s-install-cluster-master/install_docker_k8s_v.1.18.sh

> Define the correct ethernet interface in variables 'interface', 'ip_addr', 'ext_ip_addr'

> Adjust the correct HTTP Proxy in variables 'HTTPS_PROXY', 'https_proxy', 'http_proxy', 'HTTP_PROXY'

> Installation
[a relative link](devops-k8s-install-cluster-nodes/README.md)