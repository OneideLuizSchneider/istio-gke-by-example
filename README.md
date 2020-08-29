# Istio - Canary deployments
 \
Istio is a great service mesh tool and lets you connect, secure, control, and observe services. \
Here I implemented a Canary Deployment, which means, the traffic will be splitting in versions. \
 \
Here we have 3 versions of the same API, written in Java with Spring Boot, and we have a little difference between each. \
The traffic will be splitting by 50%, 30%, and 20%.  \
So, lets see the code.
 \
 \ 
First \
Create a Kubernetes cluster, for this example I'll use GKE (Google Kubernetes Engine).
Steps: \
``gcloud container clusters create CLUSTER-NAME --zone ZONE  --num-nodes=3``Obs.: You can create on the UI. \
``gcloud container clusters get-credentials CLUSTER-NAME --zone ZONE --project PROJECT-ID`` \
 \
 \
Second \
Wait until the first step is done, then install and configure Istio \
Steps: \
`` curl -L https://istio.io/downloadIstio | ISTIO_VERSION=1.6.1 sh -`` \
``cd istio-1.6.1`` \
``export PATH=$PWD/bin:$PATH`` \
``istioctl manifest apply --set profile=demo`` \
``kubectl label namespace default istio-injection=enabled`` \
*Now it's possible to open kiali on the webbrowser, where you can see the traffic, etc. \
``istioctl dashboard kiali`` \
 \
 \
Third \
Now go to your terminal and create all the deployments, services, and Istio rules. \
``cd kubernetes`` \
``kubectl create -f books-deployment-v1.yml`` \
``kubectl create -f books-deployment-v2.yml`` \
``kubectl create -f books-deployment-v3.yml`` \
``kubectl create -f books-svc.yml`` \
``cd ..`` \
``cd istio`` \
``kubectl create -f gateway.yml`` \
``kubectl create -f destination-rule.yml`` \
``kubectl create -f vs-books.yml`` \
 \
 \
On the browser you can see something like this: \
<p align="center">  
  <img src="https://github.com/OneideLuizSchneider/istio-gke-by-example/assets/kiali.png?raw=true" width="800">
</p>
 \
 \
Enjoy it :D
