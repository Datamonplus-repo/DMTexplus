package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusmat extends GXProcedure
{
   public pbusmat( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusmat.class ), "" );
   }

   public pbusmat( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           short[] aP1 )
   {
      pbusmat.this.aP2 = new byte[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        byte[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             byte[] aP2 )
   {
      pbusmat.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbusmat.this.A626MatCod = aP1[0];
      this.aP1 = aP1;
      pbusmat.this.AV15Flag = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P000V2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A626MatCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         AV15Flag = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbusmat.this.A396EmprCod;
      this.aP1[0] = pbusmat.this.A626MatCod;
      this.aP2[0] = pbusmat.this.AV15Flag;
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
      P000V2_A396EmprCod = new String[] {""} ;
      P000V2_A626MatCod = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusmat__default(),
         new Object[] {
             new Object[] {
            P000V2_A396EmprCod, P000V2_A626MatCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15Flag ;
   private short A626MatCod ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private byte[] aP2 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P000V2_A396EmprCod ;
   private short[] P000V2_A626MatCod ;
}

final  class pbusmat__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000V2", "SELECT EmprCod, MatCod FROM TXPMATICE WHERE EmprCod = ? and MatCod = ? ORDER BY EmprCod, MatCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

