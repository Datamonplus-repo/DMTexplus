package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmodest extends GXProcedure
{
   public pmodest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmodest.class ), "" );
   }

   public pmodest( int remoteHandle ,
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
      pmodest.this.aP4 = new String[] {""};
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
      pmodest.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pmodest.this.AV16BarCod = aP1[0];
      this.aP1 = aP1;
      pmodest.this.AV17BarCodReo = aP2[0];
      this.aP2 = aP2;
      pmodest.this.AV18BarCodPar = aP3[0];
      this.aP3 = aP3;
      pmodest.this.AV19BarPieCod = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized UPDATE. */
      /* Using cursor P00662 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar, AV19BarPieCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
      /* End optimized UPDATE. */
      GXv_char1[0] = AV15EmprCod ;
      GXv_int2[0] = AV16BarCod ;
      GXv_int3[0] = AV17BarCodReo ;
      GXv_char4[0] = AV18BarCodPar ;
      GXv_char5[0] = httpContext.getMessage( "P", "") ;
      new app.pciebar(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_char5) ;
      pmodest.this.AV15EmprCod = GXv_char1[0] ;
      pmodest.this.AV16BarCod = GXv_int2[0] ;
      pmodest.this.AV17BarCodReo = GXv_int3[0] ;
      pmodest.this.AV18BarCodPar = GXv_char4[0] ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmodest.this.AV15EmprCod;
      this.aP1[0] = pmodest.this.AV16BarCod;
      this.aP2[0] = pmodest.this.AV17BarCodReo;
      this.aP3[0] = pmodest.this.AV18BarCodPar;
      this.aP4[0] = pmodest.this.AV19BarPieCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmodest");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmodest__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17BarCodReo ;
   private byte GXv_int3[] ;
   private short Gx_err ;
   private int AV16BarCod ;
   private int GXv_int2[] ;
   private String AV15EmprCod ;
   private String AV18BarCodPar ;
   private String AV19BarPieCod ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
}

final  class pmodest__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P00662", "UPDATE TXPBARPIE SET BarPieEst=1  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
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

