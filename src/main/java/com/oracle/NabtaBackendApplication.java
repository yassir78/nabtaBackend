package com.oracle;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.oracle.dao.DiseaseDao;
import com.oracle.dao.ImageDao;
import com.oracle.model.Disease;
import com.oracle.model.Image;

@SpringBootApplication
public class NabtaBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(NabtaBackendApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(DiseaseDao diseaseDao, ImageDao imageDao) {
		return (args) -> {
			//French
			Disease potato_early_blight_fr = new Disease();
			potato_early_blight_fr.setLangue("fr");
			potato_early_blight_fr.setNom("Mildiou de la pomme de terre");
			potato_early_blight_fr.setNomScientifique("Alternaria solani");
			potato_early_blight_fr.setSymptoms("     Les symptômes du mildiou se manifestent sur le feuillage, la tige et les fruits plus âgés. Des taches grises à brunes apparaissent sur les feuilles et se développent progressivement de manière concentrique manière autour d'un centre clair - la formation caractéristique «bullseye». Ces lésions sont entourées d'un halo jaune vif. Au fur et à mesure que la maladie progresse, des feuilles entières peuvent devenir chlorotiques et tomber, conduisant à une défoliation importante. Quand les feuilles meurent et tombent, les fruits deviennent plus vulnérable aux brûlures dues au soleil. Le même type de spots avec un centre clair apparaît sur les tiges et les fruits. La pourriture des fruits et parfois la chute s'ensuit.");
			potato_early_blight_fr.setConditions("     Les feuilles inférieures sont souvent infectées au contact du sol contaminé. Des températures chaudes (24-29 ° C) et une humidité élevée (90%) favorisent le développement du maladie. Une longue période humide (ou une alternance de temps humide / sec) améliore la production de spores, qui peuvent se propager par le vent, les éclaboussures de pluie ou l'irrigation par aspersion. Les tubercules récoltés verts ou dans des conditions humides sont particulièrement sensibles à une infection. Il frappe souvent après une période de fortes pluies et est particulièrement destructeur dans les régions tropicales. et les zones subtropicales.");
			potato_early_blight_fr.setManagement("     1. Utilisez des semences ou des greffes certifiées exemptes d'agents pathogènes. \\n\\n2. Recherchez des variétés résistantes à la maladie. \\n\\n3.  Plantez ou transplantez sur des plates-bandes surélevées pour améliorer le drainage. \\n\\n4. Orientez les rangées dans la direction des vents principaux et évitez les zones ombragées. \\n\\n5.  Espacez les plantes pour permettre à la canopée de sécher rapidement après une pluie ou une irrigation. \\n\\n6. Posez du paillis sur le sol pour empêcher les plantes de toucher le sol. \\n\\n7. Surveiller les champs pour détecter les signes de la maladie, en particulier par temps pluvieux. \\n\\n8. Retirez les feuilles du bas qui sont trop près du sol. \\n\\n9. Supprimer les feuilles affichant symptômes et détruisez-les. \\n\\n10. Gardez les plantes fortes et vigoureuses avec un nutrition adéquate. \\n\\n11. Utilisez des piquets pour garder les plantes debout. \\n\\n12. Utilisez un système d'irrigation goutte à goutte pour minimiser l'humidité des feuilles. \\n\\nn13. Arrosez les plantes le matin pour qu'elles sèchent pendant la journée. \\n\\n14. Contrôlez les mauvaises herbes sensibles dans et autour du champ. \\n\\n15. Évitez de travailler dans les champs lorsque les plantes sont mouillées. \\n\\n16. Après la récolte, retirez les débris végétaux et brûlez-les (ne compostez pas). \\n\\n17. Vous pouvez également labourer les débris profondément dans le sol (plus de 45 cm). \\n\\n18. Planifiez une rotation des cultures de 2 ou 3 ans avec des cultures non sensibles. \\n\\n19. Conserver les tubercules à des températures fraîches et dans des sites bien aérés.");
			potato_early_blight_fr.setControl("     Application de produits à base de Bacillus subtilis ou de fongicides à base de cuivre enregistré comme bio peut traiter cette maladie. Envisagez toujours une approche intégrée avec des mesures préventives et des traitements biologiques si disponibles. Il y a de nombreux fongicides sur le marché pour lutter contre le mildiou. Fongicides à base ou des combinaisons d'azoxystrobine, de pyraclostrobine, de difénoconazole, de boscalid, de chlorothalonil, la fenamidone, le manèbe, le mancozèbe, la trifloxystrobine et le zirame peuvent être utilisés. La rotation de différents composés chimiques est recommandée. Appliquer les traitements en temps opportun, en tenant compte des conditions météorologiques. Vérifiez attentivement l'intervalle de pré-récolte auquel vous pouvez récolter en toute sécurité après la application de ces produits.");
			diseaseDao.save(potato_early_blight_fr);
			Stream.of(
					"https://firebasestorage.googleapis.com/v0/b/nabta-38d6a.appspot.com/o/disease%2Fimage%2F1622766282259?alt=media&token=db3d6e7a-76f2-4e20-a177-8947942bbc23",
					"https://firebasestorage.googleapis.com/v0/b/nabta-38d6a.appspot.com/o/disease%2Fimage%2F1622766306355?alt=media&token=a9b7157c-93c8-4080-b338-a7e647faa82c",
					"https://firebasestorage.googleapis.com/v0/b/nabta-38d6a.appspot.com/o/disease%2Fimage%2F1622766332321?alt=media&token=941b735f-c30c-41d4-bbc4-2a2aebbbdc76").forEach(image -> {
						Image img = new Image();
						img.setPath(image);
						img.setDisease(potato_early_blight_fr);
						imageDao.save(img);
					});
			

			Disease potato_late_blight_fr = new Disease();
			potato_late_blight_fr.setLangue("fr");
			potato_late_blight_fr.setNom("Mildiou tardif de la pomme de terre ");
			potato_late_blight_fr.setNomScientifique("Phytophthora infestans");
			potato_late_blight_fr.setSymptoms(
					"     Des taches brun foncé se développent sur les feuilles à partir de la pointe ou des marges des feuilles. Dans les climats humides, ces taches deviennent des lésions imbibées d'eau. Une couverture fongique blanche peut être vue sur la face inférieure des feuilles. Au fur et à mesure que la maladie progresse, des feuilles entières deviennent nécrotiques, brunissent et meurent. Des lésions similaires se développent sur les tiges et les pétioles. Les tubercules de pomme de terre ont des taches bleu grisâtre sur leur peau et leur chair devient également brune, les rendant non comestibles. La pourriture des champs infestés dégage une odeur distinctive.");
			potato_late_blight_fr.setConditions(
					"     potato-late-blight.environement-conditions\": \"Ce champignon est un parasite obligatoire. Cela signifie qu'il doit hiverner dans les débris végétaux et les tubercules ainsi que sur d'autres hôtes pour survivre. Il pénètre dans la plante par des blessures et des déchirures de la peau. Les spores fongiques germent à des températures plus élevées au printemps et se propagent par le vent ou l'eau. La maladie est plus grave pendant les périodes de nuits fraîches (en dessous de 18 ° C), de journées chaudes (18-22 ° C) et de conditions humides prolongées telles que la pluie et le brouillard (90% d'humidité relative). Dans ces conditions, une épidémie de mildiou peut survenir.");
			potato_late_blight_fr.setManagement(
					"     1. Utilisez des graines saines ou des plantes plus tolérantes. \\n\\n2. Assurez-vous que le champ a une bonne ventilation et un sol bien drainé.\\n\\n3. Surveillez les champs et supprimez les plantes infectées et les plantes environnantes.\\n\\n4. Utilisez des rotations de deux à trois ans pour les cultures non hôtes.\\n\\n5. Détruisez les hôtes volontaires dans et autour du terrain.\\n\\n6. Évitez une fertilisation excessive avec de l'azote.\\n\\nn7. Utilisez des fortifiants pour plantes.\\n\\n8. Conservez les tubercules à basse température et avec une bonne ventilation.\\n\\n9. Détruisez les tubercules et les débris végétaux après la récolte en les enterrant à deux pieds de profondeur ou en les nourrissant aux animaux.");
			potato_late_blight_fr.setControl(
					"     Appliquer des fongicides à base de cuivre avant le temps sec. Les pulvérisations foliaires d'agents d'enrobage organiques peuvent également prévenir l'infection. Envisagez toujours une approche intégrée avec des mesures préventives ainsi que des traitements biologiques si disponibles. Les applications de fongicides sont importantes pour lutter contre le mildiou, en particulier dans les zones humides. Les fongicides de contact qui recouvrent les feuilles sont efficaces avant les infections et ne déclenchent pas de résistance chez les champignons. Les fongicides contenant du mandipropamide, du chlorothalonil, du fluaziname ou du mancozèbe peuvent également être utilisés comme traitement préventif. Le traitement des semences avant le semis avec des fongicides comme le mancozèbe fonctionne également.");
			diseaseDao.save(potato_late_blight_fr);
			Stream.of(
					"https://firebasestorage.googleapis.com/v0/b/nabta-38d6a.appspot.com/o/disease%2Fimage%2F1622766355934?alt=media&token=d21a12f2-5f02-4639-bb72-774881b852ed",
					"https://firebasestorage.googleapis.com/v0/b/nabta-38d6a.appspot.com/o/disease%2Fimage%2F1622766373539?alt=media&token=77acc0b2-94cd-4bde-ada8-a9653b0ad808",
					"https://firebasestorage.googleapis.com/v0/b/nabta-38d6a.appspot.com/o/disease%2Fimage%2F1622766402920?alt=media&token=63216d79-c2b9-4ffa-86fb-633246ed3d1b")
					.forEach(image -> {
						Image img = new Image();
						img.setPath(image);
						img.setDisease(potato_late_blight_fr);
						imageDao.save(img);
					});

			Disease tomato_early_blight_fr = new Disease();
			tomato_early_blight_fr.setLangue("fr");
			tomato_early_blight_fr.setNom("Mildiou des tomates");
			tomato_early_blight_fr.setNomScientifique("Alternaria Solani");
			tomato_early_blight_fr.setSymptoms(
					"     Les symptômes du mildiou se manifestent sur le feuillage, la tige et les fruits plus âgés. Des taches grises à brunes apparaissent sur les feuilles et se développent progressivement de manière concentrique autour d'un centre clair - la formation caractéristique de «bullseye». Ces lésions sont entourées d'un halo jaune vif. Au fur et à mesure que la maladie progresse, des feuilles entières peuvent devenir chlorotiques et tomber, entraînant une défoliation importante. Lorsque les feuilles meurent et tombent, les fruits deviennent plus vulnérables aux brûlures dues au soleil. Le même type de taches avec un centre clair apparaît sur les tiges et les fruits. La pourriture des fruits et parfois la chute s'ensuit.");
			tomato_early_blight_fr.setConditions(
					"     Des températures chaudes (24-29 ° C) et une humidité élevée (90%) favorisent le développement de la maladie. Une longue période humide (ou une alternance de temps humide / sec) améliore la production de spores, qui peuvent se propager par le vent, les éclaboussures de pluie ou l'irrigation par aspersion. Les tubercules récoltés verts ou dans des conditions humides sont particulièrement sensibles à une infection. Il frappe souvent après une période de fortes pluies et est particulièrement destructeur dans les zones tropicales et subtropicales.");
			tomato_early_blight_fr.setManagement(
					"     1. Recherchez des variétés résistantes à la maladie. \\n\\n2. Plantez ou transplantez sur des plates-bandes surélevées pour améliorer le drainage. \\n\\n3. Utilisez des semences ou des greffes certifiées exemptes d'agents pathogènes. \\n\\n4. Orientez les rangées dans la direction des vents principaux et évitez les zones ombragées. \\n\\n5. Espacez les plantes pour permettre à la canopée de sécher rapidement après une pluie ou une irrigation. \\n\\n6. Posez du paillis sur le sol pour empêcher les plantes de toucher le sol. \\n\\n7. Surveillez les champs pour détecter les signes de la maladie, en particulier par temps pluvieux. \\n\\n8. Sinon, labourez les débris profondément dans le sol (plus de 45 cm).");
			tomato_early_blight_fr.setControl(
					"     1. L'application de produits à base de Bacillus subtilis ou de fongicides à base de cuivre enregistrés comme biologiques peut traiter cette maladie. \\n\\n2. Envisagez toujours une approche intégrée avec des mesures préventives et des traitements biologiques si disponibles. Il existe de nombreux fongicides sur le marché pour lutter contre le mildiou. Des fongicides à base ou des combinaisons d'azoxystrobine, de pyraclostrobine, de difénoconazole, de boscalid, de chlorothalonil, de fenamidone, de manèbe, de mancozèbe, de trifloxystrobine et de zirame peuvent être utilisés. La rotation de différents composés chimiques est recommandée. Appliquer les traitements en temps opportun, en tenant compte des conditions météorologiques. Vérifiez soigneusement l'intervalle de pré-récolte auquel vous pouvez récolter en toute sécurité après l'application de ces produits. \\n\\n3. Biofongicides: Il existe une souche de bactéries efficace pour traiter la rouille du pommier du cèdre sur les pommiers. C'est une souche spéciale de Bacillus subtilis");
			diseaseDao.save(tomato_early_blight_fr);
			Stream.of(
					"https://firebasestorage.googleapis.com/v0/b/nabta-38d6a.appspot.com/o/disease%2Fimage%2F1622766728962?alt=media&token=680c723d-0854-49ad-b12b-59cdd4a2b405",
					"https://firebasestorage.googleapis.com/v0/b/nabta-38d6a.appspot.com/o/disease%2Fimage%2F1622766680713?alt=media&token=a3363f57-f7a1-4075-82b4-7e29015f2664",
					"https://firebasestorage.googleapis.com/v0/b/nabta-38d6a.appspot.com/o/disease%2Fimage%2F1622766704688?alt=media&token=23c02efe-4a44-4895-8e65-86ecbf6a2722")
					.forEach(image -> {
						Image img = new Image();
						img.setPath(image);
						img.setDisease(tomato_early_blight_fr);
						imageDao.save(img);
					});

			Disease tomato_late_blight_fr = new Disease();
			tomato_late_blight_fr.setLangue("fr");
			tomato_late_blight_fr.setNom("Mildiou tardif des tomates");
			tomato_late_blight_fr.setNomScientifique("Phytophthora infestans");
			tomato_late_blight_fr.setSymptoms(
					"     Des tâches vertes brunâtres apparaissent sur les marges et le sommet des feuilles. Plus tard, de grandes zones des feuilles deviennent complètement brunes. Par temps humide, les lésions sur la face inférieure des feuilles peuvent être couvertes d'une croissance moisie grise à blanche, ce qui permet de distinguer plus facilement les tissus des feuilles saines des feuilles mortes. Au fur et à mesure que la maladie progresse, le feuillage brunit, s'enroule et sèche. Dans certains cas, les taches brunes nettement délimitées et la couverture blanche apparaissent également sur les tiges, les branches et les pétioles. Des tâches vertes grisâtres à brun sale et ridées apparaissent sur les fruits. À ces endroits, la chair du fruit est durcie.");
			tomato_late_blight_fr.setConditions(
					"     Le champignon pénètre dans la plante par des blessures et des déchirures dans la peau. La température et l’humidité sont les facteurs environnementaux les plus importants qui influent sur le développement de la maladie. Les champignons du mildiou poussent le mieux dans les humidités relatives élevées (environ 90 %) et dans des plages de température de 18 à 26°C.  Le temps chaud et sec de l’été peut mettre un terme à la propagation de la maladie.");
			tomato_late_blight_fr.setManagement(
					"     1. Les tomates et les pommes de terre ne doivent pas être cultivées l’une à côté de l’autre.\\n\\n2. Essayez de garder les plantes au sec bien qu’un bon drainage et la ventilation de vos cultures. \\n\\n3. L’installation d’un abri de pluie transparent simple à l’aide d’une bâche et de pieux en bois pourrait aider. \\n\\n4. Les engrais contenant du silicate peuvent augmenter la résistance au champignon, en particulier au stade du semis. nn5. Évitez l’irrigation tard dans la journée et irriguer les plantes au niveau du sol.  \\n\\n6. Utilisez le fortificateur de plantes pour le renforcement général des plantes. \\n\\n7. La rotation des cultures de deux à trois ans avec les cultures non hôtes est recommandée.\\n\\n8. Achetez des semences saines auprès de détaillants fiables.");
			tomato_late_blight_fr.setControl(
					"     1. À ce stade, il n’existe aucun contrôle biologique de l’efficacité connue contre le mildiou. Pour éviter de se propager, enlever et détruire immédiatement les plantes autour de l’endroit infecté et ne compostez pas les matières végétales infectées.  \\n\\n2. Toujours envisager une approche intégrée avec des mesures préventives ainsi que des traitements biologiques si disponible. Utilisez des sprays fongicides à base de mandipropamid, chlorothalonil, fluazinam, mancozeb pour combattre le mildiou. Les fongicides ne sont généralement nécessaires que si la maladie apparaît à une période de l’année où la pluie est probable ou si l’irrigation aérienne est pratiquée. .\\n\\n3. Biofungicides : Il existe une souche de bactéries qui est efficace pour traiter la rouille des pommiers sur les pommiers. C’est une souche spéciale de Bacillus subtilis");
			diseaseDao.save(tomato_late_blight_fr);
			Stream.of(
					"https://firebasestorage.googleapis.com/v0/b/nabta-38d6a.appspot.com/o/disease%2Fimage%2F1622766761186?alt=media&token=06bc70ee-79fd-4e5a-bfc9-5fe021631449",
					"https://firebasestorage.googleapis.com/v0/b/nabta-38d6a.appspot.com/o/disease%2Fimage%2F1622766784105?alt=media&token=fe57f2d3-8b63-46c0-ad10-c447faaf2863",
					"https://firebasestorage.googleapis.com/v0/b/nabta-38d6a.appspot.com/o/disease%2Fimage%2F1622766810846?alt=media&token=dbf5b7f6-6ce3-4073-bc86-80f7b09fdda1")
					.forEach(image -> {
						Image img = new Image();
						img.setPath(image);
						img.setDisease(tomato_late_blight_fr);
						imageDao.save(img);
					});

			// English

			Disease potato_early_blight_en = new Disease();
			potato_early_blight_en.setLangue("en");
			potato_early_blight_en.setNom("Potato Early Blight");
			potato_early_blight_en.setNomScientifique("Alternaria solani");
			potato_early_blight_en.setSymptoms(
					"      Symptoms of early blight occur on older foliage, stem, and fruits. Gray to brown spots appear on leaves and gradually grow in a concentric manner around a clear center - the characteristic “bullseye” formation. These lesions are surrounded by a bright yellow halo. As the disease progresses, entire leaves may turn chlorotic and shed, leading to significant defoliation. When leaves die and fall, fruits become more vulnerable to sun scald. The same type of spots with a clear center appears on stems and fruits. Rotting of fruits and sometimes dropping follows.");
			potato_early_blight_en.setConditions(
					"     Lower leaves often get infected when in contact with contaminated soil. Warm temperatures (24-29°C) and high humidity (90%) favor development of the disease. A long wet period (or alternating wet/dry weather) enhances the production of spores, which may be spread via wind, splashing rain or overhead irrigation. Tubers harvested green or in wet conditions are particularly susceptible to an infection. It often strikes after a period of heavy rainfall and is particularly destructive in tropical and subtropical areas.");
			potato_early_blight_en.setManagement(
					"     1. Use certified pathogen-free seeds or transplants.\\n\\n2. Look for varieties that are resistant to the disease.\\n\\n3. Plant or transplant on raised beds to improve drainage.\\n\\n4. Orient rows in the direction of main winds and avoid shaded areas.\\n\\n5. Space plants to allow the canopy to dry quickly after rainfall or irrigation.\\n\\n6. Lay mulch on the soil to keep plants from touching the soil. \\n\\n7. Monitor fields for signs of the disease, particularly during wet weather. \\n\\n8. Remove bottom leaves that are too close to the soil.\\n\\n9. Remove leaves displaying symptoms and destroy them.\\n\\n10. Keep plants strong and vigorous with an adequate nutrition.\\n\\n11. Use stakes to keep plants upright.\\n\\n12. Use a drip irrigation system to minimize leaf wetness.\\n\\nn13. Water plants in the morning so plants dry during the day.\\n\\n14. Control susceptible weeds in and around the field.\\n\\n15. Avoid working in fields when plants are wet.\\n\\n16. After harvest, remove plant debris and burn them (do not compost).\\n\\n17. Alternatively, plow debris deep in the soil (more than 45 cm).\\n\\n18. Plan a 2- or 3-year crop rotation with non-susceptible crops.\\n\\n19. Store tubers at cool temperatures and in well-aerated sites.");
			potato_early_blight_en.setControl(
					"     Application of products based on Bacillus subtilis or copper-based fungicides registered as organic can treat this disease. Always consider an integrated approach with preventive measures and biological treatments if available. There are numerous fungicides on the market for controlling early blight. Fungicides based on or combinations of azoxystrobin, pyraclostrobin, difenoconazole, boscalid, chlorothalonil, fenamidone, maneb, mancozeb, trifloxystrobin, and ziram can be used. Rotation of different chemical compounds is recommended. Apply treatments in a timely manner, taking into account weather conditions. Check carefully the preharvest interval at which you can harvest safely after the application of these products.");
			diseaseDao.save(potato_early_blight_en);
			Stream.of(
					"https://firebasestorage.googleapis.com/v0/b/nabta-38d6a.appspot.com/o/disease%2Fimage%2F1622766282259?alt=media&token=db3d6e7a-76f2-4e20-a177-8947942bbc23",
					"https://firebasestorage.googleapis.com/v0/b/nabta-38d6a.appspot.com/o/disease%2Fimage%2F1622766306355?alt=media&token=a9b7157c-93c8-4080-b338-a7e647faa82c",
					"https://firebasestorage.googleapis.com/v0/b/nabta-38d6a.appspot.com/o/disease%2Fimage%2F1622766332321?alt=media&token=941b735f-c30c-41d4-bbc4-2a2aebbbdc76")
					.forEach(image -> {
						Image img = new Image();
						img.setPath(image);
						img.setDisease(potato_early_blight_en);
						imageDao.save(img);
					});

			Disease potato_late_blight_en = new Disease();
			potato_late_blight_en.setLangue("en");
			potato_late_blight_en.setNom("Potato Late Blight");
			potato_late_blight_en.setNomScientifique("Phytophthora infestans");
			potato_late_blight_en.setSymptoms(
					"     Dark brown spots develop on the leaves starting at the tip or the leaf margins. In humid climates, these spots become water-soaked lesions. A white fungal covering can be seen on the underside of the leaves. As the disease progresses, entire leaves become necrotic, turn brown and die off. Similar lesions develop on stems and petioles. The potato tubers have greyish-blue spots on their skin and their flesh also turns brown, making them inedible. The rotting of the infested fields emits a distinctive odor.");
			potato_late_blight_en.setConditions(
					"     This fungus is an obligate parasite. This means that it must overwinter in plant debris and tubers as well as on alternative hosts to survive. It enters the plant via wounds and rips in the skin. Fungal spores germinate at higher temperatures during the spring and spread through wind or water. The disease is more severe in periods of cool nights (below 18°C), warm days (18-22°C), and extended wet conditions such as rain and fog (90% relative humidity). In these conditions, a late blight epidemic can occur.");
			potato_late_blight_en.setManagement(
					"     1. Use healthy seeds or more tolerant plants.\\n\\n2. Make sure the field has good air ventilation and well-drained soil.\\n\\n3. Monitor fields and remove infected plants and surrounding ones.\\n\\n4. Use rotations of two to three years to non-host crops.\\n\\n5. Destroy volunteer hosts in and around the field.\\n\\n6. Avoid excessive fertilization with nitrogen.\\n\\n7. Use plant fortifiers.\\n\\n8. Store tubers at low temperatures and with good ventilation.\\n\\n9. Destroy tubers and plant debris after harvest burying them two feet deep or feeding them to animals.");
			potato_late_blight_en.setControl(
					"     Apply copper-based fungicides before dry weather. Foliar sprays of organic coating agents can also prevent the infection. Always consider an integrated approach with preventive measures together with biological treatments if available. Fungicide applications are important to control late blight, particularly in humid areas. Contact fungicides that coat leaves are effective before infections and do not trigger resistance in the fungi. Fungicides containing mandipropamid, chlorothalonil, fluazinam, or mancozeb can also be used as a preventive treatment. Seed treatment before sowing with fungicides like mancozeb also work.");
			diseaseDao.save(potato_late_blight_en);
			Stream.of(
					"https://firebasestorage.googleapis.com/v0/b/nabta-38d6a.appspot.com/o/disease%2Fimage%2F1622766355934?alt=media&token=d21a12f2-5f02-4639-bb72-774881b852ed",
					"https://firebasestorage.googleapis.com/v0/b/nabta-38d6a.appspot.com/o/disease%2Fimage%2F1622766373539?alt=media&token=77acc0b2-94cd-4bde-ada8-a9653b0ad808",
					"https://firebasestorage.googleapis.com/v0/b/nabta-38d6a.appspot.com/o/disease%2Fimage%2F1622766402920?alt=media&token=63216d79-c2b9-4ffa-86fb-633246ed3d1b")
					.forEach(image -> {
						Image img = new Image();
						img.setPath(image);
						img.setDisease(potato_late_blight_en);
						imageDao.save(img);
					});

			Disease tomato_early_blight_en = new Disease();
			tomato_early_blight_en.setLangue("en");
			tomato_early_blight_en.setNom("Tomato Early Blight");
			tomato_early_blight_en.setNomScientifique("Alternaria Solani");
			tomato_early_blight_en.setSymptoms(
					"      Symptoms of early blight occur on older foliage, stem, and fruits. Gray to brown spots appear on leaves and gradually grow in a concentric manner around a clear center - the characteristic “bullseye” formation. These lesions are surrounded by a bright yellow halo. As the disease progresses, entire leaves may turn chlorotic and shed, leading to significant defoliation. When leaves die and fall, fruits become more vulnerable to sun scald. The same type of spots with a clear center appears on stems and fruits. Rotting of fruits and sometimes dropping follows.");
			tomato_early_blight_en.setConditions(
					"     Warm temperatures (24-29°C) and high humidity (90%) favor development of the disease. A long wet period (or alternating wet/dry weather) enhances the production of spores, which may be spread via wind, splashing rain or overhead irrigation. Tubers harvested green or in wet conditions are particularly susceptible to an infection. It often strikes after a period of heavy rainfall and is particularly destructive in tropical and subtropical areas.");
			tomato_early_blight_en.setManagement(
					"     1. Look for varieties that are resistant to the disease.\\n\\n2. Plant or transplant on raised beds to improve drainage.\\n\\n3. Use certified pathogen-free seeds or transplants. \\n\\n4. Orient rows in the direction of main winds and avoid shaded areas.\\n\\n5. Space plants to allow the canopy to dry quickly after rainfall or irrigation. \\n\\n6. Lay mulch on the soil to keep plants from touching the soil. \\n\\n7. Monitor fields for signs of the disease, particularly during wet weather.\\n\\n8. Alternatively, plow debris deep in the soil (more than 45 cm).");
			tomato_early_blight_en.setControl(
					"     1. Application of products based on Bacillus subtilis or copper-based fungicides registered as organic can treat this disease.  \\n\\n2. Always consider an integrated approach with preventive measures and biological treatments if available. There are numerous fungicides on the market for controlling early blight. Fungicides based on or combinations of azoxystrobin, pyraclostrobin, difenoconazole, boscalid, chlorothalonil, fenamidone, maneb, mancozeb, trifloxystrobin, and ziram can be used. Rotation of different chemical compounds is recommended. Apply treatments in a timely manner, taking into account weather conditions. Check carefully the preharvest interval at which you can harvest safely after the application of these products.\\n\\n3. Biofungicides: There is a strain of bacteria that is effective at treating cedar apple rust on apple trees. It is a special strain of Bacillus subtilis");
			diseaseDao.save(tomato_early_blight_en);
			Stream.of(
					"https://firebasestorage.googleapis.com/v0/b/nabta-38d6a.appspot.com/o/disease%2Fimage%2F1622766728962?alt=media&token=680c723d-0854-49ad-b12b-59cdd4a2b405",
					"https://firebasestorage.googleapis.com/v0/b/nabta-38d6a.appspot.com/o/disease%2Fimage%2F1622766680713?alt=media&token=a3363f57-f7a1-4075-82b4-7e29015f2664",
					"https://firebasestorage.googleapis.com/v0/b/nabta-38d6a.appspot.com/o/disease%2Fimage%2F1622766704688?alt=media&token=23c02efe-4a44-4895-8e65-86ecbf6a2722")
					.forEach(image -> {
						Image img = new Image();
						img.setPath(image);
						img.setDisease(tomato_early_blight_en);
						imageDao.save(img);
					});

			Disease tomato_late_blight_en = new Disease();
			tomato_late_blight_en.setLangue("en");
			tomato_late_blight_en.setNom("Tomato Late Blight");
			tomato_late_blight_en.setNomScientifique("Phytophthora infestans");
			tomato_late_blight_en.setSymptoms(
					"     Brownish-green spots appear on the leaf margins and leaf tops. Later, large areas of the leaves turn brown completely. During wet weather, lesions on the lower side of the leaves may be covered with a gray to white moldy growth, making it easier to distinguish healthy from dead leaf tissue. As the disease progresses, the foliage runs brown, curls and dries. In some cases, the sharply delimited brown spots and the white covering also appear on the stems, branches, and petioles. Greyish-green to dirty-brown and wrinkled stains appear on the fruits. At these spots, the fruit flesh is hardened.");
			tomato_late_blight_en.setConditions(
					"     The fungus enters the plant via wounds and rips in the skin. Temperature and moisture are the most important environmental factors affecting the development of the disease. Late blight fungi grow best in high relative humidities (around 90%) and in temperature ranges of 18 to 26°C. Warm and dry summer weather can bring the spread of the disease to a halt.");

			tomato_late_blight_en.setManagement(
					"     1. Tomatoes and potatoes should not be cultivated next to each other.\\n\\n2. Try to keep plants dry though good drainage and ventilation of your cultures. \\n\\n3. Installing a simple transparent rain shelter with the help of a tarpaulin and wooden stakes might help. \\n\\n4. Silicate-containing fertilizers may increase the resistance to the fungus, especially in the seedling stage. \\n\\n5. Avoid irrigation late in the day and irrigate plants at ground level.  \\n\\n6. Use plant fortifier for general strengthening of the plants. \\n\\n7. Crop rotation of two to three years with non-host crops is recommended.\\n\\n8. Purchase healthy seeds from reliable retailers.");
			tomato_late_blight_en.setControl(
					"     1. At this point, there is no biological control of known efficacy against late blight. To avoid spreading, remove and destroy plants around the infected spot immediately and do not compost infected plant material.  \\n\\n2. Always consider an integrated approach with preventive measures together with biological treatments if available. Use fungicide sprays based on mandipropamid, chlorothalonil, fluazinam, mancozeb to combat late blight. Fungicides are generally needed only if the disease appears during a time of year when rain is likely or overhead irrigation is practiced. .\\n\\n3. Biofungicides: There is a strain of bacteria that is effective at treating cedar apple rust on apple trees. It is a special strain of Bacillus subtilis");
			diseaseDao.save(tomato_late_blight_en);
			Stream.of(
					"https://firebasestorage.googleapis.com/v0/b/nabta-38d6a.appspot.com/o/disease%2Fimage%2F1622766761186?alt=media&token=06bc70ee-79fd-4e5a-bfc9-5fe021631449",
					"https://firebasestorage.googleapis.com/v0/b/nabta-38d6a.appspot.com/o/disease%2Fimage%2F1622766784105?alt=media&token=fe57f2d3-8b63-46c0-ad10-c447faaf2863",
					"https://firebasestorage.googleapis.com/v0/b/nabta-38d6a.appspot.com/o/disease%2Fimage%2F1622766810846?alt=media&token=dbf5b7f6-6ce3-4073-bc86-80f7b09fdda1")
					.forEach(image -> {
						Image img = new Image();
						img.setPath(image);
						img.setDisease(tomato_late_blight_en);
						imageDao.save(img);
					});
			
			
			
			
		
			
			

		};

	}

}
