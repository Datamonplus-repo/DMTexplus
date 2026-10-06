package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpdetalleentradas extends GXProcedure
{
   public dpdetalleentradas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpdetalleentradas.class ), "" );
   }

   public dpdetalleentradas( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtSDTDetalleEntradas> executeUdp( String aP0 ,
                                                                  int aP1 ,
                                                                  int aP2 ,
                                                                  java.util.Date aP3 ,
                                                                  java.util.Date aP4 ,
                                                                  String aP5 ,
                                                                  String aP6 ,
                                                                  byte aP7 )
   {
      dpdetalleentradas.this.aP8 = new GXBaseCollection[] {new GXBaseCollection<app.SdtSDTDetalleEntradas>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int aP2 ,
                        java.util.Date aP3 ,
                        java.util.Date aP4 ,
                        String aP5 ,
                        String aP6 ,
                        byte aP7 ,
                        GXBaseCollection<app.SdtSDTDetalleEntradas>[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             String aP5 ,
                             String aP6 ,
                             byte aP7 ,
                             GXBaseCollection<app.SdtSDTDetalleEntradas>[] aP8 )
   {
      dpdetalleentradas.this.AV15Emprcod = aP0;
      dpdetalleentradas.this.AV14ClienteInicial = aP1;
      dpdetalleentradas.this.AV13ClienteFinal = aP2;
      dpdetalleentradas.this.AV17FechaInicial = aP3;
      dpdetalleentradas.this.AV16FechaFinal = aP4;
      dpdetalleentradas.this.AV12ArticuloInicial = aP5;
      dpdetalleentradas.this.AV11ArticuloFinal = aP6;
      dpdetalleentradas.this.AV10Albrest = aP7;
      dpdetalleentradas.this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00182 */
      pr_default.execute(0, new Object[] {AV15Emprcod, Integer.valueOf(AV14ClienteInicial), AV17FechaInicial, AV12ArticuloInicial, AV11ArticuloFinal, AV16FechaFinal, Byte.valueOf(AV10Albrest), Byte.valueOf(AV10Albrest), Integer.valueOf(AV13ClienteFinal)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A840TrnCod = P00182_A840TrnCod[0] ;
         n840TrnCod = P00182_n840TrnCod[0] ;
         A970ProceCod = P00182_A970ProceCod[0] ;
         n970ProceCod = P00182_n970ProceCod[0] ;
         A396EmprCod = P00182_A396EmprCod[0] ;
         A44AlbRecCod = P00182_A44AlbRecCod[0] ;
         A47AlbREst = P00182_A47AlbREst[0] ;
         A49AlbRFen = P00182_A49AlbRFen[0] ;
         A45AlbRef = P00182_A45AlbRef[0] ;
         A252CliCod = P00182_A252CliCod[0] ;
         A279CliNom = P00182_A279CliNom[0] ;
         A3613AlbRefDsc = P00182_A3613AlbRefDsc[0] ;
         A5806AlbREnt2 = P00182_A5806AlbREnt2[0] ;
         A46AlbREnt = P00182_A46AlbREnt[0] ;
         A56AlbRUni = P00182_A56AlbRUni[0] ;
         A50AlbRLoc = P00182_A50AlbRLoc[0] ;
         A971ProceNom = P00182_A971ProceNom[0] ;
         n971ProceNom = P00182_n971ProceNom[0] ;
         A841TrnNom = P00182_A841TrnNom[0] ;
         n841TrnNom = P00182_n841TrnNom[0] ;
         A54AlbRPieUti = P00182_A54AlbRPieUti[0] ;
         A52AlbRPieEnt = P00182_A52AlbRPieEnt[0] ;
         A60AlbRUniUti = P00182_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = P00182_A58AlbRUniEnt[0] ;
         A841TrnNom = P00182_A841TrnNom[0] ;
         n841TrnNom = P00182_n841TrnNom[0] ;
         A971ProceNom = P00182_A971ProceNom[0] ;
         n971ProceNom = P00182_n971ProceNom[0] ;
         A279CliNom = P00182_A279CliNom[0] ;
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
         {
            A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         }
         else
         {
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
            else
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
         }
         A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         Gxm1sdtdetalleentradas = (app.SdtSDTDetalleEntradas)new app.SdtSDTDetalleEntradas(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtdetalleentradas, 0);
         Gxm1sdtdetalleentradas.setgxTv_SdtSDTDetalleEntradas_Clicod( A252CliCod );
         Gxm1sdtdetalleentradas.setgxTv_SdtSDTDetalleEntradas_Clinom( A279CliNom );
         Gxm1sdtdetalleentradas.setgxTv_SdtSDTDetalleEntradas_Albref( A45AlbRef );
         Gxm1sdtdetalleentradas.setgxTv_SdtSDTDetalleEntradas_Albrefdsc( A3613AlbRefDsc );
         Gxm1sdtdetalleentradas.setgxTv_SdtSDTDetalleEntradas_Albreccod( A44AlbRecCod );
         Gxm1sdtdetalleentradas.setgxTv_SdtSDTDetalleEntradas_Albrfen( A49AlbRFen );
         GXt_char1 = "" ;
         GXv_char2[0] = A46AlbREnt ;
         GXv_char3[0] = A5806AlbREnt2 ;
         GXv_char4[0] = GXt_char1 ;
         new app.proc_albrent2(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4) ;
         dpdetalleentradas.this.A46AlbREnt = GXv_char2[0] ;
         dpdetalleentradas.this.A5806AlbREnt2 = GXv_char3[0] ;
         dpdetalleentradas.this.GXt_char1 = GXv_char4[0] ;
         Gxm1sdtdetalleentradas.setgxTv_SdtSDTDetalleEntradas_Albrent2( GXt_char1 );
         Gxm1sdtdetalleentradas.setgxTv_SdtSDTDetalleEntradas_Albruni( A56AlbRUni );
         Gxm1sdtdetalleentradas.setgxTv_SdtSDTDetalleEntradas_Albrunient( A58AlbRUniEnt );
         Gxm1sdtdetalleentradas.setgxTv_SdtSDTDetalleEntradas_Albrpieent( A52AlbRPieEnt );
         Gxm1sdtdetalleentradas.setgxTv_SdtSDTDetalleEntradas_Albruniuti( A60AlbRUniUti );
         Gxm1sdtdetalleentradas.setgxTv_SdtSDTDetalleEntradas_Albrpieuti( A54AlbRPieUti );
         Gxm1sdtdetalleentradas.setgxTv_SdtSDTDetalleEntradas_Albrunidis( A57AlbRUniDis );
         Gxm1sdtdetalleentradas.setgxTv_SdtSDTDetalleEntradas_Albrpiedis( A51AlbRPieDis );
         Gxm1sdtdetalleentradas.setgxTv_SdtSDTDetalleEntradas_Albrloc( A50AlbRLoc );
         Gxm1sdtdetalleentradas.setgxTv_SdtSDTDetalleEntradas_Procenom( A971ProceNom );
         Gxm1sdtdetalleentradas.setgxTv_SdtSDTDetalleEntradas_Trnnom( A841TrnNom );
         AV5Obs = "" ;
         /* Using cursor P00183 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1300AlbRObs = P00183_A1300AlbRObs[0] ;
            A1299AlbRLin = P00183_A1299AlbRLin[0] ;
            AV5Obs += A1300AlbRObs + GXutil.newLine( ) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         Gxm1sdtdetalleentradas.setgxTv_SdtSDTDetalleEntradas_Obs( AV5Obs );
         AV6KgsExp = (short)(0) ;
         AV7MtsExp = (short)(0) ;
         AV8PzsExp = (short)(0) ;
         /* Using cursor P00184 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A201BarPieEst = P00184_A201BarPieEst[0] ;
            A183BarMetLan = P00184_A183BarMetLan[0] ;
            A170BarKilLan = P00184_A170BarKilLan[0] ;
            A1271BarPieLzd = P00184_A1271BarPieLzd[0] ;
            A129BarCod = P00184_A129BarCod[0] ;
            A132BarCodReo = P00184_A132BarCodReo[0] ;
            A130BarCodPar = P00184_A130BarCodPar[0] ;
            A200BarPieCod = P00184_A200BarPieCod[0] ;
            AV7MtsExp = (short)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(AV7MtsExp).add(((A183BarMetLan.doubleValue()>0) ? A183BarMetLan : DecimalUtil.doubleToDec(0))))) ;
            AV6KgsExp = (short)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(AV6KgsExp).add(((A170BarKilLan.doubleValue()>0) ? A170BarKilLan : DecimalUtil.doubleToDec(0))))) ;
            AV8PzsExp = (short)(AV8PzsExp+((A1271BarPieLzd>0) ? A1271BarPieLzd : 1)) ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         Gxm1sdtdetalleentradas.setgxTv_SdtSDTDetalleEntradas_Kgsexp( DecimalUtil.doubleToDec(AV6KgsExp) );
         Gxm1sdtdetalleentradas.setgxTv_SdtSDTDetalleEntradas_Mtsexp( DecimalUtil.doubleToDec(AV7MtsExp) );
         Gxm1sdtdetalleentradas.setgxTv_SdtSDTDetalleEntradas_Pzsexp( AV8PzsExp );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP8[0] = dpdetalleentradas.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.SdtSDTDetalleEntradas>(app.SdtSDTDetalleEntradas.class, "SDTDetalleEntradas", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P00182_A840TrnCod = new short[1] ;
      P00182_n840TrnCod = new boolean[] {false} ;
      P00182_A970ProceCod = new short[1] ;
      P00182_n970ProceCod = new boolean[] {false} ;
      P00182_A396EmprCod = new String[] {""} ;
      P00182_A44AlbRecCod = new int[1] ;
      P00182_A47AlbREst = new byte[1] ;
      P00182_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P00182_A45AlbRef = new String[] {""} ;
      P00182_A252CliCod = new int[1] ;
      P00182_A279CliNom = new String[] {""} ;
      P00182_A3613AlbRefDsc = new String[] {""} ;
      P00182_A5806AlbREnt2 = new String[] {""} ;
      P00182_A46AlbREnt = new String[] {""} ;
      P00182_A56AlbRUni = new String[] {""} ;
      P00182_A50AlbRLoc = new String[] {""} ;
      P00182_A971ProceNom = new String[] {""} ;
      P00182_n971ProceNom = new boolean[] {false} ;
      P00182_A841TrnNom = new String[] {""} ;
      P00182_n841TrnNom = new boolean[] {false} ;
      P00182_A54AlbRPieUti = new int[1] ;
      P00182_A52AlbRPieEnt = new int[1] ;
      P00182_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00182_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A396EmprCod = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A45AlbRef = "" ;
      A279CliNom = "" ;
      A3613AlbRefDsc = "" ;
      A5806AlbREnt2 = "" ;
      A46AlbREnt = "" ;
      A56AlbRUni = "" ;
      A50AlbRLoc = "" ;
      A971ProceNom = "" ;
      A841TrnNom = "" ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      Gxm1sdtdetalleentradas = new app.SdtSDTDetalleEntradas(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      AV5Obs = "" ;
      P00183_A396EmprCod = new String[] {""} ;
      P00183_A44AlbRecCod = new int[1] ;
      P00183_A1300AlbRObs = new String[] {""} ;
      P00183_A1299AlbRLin = new byte[1] ;
      A1300AlbRObs = "" ;
      P00184_A396EmprCod = new String[] {""} ;
      P00184_A44AlbRecCod = new int[1] ;
      P00184_A201BarPieEst = new byte[1] ;
      P00184_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00184_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00184_A1271BarPieLzd = new int[1] ;
      P00184_A129BarCod = new int[1] ;
      P00184_A132BarCodReo = new byte[1] ;
      P00184_A130BarCodPar = new String[] {""} ;
      P00184_A200BarPieCod = new String[] {""} ;
      A183BarMetLan = DecimalUtil.ZERO ;
      A170BarKilLan = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      A200BarPieCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.dpdetalleentradas__default(),
         new Object[] {
             new Object[] {
            P00182_A840TrnCod, P00182_n840TrnCod, P00182_A970ProceCod, P00182_n970ProceCod, P00182_A396EmprCod, P00182_A44AlbRecCod, P00182_A47AlbREst, P00182_A49AlbRFen, P00182_A45AlbRef, P00182_A252CliCod,
            P00182_A279CliNom, P00182_A3613AlbRefDsc, P00182_A5806AlbREnt2, P00182_A46AlbREnt, P00182_A56AlbRUni, P00182_A50AlbRLoc, P00182_A971ProceNom, P00182_n971ProceNom, P00182_A841TrnNom, P00182_n841TrnNom,
            P00182_A54AlbRPieUti, P00182_A52AlbRPieEnt, P00182_A60AlbRUniUti, P00182_A58AlbRUniEnt
            }
            , new Object[] {
            P00183_A396EmprCod, P00183_A44AlbRecCod, P00183_A1300AlbRObs, P00183_A1299AlbRLin
            }
            , new Object[] {
            P00184_A396EmprCod, P00184_A44AlbRecCod, P00184_A201BarPieEst, P00184_A183BarMetLan, P00184_A170BarKilLan, P00184_A1271BarPieLzd, P00184_A129BarCod, P00184_A132BarCodReo, P00184_A130BarCodPar, P00184_A200BarPieCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10Albrest ;
   private byte A47AlbREst ;
   private byte A1299AlbRLin ;
   private byte A201BarPieEst ;
   private byte A132BarCodReo ;
   private short A840TrnCod ;
   private short A970ProceCod ;
   private short AV6KgsExp ;
   private short AV7MtsExp ;
   private short AV8PzsExp ;
   private short Gx_err ;
   private int AV14ClienteInicial ;
   private int AV13ClienteFinal ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int A54AlbRPieUti ;
   private int A52AlbRPieEnt ;
   private int A51AlbRPieDis ;
   private int A1271BarPieLzd ;
   private int A129BarCod ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal A183BarMetLan ;
   private java.math.BigDecimal A170BarKilLan ;
   private String AV15Emprcod ;
   private String AV12ArticuloInicial ;
   private String AV11ArticuloFinal ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A45AlbRef ;
   private String A279CliNom ;
   private String A3613AlbRefDsc ;
   private String A5806AlbREnt2 ;
   private String A46AlbREnt ;
   private String A56AlbRUni ;
   private String A50AlbRLoc ;
   private String A971ProceNom ;
   private String A841TrnNom ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String A1300AlbRObs ;
   private String A130BarCodPar ;
   private String A200BarPieCod ;
   private java.util.Date AV17FechaInicial ;
   private java.util.Date AV16FechaFinal ;
   private java.util.Date A49AlbRFen ;
   private boolean n840TrnCod ;
   private boolean n970ProceCod ;
   private boolean n971ProceNom ;
   private boolean n841TrnNom ;
   private String AV5Obs ;
   private GXBaseCollection<app.SdtSDTDetalleEntradas>[] aP8 ;
   private IDataStoreProvider pr_default ;
   private short[] P00182_A840TrnCod ;
   private boolean[] P00182_n840TrnCod ;
   private short[] P00182_A970ProceCod ;
   private boolean[] P00182_n970ProceCod ;
   private String[] P00182_A396EmprCod ;
   private int[] P00182_A44AlbRecCod ;
   private byte[] P00182_A47AlbREst ;
   private java.util.Date[] P00182_A49AlbRFen ;
   private String[] P00182_A45AlbRef ;
   private int[] P00182_A252CliCod ;
   private String[] P00182_A279CliNom ;
   private String[] P00182_A3613AlbRefDsc ;
   private String[] P00182_A5806AlbREnt2 ;
   private String[] P00182_A46AlbREnt ;
   private String[] P00182_A56AlbRUni ;
   private String[] P00182_A50AlbRLoc ;
   private String[] P00182_A971ProceNom ;
   private boolean[] P00182_n971ProceNom ;
   private String[] P00182_A841TrnNom ;
   private boolean[] P00182_n841TrnNom ;
   private int[] P00182_A54AlbRPieUti ;
   private int[] P00182_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P00182_A60AlbRUniUti ;
   private java.math.BigDecimal[] P00182_A58AlbRUniEnt ;
   private String[] P00183_A396EmprCod ;
   private int[] P00183_A44AlbRecCod ;
   private String[] P00183_A1300AlbRObs ;
   private byte[] P00183_A1299AlbRLin ;
   private String[] P00184_A396EmprCod ;
   private int[] P00184_A44AlbRecCod ;
   private byte[] P00184_A201BarPieEst ;
   private java.math.BigDecimal[] P00184_A183BarMetLan ;
   private java.math.BigDecimal[] P00184_A170BarKilLan ;
   private int[] P00184_A1271BarPieLzd ;
   private int[] P00184_A129BarCod ;
   private byte[] P00184_A132BarCodReo ;
   private String[] P00184_A130BarCodPar ;
   private String[] P00184_A200BarPieCod ;
   private GXBaseCollection<app.SdtSDTDetalleEntradas> Gxm2rootcol ;
   private app.SdtSDTDetalleEntradas Gxm1sdtdetalleentradas ;
}

final  class dpdetalleentradas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00182", "SELECT T1.TrnCod, T1.ProceCod, T1.EmprCod, T1.AlbRecCod, T1.AlbREst, T1.AlbRFen, T1.AlbRef, T1.CliCod, T4.CliNom, T1.AlbRefDsc, T1.AlbREnt2, T1.AlbREnt, T1.AlbRUni, T1.AlbRLoc, T3.ProceNom, T2.TrnNom, T1.AlbRPieUti, T1.AlbRPieEnt, T1.AlbRUniUti, T1.AlbRUniEnt FROM (((TXPALBREC T1 LEFT JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.TrnCod) LEFT JOIN TXPPROCED T3 ON T3.EmprCod = T1.EmprCod AND T3.ProceCod = T1.ProceCod) INNER JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod) WHERE (T1.EmprCod = ? and T1.CliCod >= ? and T1.AlbRFen >= ? and T1.AlbRef >= ?) AND (T1.AlbRef <= ?) AND (T1.AlbRFen <= ?) AND (T1.AlbREst = ? or ? = 9) AND (T1.CliCod <= ?) ORDER BY T1.EmprCod, T1.CliCod, T1.AlbRFen, T1.AlbRef ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00183", "SELECT EmprCod, AlbRecCod, AlbRObs, AlbRLin FROM TXPALBROB WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod, AlbRLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00184", "SELECT EmprCod, AlbRecCod, BarPieEst, BarMetLan, BarKilLan, BarPieLzd, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE (EmprCod = ? and AlbRecCod = ?) AND (BarPieEst > 0) ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 16);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((String[]) buf[11])[0] = rslt.getString(10, 26);
               ((String[]) buf[12])[0] = rslt.getString(11, 20);
               ((String[]) buf[13])[0] = rslt.getString(12, 8);
               ((String[]) buf[14])[0] = rslt.getString(13, 1);
               ((String[]) buf[15])[0] = rslt.getString(14, 10);
               ((String[]) buf[16])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(17);
               ((int[]) buf[21])[0] = rslt.getInt(18);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(20,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 9);
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
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setString(5, (String)parms[4], 16);
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

