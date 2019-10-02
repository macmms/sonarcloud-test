#!/bin/bash

# automatically exit on any simple non-zero result
set -e

# validate the templates first
../tests/validate-templates.sh

# create codebuild for prs
aws cloudformation deploy \
  --template-file master.yaml \
  --stack-name jake-sonarcloud-repo-prs \
  --capabilities CAPABILITY_NAMED_IAM
