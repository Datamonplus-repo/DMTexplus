package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aphisrag extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aphisrag pgm = new aphisrag (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aphisrag( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aphisrag.class ), "" );
   }

   public aphisrag( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P03WS2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P03WS2_A396EmprCod[0] ;
         A9808HreRacab = P03WS2_A9808HreRacab[0] ;
         n9808HreRacab = P03WS2_n9808HreRacab[0] ;
         A4492HreBarCod = P03WS2_A4492HreBarCod[0] ;
         A4493HreBarReo = P03WS2_A4493HreBarReo[0] ;
         A4494HreBarPar = P03WS2_A4494HreBarPar[0] ;
         A4495HreNumCie = P03WS2_A4495HreNumCie[0] ;
         if ( GXutil.strcmp(A9808HreRacab, httpContext.getMessage( "S", "")) == 0 )
         {
            AV8Ac_barcod = A4492HreBarCod ;
            AV9Ac_barreo = A4493HreBarReo ;
            AV10Ac_barpar = A4494HreBarPar ;
            AV17HreNumcie = A4495HreNumCie ;
            /* Execute user subroutine: 'HDRACA' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'HDRACA' Routine */
      returnInSub = false ;
      /* Using cursor P03WS3 */
      pr_default.execute(1, new Object[] {Integer.valueOf(AV8Ac_barcod), Byte.valueOf(AV9Ac_barreo), AV10Ac_barpar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A6031Ac_Barcod = P03WS3_A6031Ac_Barcod[0] ;
         A6032Ac_BarReo = P03WS3_A6032Ac_BarReo[0] ;
         A6033Ac_BarPar = P03WS3_A6033Ac_BarPar[0] ;
         A6035Ac_Kilos = P03WS3_A6035Ac_Kilos[0] ;
         n6035Ac_Kilos = P03WS3_n6035Ac_Kilos[0] ;
         A6034Ac_Metros = P03WS3_A6034Ac_Metros[0] ;
         n6034Ac_Metros = P03WS3_n6034Ac_Metros[0] ;
         A6036Ac_Pzs = P03WS3_A6036Ac_Pzs[0] ;
         n6036Ac_Pzs = P03WS3_n6036Ac_Pzs[0] ;
         A396EmprCod = P03WS3_A396EmprCod[0] ;
         A132BarCodReo = P03WS3_A132BarCodReo[0] ;
         A130BarCodPar = P03WS3_A130BarCodPar[0] ;
         A129BarCod = P03WS3_A129BarCod[0] ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A6031Ac_Barcod ;
         GXv_int3[0] = A6032Ac_BarReo ;
         GXv_char4[0] = A6033Ac_BarPar ;
         GXv_int5[0] = AV12Clicodagr ;
         GXv_char6[0] = AV13BarAGrser ;
         GXv_char7[0] = AV14BarAGrdsc ;
         GXv_char8[0] = AV15ColNomAgr ;
         GXv_int9[0] = AV16ColNumAgr ;
         new app.recetasdeacabados.pinfhdraac(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_int5, GXv_char6, GXv_char7, GXv_char8, GXv_int9) ;
         aphisrag.this.A396EmprCod = GXv_char1[0] ;
         aphisrag.this.A6031Ac_Barcod = GXv_int2[0] ;
         aphisrag.this.A6032Ac_BarReo = GXv_int3[0] ;
         aphisrag.this.A6033Ac_BarPar = GXv_char4[0] ;
         aphisrag.this.AV12Clicodagr = GXv_int5[0] ;
         aphisrag.this.AV13BarAGrser = GXv_char6[0] ;
         aphisrag.this.AV14BarAGrdsc = GXv_char7[0] ;
         aphisrag.this.AV15ColNomAgr = GXv_char8[0] ;
         aphisrag.this.AV16ColNumAgr = GXv_int9[0] ;
         /*
            INSERT RECORD ON TABLE TXPHISHRA

         */
         A4492HreBarCod = AV22Barcod ;
         A4493HreBarReo = AV23Barcodreo ;
         A4494HreBarPar = AV24Barcodpar ;
         A4495HreNumCie = AV17HreNumcie ;
         A9985HreAcCod = A6031Ac_Barcod ;
         A9986HreAcReo = A6032Ac_BarReo ;
         A9987HreAcPar = A6033Ac_BarPar ;
         A9988HreAcKgm = A6035Ac_Kilos ;
         n9988HreAcKgm = false ;
         A9989HreAcMtr = A6034Ac_Metros ;
         n9989HreAcMtr = false ;
         A9990HreAcPie = A6036Ac_Pzs ;
         n9990HreAcPie = false ;
         A9991HreAcCli = AV12Clicodagr ;
         n9991HreAcCli = false ;
         A9992HreAcSer = AV13BarAGrser ;
         n9992HreAcSer = false ;
         A9993HreAcDsc = AV14BarAGrdsc ;
         n9993HreAcDsc = false ;
         A9994HreAcCol = AV15ColNomAgr ;
         n9994HreAcCol = false ;
         A9995HreAcNumC = AV16ColNumAgr ;
         n9995HreAcNumC = false ;
         /* Using cursor P03WS4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Integer.valueOf(A9985HreAcCod), Byte.valueOf(A9986HreAcReo), A9987HreAcPar, Boolean.valueOf(n9988HreAcKgm), A9988HreAcKgm, Boolean.valueOf(n9989HreAcMtr), A9989HreAcMtr, Boolean.valueOf(n9990HreAcPie), Integer.valueOf(A9990HreAcPie), Boolean.valueOf(n9991HreAcCli), Integer.valueOf(A9991HreAcCli), Boolean.valueOf(n9992HreAcSer), A9992HreAcSer, Boolean.valueOf(n9993HreAcDsc), A9993HreAcDsc, Boolean.valueOf(n9994HreAcCol), A9994HreAcCol, Boolean.valueOf(n9995HreAcNumC), Integer.valueOf(A9995HreAcNumC)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISHRA");
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
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(phisrag.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aphisrag");
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
      P03WS2_A396EmprCod = new String[] {""} ;
      P03WS2_A9808HreRacab = new String[] {""} ;
      P03WS2_n9808HreRacab = new boolean[] {false} ;
      P03WS2_A4492HreBarCod = new int[1] ;
      P03WS2_A4493HreBarReo = new byte[1] ;
      P03WS2_A4494HreBarPar = new String[] {""} ;
      P03WS2_A4495HreNumCie = new byte[1] ;
      A396EmprCod = "" ;
      A9808HreRacab = "" ;
      A4494HreBarPar = "" ;
      AV10Ac_barpar = "" ;
      P03WS3_A6031Ac_Barcod = new int[1] ;
      P03WS3_A6032Ac_BarReo = new byte[1] ;
      P03WS3_A6033Ac_BarPar = new String[] {""} ;
      P03WS3_A6035Ac_Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03WS3_n6035Ac_Kilos = new boolean[] {false} ;
      P03WS3_A6034Ac_Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03WS3_n6034Ac_Metros = new boolean[] {false} ;
      P03WS3_A6036Ac_Pzs = new short[1] ;
      P03WS3_n6036Ac_Pzs = new boolean[] {false} ;
      P03WS3_A396EmprCod = new String[] {""} ;
      P03WS3_A132BarCodReo = new byte[1] ;
      P03WS3_A130BarCodPar = new String[] {""} ;
      P03WS3_A129BarCod = new int[1] ;
      A6033Ac_BarPar = "" ;
      A6035Ac_Kilos = DecimalUtil.ZERO ;
      A6034Ac_Metros = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      AV13BarAGrser = "" ;
      GXv_char6 = new String[1] ;
      AV14BarAGrdsc = "" ;
      GXv_char7 = new String[1] ;
      AV15ColNomAgr = "" ;
      GXv_char8 = new String[1] ;
      GXv_int9 = new int[1] ;
      AV24Barcodpar = "" ;
      A9987HreAcPar = "" ;
      A9988HreAcKgm = DecimalUtil.ZERO ;
      A9989HreAcMtr = DecimalUtil.ZERO ;
      A9992HreAcSer = "" ;
      A9993HreAcDsc = "" ;
      A9994HreAcCol = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aphisrag__default(),
         new Object[] {
             new Object[] {
            P03WS2_A396EmprCod, P03WS2_A9808HreRacab, P03WS2_n9808HreRacab, P03WS2_A4492HreBarCod, P03WS2_A4493HreBarReo, P03WS2_A4494HreBarPar, P03WS2_A4495HreNumCie
            }
            , new Object[] {
            P03WS3_A6031Ac_Barcod, P03WS3_A6032Ac_BarReo, P03WS3_A6033Ac_BarPar, P03WS3_A6035Ac_Kilos, P03WS3_n6035Ac_Kilos, P03WS3_A6034Ac_Metros, P03WS3_n6034Ac_Metros, P03WS3_A6036Ac_Pzs, P03WS3_n6036Ac_Pzs, P03WS3_A396EmprCod,
            P03WS3_A132BarCodReo, P03WS3_A130BarCodPar, P03WS3_A129BarCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte AV9Ac_barreo ;
   private byte AV17HreNumcie ;
   private byte A6032Ac_BarReo ;
   private byte A132BarCodReo ;
   private byte GXv_int3[] ;
   private byte AV23Barcodreo ;
   private byte A9986HreAcReo ;
   private short A6036Ac_Pzs ;
   private short Gx_err ;
   private int A4492HreBarCod ;
   private int AV8Ac_barcod ;
   private int A6031Ac_Barcod ;
   private int A129BarCod ;
   private int GXv_int2[] ;
   private int AV12Clicodagr ;
   private int GXv_int5[] ;
   private int AV16ColNumAgr ;
   private int GXv_int9[] ;
   private int GX_INS1327 ;
   private int AV22Barcod ;
   private int A9985HreAcCod ;
   private int A9990HreAcPie ;
   private int A9991HreAcCli ;
   private int A9995HreAcNumC ;
   private java.math.BigDecimal A6035Ac_Kilos ;
   private java.math.BigDecimal A6034Ac_Metros ;
   private java.math.BigDecimal A9988HreAcKgm ;
   private java.math.BigDecimal A9989HreAcMtr ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A9808HreRacab ;
   private String A4494HreBarPar ;
   private String AV10Ac_barpar ;
   private String A6033Ac_BarPar ;
   private String A130BarCodPar ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private String AV13BarAGrser ;
   private String GXv_char6[] ;
   private String AV14BarAGrdsc ;
   private String GXv_char7[] ;
   private String AV15ColNomAgr ;
   private String GXv_char8[] ;
   private String AV24Barcodpar ;
   private String A9987HreAcPar ;
   private String A9992HreAcSer ;
   private String A9993HreAcDsc ;
   private String A9994HreAcCol ;
   private String Gx_emsg ;
   private boolean n9808HreRacab ;
   private boolean returnInSub ;
   private boolean n6035Ac_Kilos ;
   private boolean n6034Ac_Metros ;
   private boolean n6036Ac_Pzs ;
   private boolean n9988HreAcKgm ;
   private boolean n9989HreAcMtr ;
   private boolean n9990HreAcPie ;
   private boolean n9991HreAcCli ;
   private boolean n9992HreAcSer ;
   private boolean n9993HreAcDsc ;
   private boolean n9994HreAcCol ;
   private boolean n9995HreAcNumC ;
   private IDataStoreProvider pr_default ;
   private String[] P03WS2_A396EmprCod ;
   private String[] P03WS2_A9808HreRacab ;
   private boolean[] P03WS2_n9808HreRacab ;
   private int[] P03WS2_A4492HreBarCod ;
   private byte[] P03WS2_A4493HreBarReo ;
   private String[] P03WS2_A4494HreBarPar ;
   private byte[] P03WS2_A4495HreNumCie ;
   private int[] P03WS3_A6031Ac_Barcod ;
   private byte[] P03WS3_A6032Ac_BarReo ;
   private String[] P03WS3_A6033Ac_BarPar ;
   private java.math.BigDecimal[] P03WS3_A6035Ac_Kilos ;
   private boolean[] P03WS3_n6035Ac_Kilos ;
   private java.math.BigDecimal[] P03WS3_A6034Ac_Metros ;
   private boolean[] P03WS3_n6034Ac_Metros ;
   private short[] P03WS3_A6036Ac_Pzs ;
   private boolean[] P03WS3_n6036Ac_Pzs ;
   private String[] P03WS3_A396EmprCod ;
   private byte[] P03WS3_A132BarCodReo ;
   private String[] P03WS3_A130BarCodPar ;
   private int[] P03WS3_A129BarCod ;
}

final  class aphisrag__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03WS2", "SELECT EmprCod, HreRacab, HreBarCod, HreBarReo, HreBarPar, HreNumCie FROM TXPHISREH WHERE EmprCod = '001' ORDER BY EmprCod, HreRacab ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03WS3", "SELECT Ac_Barcod, Ac_BarReo, Ac_BarPar, Ac_Kilos, Ac_Metros, Ac_Pzs, EmprCod, BarCodReo, BarCodPar, BarCod FROM TXPHDRACA WHERE EmprCod = '001' and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03WS4", "INSERT INTO TXPHISHRA(EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAcCod, HreAcReo, HreAcPar, HreAcKgm, HreAcMtr, HreAcPie, HreAcCli, HreAcSer, HreAcDsc, HreAcCol, HreAcNumC) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISHRA")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 3);
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               ((String[]) buf[11])[0] = rslt.getString(9, 1);
               ((int[]) buf[12])[0] = rslt.getInt(10);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[13]).intValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(12, ((Number) parms[15]).intValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[17], 16);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[19], 26);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[21], 13);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(16, ((Number) parms[23]).intValue());
               }
               return;
      }
   }

}

