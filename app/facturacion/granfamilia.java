package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class granfamilia extends GXProcedure
{
   public granfamilia( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( granfamilia.class ), "" );
   }

   public granfamilia( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            short aP1 )
   {
      granfamilia.this.aP2 = new short[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        short aP1 ,
                        short[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             short aP1 ,
                             short[] aP2 )
   {
      granfamilia.this.A396EmprCod = aP0;
      granfamilia.this.A829TipArtCod = aP1;
      granfamilia.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9GrdTipArt = (short)(0) ;
      /* Using cursor P0A2I2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A829TipArtCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4364GrdTipArt = P0A2I2_A4364GrdTipArt[0] ;
         AV9GrdTipArt = A4364GrdTipArt ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = granfamilia.this.AV9GrdTipArt;
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
      P0A2I2_A396EmprCod = new String[] {""} ;
      P0A2I2_A829TipArtCod = new short[1] ;
      P0A2I2_A4364GrdTipArt = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.granfamilia__default(),
         new Object[] {
             new Object[] {
            P0A2I2_A396EmprCod, P0A2I2_A829TipArtCod, P0A2I2_A4364GrdTipArt
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A829TipArtCod ;
   private short AV9GrdTipArt ;
   private short A4364GrdTipArt ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private short[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A2I2_A396EmprCod ;
   private short[] P0A2I2_A829TipArtCod ;
   private short[] P0A2I2_A4364GrdTipArt ;
}

final  class granfamilia__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A2I2", "SELECT EmprCod, TipArtCod, GrdTipArt FROM TXPGRDTI1 WHERE EmprCod = ? and TipArtCod = ? ORDER BY EmprCod, TipArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
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

