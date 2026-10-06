package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class txpcprdesloadredundancy extends GXProcedure
{
   public txpcprdesloadredundancy( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( txpcprdesloadredundancy.class ), "" );
   }

   public txpcprdesloadredundancy( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Loading redundancy in table TXPCPRDES ...", "") );
      /* Using cursor TXPCPRDESL2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A681PrdAny = TXPCPRDESL2_A681PrdAny[0] ;
         A719PrdNum = TXPCPRDESL2_A719PrdNum[0] ;
         A396EmprCod = TXPCPRDESL2_A396EmprCod[0] ;
         A676PrdAcuConA = TXPCPRDESL2_A676PrdAcuConA[0] ;
         O676PrdAcuConA = A676PrdAcuConA ;
         O676PrdAcuConA = A676PrdAcuConA ;
         A676PrdAcuConA = DecimalUtil.doubleToDec(0) ;
         /* Using cursor TXPCPRDESL3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A744PrdUniConM = TXPCPRDESL3_A744PrdUniConM[0] ;
            A720PrdNumMes = TXPCPRDESL3_A720PrdNumMes[0] ;
            A676PrdAcuConA = O676PrdAcuConA.add(A744PrdUniConM) ;
            O676PrdAcuConA = A676PrdAcuConA ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Using cursor TXPCPRDESL4 */
         pr_default.execute(2, new Object[] {A676PrdAcuConA, A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPRDES");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( "" );
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "txpcprdesloadredundancy");
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
      TXPCPRDESL2_A681PrdAny = new short[1] ;
      TXPCPRDESL2_A719PrdNum = new String[] {""} ;
      TXPCPRDESL2_A396EmprCod = new String[] {""} ;
      TXPCPRDESL2_A676PrdAcuConA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      A676PrdAcuConA = DecimalUtil.ZERO ;
      O676PrdAcuConA = DecimalUtil.ZERO ;
      TXPCPRDESL3_A396EmprCod = new String[] {""} ;
      TXPCPRDESL3_A719PrdNum = new String[] {""} ;
      TXPCPRDESL3_A681PrdAny = new short[1] ;
      TXPCPRDESL3_A744PrdUniConM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      TXPCPRDESL3_A720PrdNumMes = new byte[1] ;
      A744PrdUniConM = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.txpcprdesloadredundancy__default(),
         new Object[] {
             new Object[] {
            TXPCPRDESL2_A681PrdAny, TXPCPRDESL2_A719PrdNum, TXPCPRDESL2_A396EmprCod, TXPCPRDESL2_A676PrdAcuConA
            }
            , new Object[] {
            TXPCPRDESL3_A396EmprCod, TXPCPRDESL3_A719PrdNum, TXPCPRDESL3_A681PrdAny, TXPCPRDESL3_A744PrdUniConM, TXPCPRDESL3_A720PrdNumMes
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A720PrdNumMes ;
   private short A681PrdAny ;
   private short Gx_err ;
   private java.math.BigDecimal A676PrdAcuConA ;
   private java.math.BigDecimal O676PrdAcuConA ;
   private java.math.BigDecimal A744PrdUniConM ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private IDataStoreProvider pr_default ;
   private short[] TXPCPRDESL2_A681PrdAny ;
   private String[] TXPCPRDESL2_A719PrdNum ;
   private String[] TXPCPRDESL2_A396EmprCod ;
   private java.math.BigDecimal[] TXPCPRDESL2_A676PrdAcuConA ;
   private String[] TXPCPRDESL3_A396EmprCod ;
   private String[] TXPCPRDESL3_A719PrdNum ;
   private short[] TXPCPRDESL3_A681PrdAny ;
   private java.math.BigDecimal[] TXPCPRDESL3_A744PrdUniConM ;
   private byte[] TXPCPRDESL3_A720PrdNumMes ;
}

final  class txpcprdesloadredundancy__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("TXPCPRDESL2", "SELECT PrdAny, PrdNum, EmprCod, PrdAcuConA FROM TXPCPRDES ORDER BY EmprCod, PrdNum, PrdAny  FOR UPDATE OF PrdAcuConA NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("TXPCPRDESL3", "SELECT EmprCod, PrdNum, PrdAny, PrdUniConM, PrdNumMes FROM TXPLPRDES WHERE EmprCod = ? and PrdNum = ? and PrdAny = ? ORDER BY EmprCod, PrdNum, PrdAny ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("TXPCPRDESL4", "UPDATE TXPCPRDES SET PrdAcuConA=?  WHERE EmprCod = ? AND PrdNum = ? AND PrdAny = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPRDES")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
      }
   }

}

