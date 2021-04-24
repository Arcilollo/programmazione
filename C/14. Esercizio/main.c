#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>
#include <sys/wait.h>

void printP(char c1, int n1) {
	printf("PROCESSO %c%d\n", c1, n1);
	printf("PID del padre: %d\n", getppid());
	printf("PID di questo processo: %d\n\n", getpid());
}

int main() {
	int pidA1, pidA2;
	int pidB;

	int status;

	pidA1 = fork();
	if (pidA1 > 0)
		pidA2 = fork();

	if (pidA1 == 0) {
		printP('F', 1);
		pidB = fork();

		if (pidB == 0) {
			printP('N', 1);
			exit(1);
		}
		wait(&status);
		exit(1);
	}
	else if (pidA2 == 0) {
		printP('F', 2);
		exit(1);
	}

	else if ((pidA1 > 0) && (pidA2 > 0)) {
		for (int i = 0; i < 2; i++)
			wait(&status);
		printP('P', 1);
	}


	return 0;
}
