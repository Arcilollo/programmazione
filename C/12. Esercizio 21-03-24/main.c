#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>
#include <sys/wait.h>

int main() {
	int F1, F2;
	int N11, N12, N21;

	int status;

	// Creazione dei due figli
	F1 = fork();
	if (F1 > 0) {
		F2 = fork();
	}



	if (F1 == 0) {	// Parte eseguita da F1
		sleep(1);
		printf("SONO IL PROCESSO F1\n");
		printf("Il mio PID é: %d\n", getpid());
		printf("Mio padre ha PID: %d\n\n", getppid());

		// Creazione dei due nipoti
		N11 = fork();
		if (N11 > 0) {
			N12 = fork();
		}

		if (N11 == 0) {	// Nipote 1
			sleep(1);
			printf("SONO IL PROCESSO N11\n");
			printf("Il mio PID é: %d\n", getpid());
			printf("Mio padre ha PID: %d\n\n", getppid());
			exit(1);
		}
		else if (N12 == 0) {	// Nipote 2
			sleep(2);
			printf("SONO IL PROCESSO N12\n");
			printf("Il mio PID é: %d\n", getpid());
			printf("Mio padre ha PID: %d\n\n", getppid());
			exit(1);
		}

		for (int i = 0; i < 2; i++)
			wait(&status);
	}

	else if (F2 == 0) {				// Parte eseguita da F2
		sleep(4);
		printf("SONO IL PROCESSO F2\n");
		printf("Il mio PID é: %d\n", getpid());
		printf("Mio padre ha PID: %d\n\n", getppid());

		// Creazione Nipote
		N21 = fork();

		if (N21 == 0) { // Nipote
			sleep(1);
			printf("SONO IL PROCESSO N21\n");
			printf("Il mio PID é: %d\n", getpid());
			printf("Mio padre ha PID: %d\n\n", getppid());
			exit(1);
		}
		wait(&status);
	}

	else if (F1 > 0 && F2 > 0) {	// Parte eseguita da P1
		sleep(6);
		printf("SONO IL PROCESSO P1\n");
		printf("Il mio PID é: %d\n", getpid());
	}



	else {							// Errore nella fork
		printf("Errore nella fork()\n");
	}

	return 0;
}
