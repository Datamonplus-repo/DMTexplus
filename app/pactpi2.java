package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pactpi2 extends GXProcedure
{
   public pactpi2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pactpi2.class ), "" );
   }

   public pactpi2( int remoteHandle ,
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
                           String[] aP8 )
   {
      pactpi2.this.aP9 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        int[] aP7 ,
                        String[] aP8 ,
                        byte[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             int[] aP7 ,
                             String[] aP8 ,
                             byte[] aP9 )
   {
      pactpi2.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pactpi2.this.AV16AlbProCod = aP1[0];
      this.aP1 = aP1;
      pactpi2.this.AV17BarCod = aP2[0];
      this.aP2 = aP2;
      pactpi2.this.AV18BarCodReo = aP3[0];
      this.aP3 = aP3;
      pactpi2.this.AV19BarCodPar = aP4[0];
      this.aP4 = aP4;
      pactpi2.this.AV20Kilos = aP5[0];
      this.aP5 = aP5;
      pactpi2.this.AV21KilAnt = aP6[0];
      this.aP6 = aP6;
      pactpi2.this.AV22Piezas = aP7[0];
      this.aP7 = aP7;
      pactpi2.this.AV23Modo = aP8[0];
      this.aP8 = aP8;
      pactpi2.this.AV24BarSit = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P008J3 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV17BarCod), Byte.valueOf(AV18BarCodReo), AV19BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P008J3_A130BarCodPar[0] ;
         A132BarCodReo = P008J3_A132BarCodReo[0] ;
         A129BarCod = P008J3_A129BarCod[0] ;
         A396EmprCod = P008J3_A396EmprCod[0] ;
         A252CliCod = P008J3_A252CliCod[0] ;
         n252CliCod = P008J3_n252CliCod[0] ;
         A212BarSer = P008J3_A212BarSer[0] ;
         A3133BarNumCor = P008J3_A3133BarNumCor[0] ;
         A166BarKgm = P008J3_A166BarKgm[0] ;
         A184BarMtr = P008J3_A184BarMtr[0] ;
         A168BarKgmLan = P008J3_A168BarKgmLan[0] ;
         A186BarMtrLan = P008J3_A186BarMtrLan[0] ;
         A166BarKgm = P008J3_A166BarKgm[0] ;
         A184BarMtr = P008J3_A184BarMtr[0] ;
         A168BarKgmLan = P008J3_A168BarKgmLan[0] ;
         A186BarMtrLan = P008J3_A186BarMtrLan[0] ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A252CliCod ;
         GXv_char3[0] = A212BarSer ;
         GXv_decimal4[0] = AV33ArtMer ;
         new app.pbusmer(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3, GXv_decimal4) ;
         pactpi2.this.A396EmprCod = GXv_char1[0] ;
         pactpi2.this.A252CliCod = GXv_int2[0] ;
         pactpi2.this.A212BarSer = GXv_char3[0] ;
         pactpi2.this.AV33ArtMer = GXv_decimal4[0] ;
         AV27BarKgm = A166BarKgm ;
         AV30BarMtr = A184BarMtr ;
         AV28BarKgmLan = A168BarKgmLan ;
         AV31BarMtrLan = A186BarMtrLan ;
         AV29DifKgm = AV27BarKgm.subtract(AV28BarKgmLan) ;
         AV32DifMtr = AV30BarMtr.subtract(AV31BarMtrLan) ;
         AV34vCortes = (short)(A3133BarNumCor+1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV25OK = " " ;
      if ( AV24BarSit != 9 )
      {
         if ( GXutil.strcmp(AV23Modo, httpContext.getMessage( "DEL", "")) != 0 )
         {
            while ( ( GXutil.strcmp(AV25OK, httpContext.getMessage( "N", "")) != 0 ) && ( GXutil.strcmp(AV25OK, httpContext.getMessage( "S", "")) != 0 ) )
            {
               if ( AV34vCortes == 0 )
               {
               }
               else
               {
               }
            }
         }
         else
         {
            AV25OK = httpContext.getMessage( "N", "") ;
         }
      }
      if ( GXutil.strcmp(AV23Modo, httpContext.getMessage( "INS", "")) == 0 )
      {
         AV26ContPie = 0 ;
         /* Using cursor P008J4 */
         pr_default.execute(1, new Object[] {AV15EmprCod, Integer.valueOf(AV17BarCod), Byte.valueOf(AV18BarCodReo), AV19BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A200BarPieCod = P008J4_A200BarPieCod[0] ;
            A130BarCodPar = P008J4_A130BarCodPar[0] ;
            A132BarCodReo = P008J4_A132BarCodReo[0] ;
            A129BarCod = P008J4_A129BarCod[0] ;
            A396EmprCod = P008J4_A396EmprCod[0] ;
            A170BarKilLan = P008J4_A170BarKilLan[0] ;
            A201BarPieEst = P008J4_A201BarPieEst[0] ;
            AV26ContPie = (int)(AV26ContPie+1) ;
            /*
               INSERT RECORD ON TABLE TXPLALPRD

            */
            A30AlbProCod = AV16AlbProCod ;
            A27AlbPKilEnt = DecimalUtil.ZERO ;
            A1270AlbPMtrEnt = DecimalUtil.ZERO ;
            /* Using cursor P008J5 */
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
            if ( AV26ContPie == AV22Piezas )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               /* Using cursor P008J6 */
               pr_default.execute(3, new Object[] {Byte.valueOf(A201BarPieEst), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
               if (true) break;
            }
            /* Using cursor P008J7 */
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
      GXv_decimal7[0] = AV21KilAnt ;
      GXv_char8[0] = AV23Modo ;
      new app.pcampi2(remoteHandle, context).execute( GXv_char3, GXv_int5, GXv_int2, GXv_int6, GXv_char1, GXv_decimal4, GXv_decimal7, GXv_char8) ;
      pactpi2.this.AV15EmprCod = GXv_char3[0] ;
      pactpi2.this.AV16AlbProCod = GXv_int5[0] ;
      pactpi2.this.AV17BarCod = GXv_int2[0] ;
      pactpi2.this.AV18BarCodReo = GXv_int6[0] ;
      pactpi2.this.AV19BarCodPar = GXv_char1[0] ;
      pactpi2.this.AV20Kilos = GXv_decimal4[0] ;
      pactpi2.this.AV21KilAnt = GXv_decimal7[0] ;
      pactpi2.this.AV23Modo = GXv_char8[0] ;
      if ( GXutil.strcmp(AV25OK, httpContext.getMessage( "S", "")) == 0 )
      {
         GXv_char8[0] = AV15EmprCod ;
         GXv_int2[0] = AV17BarCod ;
         GXv_int6[0] = AV18BarCodReo ;
         GXv_char3[0] = AV19BarCodPar ;
         GXv_int9[0] = (byte)(9) ;
         new app.pmodsit(remoteHandle, context).execute( GXv_char8, GXv_int2, GXv_int6, GXv_char3, GXv_int9) ;
         pactpi2.this.AV15EmprCod = GXv_char8[0] ;
         pactpi2.this.AV17BarCod = GXv_int2[0] ;
         pactpi2.this.AV18BarCodReo = GXv_int6[0] ;
         pactpi2.this.AV19BarCodPar = GXv_char3[0] ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pactpi2.this.AV15EmprCod;
      this.aP1[0] = pactpi2.this.AV16AlbProCod;
      this.aP2[0] = pactpi2.this.AV17BarCod;
      this.aP3[0] = pactpi2.this.AV18BarCodReo;
      this.aP4[0] = pactpi2.this.AV19BarCodPar;
      this.aP5[0] = pactpi2.this.AV20Kilos;
      this.aP6[0] = pactpi2.this.AV21KilAnt;
      this.aP7[0] = pactpi2.this.AV22Piezas;
      this.aP8[0] = pactpi2.this.AV23Modo;
      this.aP9[0] = pactpi2.this.AV24BarSit;
      Application.commitDataStores(context, remoteHandle, pr_default, "pactpi2");
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
      P008J3_A130BarCodPar = new String[] {""} ;
      P008J3_A132BarCodReo = new byte[1] ;
      P008J3_A129BarCod = new int[1] ;
      P008J3_A396EmprCod = new String[] {""} ;
      P008J3_A252CliCod = new int[1] ;
      P008J3_n252CliCod = new boolean[] {false} ;
      P008J3_A212BarSer = new String[] {""} ;
      P008J3_A3133BarNumCor = new short[1] ;
      P008J3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008J3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008J3_A168BarKgmLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008J3_A186BarMtrLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A212BarSer = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A168BarKgmLan = DecimalUtil.ZERO ;
      A186BarMtrLan = DecimalUtil.ZERO ;
      AV33ArtMer = DecimalUtil.ZERO ;
      AV27BarKgm = DecimalUtil.ZERO ;
      AV30BarMtr = DecimalUtil.ZERO ;
      AV28BarKgmLan = DecimalUtil.ZERO ;
      AV31BarMtrLan = DecimalUtil.ZERO ;
      AV29DifKgm = DecimalUtil.ZERO ;
      AV32DifMtr = DecimalUtil.ZERO ;
      AV25OK = "" ;
      P008J4_A200BarPieCod = new String[] {""} ;
      P008J4_A130BarCodPar = new String[] {""} ;
      P008J4_A132BarCodReo = new byte[1] ;
      P008J4_A129BarCod = new int[1] ;
      P008J4_A396EmprCod = new String[] {""} ;
      P008J4_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008J4_A201BarPieEst = new byte[1] ;
      A200BarPieCod = "" ;
      A170BarKilLan = DecimalUtil.ZERO ;
      A27AlbPKilEnt = DecimalUtil.ZERO ;
      A1270AlbPMtrEnt = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      GXv_int5 = new long[1] ;
      GXv_char1 = new String[1] ;
      GXv_decimal4 = new java.math.BigDecimal[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_char8 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_int9 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pactpi2__default(),
         new Object[] {
             new Object[] {
            P008J3_A130BarCodPar, P008J3_A132BarCodReo, P008J3_A129BarCod, P008J3_A396EmprCod, P008J3_A252CliCod, P008J3_n252CliCod, P008J3_A212BarSer, P008J3_A3133BarNumCor, P008J3_A166BarKgm, P008J3_A184BarMtr,
            P008J3_A168BarKgmLan, P008J3_A186BarMtrLan
            }
            , new Object[] {
            P008J4_A200BarPieCod, P008J4_A130BarCodPar, P008J4_A132BarCodReo, P008J4_A129BarCod, P008J4_A396EmprCod, P008J4_A170BarKilLan, P008J4_A201BarPieEst
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
   private byte AV24BarSit ;
   private byte A132BarCodReo ;
   private byte A201BarPieEst ;
   private byte GXv_int6[] ;
   private byte GXv_int9[] ;
   private short A3133BarNumCor ;
   private short AV34vCortes ;
   private short Gx_err ;
   private int AV17BarCod ;
   private int AV22Piezas ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int AV26ContPie ;
   private int GX_INS197 ;
   private int GXv_int2[] ;
   private long AV16AlbProCod ;
   private long A30AlbProCod ;
   private long GXv_int5[] ;
   private java.math.BigDecimal AV20Kilos ;
   private java.math.BigDecimal AV21KilAnt ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A168BarKgmLan ;
   private java.math.BigDecimal A186BarMtrLan ;
   private java.math.BigDecimal AV33ArtMer ;
   private java.math.BigDecimal AV27BarKgm ;
   private java.math.BigDecimal AV30BarMtr ;
   private java.math.BigDecimal AV28BarKgmLan ;
   private java.math.BigDecimal AV31BarMtrLan ;
   private java.math.BigDecimal AV29DifKgm ;
   private java.math.BigDecimal AV32DifMtr ;
   private java.math.BigDecimal A170BarKilLan ;
   private java.math.BigDecimal A27AlbPKilEnt ;
   private java.math.BigDecimal A1270AlbPMtrEnt ;
   private java.math.BigDecimal GXv_decimal4[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private String AV15EmprCod ;
   private String AV19BarCodPar ;
   private String AV23Modo ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A212BarSer ;
   private String AV25OK ;
   private String A200BarPieCod ;
   private String Gx_emsg ;
   private String GXv_char1[] ;
   private String GXv_char8[] ;
   private String GXv_char3[] ;
   private boolean n252CliCod ;
   private byte[] aP9 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private int[] aP7 ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P008J3_A130BarCodPar ;
   private byte[] P008J3_A132BarCodReo ;
   private int[] P008J3_A129BarCod ;
   private String[] P008J3_A396EmprCod ;
   private int[] P008J3_A252CliCod ;
   private boolean[] P008J3_n252CliCod ;
   private String[] P008J3_A212BarSer ;
   private short[] P008J3_A3133BarNumCor ;
   private java.math.BigDecimal[] P008J3_A166BarKgm ;
   private java.math.BigDecimal[] P008J3_A184BarMtr ;
   private java.math.BigDecimal[] P008J3_A168BarKgmLan ;
   private java.math.BigDecimal[] P008J3_A186BarMtrLan ;
   private String[] P008J4_A200BarPieCod ;
   private String[] P008J4_A130BarCodPar ;
   private byte[] P008J4_A132BarCodReo ;
   private int[] P008J4_A129BarCod ;
   private String[] P008J4_A396EmprCod ;
   private java.math.BigDecimal[] P008J4_A170BarKilLan ;
   private byte[] P008J4_A201BarPieEst ;
}

final  class pactpi2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P008J3", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.CliCod, T1.BarSer, T1.BarNumCor, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarKgmLan, 0) AS BarKgmLan, COALESCE( T2.BarMtrLan, 0) AS BarMtrLan FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, SUM(BarKilLan) AS BarKgmLan, SUM(BarMetLan) AS BarMtrLan FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P008J4", "SELECT BarPieCod, BarCodPar, BarCodReo, BarCod, EmprCod, BarKilLan, BarPieEst FROM TXPBARPIE WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarPieEst = 0) AND (BarKilLan <> 0) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P008J5", "INSERT INTO TXPLALPRD(EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbPKilEnt, AlbPMtrEnt, AlbPieDsc, AlbPreAnc, AlbPKilNet, AlbPMtrNet, AlbPreAncc, AlbPrePgd, AlbTarAlb, AlbPTrnCod, AlbPTrnFec) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, 0, 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALPRD")
         ,new UpdateCursor("P008J6", "UPDATE TXPBARPIE SET BarPieEst=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P008J7", "UPDATE TXPBARPIE SET BarPieEst=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
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
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
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

