package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnewagr extends GXProcedure
{
   public pnewagr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnewagr.class ), "" );
   }

   public pnewagr( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 ,
                            short[] aP4 ,
                            int[] aP5 ,
                            byte[] aP6 ,
                            String[] aP7 )
   {
      pnewagr.this.aP8 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        int[] aP5 ,
                        byte[] aP6 ,
                        String[] aP7 ,
                        short[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             int[] aP5 ,
                             byte[] aP6 ,
                             String[] aP7 ,
                             short[] aP8 )
   {
      pnewagr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnewagr.this.AV8BarCodMin = aP1[0];
      this.aP1 = aP1;
      pnewagr.this.AV9BarReoMin = aP2[0];
      this.aP2 = aP2;
      pnewagr.this.AV10BarParMin = aP3[0];
      this.aP3 = aP3;
      pnewagr.this.AV11BarOrdLM = aP4[0];
      this.aP4 = aP4;
      pnewagr.this.AV12BarCodAgr = aP5[0];
      this.aP5 = aP5;
      pnewagr.this.AV13BarReoAgr = aP6[0];
      this.aP6 = aP6;
      pnewagr.this.AV14BarParAgr = aP7[0];
      this.aP7 = aP7;
      pnewagr.this.AV15BarOrdLAgr = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /*
         INSERT RECORD ON TABLE TXPMINAGR

      */
      A6551PlaHdrMin = GXutil.str( AV8BarCodMin, 8, 0) + GXutil.str( AV9BarReoMin, 1, 0) + AV10BarParMin ;
      A6552PlaFasMin = AV11BarOrdLM ;
      A6553PlaHdrAgr = GXutil.str( AV12BarCodAgr, 8, 0) + GXutil.str( AV13BarReoAgr, 1, 0) + AV14BarParAgr ;
      A6554PlaFasAgr = AV15BarOrdLAgr ;
      /* Using cursor P02J32 */
      pr_default.execute(0, new Object[] {A396EmprCod, A6551PlaHdrMin, Short.valueOf(A6552PlaFasMin), A6553PlaHdrAgr, Short.valueOf(A6554PlaFasAgr)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMINAGR");
      if ( (pr_default.getStatus(0) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnewagr.this.A396EmprCod;
      this.aP1[0] = pnewagr.this.AV8BarCodMin;
      this.aP2[0] = pnewagr.this.AV9BarReoMin;
      this.aP3[0] = pnewagr.this.AV10BarParMin;
      this.aP4[0] = pnewagr.this.AV11BarOrdLM;
      this.aP5[0] = pnewagr.this.AV12BarCodAgr;
      this.aP6[0] = pnewagr.this.AV13BarReoAgr;
      this.aP7[0] = pnewagr.this.AV14BarParAgr;
      this.aP8[0] = pnewagr.this.AV15BarOrdLAgr;
      Application.commitDataStores(context, remoteHandle, pr_default, "pnewagr");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A6551PlaHdrMin = "" ;
      A6553PlaHdrAgr = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnewagr__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9BarReoMin ;
   private byte AV13BarReoAgr ;
   private short AV11BarOrdLM ;
   private short AV15BarOrdLAgr ;
   private short A6552PlaFasMin ;
   private short A6554PlaFasAgr ;
   private short Gx_err ;
   private int AV8BarCodMin ;
   private int AV12BarCodAgr ;
   private int GX_INS941 ;
   private String A396EmprCod ;
   private String AV10BarParMin ;
   private String AV14BarParAgr ;
   private String A6551PlaHdrMin ;
   private String A6553PlaHdrAgr ;
   private String Gx_emsg ;
   private short[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private int[] aP5 ;
   private byte[] aP6 ;
   private String[] aP7 ;
   private IDataStoreProvider pr_default ;
}

final  class pnewagr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P02J32", "INSERT INTO TXPMINAGR(EmprCod, PlaHdrMin, PlaFasMin, PlaHdrAgr, PlaFasAgr) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMINAGR")
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 10);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

