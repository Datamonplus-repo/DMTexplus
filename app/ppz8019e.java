package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppz8019e extends GXProcedure
{
   public ppz8019e( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppz8019e.class ), "" );
   }

   public ppz8019e( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      ppz8019e.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      ppz8019e.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppz8019e.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      ppz8019e.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      ppz8019e.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      ppz8019e.this.A200BarPieCod = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized DELETE. */
      /* Using cursor P03SG2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
      /* End optimized DELETE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppz8019e.this.A396EmprCod;
      this.aP1[0] = ppz8019e.this.A129BarCod;
      this.aP2[0] = ppz8019e.this.A132BarCodReo;
      this.aP3[0] = ppz8019e.this.A130BarCodPar;
      this.aP4[0] = ppz8019e.this.A200BarPieCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "ppz8019e");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppz8019e__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A200BarPieCod ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
}

final  class ppz8019e__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P03SG2", "DELETE FROM TXPBARPIE  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
      }
   }

}

