package kodlama.io.rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.rentACar.entities.concretes.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer> {
	
   //veritabanı işleri yapacak sınıflara repo ismi verilir ya da dao verilir
	//List<Brand> getAll(); //getall çağıran birsi markaları listeler.
}
	
