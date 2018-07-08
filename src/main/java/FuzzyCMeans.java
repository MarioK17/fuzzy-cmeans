import org.apache.commons.math3.ml.clustering.CentroidCluster;
import org.apache.commons.math3.ml.clustering.FuzzyKMeansClusterer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FuzzyCMeans {

    public static void main(String[] args) {

        List<Universidad> universidades = Arrays.asList(new Universidad("Adelphi ",70,40,2),
                new Universidad("Arizona-State ",80,60,3),
                new Universidad("Boston-College ",50,40,4),
                new Universidad("Boston-University ",60,40,4),
                new Universidad("Brown ",20,50,5),
                new Universidad("Cal-Tech ",15,90,5),
                new Universidad("Carnegie-Mellon ",40,50,4),
                new Universidad("Case-Western ",85,35,3),
                new Universidad("CCNY ",80,60,3),
                new Universidad("Colgate ",40,40,4),
                new Universidad("Columbia ",30,50,5),
                new Universidad("Cooper-Union ",20,65,3),
                new Universidad("Cornell ",30,50,5),
                new Universidad("Dartmouth ",20,60,5),
                new Universidad("Florida-Tech ",60,50,3),
                new Universidad("Florida-state ",60,50,3),
                new Universidad("Georgia-Tech ",60,50,4),
                new Universidad("Harvard ",20,80,5),
                new Universidad("Hofstra ",70,50,2),
                new Universidad("Illinois-Tech ",50,60,3),
                new Universidad("Johns-Hopkins ",50,40,5),
                new Universidad("MIT ",30,60,5),
                new Universidad("University-of-Montana ",90,60,3),
                new Universidad("Morgan-state ",70,50,2),
                new Universidad("New-Jersey-Tech ",50,60,3),
                new Universidad("NYU ",50,60,4),
                new Universidad("Pratt ",50,60,3),
                new Universidad("Princeton ",20,60,5),
                new Universidad("Rensselaer ",50,30,4),
                new Universidad("Rochester-Tech ",70,50,3),
                new Universidad("Stanford ",20,70,5),
                new Universidad("Stevens ",60,40,3),
                new Universidad("Temple ",70,60,2),
                new Universidad("Texas-A ",80,70,3),
                new Universidad("University-of-California-Berkely ",50,70,5),
                new Universidad("University-of-California-Davis ",70,70,4),
                new Universidad("UCLA ",80,70,4),
                new Universidad("University-of-California-San-Diego ",80,65,4),
                new Universidad("University-of-California-Santa-Cruz ",70,60,4),
                new Universidad("University-of-Maine ",90,50,2),
                new Universidad("University-of-Oklahoma ",90,70,3),
                new Universidad("University-of-Penn ",40,50,5),
                new Universidad("University-of-San-Francisco ",60,60,3),
                new Universidad("USC ",70,50,4),
                new Universidad("Worcester ",50,50,4),
                new Universidad("Yale ",20,60,5),
                new Universidad("ABILENE-CHRISTIAN-UNIVERSITY ",90,80,2),
                new Universidad("BRANDEIS0 ",70,40,4),
                new Universidad("EMORY0 ",60,30,4),
                new Universidad("GEORGETOWN1 ",30,50,4),
                new Universidad("CLARK-UNIVERSITY1 ",60,30,4),
                new Universidad("UNIVERSITY-OF-PITTSBURGH1 ",80,50,3),
                new Universidad("UNIVERSITY-OF-ROCHESTER1 ",70,30,4),
                new Universidad("UNIVERSITY-OF-WASHINGTON1 ",70,60,4),
                new Universidad("BRANDEIS1 ",75,35,4),
                new Universidad("HUNTINGTON-COLLEGE ",90,65,3),
                new Universidad("TUFTS1 ",75,35,4),
                new Universidad("TRINITY-COLLEGE ",45,35,4),
                new Universidad("UNIVERSITY-OF-PORTLAND ",90,50,3),
                new Universidad("FLORIDA-ACADEMIC-UNIVERSITY ",80,60,2),
                new Universidad("BENNINGTON0 ",80,55,4),
                new Universidad("JUILLIARD0 ",50,95,4),
                new Universidad("MESA ",95,55,2),
                new Universidad("HAMPSHIRE-COLLEGE1 ",75,50,3),
                new Universidad("RUTGERS2 ",55,35,3),
                new Universidad("UNIVERSITY-OF-PENNSYLVANIA1 ",40,50,5),
                new Universidad("UNIVERSITY-OF-GEORGIA1 ",70,50,2),
                new Universidad("GOLDEN-GATE-COLLEGE ",10,50,2),
                new Universidad("AUGSBURG ",85,50,1),
                new Universidad("VANDERBILT ",60,25,4),
                new Universidad("UNIVERSITY-OF-ALABAMA ",70,50,2),
                new Universidad("AUBURN ",90,60,2),
                new Universidad("GEORGETOWN2 ",30,10,4),
                new Universidad("WASHINGTON-AND-LEE0 ",50,30,4),
                new Universidad("RUTGERS3 ",70,50,4),
                new Universidad("QUEENS ",70,50,4),
                new Universidad("BARUCH ",60,50,3),
                new Universidad("RENSSELAER0 ",50,40,3),
                new Universidad("NICHOLLS-STATE ",10,70,2),
                new Universidad("BOSTON-COLLEGE0 ",30,20,4),
                new Universidad("TOURO ",60,30,3),
                new Universidad("EASTERN-MICHIGAN ",70,30,2),
                new Universidad("SUNY-STONY-BROOK2 ",60,30,4),
                new Universidad("GEORGETOWN ",30,70,4),
                new Universidad("UNIVERSITY-OF-MICHIGAN0 ",70,55,5),
                new Universidad("OREGON-STATE0 ",90,85,3),
                new Universidad("UNIVERSITY-OF-PITTSBURGH ",75,55,3),
                new Universidad("UNIVERSITY-OF-MISSOURI ",65,65,2),
                new Universidad("UNIVERSITY-OF-KANSAS ",80,50,4),
                new Universidad("UNIVERSITY-OF-EVANSVILLE ",80,50,3),
                new Universidad("UNIVERSITY-OF-LOWELL ",60,30,3),
                new Universidad("OKLAHOMA-STATE-UNIVERSITY ",80,40,4),
                new Universidad("POLYTECHNIC-INSTITUTE-OF-NEWYORK1 ",75,45,3),
                new Universidad("TUFTS0 ",35,40,4),
                new Universidad("RUTGERS1 ",70,50,3),
                new Universidad("SETON-HALL ",65,45,3),
                new Universidad("UNIVERSITY-OF-PITTSBURGH0 ",70,30,3),
                new Universidad("BARNARD ",60,20,4),
                new Universidad("UNIVERSITY-OF-MASSACHUSETTS-AMHERST0 ",80,20,3),
                new Universidad("FORDHAM ",60,45,3),
                new Universidad("MARIST-COLLEGE ",40,60,3),
                new Universidad("HAMPSHIRE-COLLEGE ",75,40,3),
                new Universidad("HAMPSHIRE-COLLEGE0 ",75,40,3),
                new Universidad("FORDHAM1 ",65,30,3),
                new Universidad("ST-JOHNS-U ",75,35,2),
                new Universidad("UNIVERSITY-OF-CHICAGO0 ",70,25,5),
                new Universidad("FORDHAM0 ",70,40,4),
                new Universidad("NEWYORKIT ",80,50,2),
                new Universidad("REED ",80,40,4),
                new Universidad("SUNY-ALBANY0 ",50,35,3),
                new Universidad("SUNY-BINGHAMTON0 ",45,40,3),
                new Universidad("LESLEY ",70,50,2),
                new Universidad("UNIVERSITY-OF-PUGET-SOUND ",80,40,3),
                new Universidad("PURDUE0 ",80,50,4),
                new Universidad("NORTHWESTERN0 ",50,50,4),
                new Universidad("EMORY ",35,30,4),
                new Universidad("YALE0 ",20,60,5),
                new Universidad("UNIVERSITY-OF-BRIDGEPORT ",80,25,1),
                new Universidad("BARD ",70,30,3),
                new Universidad("DREW ",70,30,3),
                new Universidad("GEORGETOWN0 ",30,50,5),
                new Universidad("SWARTHMORE ",50,40,5),
                new Universidad("WESLEYAN ",35,40,5),
                new Universidad("MOUNT-HOLYOKE ",50,50,4),
                new Universidad("UNIVERSITY-OF-TEXAS1 ",80,60,3),
                new Universidad("TULANE ",80,30,3),
                new Universidad("TEXAS-CHRISTIAN-UNIVERSITY ",70,80,3),
                new Universidad("OREGON-INSTITUTE-OF-TECHNOLOGY ",80,60,3),
                new Universidad("SAN-JOSE-STATE ",60,50,4),
                new Universidad("UNIVERSITY-OF-CHICAGO ",40,20,4),
                new Universidad("BRYN-MAWR ",50,30,3),
                new Universidad("OBERLIN ",70,30,3),
                new Universidad("UNIVERSITY-OF-TEXAS ",60,60,3),
                new Universidad("CORPUS-CHRISTI-STATE-U ",80,70,1),
                new Universidad("JUILLIARD ",15,80,1),
                new Universidad("EASTMAN-SCHOOL-OF-MUSIC ",15,70,3),
                new Universidad("BUTLER ",80,40,3),
                new Universidad("RUTGERS ",50,30,4),
                new Universidad("UNIVERSITY-OF-MINNESOTA ",80,60,4),
                new Universidad("UNIVERSITY-OF-MARYLAND ",60,50,3),
                new Universidad("NORTHWESTERN ",45,45,4),
                new Universidad("SYRACUSE0 ",70,30,3),
                new Universidad("MICHIGAN-STATE ",90,50,2),
                new Universidad("UNIVERSITY-OF-MICHIGAN1 ",60,70,5),
                new Universidad("MONMOUTH-COLLEGE ",80,40,3),
                new Universidad("CLARKSON-UNIVERSITY ",70,30,3),
                new Universidad("CLARK-UNIVERSITY0 ",60,30,4),
                new Universidad("COLORADO-COLLEGE ",30,0,3),
                new Universidad("SUNY-PLATTSBURGH ",40,20,3),
                new Universidad("CHALMERS-UNIVERSITY-OF-TECHNOLOGY ",20,90,4),
                new Universidad("GOTHENBURG-UNIVERSITY ",30,70,3),
                new Universidad("UNIVERSITY-OF-TULSA0 ",80,40,3),
                new Universidad("UNIVERSITY-OF-DENVER ",70,50,3),
                new Universidad("BUCKNELL ",35,15,4),
                new Universidad("UNIVERSITY-OF-THE-PACIFIC ",80,40,3),
                new Universidad("UNIVERSITY-OF-THE-SOUTH0 ",75,50,3),
                new Universidad("UNIVERSITY-OF-TOLEDO ",95,70,1),
                new Universidad("UNIVERSITY-OF-THE-DISTRICT-OF-COLUMBIA ",95,80,2),
                new Universidad("UNIVERSITY-OF-SOUTHDAKOTA ",80,80,2),
                new Universidad("YANKTOWN-COLLEGE ",95,90,1),
                new Universidad("BAYLOR-UNIVERSITY ",65,75,4),
                new Universidad("DALLAS-BAPTIST-COLLEGE ",10,40,1),
                new Universidad("SUNY-BINGHAMTON ",50,30,4),
                new Universidad("SUNY-BUFFALO ",90,30,4),
                new Universidad("SUNY-ALBANY ",60,30,4),
                new Universidad("OHIO-STATE ",90,65,4),
                new Universidad("PENN-STATE1 ",60,55,3),
                new Universidad("RUTGERS0 ",55,30,4),
                new Universidad("UNIVERSITY-OF-WASHINGTON ",65,60,4),
                new Universidad("UNIVERSITY-OF-TEXAS0 ",70,65,5),
                new Universidad("SUNY-STONY-BROOK0 ",70,30,4),
                new Universidad("NORTHCAROLINA-STATE-UNIVERSITY ",0,0,2),
                new Universidad("BRYN-MAWR0 ",60,50,5),
                new Universidad("WALLA-WALLA-COLLEGE ",70,60,2),
                new Universidad("VASSAR ",50,40,5),
                new Universidad("COLLEGE-OF-NEWROCHELLE ",70,40,2),
                new Universidad("UNIVERSITY-OF-MASSACHUSETTS-AMHERST ",70,45,3),
                new Universidad("UNIVERSITY-OF-VIRGINIA0 ",35,60,4),
                new Universidad("SYRACUSE1 ",70,40,4),
                new Universidad("UNIVERSITY-OF-NOTRE-DAME ",50,60,4),
                new Universidad("UNIVERSITY-OF-COLORADO ",70,60,3),
                new Universidad("COLORADO-SCHOOL-OF-MINES ",60,50,3),
                new Universidad("UNIVERSITY-OF-WASHINGTON0 ",65,60,4),
                new Universidad("SUNY-STONY-BROOK1 ",70,30,4),
                new Universidad("WILLIAM-PATERSON-COLLEGE ",50,50,3),
                new Universidad("OREGON-INSTITUTE-OF-TECHNOLOGY0 ",90,80,3),
                new Universidad("ECOLE-NATIONALE-SUPERIEURE-DE-TELECOMMUNICATION-DE-PARIS ",5,50,4),
                new Universidad("ECOLE-POLYTECHNIQUE ",10,95,5),
                new Universidad("UNIVERSITE-SAINT-JOSEPH ",70,80,4),
                new Universidad("AMERICAN-UNIVERSITY-OF-BEIRUT ",50,80,3),
                new Universidad("POLYTECHNIC-INSTITUTE-OF-NEWYORK0 ",60,60,3),
                new Universidad("PENN-STATE0 ",80,50,2),
                new Universidad("UNIVERSITY-OF-OREGON ",80,70,3),
                new Universidad("PURDUE ",80,50,3),
                new Universidad("UNIVERSITY-WEST-VIRGINIA ",95,60,2),
                new Universidad("DEPAUL-UNIVERSITY ",75,50,2),
                new Universidad("UNIVERSITY-OF-GEORGIA ",80,50,3),
                new Universidad("ADELPHI ",70,40,2),
                new Universidad("ARIZONA-STATE ",80,60,3),
                new Universidad("BOSTON-COLLEGE ",50,40,4),
                new Universidad("BOSTON-UNIVERSITY ",60,40,4),
                new Universidad("BROWN ",20,50,5),
                new Universidad("CAL-TECH ",20,90,5),
                new Universidad("CARNEGIE-MELLON ",40,50,4),
                new Universidad("CASE-WESTERN ",85,35,3),
                new Universidad("CCNY ",80,60,3),
                new Universidad("COLGATE ",40,40,4),
                new Universidad("COLUMBIA ",30,50,5),
                new Universidad("COOPER-UNION ",20,65,3),
                new Universidad("CORNELL ",30,50,5),
                new Universidad("DARTMOUTH ",20,60,5),
                new Universidad("FLORIDA-TECH ",60,50,3),
                new Universidad("FLORIDA-STATE ",60,50,3),
                new Universidad("GEORGIA-TECH ",60,50,4),
                new Universidad("HARVARD ",20,80,5),
                new Universidad("HOFSTRA ",70,50,2),
                new Universidad("ILLINOIS-TECH ",50,60,3),
                new Universidad("JOHNS-HOPKINS ",50,40,5),
                new Universidad("MIT ",30,60,5),
                new Universidad("UNIVERSITY-OF-MONTANA ",90,60,3),
                new Universidad("MORGAN-STATE ",70,50,2),
                new Universidad("NEWJERSEY-TECH ",50,60,3),
                new Universidad("NYU ",50,60,4),
                new Universidad("PRATT ",50,60,3),
                new Universidad("PRINCETON ",20,60,5),
                new Universidad("RENSSELAER ",50,30,4),
                new Universidad("ROCHESTER-TECH ",70,50,3),
                new Universidad("STANFORD ",20,70,5),
                new Universidad("STEVENS ",60,40,3),
                new Universidad("TEMPLE ",70,60,2),
                new Universidad("TEXAS-A ",80,70,3),
                new Universidad("UNIVERSITY-OF-CALIFORNIA-BERKELEY ",50,70,5),
                new Universidad("UNIVERSITY-OF-CALIFORNIA-DAVIS ",70,70,4),
                new Universidad("UCLA ",80,70,4),
                new Universidad("UNIVERSITY-OF-CALIFORNIA-SAN-DIEGO ",80,65,4),
                new Universidad("UNIVERSITY-OF-CALIFORNIA-SANTA-CRUZ ",70,60,4),
                new Universidad("UNIVERSITY-OF-MAINE ",90,50,2),
                new Universidad("UNIVERSITY-OF-OKLAHOMA ",90,70,3),
                new Universidad("UNIVERSITY-OF-PENNSYLVANIA ",40,50,5),
                new Universidad("UNIVERSITY-OF-SAN-FRANCISCO ",60,60,3),
                new Universidad("USC ",70,50,4),
                new Universidad("WORCESTER ",50,50,4),
                new Universidad("YALE ",20,60,5),
                new Universidad("PENN-STATE ",40,50,5),
                new Universidad("UNIVERSITY-OF-PITTSBURGH2 ",75,55,4),
                new Universidad("UNIVERSITY-OF-MICHIGAN ",60,50,4),
                new Universidad("NORTHEASTERN ",80,10,3),
                new Universidad("RICE ",35,55,5),
                new Universidad("NOTRE-DAME ",35,60,5),
                new Universidad("NEWENGLAND-COLLEGE ",50,95,4),
                new Universidad("SUNY-STONY-BROOK ",50,90,5),
                new Universidad("SUFFOLK-COMMUNITY-COLLEGE ",80,95,4),
                new Universidad("CLARK-UNIVERSITY ",60,35,4),
                new Universidad("UNIVERSITY-OF-HARTFORD ",75,35,3),
                new Universidad("LEWIS-AND-CLARK ",70,40,3),
                new Universidad("BENNINGTON ",70,30,3),
                new Universidad("RICE0 ",40,30,5),
                new Universidad("SMITH ",50,20,4),
                new Universidad("UNIVERSITY-OF-THE-SOUTH ",60,30,4),
                new Universidad("POLYTECHNIC-INSTITUTE-OF-NEWYORK ",75,45,3),
                new Universidad("TUFTS ",35,35,4),
                new Universidad("UNIVERSITY-OF-VIRGINIA ",40,20,4),
                new Universidad("WASHINGTON-AND-LEE ",60,30,4),
                new Universidad("UNIVERSITY-OF-ROCHESTER ",80,30,4),
                new Universidad("SAM-HOUSTON-STATE-UNIVERSITY ",80,70,2),
                new Universidad("MANHATTANVILLE-COLLEGE ",60,40,4),
                new Universidad("SUNY-PURCHASE ",40,40,3),
                new Universidad("BRANDEIS ",60,45,4),
                new Universidad("GEORGE-WASHINGTON ",75,30,3),
                new Universidad("ORAL-ROBERTS-UNIVERSITY ",65,75,4),
                new Universidad("UNIVERSITY-OF-TULSA ",85,65,4),
                new Universidad("CONNECTICUT-COLLEGE ",40,40,4),
                new Universidad("LEHIGH-UNIVERSITY ",50,40,4),
                new Universidad("OREGON-STATE ",90,70,3));



        List<UniversidadWrapper> clusterInput = new ArrayList<UniversidadWrapper>(universidades.size());
        for(Universidad universidad : universidades) {
            clusterInput.add(new UniversidadWrapper(universidad));
        }


        FuzzyKMeansClusterer<UniversidadWrapper> clusterer = new FuzzyKMeansClusterer(3,2);

        List<CentroidCluster<UniversidadWrapper>> clusterResults = clusterer.cluster(clusterInput);

        System.out.println(clusterer.getMembershipMatrix());

        new Grafico(clusterResults,universidades.size());

        /*for (int i = 0; i<clusterResults.size(); i++) {

            System.out.println("Cluster " + i);


            for (UniversidadWrapper universidadWrapper : clusterResults.get(i).getPoints()) {
                System.out.println(universidadWrapper.getUniversidad().getName());
            }

        }*/


    }

}