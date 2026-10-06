package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pminagf extends GXProcedure
{
   public pminagf( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pminagf.class ), "" );
   }

   public pminagf( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      pminagf.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pminagf.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pminagf.this.AV20BarCodP = aP1[0];
      this.aP1 = aP1;
      pminagf.this.AV21BarCodReoP = aP2[0];
      this.aP2 = aP2;
      pminagf.this.AV22BarCodParP = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15BarCod = AV20BarCodP ;
      AV16BarCodReo = AV21BarCodReoP ;
      AV17BarCodPar = AV22BarCodParP ;
      new app.pminagr(remoteHandle, context).execute( A396EmprCod, AV15BarCod, AV16BarCodReo, AV17BarCodPar) ;
      AV18PlaHdrMin = GXutil.str( AV15BarCod, 8, 0) + GXutil.str( AV16BarCodReo, 1, 0) + AV17BarCodPar ;
      /* Optimized DELETE. */
      /* Using cursor P02KL2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV18PlaHdrMin});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMINAGR");
      /* End optimized DELETE. */
      GXv_char1[0] = A396EmprCod ;
      GXv_int2[0] = AV15BarCod ;
      GXv_int3[0] = AV16BarCodReo ;
      GXv_char4[0] = AV17BarCodPar ;
      new app.pcremag(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4) ;
      pminagf.this.A396EmprCod = GXv_char1[0] ;
      pminagf.this.AV15BarCod = GXv_int2[0] ;
      pminagf.this.AV16BarCodReo = GXv_int3[0] ;
      pminagf.this.AV17BarCodPar = GXv_char4[0] ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pminagf.this.A396EmprCod;
      this.aP1[0] = pminagf.this.AV20BarCodP;
      this.aP2[0] = pminagf.this.AV21BarCodReoP;
      this.aP3[0] = pminagf.this.AV22BarCodParP;
      Application.commitDataStores(context, remoteHandle, pr_default, "pminagf");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV17BarCodPar = "" ;
      AV18PlaHdrMin = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pminagf__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV21BarCodReoP ;
   private byte AV16BarCodReo ;
   private byte GXv_int3[] ;
   private short Gx_err ;
   private int AV20BarCodP ;
   private int AV15BarCod ;
   private int GXv_int2[] ;
   private String A396EmprCod ;
   private String AV22BarCodParP ;
   private String AV17BarCodPar ;
   private String AV18PlaHdrMin ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
}

final  class pminagf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P02KL2", "DELETE FROM TXPMINAGR  WHERE EmprCod = ? and PlaHdrMin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMINAGR")
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
               stmt.setString(2, (String)parms[1], 10);
               return;
      }
   }

}

