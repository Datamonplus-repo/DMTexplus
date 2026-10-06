package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class txpdisfasloadredundancy extends GXProcedure
{
   public txpdisfasloadredundancy( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( txpdisfasloadredundancy.class ), "" );
   }

   public txpdisfasloadredundancy( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Loading redundancy in table TXPDISFAS ...", "") );
      /* Using cursor TXPDISFASL2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A457FasCod = TXPDISFASL2_A457FasCod[0] ;
         A7744FasPreObl = TXPDISFASL2_A7744FasPreObl[0] ;
         n7744FasPreObl = TXPDISFASL2_n7744FasPreObl[0] ;
         A7744FasPreObl = TXPDISFASL2_A7744FasPreObl[0] ;
         n7744FasPreObl = TXPDISFASL2_n7744FasPreObl[0] ;
         A368DisFasLin = TXPDISFASL2_A368DisFasLin[0] ;
         A758ProCod = TXPDISFASL2_A758ProCod[0] ;
         A361DisCod = TXPDISFASL2_A361DisCod[0] ;
         A396EmprCod = TXPDISFASL2_A396EmprCod[0] ;
         O7744FasPreObl = A7744FasPreObl ;
         n7744FasPreObl = false ;
         A7744FasPreObl = TXPDISFASL2_A7744FasPreObl[0] ;
         n7744FasPreObl = TXPDISFASL2_n7744FasPreObl[0] ;
         O7744FasPreObl = A7744FasPreObl ;
         n7744FasPreObl = false ;
         A7744FasPreObl = O7744FasPreObl ;
         n7744FasPreObl = false ;
         O7744FasPreObl = A7744FasPreObl ;
         n7744FasPreObl = false ;
         /* Using cursor TXPDISFASL3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n7744FasPreObl), Byte.valueOf(A7744FasPreObl), A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( "" );
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "txpdisfasloadredundancy");
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
      TXPDISFASL2_A457FasCod = new String[] {""} ;
      TXPDISFASL2_A7744FasPreObl = new byte[1] ;
      TXPDISFASL2_n7744FasPreObl = new boolean[] {false} ;
      TXPDISFASL2_A368DisFasLin = new short[1] ;
      TXPDISFASL2_A758ProCod = new String[] {""} ;
      TXPDISFASL2_A361DisCod = new int[1] ;
      TXPDISFASL2_A396EmprCod = new String[] {""} ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      A396EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.txpdisfasloadredundancy__default(),
         new Object[] {
             new Object[] {
            TXPDISFASL2_A457FasCod, TXPDISFASL2_A7744FasPreObl, TXPDISFASL2_n7744FasPreObl, TXPDISFASL2_A7744FasPreObl, TXPDISFASL2_n7744FasPreObl, TXPDISFASL2_A368DisFasLin, TXPDISFASL2_A758ProCod, TXPDISFASL2_A361DisCod, TXPDISFASL2_A396EmprCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A7744FasPreObl ;
   private byte O7744FasPreObl ;
   private short A368DisFasLin ;
   private short Gx_err ;
   private int A361DisCod ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String A396EmprCod ;
   private boolean n7744FasPreObl ;
   private IDataStoreProvider pr_default ;
   private String[] TXPDISFASL2_A457FasCod ;
   private byte[] TXPDISFASL2_A7744FasPreObl ;
   private boolean[] TXPDISFASL2_n7744FasPreObl ;
   private short[] TXPDISFASL2_A368DisFasLin ;
   private String[] TXPDISFASL2_A758ProCod ;
   private int[] TXPDISFASL2_A361DisCod ;
   private String[] TXPDISFASL2_A396EmprCod ;
}

final  class txpdisfasloadredundancy__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("TXPDISFASL2", "SELECT T1.FasCod, T1.FasPreObl, T2.FasPreObl, T1.DisFasLin, T1.ProCod, T1.DisCod, T1.EmprCod FROM (TXPDISFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) ORDER BY T1.EmprCod, T1.DisCod, T1.ProCod, T1.DisFasLin  FOR UPDATE OF T1.FasPreObl NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("TXPDISFASL3", "UPDATE TXPDISFAS SET FasPreObl=?  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISFAS")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((String[]) buf[6])[0] = rslt.getString(5, 8);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 3);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 8);
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

