package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptipcoldsc extends GXProcedure
{
   public ptipcoldsc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptipcoldsc.class ), "" );
   }

   public ptipcoldsc( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             byte aP1 )
   {
      ptipcoldsc.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        byte aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             byte aP1 ,
                             String[] aP2 )
   {
      ptipcoldsc.this.A396EmprCod = aP0;
      ptipcoldsc.this.A831TipColCod = aP1;
      ptipcoldsc.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P08712 */
      pr_default.execute(0, new Object[] {A396EmprCod, Byte.valueOf(A831TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A832TipColDsc = P08712_A832TipColDsc[0] ;
         n832TipColDsc = P08712_n832TipColDsc[0] ;
         AV8TipColDsc = A832TipColDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = ptipcoldsc.this.AV8TipColDsc;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8TipColDsc = "" ;
      scmdbuf = "" ;
      P08712_A396EmprCod = new String[] {""} ;
      P08712_A831TipColCod = new byte[1] ;
      P08712_A832TipColDsc = new String[] {""} ;
      P08712_n832TipColDsc = new boolean[] {false} ;
      A832TipColDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptipcoldsc__default(),
         new Object[] {
             new Object[] {
            P08712_A396EmprCod, P08712_A831TipColCod, P08712_A832TipColDsc, P08712_n832TipColDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV8TipColDsc ;
   private String scmdbuf ;
   private String A832TipColDsc ;
   private boolean n832TipColDsc ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P08712_A396EmprCod ;
   private byte[] P08712_A831TipColCod ;
   private String[] P08712_A832TipColDsc ;
   private boolean[] P08712_n832TipColDsc ;
}

final  class ptipcoldsc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08712", "SELECT EmprCod, TipColCod, TipColDsc FROM TXPTIPCOL WHERE EmprCod = ? and TipColCod = ? ORDER BY EmprCod, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
      }
   }

}

