class Product{
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category){
        this.productId=productId;
        this.productName=productName;
        this.category=category;
    }
}

public class ECommerce{
    public static int linearSearch(Product[] products, String targetName){
        for(int i=0;i<products.length;i++){
            if(products[i].productName.equals(targetName)){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(Product[] products, String targetName){
        int low=0;
        int high=products.length-1;

        while(low<=high){
            int mid=(low+high)/2;
            int comparison=products[mid].productName.compareTo(targetName);
            if(comparison==0){
                return mid;
            }
            else if(comparison<0){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Product[] products={
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shirt", "Clothing"),
            new Product(103, "Book", "Education"),
            new Product(104, "Phone", "Electronics")            
        };

        Product[] sortedProducts={
            new Product(103, "Book", "Education"),
            new Product(103, "Laptop", "Elctronics"),
            new Product(104, "Phone", "Electronics"),
            new Product(102, "Shirt", "Clothing")
        };

        int linearResult=linearSearch(products, "Phone");
        int binaryResult=binarySearch(sortedProducts, "Phone");

        System.out.println("Linear Search Index: "+linearResult);
        System.out.println("Binary Search Index: "+binaryResult);
    }
}