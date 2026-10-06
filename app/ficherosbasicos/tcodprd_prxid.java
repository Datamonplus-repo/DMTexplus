package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tcodprd_prxid extends GXProcedure
{
   public tcodprd_prxid( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tcodprd_prxid.class ), "" );
   }

   public tcodprd_prxid( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 )
   {
      tcodprd_prxid.this.aP1 = new short[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String aP0 ,
                        short[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             short[] aP1 )
   {
      tcodprd_prxid.this.AV8EmprCod = aP0;
      tcodprd_prxid.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P0A0P3 */
      pr_default.execute(0, new Object[] {AV8EmprCod});
      if ( (pr_default.getStatus(0) != 101) )
      {
         A40000GXC1 = P0A0P3_A40000GXC1[0] ;
         n40000GXC1 = P0A0P3_n40000GXC1[0] ;
      }
      else
      {
         A40000GXC1 = (short)(0) ;
         n40000GXC1 = false ;
      }
      pr_default.close(0);
      AV10Rps_Cod = (short)(A40000GXC1+1) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = tcodprd_prxid.this.AV10Rps_Cod;
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
      P0A0P3_A40000GXC1 = new short[1] ;
      P0A0P3_n40000GXC1 = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tcodprd_prxid__default(),
         new Object[] {
             new Object[] {
            P0A0P3_A40000GXC1, P0A0P3_n40000GXC1
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10Rps_Cod ;
   private short A40000GXC1 ;
   private short Gx_err ;
   private String AV8EmprCod ;
   private String scmdbuf ;
   private boolean n40000GXC1 ;
   private short[] aP1 ;
   private IDataStoreProvider pr_default ;
   private short[] P0A0P3_A40000GXC1 ;
   private boolean[] P0A0P3_n40000GXC1 ;
}

final  class tcodprd_prxid__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A0P3", "SELECT COALESCE( T1.GXC1, 0) AS GXC1 FROM (SELECT MAX(Rps_Cod) AS GXC1 FROM TXPCODRPS WHERE EmprCod = ? ) T1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               return;
      }
   }

}

