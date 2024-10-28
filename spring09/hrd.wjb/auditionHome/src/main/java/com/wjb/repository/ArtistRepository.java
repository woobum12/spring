package com.wjb.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.wjb.dto.ArtistDTO;

@Repository
@Mapper
public interface ArtistRepository {
	
	// --참가자 참가 등록 ---------------------------

		// insert어노테이션 사용법1
	
		@Insert("INSERT INTO artistTBL \r\n" + "VALUES " +
				"(#{artist_id},#{artist_name},#{artist_birth},#{artist_gender},#{talent},#{agency})")
		@Options(useGeneratedKeys = true, keyProperty = "artist_id")
		public int insertOne(ArtistDTO artistDTO);
		
		// insert어노테이션 사용법2_ 더간단함
//		@Insert("""
//				<script>
//				INSERT INTO artistTBL 
//				set
//					artist_id=#{artist_id}, artist_name=#{artist_name}, 
//					artist_birth=#{artist_birth}, artist_gender=#{artist_gender}, 
//					talent=#{talent}, agency=#{agency}
//				</script>
//				""")
//		public int insertOne(ArtistDTO artistDTO);
		
		// --참가자목록조회 기본 --------------------------
		
		@Select("SELECT * from artistTBL")
		public List<ArtistDTO> selectAll_basic();
		
		// -- 참가자목록 조회
		@Select("SELECT \r\n" +"artist_id, \r\n" + "artist_name, \r\n"
					+"DATE_FORMAT(artist_birth, '%Y년 %m월 %d일') AS artist_birth,\r\n" + "case\r\n"
					+"when artist_gender='F' then '남성'\r\n" +"case\r\n"
					+"ELSE '기타'\r\n" +"end AS artist_gender,\r\n"+"case\r\n"
					+"when talent='1' then '보컬'\r\n" +"when talent='2'then '댄스'\r\n"
					+"when talent='3' then '랩'\r\n" +"ELSE'기타'\r\n" +"end AS talent,\r\n" +"agency\r\n"
					+"FROM artistTBL\r\n" + "ORDER BY artist_id")
		public List<ArtistDTO> selectAll();
		
		// --참가자목록조회 한명
		@Select("SELECT * FROM artisttbl WHERE artist_id = #{artist_id}")
		public ArtistDTO selectOne(String artist_id);
		
		// --참가자 정보 수정 -------------------
		@Update("""
					<script>
					UPDATE artisttbl
					SET artist_name=#{artist_name}, artist_birth=#{artist_birth},
						artist_gender=#{artist_gender}, talent=#{talent},
						agency=#{agency}
					WHERE artist_id=#{artist_id}
					</script>
					""")
		public void update(ArtistDTO artistDTO);
				""")
}
