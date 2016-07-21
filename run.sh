#!/usr/bin/env bash

set -o errexit;

ant;
cd build;

echo "------------------------------------------------------------------------";
java dsc.projetoHiperbole.view.ProjetoHiperbole $@;
cd ..;