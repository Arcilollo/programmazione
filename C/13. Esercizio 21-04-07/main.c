#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>
#include <string.h>
#include <sys/wait.h>

void presentaProcesso(char F, int n) {
	printf("SONO IL PROCESSO %c%d\n", F, n);
	printf("Il mio PID é: %d\n", getpid());
	printf("Mio padre ha PID: %d\n\n", getppid());
}

int main() {
	int F1, F2;
	int N1;

	int status;

	// Creazione dei due figli
	F1 = fork();
	if (F1 > 0) {
		F2 = fork();
	}



	if (F1 == 0) {					// Parte eseguita da F1
		presentaProcesso('F', 1);

		// Creazione del processo N1
		N1 = fork();

		if (N1 == 0) {				// Parte eseguita da N1
			presentaProcesso('N', 1);
			exit(1);
		}
		else if (N1 > 0){
			wait(&status);
			exit(1);
		}
		else
			printf("Errore nella fork di N1");

	}

	else if (F2 == 0) {				// Parte eseguita da F2
		presentaProcesso('F', 2);
		exit(1);
	}

	else if (F1 > 0 && F2 > 0) {	// Parte eseguita da P1
		for (int i = 0; i < 2; i++)
			wait(&status);
		presentaProcesso('P', 1);
	}



	else {							// Errore nella fork
		printf("Errore nella fork()\n");
	}

	return 0;
}
