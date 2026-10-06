package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pactpi3 extends GXProcedure
{
   public pactpi3( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pactpi3.class ), "" );
   }

   public pactpi3( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           long[] aP1 ,
                           int[] aP2 ,
                           byte[] aP3 ,
                           String[] aP4 ,
                           java.math.BigDecimal[] aP5 ,
                           java.math.BigDecimal[] aP6 ,
                           int[] aP7 ,
                           java.math.BigDecimal[] aP8 ,
                           java.math.BigDecimal[] aP9 ,
                           int[] aP10 ,
                           String[] aP11 )
   {
      pactpi3.this.aP12 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        int[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        int[] aP10 ,
                        String[] aP11 ,
                        byte[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             int[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             int[] aP10 ,
                             String[] aP11 ,
                             byte[] aP12 )
   {
      pactpi3.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pactpi3.this.AV16AlbProCod = aP1[0];
      this.aP1 = aP1;
      pactpi3.this.AV17BarCod = aP2[0];
      this.aP2 = aP2;
      pactpi3.this.AV18BarCodReo = aP3[0];
      this.aP3 = aP3;
      pactpi3.this.AV19BarCodPar = aP4[0];
      this.aP4 = aP4;
      pactpi3.this.AV20Kilos = aP5[0];
      this.aP5 = aP5;
      pactpi3.this.AV21Metros = aP6[0];
      this.aP6 = aP6;
      pactpi3.this.AV22Piezas = aP7[0];
      this.aP7 = aP7;
      pactpi3.this.AV23KilAnt = aP8[0];
      this.aP8 = aP8;
      pactpi3.this.AV24MtrAnt = aP9[0];
      this.aP9 = aP9;
      pactpi3.this.AV25PieAnt = aP10[0];
      this.aP10 = aP10;
      pactpi3.this.AV26Modo = aP11[0];
      this.aP11 = aP11;
      pactpi3.this.AV27BarSit = aP12[0];
      this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P008O3 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV17BarCod), Byte.valueOf(AV18BarCodReo), AV19BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P008O3_A130BarCodPar[0] ;
         A132BarCodReo = P008O3_A132BarCodReo[0] ;
         A129BarCod = P008O3_A129BarCod[0] ;
         A396EmprCod = P008O3_A396EmprCod[0] ;
         A252CliCod = P008O3_A252CliCod[0] ;
         n252CliCod = P008O3_n252CliCod[0] ;
         A212BarSer = P008O3_A212BarSer[0] ;
         A3133BarNumCor = P008O3_A3133BarNumCor[0] ;
         A166BarKgm = P008O3_A166BarKgm[0] ;
         A184BarMtr = P008O3_A184BarMtr[0] ;
         A168BarKgmLan = P008O3_A168BarKgmLan[0] ;
         A186BarMtrLan = P008O3_A186BarMtrLan[0] ;
         A166BarKgm = P008O3_A166BarKgm[0] ;
         A184BarMtr = P008O3_A184BarMtr[0] ;
         A168BarKgmLan = P008O3_A168BarKgmLan[0] ;
         A186BarMtrLan = P008O3_A186BarMtrLan[0] ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A252CliCod ;
         GXv_char3[0] = A212BarSer ;
         GXv_decimal4[0] = AV30ArtMer ;
         new app.pbusmer(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3, GXv_decimal4) ;
         pactpi3.this.A396EmprCod = GXv_char1[0] ;
         pactpi3.this.A252CliCod = GXv_int2[0] ;
         pactpi3.this.A212BarSer = GXv_char3[0] ;
         pactpi3.this.AV30ArtMer = GXv_decimal4[0] ;
         AV36BarKgm = A166BarKgm ;
         AV33BarMtr = A184BarMtr ;
         AV31BarKgmLan = A168BarKgmLan ;
         AV34BarMtrLan = A186BarMtrLan ;
         AV32DifKgm = AV36BarKgm.subtract(AV31BarKgmLan) ;
         AV35DifMtr = AV33BarMtr.subtract(AV34BarMtrLan) ;
         AV37vCortes = (short)(A3133BarNumCor+1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV28OK = " " ;
      if ( AV27BarSit != 9 )
      {
         if ( GXutil.strcmp(AV26Modo, httpContext.getMessage( "DEL", "")) != 0 )
         {
            while ( ( GXutil.strcmp(AV28OK, httpContext.getMessage( "N", "")) != 0 ) && ( GXutil.strcmp(AV28OK, httpContext.getMessage( "S", "")) != 0 ) )
            {
               if ( AV37vCortes == 0 )
               {
               }
               else
               {
               }
            }
         }
         else
         {
            AV28OK = httpContext.getMessage( "N", "") ;
         }
      }
      if ( GXutil.strcmp(AV26Modo, httpContext.getMessage( "INS", "")) == 0 )
      {
         AV29ContPie = 0 ;
         /* Using cursor P008O4 */
         pr_default.execute(1, new Object[] {AV15EmprCod, Integer.valueOf(AV17BarCod), Byte.valueOf(AV18BarCodReo), AV19BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A200BarPieCod = P008O4_A200BarPieCod[0] ;
            A130BarCodPar = P008O4_A130BarCodPar[0] ;
            A132BarCodReo = P008O4_A132BarCodReo[0] ;
            A129BarCod = P008O4_A129BarCod[0] ;
            A396EmprCod = P008O4_A396EmprCod[0] ;
            A201BarPieEst = P008O4_A201BarPieEst[0] ;
            AV29ContPie = (int)(AV29ContPie+1) ;
            /*
               INSERT RECORD ON TABLE TXPLALPRD

            */
            A30AlbProCod = AV16AlbProCod ;
            A27AlbPKilEnt = DecimalUtil.ZERO ;
            A1270AlbPMtrEnt = DecimalUtil.ZERO ;
            /* Using cursor P008O5 */
            pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, A27AlbPKilEnt, A1270AlbPMtrEnt});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALPRD");
            if ( (pr_default.getStatus(2) == 1) )
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
            A201BarPieEst = (byte)(1) ;
            if ( AV29ContPie == AV22Piezas )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               /* Using cursor P008O6 */
               pr_default.execute(3, new Object[] {Byte.valueOf(A201BarPieEst), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
               if (true) break;
            }
            /* Using cursor P008O7 */
            pr_default.execute(4, new Object[] {Byte.valueOf(A201BarPieEst), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
      GXv_char3[0] = AV15EmprCod ;
      GXv_int5[0] = AV16AlbProCod ;
      GXv_int2[0] = AV17BarCod ;
      GXv_int6[0] = AV18BarCodReo ;
      GXv_char1[0] = AV19BarCodPar ;
      GXv_decimal4[0] = AV20Kilos ;
      GXv_decimal7[0] = AV21Metros ;
      GXv_int8[0] = AV22Piezas ;
      GXv_decimal9[0] = AV23KilAnt ;
      GXv_decimal10[0] = AV24MtrAnt ;
      GXv_int11[0] = AV25PieAnt ;
      GXv_char12[0] = AV26Modo ;
      new app.pcampi3(remoteHandle, context).execute( GXv_char3, GXv_int5, GXv_int2, GXv_int6, GXv_char1, GXv_decimal4, GXv_decimal7, GXv_int8, GXv_decimal9, GXv_decimal10, GXv_int11, GXv_char12) ;
      pactpi3.this.AV15EmprCod = GXv_char3[0] ;
      pactpi3.this.AV16AlbProCod = GXv_int5[0] ;
      pactpi3.this.AV17BarCod = GXv_int2[0] ;
      pactpi3.this.AV18BarCodReo = GXv_int6[0] ;
      pactpi3.this.AV19BarCodPar = GXv_char1[0] ;
      pactpi3.this.AV20Kilos = GXv_decimal4[0] ;
      pactpi3.this.AV21Metros = GXv_decimal7[0] ;
      pactpi3.this.AV22Piezas = GXv_int8[0] ;
      pactpi3.this.AV23KilAnt = GXv_decimal9[0] ;
      pactpi3.this.AV24MtrAnt = GXv_decimal10[0] ;
      pactpi3.this.AV25PieAnt = GXv_int11[0] ;
      pactpi3.this.AV26Modo = GXv_char12[0] ;
      if ( GXutil.strcmp(AV28OK, httpContext.getMessage( "S", "")) == 0 )
      {
         GXv_char12[0] = AV15EmprCod ;
         GXv_int11[0] = AV17BarCod ;
         GXv_int6[0] = AV18BarCodReo ;
         GXv_char3[0] = AV19BarCodPar ;
         GXv_int13[0] = (byte)(9) ;
         new app.pmodsit(remoteHandle, context).execute( GXv_char12, GXv_int11, GXv_int6, GXv_char3, GXv_int13) ;
         pactpi3.this.AV15EmprCod = GXv_char12[0] ;
         pactpi3.this.AV17BarCod = GXv_int11[0] ;
         pactpi3.this.AV18BarCodReo = GXv_int6[0] ;
         pactpi3.this.AV19BarCodPar = GXv_char3[0] ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pactpi3.this.AV15EmprCod;
      this.aP1[0] = pactpi3.this.AV16AlbProCod;
      this.aP2[0] = pactpi3.this.AV17BarCod;
      this.aP3[0] = pactpi3.this.AV18BarCodReo;
      this.aP4[0] = pactpi3.this.AV19BarCodPar;
      this.aP5[0] = pactpi3.this.AV20Kilos;
      this.aP6[0] = pactpi3.this.AV21Metros;
      this.aP7[0] = pactpi3.this.AV22Piezas;
      this.aP8[0] = pactpi3.this.AV23KilAnt;
      this.aP9[0] = pactpi3.this.AV24MtrAnt;
      this.aP10[0] = pactpi3.this.AV25PieAnt;
      this.aP11[0] = pactpi3.this.AV26Modo;
      this.aP12[0] = pactpi3.this.AV27BarSit;
      Application.commitDataStores(context, remoteHandle, pr_default, "pactpi3");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P008O3_A130BarCodPar = new String[] {""} ;
      P008O3_A132BarCodReo = new byte[1] ;
      P008O3_A129BarCod = new int[1] ;
      P008O3_A396EmprCod = new String[] {""} ;
      P008O3_A252CliCod = new int[1] ;
      P008O3_n252CliCod = new boolean[] {false} ;
      P008O3_A212BarSer = new String[] {""} ;
      P008O3_A3133BarNumCor = new short[1] ;
      P008O3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008O3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008O3_A168BarKgmLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008O3_A186BarMtrLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A212BarSer = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A168BarKgmLan = DecimalUtil.ZERO ;
      A186BarMtrLan = DecimalUtil.ZERO ;
      AV30ArtMer = DecimalUtil.ZERO ;
      AV36BarKgm = DecimalUtil.ZERO ;
      AV33BarMtr = DecimalUtil.ZERO ;
      AV31BarKgmLan = DecimalUtil.ZERO ;
      AV34BarMtrLan = DecimalUtil.ZERO ;
      AV32DifKgm = DecimalUtil.ZERO ;
      AV35DifMtr = DecimalUtil.ZERO ;
      AV28OK = "" ;
      P008O4_A200BarPieCod = new String[] {""} ;
      P008O4_A130BarCodPar = new String[] {""} ;
      P008O4_A132BarCodReo = new byte[1] ;
      P008O4_A129BarCod = new int[1] ;
      P008O4_A396EmprCod = new String[] {""} ;
      P008O4_A201BarPieEst = new byte[1] ;
      A200BarPieCod = "" ;
      A27AlbPKilEnt = DecimalUtil.ZERO ;
      A1270AlbPMtrEnt = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      GXv_int5 = new long[1] ;
      GXv_int2 = new int[1] ;
      GXv_char1 = new String[1] ;
      GXv_decimal4 = new java.math.BigDecimal[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_int8 = new int[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_char12 = new String[1] ;
      GXv_int11 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_int13 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pactpi3__default(),
         new Object[] {
             new Object[] {
            P008O3_A130BarCodPar, P008O3_A132BarCodReo, P008O3_A129BarCod, P008O3_A396EmprCod, P008O3_A252CliCod, P008O3_n252CliCod, P008O3_A212BarSer, P008O3_A3133BarNumCor, P008O3_A166BarKgm, P008O3_A184BarMtr,
            P008O3_A168BarKgmLan, P008O3_A186BarMtrLan
            }
            , new Object[] {
            P008O4_A200BarPieCod, P008O4_A130BarCodPar, P008O4_A132BarCodReo, P008O4_A129BarCod, P008O4_A396EmprCod, P008O4_A201BarPieEst
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18BarCodReo ;
   private byte AV27BarSit ;
   private byte A132BarCodReo ;
   private byte A201BarPieEst ;
   private byte GXv_int6[] ;
   private byte GXv_int13[] ;
   private short A3133BarNumCor ;
   private short AV37vCortes ;
   private short Gx_err ;
   private int AV17BarCod ;
   private int AV22Piezas ;
   private int AV25PieAnt ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int AV29ContPie ;
   private int GX_INS197 ;
   private int GXv_int2[] ;
   private int GXv_int8[] ;
   private int GXv_int11[] ;
   private long AV16AlbProCod ;
   private long A30AlbProCod ;
   private long GXv_int5[] ;
   private java.math.BigDecimal AV20Kilos ;
   private java.math.BigDecimal AV21Metros ;
   private java.math.BigDecimal AV23KilAnt ;
   private java.math.BigDecimal AV24MtrAnt ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A168BarKgmLan ;
   private java.math.BigDecimal A186BarMtrLan ;
   private java.math.BigDecimal AV30ArtMer ;
   private java.math.BigDecimal AV36BarKgm ;
   private java.math.BigDecimal AV33BarMtr ;
   private java.math.BigDecimal AV31BarKgmLan ;
   private java.math.BigDecimal AV34BarMtrLan ;
   private java.math.BigDecimal AV32DifKgm ;
   private java.math.BigDecimal AV35DifMtr ;
   private java.math.BigDecimal A27AlbPKilEnt ;
   private java.math.BigDecimal A1270AlbPMtrEnt ;
   private java.math.BigDecimal GXv_decimal4[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private String AV15EmprCod ;
   private String AV19BarCodPar ;
   private String AV26Modo ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A212BarSer ;
   private String AV28OK ;
   private String A200BarPieCod ;
   private String Gx_emsg ;
   private String GXv_char1[] ;
   private String GXv_char12[] ;
   private String GXv_char3[] ;
   private boolean n252CliCod ;
   private byte[] aP12 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private int[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private int[] aP10 ;
   private String[] aP11 ;
   private IDataStoreProvider pr_default ;
   private String[] P008O3_A130BarCodPar ;
   private byte[] P008O3_A132BarCodReo ;
   private int[] P008O3_A129BarCod ;
   private String[] P008O3_A396EmprCod ;
   private int[] P008O3_A252CliCod ;
   private boolean[] P008O3_n252CliCod ;
   private String[] P008O3_A212BarSer ;
   private short[] P008O3_A3133BarNumCor ;
   private java.math.BigDecimal[] P008O3_A166BarKgm ;
   private java.math.BigDecimal[] P008O3_A184BarMtr ;
   private java.math.BigDecimal[] P008O3_A168BarKgmLan ;
   private java.math.BigDecimal[] P008O3_A186BarMtrLan ;
   private String[] P008O4_A200BarPieCod ;
   private String[] P008O4_A130BarCodPar ;
   private byte[] P008O4_A132BarCodReo ;
   private int[] P008O4_A129BarCod ;
   private String[] P008O4_A396EmprCod ;
   private byte[] P008O4_A201BarPieEst ;
}

final  class pactpi3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P008O3", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.CliCod, T1.BarSer, T1.BarNumCor, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarKgmLan, 0) AS BarKgmLan, COALESCE( T2.BarMtrLan, 0) AS BarMtrLan FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, SUM(BarKilLan) AS BarKgmLan, SUM(BarMetLan) AS BarMtrLan FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P008O4", "SELECT BarPieCod, BarCodPar, BarCodReo, BarCod, EmprCod, BarPieEst FROM TXPBARPIE WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarPieEst = 0) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P008O5", "INSERT INTO TXPLALPRD(EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbPKilEnt, AlbPMtrEnt, AlbPieDsc, AlbPreAnc, AlbPKilNet, AlbPMtrNet, AlbPreAncc, AlbPrePgd, AlbTarAlb, AlbPTrnCod, AlbPTrnFec) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, 0, 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALPRD")
         ,new UpdateCursor("P008O6", "UPDATE TXPBARPIE SET BarPieEst=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P008O7", "UPDATE TXPBARPIE SET BarPieEst=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               return;
            case 3 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 4 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
      }
   }

}

