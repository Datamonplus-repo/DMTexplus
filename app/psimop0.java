package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psimop0 extends GXProcedure
{
   public psimop0( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psimop0.class ), "" );
   }

   public psimop0( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     int[] aP1 ,
                                     byte[] aP2 ,
                                     String[] aP3 ,
                                     String[] aP4 ,
                                     short[] aP5 )
   {
      psimop0.this.aP6 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        java.util.Date[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             java.util.Date[] aP6 )
   {
      psimop0.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      psimop0.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      psimop0.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      psimop0.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      psimop0.this.A758ProCod = aP4[0];
      this.aP4 = aP4;
      psimop0.this.A194BarOrdLin = aP5[0];
      this.aP5 = aP5;
      psimop0.this.AV8BarFecTeo = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized UPDATE. */
      /* Using cursor P02R62 */
      pr_default.execute(0, new Object[] {AV8BarFecTeo, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = psimop0.this.A396EmprCod;
      this.aP1[0] = psimop0.this.A129BarCod;
      this.aP2[0] = psimop0.this.A132BarCodReo;
      this.aP3[0] = psimop0.this.A130BarCodPar;
      this.aP4[0] = psimop0.this.A758ProCod;
      this.aP5[0] = psimop0.this.A194BarOrdLin;
      this.aP6[0] = psimop0.this.AV8BarFecTeo;
      Application.commitDataStores(context, remoteHandle, pr_default, "psimop0");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A162BarFecTeo = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.psimop0__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private java.util.Date AV8BarFecTeo ;
   private java.util.Date A162BarFecTeo ;
   private java.util.Date[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private IDataStoreProvider pr_default ;
}

final  class psimop0__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P02R62", "UPDATE TXPBARFAS SET BarFecTeo=?  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 8);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
      }
   }

}

