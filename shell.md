# Linux Shell

### Linux vi Editor
* Linux, Unix 환경에 가장 널리 사용되는 Text Editor
* 최초 실행을 하면 명령어 입력상태가 된다.
* i, o(주로 i) : 내용을 추가, 수정, 삭제를 하려면 편집상태로 변환해야한다.
* ESC : 저장, 끝내기 등을 수행하려면 명령어 입력상태가 되어야 한다.

* :w(콜론 w) : 명령어 입력상태, 편집한 내용을 저장하기
* :q : 명령어 입력상태, 현재 편집기를 종료하기
* :wq : 명령어 입력상태에서 편집한 내용을 저장하고 종료하기 동시수행.
* :q! : 편집하는 도중에 문서 내용이 얽히게 되어 내용이 많이 망가질 경우 현재 편집된 내용을 포기하고, 최초에 파일을 열었던 상태로 유지 하고 싶을 때가 있다. -편집포기, 편집된 내용을 저장하지 않고 끝내기

## shell 명령어
#### cd( chdir ) : 현재 작업 디렉토리(폴더)를 변경하는 명령어
* cd 명령만 입력 : 사용자의 home 디렉토리로 이동하는 명령(/home/No-Hyunji)
* cd 디렉토리 이름 : 특정한 디렉토리로 이동하기
* cd /(슬래시) : root 디렉토리로 이동하기, 최상위 디렉토리로 이동하기
* . , .. : 디렉토리 개념에 매우 중요한 개념
* . : 현재 디렉토리, .. : 나의 부모 디렉토리
* cd aaa : 현재 디렉토리에 가지가 붙어있는 aaa 디렉토리로 이동하라
* cd ../aaa : 현재 디렉토리에서 부모 디렉토리로 이동한 후 가지가 붙어있는 aaa
디렉토리로 이동하라
* cd /c/biz/work/java : 일단 root로 이동하고 거기에서 부터 순서대로 biz디렉토리로 이동하고 work로 이동하고 java디렉토리로 이동하라

#### mkdir : 디렉토리 만들기
#### ls : 현재 디렉토리에 저장되어있는 파일, 디렉토리를 보여달라
* 윈도우 CMD(커맨드): dir
* ls -al : 현재 디렉토리에 저장되어있는 파일, 디렉토리를 모두 자세히 모여달라.
숨긴 파일도 보여준다.
* Linux에서 .으로 시작되는 파일은 숨김파일이다. ls 명령어로는 파일을 볼 수없고, ls -al 명령으로만 확인이 된다.
