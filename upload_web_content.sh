#!/bin/sh

scp /Users/berryjam/Documents/workspace/web-backend-framework/target/blog-web.war root@121.42.164.158:/home/work/beidou/data-dicitionary

zip -r startbootstrap-clean-blog.zip /Users/berryjam/WebstormProjects/startbootstrap-clean-blog

scp ./startbootstrap-clean-blog.zip root@121.42.164.158:/home/work/beidou

rm ./startbootstrap-clean-blog.zip