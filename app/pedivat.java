package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pedivat extends GXProcedure
{
   public pedivat( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pedivat.class ), "" );
   }

   public pedivat( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            String[] aP1 ,
                            String[] aP2 )
   {
      pedivat.this.aP3 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        short[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             short[] aP3 )
   {
      pedivat.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pedivat.this.A457FasCod = aP1[0];
      this.aP1 = aP1;
      pedivat.this.A9832MaqCodF = aP2[0];
      this.aP2 = aP2;
      pedivat.this.AV43Num_r = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV43Num_r = (short)(0) ;
      /* Optimized group. */
      /* Using cursor P00992 */
      pr_default.execute(0, new Object[] {A396EmprCod, A457FasCod, A9832MaqCodF});
      cV43Num_r = P00992_AV43Num_r[0] ;
      pr_default.close(0);
      AV43Num_r = (short)(AV43Num_r+cV43Num_r*1) ;
      /* End optimized group. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pedivat.this.A396EmprCod;
      this.aP1[0] = pedivat.this.A457FasCod;
      this.aP2[0] = pedivat.this.A9832MaqCodF;
      this.aP3[0] = pedivat.this.AV43Num_r;
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
      P00992_AV43Num_r = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedivat__default(),
         new Object[] {
             new Object[] {
            P00992_AV43Num_r
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV43Num_r ;
   private short cV43Num_r ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String A9832MaqCodF ;
   private String scmdbuf ;
   private short[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private short[] P00992_AV43Num_r ;
}

final  class pedivat__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00992", "SELECT COUNT(*) FROM TXPPRFSMQ WHERE EmprCod = ? and FasCod = ? and MaqCodF = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

