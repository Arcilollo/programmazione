#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>
#include <sys/wait.h>

int main() {
	int pid = 1;
	int status, pid_wait;

	for (int i = 0; i < 5; i++) {
		if (pid > 0)
			pid = fork();
	}

	if (pid == 0) {
		printf("Processo figlio: %d\n", getpid());
		exit(57);
	}

	else if (pid > 0) {
		printf("PROCESSO PADRE: in attesa\n");

		for (int i = 0; i < 5; i++)
			pid_wait = wait(&status);

		printf("pid processo terminato: %d\n", pid_wait);
	}

	return 0;
}
