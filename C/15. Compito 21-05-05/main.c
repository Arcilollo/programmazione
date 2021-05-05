#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>
#include <sys/wait.h>

int F1() {
	return 3 * 4;
}

int F2() {
	return 2 + 3;
}

int P1() {
	return 6 / 2;
}

int WaitStatus() {
	int pid_wait, status;
	pid_wait = wait(&status);
	return WEXITSTATUS(status);
}

int main() {
	int pid1, pid2;

	int x, y, z;
	int R;

	pid1 = fork();

	if (pid1 > 0)
		pid2 = fork();


	if (pid1 == 0) {
		exit(F1());
	}
	else if (pid2 == 0) {
		exit(F2());
	}
	else if (pid1 > 0) {
		y = WaitStatus();
		z = WaitStatus();

		x = P1();

		R = x + y + z;
	}

	printf("Z = %d\n", R);


	return 0;
}
