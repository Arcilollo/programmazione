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
		sleep(1);
		exit(10);
	}
	else if (pid1 > 0) {
		printf("Processo PADRE\nin attesa che il primo processo figlio termini\n");
		pid_wait = wait(&status);

		/* Ultimo processo terminato
		for (int i = 0; i < nForks; i++)
			pid_wait = wait(&status);
		*/
		printf("pid del processo figlio terminato: %d\n", pid_wait);
		printf("valore restituito dal processo figlio terminato: %d\n", status/256);
	}
	else
		printf("errore nella fork\n");

	return 0;
}
