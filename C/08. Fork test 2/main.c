#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

int main() {
	int romolo = fork();
	int remo;

	if (romolo != 0) {
		remo = fork();
	}

	if (romolo == 0) {
		sleep(3);
		printf("Ciao sono Romolo\nIl mio PID é: %d\nIl PID di mio padre Marte é: %d\n", getpid(), getppid());
	}
	else if (remo == 0) {
		sleep(2);
		printf("Ciao sono Remo\nIl mio PID é: %d\nIl PID di mio padre Marte é: %d\n", getpid(), getppid());
	}
	else {
		sleep(1);
		printf("Ciao sono Marte\nIl mio PID é: %d\n", getpid());
	}

	sleep(10);

	return 0;
}
