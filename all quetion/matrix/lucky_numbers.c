/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* luckyNumbers(int** matrix, int matrixSize, int* matrixColSize, int* returnSize) {

    int m=matrixSize;
    int n=matrixColSize[0];
    
    int* result=(int*)malloc(sizeof(int)*50);
     *returnSize=0;

    int i,j;
    int minRow[50];
    int maxCol[50];

    //min number in row 

    for(i=0;i<m;i++){
        minRow[i]=matrix[i][0];
        for(j=1;j<n;j++){
            if(matrix[i][j] < minRow[i]){
                minRow[i]=matrix[i][j];
            }

        }
    }

    //max in col

    for(j=0;j<n;j++){
        maxCol[j]=matrix[0][j];
        for(i=1;i<m;i++){
            if(matrix[i][j] > maxCol[j]){
                maxCol[j]=matrix[i][j];

            }
        }
    }


    //lucky no
    for(i=0;i<m;i++){
        for(j=0;j<n;j++){
            if(matrix[i][j]== minRow[i] && matrix[i][j]== maxCol[j]){
                result[*returnSize] = matrix[i][j];
                (*returnSize)++;
            }
        }

    }

    return result;
 


  

   
    
}