#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>
#include <sys/wait.h>

int CalcoliFiglio1() {
	int k = 3 * 4;
	return k;
}

int CalcoliFiglio2() {
	int k = 2 + 3;
	return k;
}

int CalcoliPadre1() {
	int k = 6 / 2;
	return k;
}

int CalcoliPadre2(int x, int y, int z) {
	int k = x + y + z;
	return k;
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
		y = CalcoliFiglio1();
		exit(y);
	}
	else if (pid2 == 0) {
		z = CalcoliFiglio2();
		exit(z);
	}
	else if (pid1 > 0) {
		x = CalcoliPadre1();
	}

	y = WaitStatus();
	z = WaitStatus();

	R = CalcoliPadre2(x, y, z);
	printf("Z = %d\n", R);

	return 0;
}
