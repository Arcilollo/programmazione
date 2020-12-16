#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
// getppid() consente di conoscere il pid del padre
// getpid() consente di conoscere il pid del figlio

int main() {
	int pidF = fork();

	if (pidF == 0) {
		printf("processo figlio\n");
		printf("il mio pid è %d\n", getpid());
		printf("il pid di mio padre è %d\n", getppid());
	}
	else if (pidF > 0) {
		printf("processo padre\n");
		printf("il mio pid è %d\n", getpid());
		printf("il pid di mio padre è %d\n", getppid());
	}
	sleep(10);

	return 0;
}
