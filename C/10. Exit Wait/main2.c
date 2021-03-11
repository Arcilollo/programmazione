#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>

int main() {
	int pid1;

	int pid_wait, status;

	printf("prima di fork()\n");

	pid1 = fork();

	printf("dopo di fork()\n");

	if (pid1 == 0) {
		printf("FIGLIO1:\n");
		printf("pid: %d\n", getpid());
		printf("pid padre: %d\n", getppid());
		exit(1);
	}
	else if (pid1 > 0) {
		printf("PADRE: IN ATTESA CHE IL PROCESSO FIGLIO TERMINI\n");
		pid_wait = wait(&status);
		printf("PADRE: PROCESSO FIGLIO TERMINATO\n");
		printf("pid: %d\n", getpid());
		printf("Valore restituito dal figlio: %d\n",status/256);
		printf("Valore restituito dal figlio: %d\n", WEXITSTATUS(status));
		printf("pid figlio1 terminato: %d\n", pid_wait);
	}
	else
		printf("errore nella fork\n");

	return 0;
}
