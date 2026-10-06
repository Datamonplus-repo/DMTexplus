package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusmac extends GXProcedure
{
   public pbusmac( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusmac.class ), "" );
   }

   public pbusmac( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String aP0 ,
                          int aP1 )
   {
      pbusmac.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int[] aP2 )
   {
      pbusmac.this.A396EmprCod = aP0;
      pbusmac.this.A1202MacDisCod = aP1;
      pbusmac.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00QF2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A1202MacDisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1199MacCod = P00QF2_A1199MacCod[0] ;
         A1201MacLin = P00QF2_A1201MacLin[0] ;
         AV8MacCod = A1199MacCod ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = pbusmac.this.AV8MacCod;
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
      P00QF2_A396EmprCod = new String[] {""} ;
      P00QF2_A1202MacDisCod = new int[1] ;
      P00QF2_A1199MacCod = new int[1] ;
      P00QF2_A1201MacLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusmac__default(),
         new Object[] {
             new Object[] {
            P00QF2_A396EmprCod, P00QF2_A1202MacDisCod, P00QF2_A1199MacCod, P00QF2_A1201MacLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A1201MacLin ;
   private short Gx_err ;
   private int A1202MacDisCod ;
   private int AV8MacCod ;
   private int A1199MacCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P00QF2_A396EmprCod ;
   private int[] P00QF2_A1202MacDisCod ;
   private int[] P00QF2_A1199MacCod ;
   private short[] P00QF2_A1201MacLin ;
}

final  class pbusmac__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00QF2", "SELECT EmprCod, MacDisCod, MacCod, MacLin FROM TXPLMACRO WHERE EmprCod = ? and MacDisCod = ? ORDER BY EmprCod, MacDisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               return;
      }
   }

}

