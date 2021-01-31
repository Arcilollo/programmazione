#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>

int main() {
	int pid;

	printf("prima di fork()\n");

	pid = fork();

	if (pid == 0) {
		printf("Parte eseguita dal figlio\n");
		printf("pid:%d\n", getpid());
		printf("pid padre:%d\n", getppid());
	}
	else if (pid > 0) {
		printf("Parte eseguita dal padre\n");
		printf("pid:%d\n", getpid());
		printf("pid figlio:%d\n", pid);
	}
	else
		printf("errore nella fork\n");

	return 0;
}
