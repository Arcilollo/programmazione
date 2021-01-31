#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>

int main() {
	int pid;

	printf("prima di fork()\n");

	pid = fork();

	printf("dopo di fork()\n");

	return 0;
}
