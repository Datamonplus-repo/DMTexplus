package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aputtex1 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aputtex1 pgm = new aputtex1 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aputtex1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aputtex1.class ), "" );
   }

   public aputtex1( int remoteHandle ,
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
      /* Using cursor P02WD2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A720PrdNumMes = P02WD2_A720PrdNumMes[0] ;
         A681PrdAny = P02WD2_A681PrdAny[0] ;
         A396EmprCod = P02WD2_A396EmprCod[0] ;
         A745PrdUniCprM = P02WD2_A745PrdUniCprM[0] ;
         A744PrdUniConM = P02WD2_A744PrdUniConM[0] ;
         A749PrdValCprM = P02WD2_A749PrdValCprM[0] ;
         A747PrdValConM = P02WD2_A747PrdValConM[0] ;
         A3659PrdKilTin = P02WD2_A3659PrdKilTin[0] ;
         A719PrdNum = P02WD2_A719PrdNum[0] ;
         AV21Mes = (byte)(1) ;
         AV22Any = (short)(2008) ;
         GXv_char1[0] = A396EmprCod ;
         GXv_char2[0] = A719PrdNum ;
         GXv_int3[0] = AV21Mes ;
         GXv_int4[0] = AV22Any ;
         GXv_decimal5[0] = A745PrdUniCprM ;
         GXv_decimal6[0] = A744PrdUniConM ;
         GXv_decimal7[0] = A749PrdValCprM ;
         GXv_decimal8[0] = A747PrdValConM ;
         GXv_decimal9[0] = A3659PrdKilTin ;
         new app.puttex2(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3, GXv_int4, GXv_decimal5, GXv_decimal6, GXv_decimal7, GXv_decimal8, GXv_decimal9) ;
         aputtex1.this.A396EmprCod = GXv_char1[0] ;
         aputtex1.this.A719PrdNum = GXv_char2[0] ;
         aputtex1.this.AV21Mes = GXv_int3[0] ;
         aputtex1.this.AV22Any = GXv_int4[0] ;
         aputtex1.this.A745PrdUniCprM = GXv_decimal5[0] ;
         aputtex1.this.A744PrdUniConM = GXv_decimal6[0] ;
         aputtex1.this.A749PrdValCprM = GXv_decimal7[0] ;
         aputtex1.this.A747PrdValConM = GXv_decimal8[0] ;
         aputtex1.this.A3659PrdKilTin = GXv_decimal9[0] ;
         AV20Texto = httpContext.getMessage( "Actualizado Producto : ", "") + A719PrdNum ;
         System.out.println( AV20Texto );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "PROCESO REALIZADO", ""));
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(puttex1.class);
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
      P02WD2_A720PrdNumMes = new byte[1] ;
      P02WD2_A681PrdAny = new short[1] ;
      P02WD2_A396EmprCod = new String[] {""} ;
      P02WD2_A745PrdUniCprM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02WD2_A744PrdUniConM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02WD2_A749PrdValCprM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02WD2_A747PrdValConM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02WD2_A3659PrdKilTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02WD2_A719PrdNum = new String[] {""} ;
      A396EmprCod = "" ;
      A745PrdUniCprM = DecimalUtil.ZERO ;
      A744PrdUniConM = DecimalUtil.ZERO ;
      A749PrdValCprM = DecimalUtil.ZERO ;
      A747PrdValConM = DecimalUtil.ZERO ;
      A3659PrdKilTin = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      GXv_char1 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new byte[1] ;
      GXv_int4 = new short[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      AV20Texto = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aputtex1__default(),
         new Object[] {
             new Object[] {
            P02WD2_A720PrdNumMes, P02WD2_A681PrdAny, P02WD2_A396EmprCod, P02WD2_A745PrdUniCprM, P02WD2_A744PrdUniConM, P02WD2_A749PrdValCprM, P02WD2_A747PrdValConM, P02WD2_A3659PrdKilTin, P02WD2_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A720PrdNumMes ;
   private byte AV21Mes ;
   private byte GXv_int3[] ;
   private short A681PrdAny ;
   private short AV22Any ;
   private short GXv_int4[] ;
   private short Gx_err ;
   private java.math.BigDecimal A745PrdUniCprM ;
   private java.math.BigDecimal A744PrdUniConM ;
   private java.math.BigDecimal A749PrdValCprM ;
   private java.math.BigDecimal A747PrdValConM ;
   private java.math.BigDecimal A3659PrdKilTin ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String AV20Texto ;
   private IDataStoreProvider pr_default ;
   private byte[] P02WD2_A720PrdNumMes ;
   private short[] P02WD2_A681PrdAny ;
   private String[] P02WD2_A396EmprCod ;
   private java.math.BigDecimal[] P02WD2_A745PrdUniCprM ;
   private java.math.BigDecimal[] P02WD2_A744PrdUniConM ;
   private java.math.BigDecimal[] P02WD2_A749PrdValCprM ;
   private java.math.BigDecimal[] P02WD2_A747PrdValConM ;
   private java.math.BigDecimal[] P02WD2_A3659PrdKilTin ;
   private String[] P02WD2_A719PrdNum ;
}

final  class aputtex1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02WD2", "SELECT PrdNumMes, PrdAny, EmprCod, PrdUniCprM, PrdUniConM, PrdValCprM, PrdValConM, PrdKilTin, PrdNum FROM TXPLPRDES WHERE (EmprCod = '001') AND (PrdAny = 2008) AND (PrdNumMes = 2) ORDER BY EmprCod, PrdNum, PrdAny, PrdNumMes ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
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

