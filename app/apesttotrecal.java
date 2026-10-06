package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apesttotrecal extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apesttotrecal pgm = new apesttotrecal (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apesttotrecal( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apesttotrecal.class ), "" );
   }

   public apesttotrecal( int remoteHandle ,
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
      /* Optimized group. */
      /* Using cursor P04RE2 */
      pr_default.execute(0);
      cV12TotGen = P04RE2_AV12TotGen[0] ;
      pr_default.close(0);
      AV12TotGen = AV12TotGen.add(cV12TotGen.multiply(DecimalUtil.doubleToDec(1))) ;
      /* End optimized group. */
      AV10Tot = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P04RE3 */
      pr_default.execute(1);
      while ( (pr_default.getStatus(1) != 101) )
      {
         A2124RecMolCod = P04RE3_A2124RecMolCod[0] ;
         A1032FonCod = P04RE3_A1032FonCod[0] ;
         A1056DisComCod = P04RE3_A1056DisComCod[0] ;
         A130BarCodPar = P04RE3_A130BarCodPar[0] ;
         A132BarCodReo = P04RE3_A132BarCodReo[0] ;
         A129BarCod = P04RE3_A129BarCod[0] ;
         A396EmprCod = P04RE3_A396EmprCod[0] ;
         A2524DisComLin = P04RE3_A2524DisComLin[0] ;
         AV13Aux = AV10Tot.divide(AV12TotGen, 18, java.math.RoundingMode.DOWN).multiply(DecimalUtil.doubleToDec(100)) ;
         AV14Aux1 = DecimalUtil.doubleToDec(GXutil.dtdiff( localUtil.ctot( GXutil.time( ), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), localUtil.ctot( Gx_time, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))))) ;
         AV15Auxdt = GXutil.dtadd( localUtil.ctot( "00:00:00", localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), DecimalUtil.decToDouble(AV14Aux1)) ;
         AV17Aux2 = AV14Aux1.multiply(AV12TotGen).divide(AV10Tot, 18, java.math.RoundingMode.DOWN) ;
         AV16AuxDt1 = GXutil.dtadd( localUtil.ctot( "00:00:00", localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), DecimalUtil.decToDouble(AV17Aux2)) ;
         AV11Txt = httpContext.getMessage( "Recalculando : ", "") + GXutil.trim( GXutil.str( A129BarCod, 10, 0)) + GXutil.trim( GXutil.str( A132BarCodReo, 10, 0)) + GXutil.trim( A130BarCodPar) + " " + GXutil.trim( A1056DisComCod) + " " + GXutil.trim( A1032FonCod) + " " + GXutil.trim( GXutil.str( A2124RecMolCod, 10, 0)) + ".  " + GXutil.trim( GXutil.str( AV13Aux, 10, 2)) + httpContext.getMessage( "% Realizado.", "") + localUtil.ttoc( AV15Auxdt, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " de Proceso, restan ", "") + localUtil.ttoc( AV16AuxDt1, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + "." ;
         System.out.println( AV11Txt );
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A129BarCod ;
         GXv_int3[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_int5[0] = A2524DisComLin ;
         GXv_char6[0] = A1056DisComCod ;
         GXv_char7[0] = A1032FonCod ;
         GXv_int8[0] = A2124RecMolCod ;
         new app.pestrec3(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_int5, GXv_char6, GXv_char7, GXv_int8) ;
         apesttotrecal.this.A396EmprCod = GXv_char1[0] ;
         apesttotrecal.this.A129BarCod = GXv_int2[0] ;
         apesttotrecal.this.A132BarCodReo = GXv_int3[0] ;
         apesttotrecal.this.A130BarCodPar = GXv_char4[0] ;
         apesttotrecal.this.A2524DisComLin = GXv_int5[0] ;
         apesttotrecal.this.A1056DisComCod = GXv_char6[0] ;
         apesttotrecal.this.A1032FonCod = GXv_char7[0] ;
         apesttotrecal.this.A2124RecMolCod = GXv_int8[0] ;
         AV10Tot = AV10Tot.add(DecimalUtil.doubleToDec(1)) ;
         Application.commitDataStores(context, remoteHandle, pr_default, "apesttotrecal");
         pr_default.readNext(1);
      }
      pr_default.close(1);
      new app.pactrestot(remoteHandle, context).execute( ) ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pesttotrecal.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
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
      P04RE2_AV12TotGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      cV12TotGen = DecimalUtil.ZERO ;
      AV12TotGen = DecimalUtil.ZERO ;
      AV10Tot = DecimalUtil.ZERO ;
      P04RE3_A2124RecMolCod = new byte[1] ;
      P04RE3_A1032FonCod = new String[] {""} ;
      P04RE3_A1056DisComCod = new String[] {""} ;
      P04RE3_A130BarCodPar = new String[] {""} ;
      P04RE3_A132BarCodReo = new byte[1] ;
      P04RE3_A129BarCod = new int[1] ;
      P04RE3_A396EmprCod = new String[] {""} ;
      P04RE3_A2524DisComLin = new byte[1] ;
      A1032FonCod = "" ;
      A1056DisComCod = "" ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      AV13Aux = DecimalUtil.ZERO ;
      AV14Aux1 = DecimalUtil.ZERO ;
      Gx_time = "" ;
      AV15Auxdt = GXutil.resetTime( GXutil.nullDate() );
      AV17Aux2 = DecimalUtil.ZERO ;
      AV16AuxDt1 = GXutil.resetTime( GXutil.nullDate() );
      AV11Txt = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char6 = new String[1] ;
      GXv_char7 = new String[1] ;
      GXv_int8 = new byte[1] ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.apesttotrecal__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.apesttotrecal__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.apesttotrecal__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apesttotrecal__default(),
         new Object[] {
             new Object[] {
            P04RE2_AV12TotGen
            }
            , new Object[] {
            P04RE3_A2124RecMolCod, P04RE3_A1032FonCod, P04RE3_A1056DisComCod, P04RE3_A130BarCodPar, P04RE3_A132BarCodReo, P04RE3_A129BarCod, P04RE3_A396EmprCod, P04RE3_A2524DisComLin
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      /* GeneXus formulas. */
      Gx_time = GXutil.time( ) ;
      Gx_err = (short)(0) ;
   }

   private byte A2124RecMolCod ;
   private byte A132BarCodReo ;
   private byte A2524DisComLin ;
   private byte GXv_int3[] ;
   private byte GXv_int5[] ;
   private byte GXv_int8[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private int GXv_int2[] ;
   private java.math.BigDecimal cV12TotGen ;
   private java.math.BigDecimal AV12TotGen ;
   private java.math.BigDecimal AV10Tot ;
   private java.math.BigDecimal AV13Aux ;
   private java.math.BigDecimal AV14Aux1 ;
   private java.math.BigDecimal AV17Aux2 ;
   private String scmdbuf ;
   private String A1032FonCod ;
   private String A1056DisComCod ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String Gx_time ;
   private String AV11Txt ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private String GXv_char6[] ;
   private String GXv_char7[] ;
   private java.util.Date AV15Auxdt ;
   private java.util.Date AV16AuxDt1 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P04RE2_AV12TotGen ;
   private byte[] P04RE3_A2124RecMolCod ;
   private String[] P04RE3_A1032FonCod ;
   private String[] P04RE3_A1056DisComCod ;
   private String[] P04RE3_A130BarCodPar ;
   private byte[] P04RE3_A132BarCodReo ;
   private int[] P04RE3_A129BarCod ;
   private String[] P04RE3_A396EmprCod ;
   private byte[] P04RE3_A2524DisComLin ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class apesttotrecal__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class apesttotrecal__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class apesttotrecal__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class apesttotrecal__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04RE2", "SELECT COUNT(*) FROM TXPRECMOL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04RE3", "SELECT RecMolCod, FonCod, DisComCod, BarCodPar, BarCodReo, BarCod, EmprCod, DisComLin FROM TXPRECMOL ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

