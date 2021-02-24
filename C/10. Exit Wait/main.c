#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>

/*
	per visualizzare lo status bisogna dividere per 256
	Oppure WEXITSTATUS(status)
*/

int main() {
	int pid1;

	int pid_wait, status; // pid_wait serve a vedere il PID del figlio che ternima

	printf("prima di fork()\n");

	pid1 = fork();

	printf("dopo di fork()\n");

	if (pid1 == 0) {
		printf("FIGLIO\n");
		printf("pid: %d\n", getpid());
		printf("pid padre: %d\n", getppid());
		printf("figlio: Processo figlio TERMINATO\n");
		exit(1);
	}
	else if (pid1 > 0) {
		printf("PADRE: IN ATTESA DEGLI ALTRI PROCESSI\n");
		pid_wait = wait(&status);
		printf("padre: Processo figlio TERMINATO\n");
		printf("pid: %d\n", getpid());
		printf("Valore restituito dal figlio: %d\n", WEXITSTATUS(status));
		printf("pid figlio1 terminato: %d\n", pid_wait);
	}
	else
		printf("errore nella fork\n");

	return 0;
}
