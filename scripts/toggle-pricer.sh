#!/usr/bin/env bash
IP=$(minishift ip)
PROJECT=eclipsecon-france
http http://pricer-service-${PROJECT}.${IP}.nip.io/toggle
