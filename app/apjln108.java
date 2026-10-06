package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apjln108 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apjln108 pgm = new apjln108 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apjln108( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apjln108.class ), "" );
   }

   public apjln108( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Actualizando ENTALM......REC...", "") );
      /* Using cursor P02R32 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11Albaran = P02R32_A11Albaran[0] ;
         A724PrdPreAct = P02R32_A724PrdPreAct[0] ;
         A417EntPre = P02R32_A417EntPre[0] ;
         A597LinEnt = P02R32_A597LinEnt[0] ;
         A719PrdNum = P02R32_A719PrdNum[0] ;
         A396EmprCod = P02R32_A396EmprCod[0] ;
         A724PrdPreAct = P02R32_A724PrdPreAct[0] ;
         if ( GXutil.like( A11Albaran , GXutil.padr( httpContext.getMessage( "%REC%", "") , 254 , "%"),  ' ' ) )
         {
            A417EntPre = A724PrdPreAct ;
            /* Using cursor P02R33 */
            pr_default.execute(1, new Object[] {A417EntPre, A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENTALM");
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "Fin,Actualizando ENTALM......REC...", "") );
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pjln108.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apjln108");
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
      P02R32_A11Albaran = new String[] {""} ;
      P02R32_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02R32_A417EntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02R32_A597LinEnt = new short[1] ;
      P02R32_A719PrdNum = new String[] {""} ;
      P02R32_A396EmprCod = new String[] {""} ;
      A11Albaran = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A417EntPre = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apjln108__default(),
         new Object[] {
             new Object[] {
            P02R32_A11Albaran, P02R32_A724PrdPreAct, P02R32_A417EntPre, P02R32_A597LinEnt, P02R32_A719PrdNum, P02R32_A396EmprCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A597LinEnt ;
   private short Gx_err ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A417EntPre ;
   private String scmdbuf ;
   private String A11Albaran ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private IDataStoreProvider pr_default ;
   private String[] P02R32_A11Albaran ;
   private java.math.BigDecimal[] P02R32_A724PrdPreAct ;
   private java.math.BigDecimal[] P02R32_A417EntPre ;
   private short[] P02R32_A597LinEnt ;
   private String[] P02R32_A719PrdNum ;
   private String[] P02R32_A396EmprCod ;
}

final  class apjln108__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02R32", "SELECT T1.Albaran, T2.PrdPreAct, T1.EntPre, T1.LinEnt, T1.PrdNum, T1.EmprCod FROM (TXPENTALM T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) ORDER BY T1.EmprCod, T1.PrdNum, T1.LinEnt ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02R33", "UPDATE TXPENTALM SET EntPre=?  WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENTALM")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
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
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
      }
   }

}

