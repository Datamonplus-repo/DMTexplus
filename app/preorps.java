package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class preorps extends GXProcedure
{
   public preorps( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( preorps.class ), "" );
   }

   public preorps( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 )
   {
      preorps.this.aP4 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 )
   {
      preorps.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      preorps.this.A539HisBarCod = aP1[0];
      this.aP1 = aP1;
      preorps.this.A545HisCodReo = aP2[0];
      this.aP2 = aP2;
      preorps.this.A544HisCodPar = aP3[0];
      this.aP3 = aP3;
      preorps.this.AV8Rps_cod = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      n7000Rps_Cod = false ;
      /* Optimized UPDATE. */
      /* Using cursor P02PX2 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n7000Rps_Cod), Short.valueOf(AV8Rps_cod), A396EmprCod, Integer.valueOf(A539HisBarCod), Byte.valueOf(A545HisCodReo), A544HisCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREO");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = preorps.this.A396EmprCod;
      this.aP1[0] = preorps.this.A539HisBarCod;
      this.aP2[0] = preorps.this.A545HisCodReo;
      this.aP3[0] = preorps.this.A544HisCodPar;
      this.aP4[0] = preorps.this.AV8Rps_cod;
      Application.commitDataStores(context, remoteHandle, pr_default, "preorps");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.preorps__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A545HisCodReo ;
   private short AV8Rps_cod ;
   private short A7000Rps_Cod ;
   private short Gx_err ;
   private int A539HisBarCod ;
   private String A396EmprCod ;
   private String A544HisCodPar ;
   private boolean n7000Rps_Cod ;
   private short[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
}

final  class preorps__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P02PX2", "UPDATE TXPHISREO SET Rps_Cod=?  WHERE EmprCod = ? and HisBarCod = ? and HisCodReo = ? and HisCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISREO")
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               return;
      }
   }

}

