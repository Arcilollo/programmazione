#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>

int main() {
	int pid1;
	int nForks;

	int pid_wait, status;

	printf("Inserisci il numero di fork da eseguire: ");
	scanf("%d", &nForks);

	for (int i = 0; i < nForks; i++)
		if (pid1 > 0)
			pid1 = fork();


	if (pid1 == 0) {
		printf("PID FIGLIO: %d\nPID DEL PADRE: %d\n\n", getpid(), getppid());
		exit(10);
	}
	else if (pid1 > 0) {
		for (int i = 0; i < nForks; i++)
			pid_wait = wait(&status);
		printf("Processo PADRE\n");
		printf("pid figlio1 terminato: %d\n", pid_wait);
		//printf("Valore ritornato dal figlio: %d\n", status/256);
	}
	else
		printf("errore nella fork\n");

	return 0;
}
