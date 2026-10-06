package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdivpzav extends GXProcedure
{
   public pdivpzav( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdivpzav.class ), "" );
   }

   public pdivpzav( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 ,
                            String[] aP4 ,
                            java.math.BigDecimal[] aP5 )
   {
      pdivpzav.this.aP6 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        short[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             short[] aP6 )
   {
      pdivpzav.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdivpzav.this.AV25BarCod = aP1[0];
      this.aP1 = aP1;
      pdivpzav.this.AV26BarCodreo = aP2[0];
      this.aP2 = aP2;
      pdivpzav.this.AV27BarCodPar = aP3[0];
      this.aP3 = aP3;
      pdivpzav.this.AV22BarPieCod = aP4[0];
      this.aP4 = aP4;
      pdivpzav.this.AV23BarPieKil = aP5[0];
      this.aP5 = aP5;
      pdivpzav.this.AV24Num_trozos = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV40Usurcod = " " ;
      AV41Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV43EmprNom ;
      GXv_char3[0] = AV40Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV41Station, GXv_char1, GXv_char2, GXv_char3) ;
      pdivpzav.this.A396EmprCod = GXv_char1[0] ;
      pdivpzav.this.AV43EmprNom = GXv_char2[0] ;
      pdivpzav.this.AV40Usurcod = GXv_char3[0] ;
      AV28Kgs_o = DecimalUtil.doubleToDec(0) ;
      AV47Mts_o = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P02BZ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV25BarCod), Byte.valueOf(AV26BarCodreo), AV27BarCodPar, AV22BarPieCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A200BarPieCod = P02BZ2_A200BarPieCod[0] ;
         A130BarCodPar = P02BZ2_A130BarCodPar[0] ;
         A132BarCodReo = P02BZ2_A132BarCodReo[0] ;
         A129BarCod = P02BZ2_A129BarCod[0] ;
         A203BarPieKil = P02BZ2_A203BarPieKil[0] ;
         A205BarPieMet = P02BZ2_A205BarPieMet[0] ;
         A44AlbRecCod = P02BZ2_A44AlbRecCod[0] ;
         A1691BarPieAnc = P02BZ2_A1691BarPieAnc[0] ;
         n1691BarPieAnc = P02BZ2_n1691BarPieAnc[0] ;
         A9846BarPieAncc = P02BZ2_A9846BarPieAncc[0] ;
         n9846BarPieAncc = P02BZ2_n9846BarPieAncc[0] ;
         A9984BarPiePda = P02BZ2_A9984BarPiePda[0] ;
         n9984BarPiePda = P02BZ2_n9984BarPiePda[0] ;
         AV28Kgs_o = A203BarPieKil ;
         AV47Mts_o = A205BarPieMet ;
         AV34AlbReccod = A44AlbRecCod ;
         AV36PieOrigen = A200BarPieCod ;
         AV37BarPieAnc = A1691BarPieAnc ;
         AV38Barpieancc = A9846BarPieAncc ;
         AV39BarPiePda = A9984BarPiePda ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV30Kgs_p = AV28Kgs_o.divide(DecimalUtil.doubleToDec(AV24Num_trozos), 18, java.math.RoundingMode.DOWN) ;
      AV31Resto_k = (AV30Kgs_p.multiply(DecimalUtil.doubleToDec(AV24Num_trozos))).subtract(AV28Kgs_o) ;
      AV48Mts_p = AV47Mts_o.divide(DecimalUtil.doubleToDec(AV24Num_trozos), 18, java.math.RoundingMode.DOWN) ;
      AV49Resto_m = (AV48Mts_p.multiply(DecimalUtil.doubleToDec(AV24Num_trozos))).subtract(AV47Mts_o) ;
      GXt_char4 = AV50MaqTej ;
      GXv_char3[0] = GXt_char4 ;
      new app.pvxromqtj(remoteHandle, context).execute( A200BarPieCod, GXv_char3) ;
      pdivpzav.this.GXt_char4 = GXv_char3[0] ;
      AV50MaqTej = GXt_char4 ;
      AV33i = (short)(1) ;
      while ( AV33i <= AV24Num_trozos )
      {
         GXv_char3[0] = AV32NewPiecod ;
         new app.pvxnumro(remoteHandle, context).execute( AV50MaqTej, GXv_char3) ;
         pdivpzav.this.AV32NewPiecod = GXv_char3[0] ;
         /*
            INSERT RECORD ON TABLE TXPBARPIE

         */
         A129BarCod = AV25BarCod ;
         A132BarCodReo = AV26BarCodreo ;
         A130BarCodPar = AV27BarCodPar ;
         A200BarPieCod = AV32NewPiecod ;
         A44AlbRecCod = AV25BarCod ;
         if ( ( AV33i == AV24Num_trozos ) && ( AV31Resto_k.doubleValue() > 0 ) )
         {
            AV30Kgs_p = AV30Kgs_p.add(AV31Resto_k) ;
         }
         if ( ( AV33i == AV24Num_trozos ) && ( AV49Resto_m.doubleValue() > 0 ) )
         {
            AV48Mts_p = AV48Mts_p.add(AV49Resto_m) ;
         }
         A203BarPieKil = AV30Kgs_p ;
         A205BarPieMet = AV48Mts_p ;
         A3277BarPieAut = (short)(0) ;
         n3277BarPieAut = false ;
         A3276BarMtsAut = DecimalUtil.doubleToDec(0) ;
         n3276BarMtsAut = false ;
         A3275BarKgsAut = DecimalUtil.doubleToDec(0) ;
         n3275BarKgsAut = false ;
         A2186BarPieLoc = "" ;
         n2186BarPieLoc = false ;
         A1501BarPiePie = 0 ;
         A1271BarPieLzd = 0 ;
         A197BarPConTro = (short)(0) ;
         A183BarMetLan = DecimalUtil.doubleToDec(0) ;
         A170BarKilLan = DecimalUtil.doubleToDec(0) ;
         A201BarPieEst = (byte)(0) ;
         A8707BapieObs = " " ;
         n8707BapieObs = false ;
         A9800BarNPes = (byte)(0) ;
         n9800BarNPes = false ;
         A8838CodBarPz = " " ;
         n8838CodBarPz = false ;
         A1691BarPieAnc = AV37BarPieAnc ;
         n1691BarPieAnc = false ;
         A9846BarPieAncc = AV38Barpieancc ;
         n9846BarPieAncc = false ;
         A9984BarPiePda = AV39BarPiePda ;
         n9984BarPiePda = false ;
         A908PieOriCod = AV36PieOrigen ;
         /* Using cursor P02BZ3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Integer.valueOf(A44AlbRecCod), A203BarPieKil, A205BarPieMet, Byte.valueOf(A201BarPieEst), A170BarKilLan, A183BarMetLan, Short.valueOf(A197BarPConTro), A908PieOriCod, Integer.valueOf(A1271BarPieLzd), Integer.valueOf(A1501BarPiePie), Boolean.valueOf(n1691BarPieAnc), Short.valueOf(A1691BarPieAnc), Boolean.valueOf(n2186BarPieLoc), A2186BarPieLoc, Boolean.valueOf(n3275BarKgsAut), A3275BarKgsAut, Boolean.valueOf(n3276BarMtsAut), A3276BarMtsAut, Boolean.valueOf(n3277BarPieAut), Short.valueOf(A3277BarPieAut), Boolean.valueOf(n8707BapieObs), A8707BapieObs, Boolean.valueOf(n8838CodBarPz), A8838CodBarPz, Boolean.valueOf(n9800BarNPes), Byte.valueOf(A9800BarNPes), Boolean.valueOf(n9846BarPieAncc), Short.valueOf(A9846BarPieAncc), Boolean.valueOf(n9984BarPiePda), A9984BarPiePda});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
         GXv_char3[0] = A396EmprCod ;
         GXv_int5[0] = AV25BarCod ;
         GXv_int6[0] = AV26BarCodreo ;
         GXv_char2[0] = AV27BarCodPar ;
         GXv_char1[0] = AV22BarPieCod ;
         GXv_char7[0] = AV32NewPiecod ;
         GXv_char8[0] = httpContext.getMessage( "TRO", "") ;
         new app.pvxgrain(remoteHandle, context).execute( GXv_char3, GXv_int5, GXv_int6, GXv_char2, GXv_char1, GXv_char7, GXv_char8) ;
         pdivpzav.this.A396EmprCod = GXv_char3[0] ;
         pdivpzav.this.AV25BarCod = GXv_int5[0] ;
         pdivpzav.this.AV26BarCodreo = GXv_int6[0] ;
         pdivpzav.this.AV27BarCodPar = GXv_char2[0] ;
         pdivpzav.this.AV22BarPieCod = GXv_char1[0] ;
         pdivpzav.this.AV32NewPiecod = GXv_char7[0] ;
         AV33i = (short)(AV33i+1) ;
      }
      /* Using cursor P02BZ4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV25BarCod), Byte.valueOf(AV26BarCodreo), AV27BarCodPar, AV22BarPieCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A200BarPieCod = P02BZ4_A200BarPieCod[0] ;
         A130BarCodPar = P02BZ4_A130BarCodPar[0] ;
         A132BarCodReo = P02BZ4_A132BarCodReo[0] ;
         A129BarCod = P02BZ4_A129BarCod[0] ;
         /* Using cursor P02BZ5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
         AV42inc_obs = httpContext.getMessage( "Eliminacion PIEZA ", "") + A200BarPieCod ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV55Pgmname, AV40Usurcod, AV41Station, AV42inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdivpzav.this.A396EmprCod;
      this.aP1[0] = pdivpzav.this.AV25BarCod;
      this.aP2[0] = pdivpzav.this.AV26BarCodreo;
      this.aP3[0] = pdivpzav.this.AV27BarCodPar;
      this.aP4[0] = pdivpzav.this.AV22BarPieCod;
      this.aP5[0] = pdivpzav.this.AV23BarPieKil;
      this.aP6[0] = pdivpzav.this.AV24Num_trozos;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdivpzav");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV40Usurcod = "" ;
      AV41Station = "" ;
      AV43EmprNom = "" ;
      AV28Kgs_o = DecimalUtil.ZERO ;
      AV47Mts_o = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P02BZ2_A396EmprCod = new String[] {""} ;
      P02BZ2_A200BarPieCod = new String[] {""} ;
      P02BZ2_A130BarCodPar = new String[] {""} ;
      P02BZ2_A132BarCodReo = new byte[1] ;
      P02BZ2_A129BarCod = new int[1] ;
      P02BZ2_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02BZ2_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02BZ2_A44AlbRecCod = new int[1] ;
      P02BZ2_A1691BarPieAnc = new short[1] ;
      P02BZ2_n1691BarPieAnc = new boolean[] {false} ;
      P02BZ2_A9846BarPieAncc = new short[1] ;
      P02BZ2_n9846BarPieAncc = new boolean[] {false} ;
      P02BZ2_A9984BarPiePda = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02BZ2_n9984BarPiePda = new boolean[] {false} ;
      A200BarPieCod = "" ;
      A130BarCodPar = "" ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A9984BarPiePda = DecimalUtil.ZERO ;
      AV36PieOrigen = "" ;
      AV39BarPiePda = DecimalUtil.ZERO ;
      AV30Kgs_p = DecimalUtil.ZERO ;
      AV31Resto_k = DecimalUtil.ZERO ;
      AV48Mts_p = DecimalUtil.ZERO ;
      AV49Resto_m = DecimalUtil.ZERO ;
      AV50MaqTej = "" ;
      GXt_char4 = "" ;
      AV32NewPiecod = "" ;
      A3276BarMtsAut = DecimalUtil.ZERO ;
      A3275BarKgsAut = DecimalUtil.ZERO ;
      A2186BarPieLoc = "" ;
      A183BarMetLan = DecimalUtil.ZERO ;
      A170BarKilLan = DecimalUtil.ZERO ;
      A8707BapieObs = "" ;
      A8838CodBarPz = "" ;
      A908PieOriCod = "" ;
      Gx_emsg = "" ;
      GXv_char3 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char2 = new String[1] ;
      GXv_char1 = new String[1] ;
      GXv_char7 = new String[1] ;
      GXv_char8 = new String[1] ;
      P02BZ4_A396EmprCod = new String[] {""} ;
      P02BZ4_A200BarPieCod = new String[] {""} ;
      P02BZ4_A130BarCodPar = new String[] {""} ;
      P02BZ4_A132BarCodReo = new byte[1] ;
      P02BZ4_A129BarCod = new int[1] ;
      AV42inc_obs = "" ;
      AV55Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdivpzav__default(),
         new Object[] {
             new Object[] {
            P02BZ2_A396EmprCod, P02BZ2_A200BarPieCod, P02BZ2_A130BarCodPar, P02BZ2_A132BarCodReo, P02BZ2_A129BarCod, P02BZ2_A203BarPieKil, P02BZ2_A205BarPieMet, P02BZ2_A44AlbRecCod, P02BZ2_A1691BarPieAnc, P02BZ2_n1691BarPieAnc,
            P02BZ2_A9846BarPieAncc, P02BZ2_n9846BarPieAncc, P02BZ2_A9984BarPiePda, P02BZ2_n9984BarPiePda
            }
            , new Object[] {
            }
            , new Object[] {
            P02BZ4_A396EmprCod, P02BZ4_A200BarPieCod, P02BZ4_A130BarCodPar, P02BZ4_A132BarCodReo, P02BZ4_A129BarCod
            }
            , new Object[] {
            }
         }
      );
      AV55Pgmname = "PDIVPZAV" ;
      /* GeneXus formulas. */
      AV55Pgmname = "PDIVPZAV" ;
      Gx_err = (short)(0) ;
   }

   private byte AV26BarCodreo ;
   private byte A132BarCodReo ;
   private byte A201BarPieEst ;
   private byte A9800BarNPes ;
   private byte GXv_int6[] ;
   private short AV24Num_trozos ;
   private short A1691BarPieAnc ;
   private short A9846BarPieAncc ;
   private short AV37BarPieAnc ;
   private short AV38Barpieancc ;
   private short AV33i ;
   private short A3277BarPieAut ;
   private short A197BarPConTro ;
   private short Gx_err ;
   private int AV25BarCod ;
   private int A129BarCod ;
   private int A44AlbRecCod ;
   private int AV34AlbReccod ;
   private int GX_INS18 ;
   private int A1501BarPiePie ;
   private int A1271BarPieLzd ;
   private int GXv_int5[] ;
   private java.math.BigDecimal AV23BarPieKil ;
   private java.math.BigDecimal AV28Kgs_o ;
   private java.math.BigDecimal AV47Mts_o ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal A9984BarPiePda ;
   private java.math.BigDecimal AV39BarPiePda ;
   private java.math.BigDecimal AV30Kgs_p ;
   private java.math.BigDecimal AV31Resto_k ;
   private java.math.BigDecimal AV48Mts_p ;
   private java.math.BigDecimal AV49Resto_m ;
   private java.math.BigDecimal A3276BarMtsAut ;
   private java.math.BigDecimal A3275BarKgsAut ;
   private java.math.BigDecimal A183BarMetLan ;
   private java.math.BigDecimal A170BarKilLan ;
   private String A396EmprCod ;
   private String AV27BarCodPar ;
   private String AV22BarPieCod ;
   private String AV40Usurcod ;
   private String AV41Station ;
   private String AV43EmprNom ;
   private String scmdbuf ;
   private String A200BarPieCod ;
   private String A130BarCodPar ;
   private String AV36PieOrigen ;
   private String AV50MaqTej ;
   private String GXt_char4 ;
   private String AV32NewPiecod ;
   private String A2186BarPieLoc ;
   private String A8707BapieObs ;
   private String A8838CodBarPz ;
   private String A908PieOriCod ;
   private String Gx_emsg ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String GXv_char7[] ;
   private String GXv_char8[] ;
   private String AV55Pgmname ;
   private boolean n1691BarPieAnc ;
   private boolean n9846BarPieAncc ;
   private boolean n9984BarPiePda ;
   private boolean n3277BarPieAut ;
   private boolean n3276BarMtsAut ;
   private boolean n3275BarKgsAut ;
   private boolean n2186BarPieLoc ;
   private boolean n8707BapieObs ;
   private boolean n9800BarNPes ;
   private boolean n8838CodBarPz ;
   private String AV42inc_obs ;
   private short[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P02BZ2_A396EmprCod ;
   private String[] P02BZ2_A200BarPieCod ;
   private String[] P02BZ2_A130BarCodPar ;
   private byte[] P02BZ2_A132BarCodReo ;
   private int[] P02BZ2_A129BarCod ;
   private java.math.BigDecimal[] P02BZ2_A203BarPieKil ;
   private java.math.BigDecimal[] P02BZ2_A205BarPieMet ;
   private int[] P02BZ2_A44AlbRecCod ;
   private short[] P02BZ2_A1691BarPieAnc ;
   private boolean[] P02BZ2_n1691BarPieAnc ;
   private short[] P02BZ2_A9846BarPieAncc ;
   private boolean[] P02BZ2_n9846BarPieAncc ;
   private java.math.BigDecimal[] P02BZ2_A9984BarPiePda ;
   private boolean[] P02BZ2_n9984BarPiePda ;
   private String[] P02BZ4_A396EmprCod ;
   private String[] P02BZ4_A200BarPieCod ;
   private String[] P02BZ4_A130BarCodPar ;
   private byte[] P02BZ4_A132BarCodReo ;
   private int[] P02BZ4_A129BarCod ;
}

final  class pdivpzav__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02BZ2", "SELECT EmprCod, BarPieCod, BarCodPar, BarCodReo, BarCod, BarPieKil, BarPieMet, AlbRecCod, BarPieAnc, BarPieAncc, BarPiePda FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02BZ3", "INSERT INTO TXPBARPIE(EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbRecCod, BarPieKil, BarPieMet, BarPieEst, BarKilLan, BarMetLan, BarPConTro, PieOriCod, BarPieLzd, BarPiePie, BarPieAnc, BarPieLoc, BarKgsAut, BarMtsAut, BarPieAut, BapieObs, CodBarPz, BarNPes, BarPieAncc, BarPiePda, BarPieImp, BarPieIdPz, PzaB80, BarPieK1, BarPieK2, BarPz1, BarPz2, BarPieObs, BarTara, BarUniB, BarPieOrd, BarPieCLd, BarPieFdv, BarPieUsu, BarPieFep, BarPieUltD, BarPieColD, BarPieColN, BarPieArtI, BarPieArtD, BarPieCliI, BarPieCliN, BarPieCoCI, BarPieCoCN, BarPieEncC, BarPieTono, BarPieSecu, BarPieOpe, BarPieDest, BarPieEmp, BarPieLote, BarPieST, BarPieTurn, BarPieMq, BarPieVtx) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', ' ', 0, 0, 0, 0, ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, ' ', ' ', 0, ' ', ' ', 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new ForEachCursor("P02BZ4", "SELECT EmprCod, BarPieCod, BarCodPar, BarCodReo, BarCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02BZ5", "DELETE FROM TXPBARPIE  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 9);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 9);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 2);
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               stmt.setString(13, (String)parms[12], 9);
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setInt(15, ((Number) parms[14]).intValue());
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[16]).shortValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[18], 10);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[24]).shortValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[26], 40);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[28], 20);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(23, ((Number) parms[30]).byteValue());
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(24, ((Number) parms[32]).shortValue());
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(25, (java.math.BigDecimal)parms[34], 2);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
      }
   }

}

