 **POST TEST 2**

Pada post test kali ini sama seperi post test sebelumnya yaitu dibuat untuk mengelola data atlet dengan konsep CRUD (Create, Read, Update, Delete). User bisa menambah atlet baru, menampilkan semua atlet, mengubah data atlet, menghapus atlet, dan keluar dari aplikasi. Namun, pada post test kali ini kita akan memisahkan menjadi 3 packages yaitu:

   - packages main > isinya adalah kode yang menyimpan menu user
   - packages service > menyimpan kode logika CRUD
   -  packages model > menyimpan struktur data seperti atribut dan constructor
     
    
  1.    packages main
       Packages memiliki class MainAtlet yang berfungsi sebagai entry point program. Berikut query nya:
    
    <img width="1108" height="770" alt="image" src="https://github.com/user-attachments/assets/14ae06b9-d6f5-4c9c-9028-3f3fd8c4bc60" />
    

3. packages service
   Packges ini memiliki class AtletService yang berisi logika CRUD dan search.
   Berikut Query nya :
   
   <img width="665" height="314" alt="image" src="https://github.com/user-attachments/assets/cd504a85-65b4-435b-ad00-65e70b581686" />
   
   <img width="808" height="262" alt="image" src="https://github.com/user-attachments/assets/83268775-770d-4972-9c74-3d70edf63079" />
   
<img width="937" height="438" alt="image" src="https://github.com/user-attachments/assets/3886bea3-4632-4b68-ab8e-64f97e5728f8" />

<img width="819" height="299" alt="image" src="https://github.com/user-attachments/assets/fe0755f6-8d35-4a34-923c-b49e2bc77baf" />

berikut Query dari search:

<img width="1106" height="395" alt="image" src="https://github.com/user-attachments/assets/3b3b1a1e-555b-4b5a-a714-0b047d19f1d6" />


3.  packages model
    Dalam packages ini memiliki class yang bernama DataAtlet yang berfungsi untuk merepresentasikan entitas/data atlet. Dalam class ini memiliki properties berupa:
    
     ![WhatsApp Image 2025-09-16 at 06 29 49](https://github.com/user-attachments/assets/6ec4ddf3-6641-4308-a752-2b0f6e09221a)

    Berikut output dari query-query diatas:

<img width="588" height="267" alt="image" src="https://github.com/user-attachments/assets/b3eaccf0-2774-44eb-a51d-42453842ceb9" />

<img width="431" height="273" alt="image" src="https://github.com/user-attachments/assets/6d0d5ad8-1227-49ec-87dc-e5b757ad5911" />

<img width="506" height="284" alt="image" src="https://github.com/user-attachments/assets/53700e61-27cf-4f10-a8eb-c4b08a824bed" />

<img width="431" height="242" alt="image" src="https://github.com/user-attachments/assets/75b59d21-f56e-4121-bac3-449bb26b1a6e" />

<img width="451" height="254" alt="image" src="https://github.com/user-attachments/assets/ca610822-e3f6-47e8-b025-cdf83deeb0f9" />

<img width="400" height="225" alt="image" src="https://github.com/user-attachments/assets/436174f7-cb88-47cb-8e40-36450d3c06e6" />


   

   


