package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdalbprd extends GXProcedure
{
   public pdalbprd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdalbprd.class ), "" );
   }

   public pdalbprd( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            long[] aP1 ,
                            int[] aP2 ,
                            byte[] aP3 ,
                            String[] aP4 )
   {
      pdalbprd.this.aP5 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 )
   {
      pdalbprd.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdalbprd.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pdalbprd.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pdalbprd.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pdalbprd.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      pdalbprd.this.A1468AlbPrdLin = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized DELETE. */
      /* Using cursor P01FV2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1468AlbPrdLin)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBPRD");
      /* End optimized DELETE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdalbprd.this.A396EmprCod;
      this.aP1[0] = pdalbprd.this.A30AlbProCod;
      this.aP2[0] = pdalbprd.this.A129BarCod;
      this.aP3[0] = pdalbprd.this.A132BarCodReo;
      this.aP4[0] = pdalbprd.this.A130BarCodPar;
      this.aP5[0] = pdalbprd.this.A1468AlbPrdLin;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdalbprd");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdalbprd__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A1468AlbPrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private short[] aP5 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
}

final  class pdalbprd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P01FV2", "DELETE FROM TXPALBPRD  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and AlbPrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBPRD")
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

