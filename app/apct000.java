package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apct000 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apct000 pgm = new apct000 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apct000( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apct000.class ), "" );
   }

   public apct000( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Procesando......", "") );
      /* Using cursor P03JG2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P03JG2_A719PrdNum[0] ;
         A396EmprCod = P03JG2_A396EmprCod[0] ;
         A724PrdPreAct = P03JG2_A724PrdPreAct[0] ;
         AV8PrdNum = A719PrdNum ;
         AV9Prdpreact = A724PrdPreAct ;
         if ( AV9Prdpreact.doubleValue() > 0 )
         {
            /* Execute user subroutine: 'CCSSTKS' */
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
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Fin proceso...", ""));
      cleanup();
   }

   public void S111( )
   {
      /* 'CCSSTKS' Routine */
      returnInSub = false ;
      /* Using cursor P03JG3 */
      pr_default.execute(1, new Object[] {AV8PrdNum});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A719PrdNum = P03JG3_A719PrdNum[0] ;
         A396EmprCod = P03JG3_A396EmprCod[0] ;
         A3345TipMovCc = P03JG3_A3345TipMovCc[0] ;
         A3349CCStkPre = P03JG3_A3349CCStkPre[0] ;
         A3342CCStkLin = P03JG3_A3342CCStkLin[0] ;
         if ( ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SR", "")) == 0 ) || ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SC", "")) == 0 ) || ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SM", "")) == 0 ) )
         {
            A3349CCStkPre = AV9Prdpreact ;
         }
         /* Using cursor P03JG4 */
         pr_default.execute(2, new Object[] {A3349CCStkPre, A396EmprCod, A719PrdNum, Long.valueOf(A3342CCStkLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSTKS");
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pct000.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apct000");
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
      P03JG2_A719PrdNum = new String[] {""} ;
      P03JG2_A396EmprCod = new String[] {""} ;
      P03JG2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      AV8PrdNum = "" ;
      AV9Prdpreact = DecimalUtil.ZERO ;
      P03JG3_A719PrdNum = new String[] {""} ;
      P03JG3_A396EmprCod = new String[] {""} ;
      P03JG3_A3345TipMovCc = new String[] {""} ;
      P03JG3_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03JG3_A3342CCStkLin = new long[1] ;
      A3345TipMovCc = "" ;
      A3349CCStkPre = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apct000__default(),
         new Object[] {
             new Object[] {
            P03JG2_A719PrdNum, P03JG2_A396EmprCod, P03JG2_A724PrdPreAct
            }
            , new Object[] {
            P03JG3_A719PrdNum, P03JG3_A396EmprCod, P03JG3_A3345TipMovCc, P03JG3_A3349CCStkPre, P03JG3_A3342CCStkLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long A3342CCStkLin ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal AV9Prdpreact ;
   private java.math.BigDecimal A3349CCStkPre ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private String AV8PrdNum ;
   private String A3345TipMovCc ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private String[] P03JG2_A719PrdNum ;
   private String[] P03JG2_A396EmprCod ;
   private java.math.BigDecimal[] P03JG2_A724PrdPreAct ;
   private String[] P03JG3_A719PrdNum ;
   private String[] P03JG3_A396EmprCod ;
   private String[] P03JG3_A3345TipMovCc ;
   private java.math.BigDecimal[] P03JG3_A3349CCStkPre ;
   private long[] P03JG3_A3342CCStkLin ;
}

final  class apct000__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03JG2", "SELECT PrdNum, EmprCod, PrdPreAct FROM TXPPRODUC WHERE (EmprCod = '001' and PrdNum >= '100000') AND (PrdNum <= '999999') ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03JG3", "SELECT PrdNum, EmprCod, TipMovCc, CCStkPre, CCStkLin FROM TXPCCSTKS WHERE EmprCod = '001' and PrdNum = ? ORDER BY EmprCod, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03JG4", "UPDATE TXPCCSTKS SET CCStkPre=?  WHERE EmprCod = ? AND PrdNum = ? AND CCStkLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCSTKS")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((long[]) buf[4])[0] = rslt.getLong(5);
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
               stmt.setString(1, (String)parms[0], 6);
               return;
            case 2 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
      }
   }

}

