
/**
* This method get all the files and folders on a specific folder
*/
getAllDataOnFolder("folderId")
return [
          {
            "id" : 1
            "type" : "folder"
            "lastModification" : "21/12/12"
            "isFile" : true
            if(isFile==true){
              "artifactName" : "xxx.mp4"
              "artifactPath" : "/amazon/elumen/xxx.mp4"
            }else{
              "folderName" : "folder"
            }
          },
          {},
          {}..
        ]
        
        
/**
* This method move the file or folder into a specific folder
*/
moveFileOrFolder("folderId"(target folder),"fileOrFolder"(File or folder that we want to move))
return 
          if(canMove){
              "doneMsg", "Moved successfully"
          }else{
               "errorMsg","Error trying to move the folder or file"   
          }
          
          
/**
* This method delete the file or folder 
*/
deleteFileOrFolder("fileOrFolder"(File or folder that we want to delete))
return 
          if(canDelete{
              "doneMsg", "Deleted successfully"
          }else{
               "errorMsg","Error trying to delete the folder or file"   
          }        
          
      
