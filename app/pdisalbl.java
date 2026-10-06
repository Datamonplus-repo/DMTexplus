package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdisalbl extends GXProcedure
{
   public pdisalbl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdisalbl.class ), "" );
   }

   public pdisalbl( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 )
   {
      pdisalbl.this.aP2 = new byte[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      pdisalbl.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdisalbl.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      pdisalbl.this.AV17Disalb = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17Disalb = (byte)(0) ;
      /* Using cursor P023V2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A673Piezas = P023V2_A673Piezas[0] ;
         A44AlbRecCod = P023V2_A44AlbRecCod[0] ;
         AV17Disalb = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdisalbl.this.A396EmprCod;
      this.aP1[0] = pdisalbl.this.A361DisCod;
      this.aP2[0] = pdisalbl.this.AV17Disalb;
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
      P023V2_A396EmprCod = new String[] {""} ;
      P023V2_A361DisCod = new int[1] ;
      P023V2_A673Piezas = new int[1] ;
      P023V2_A44AlbRecCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdisalbl__default(),
         new Object[] {
             new Object[] {
            P023V2_A396EmprCod, P023V2_A361DisCod, P023V2_A673Piezas, P023V2_A44AlbRecCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17Disalb ;
   private short Gx_err ;
   private int A361DisCod ;
   private int A673Piezas ;
   private int A44AlbRecCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private byte[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P023V2_A396EmprCod ;
   private int[] P023V2_A361DisCod ;
   private int[] P023V2_A673Piezas ;
   private int[] P023V2_A44AlbRecCod ;
}

final  class pdisalbl__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P023V2", "SELECT EmprCod, DisCod, Piezas, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[3])[0] = rslt.getInt(4);
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

