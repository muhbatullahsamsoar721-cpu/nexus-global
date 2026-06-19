#!/bin/bash
echo "=== Nexus Global OS ==="
echo "1. Starting C++ Security..."
./NexusShield &
echo "2. Starting Java Core..."
java NexusCore &
echo "3. All systems active!"
