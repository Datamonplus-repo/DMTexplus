package app.pedidosclientesindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controltablalmacro extends GXProcedure
{
   public controltablalmacro( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controltablalmacro.class ), "" );
   }

   public controltablalmacro( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        String aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 )
   {
      controltablalmacro.this.A396EmprCod = aP0;
      controltablalmacro.this.A1199MacCod = aP1;
      controltablalmacro.this.AV11Usurcod = aP2;
      controltablalmacro.this.AV12station = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9TablaHdrs_SDT.clear();
      /* Using cursor P0AJN2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A1199MacCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1203MacBarCod = P0AJN2_A1203MacBarCod[0] ;
         A1204MacBarReo = P0AJN2_A1204MacBarReo[0] ;
         A1205MacBarPar = P0AJN2_A1205MacBarPar[0] ;
         A1201MacLin = P0AJN2_A1201MacLin[0] ;
         AV8TabladeHdrs_SDTItem = (app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem)new app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem(remoteHandle, context);
         AV8TabladeHdrs_SDTItem.setgxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcod( A1203MacBarCod );
         AV8TabladeHdrs_SDTItem.setgxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcodreo( A1204MacBarReo );
         AV8TabladeHdrs_SDTItem.setgxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcodpar( A1205MacBarPar );
         AV9TablaHdrs_SDT.add(AV8TabladeHdrs_SDTItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV9TablaHdrs_SDT.size() > 0 )
      {
         AV10TablaHdrs_SDTJson = AV9TablaHdrs_SDT.toJSonString(false) ;
         GXv_char1[0] = A396EmprCod ;
         GXv_char2[0] = AV10TablaHdrs_SDTJson ;
         GXv_char3[0] = AV11Usurcod ;
         GXv_char4[0] = AV12station ;
         GXv_char5[0] = AV16Pgmname ;
         new app.lecturadehdrs(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_char3, GXv_char4, GXv_char5) ;
         controltablalmacro.this.A396EmprCod = GXv_char1[0] ;
         controltablalmacro.this.AV10TablaHdrs_SDTJson = GXv_char2[0] ;
         controltablalmacro.this.AV11Usurcod = GXv_char3[0] ;
         controltablalmacro.this.AV12station = GXv_char4[0] ;
         controltablalmacro.this.AV16Pgmname = GXv_char5[0] ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9TablaHdrs_SDT = new GXBaseCollection<app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem>(app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem.class, "TabladeHdrs_SDTItem", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P0AJN2_A396EmprCod = new String[] {""} ;
      P0AJN2_A1199MacCod = new int[1] ;
      P0AJN2_A1203MacBarCod = new int[1] ;
      P0AJN2_A1204MacBarReo = new byte[1] ;
      P0AJN2_A1205MacBarPar = new String[] {""} ;
      P0AJN2_A1201MacLin = new short[1] ;
      A1205MacBarPar = "" ;
      AV8TabladeHdrs_SDTItem = new app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem(remoteHandle, context);
      AV10TablaHdrs_SDTJson = "" ;
      GXv_char1 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      AV16Pgmname = "" ;
      GXv_char5 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.controltablalmacro__default(),
         new Object[] {
             new Object[] {
            P0AJN2_A396EmprCod, P0AJN2_A1199MacCod, P0AJN2_A1203MacBarCod, P0AJN2_A1204MacBarReo, P0AJN2_A1205MacBarPar, P0AJN2_A1201MacLin
            }
         }
      );
      AV16Pgmname = "PedidosClienteSinDetalle.ControlTablaLMACRO" ;
      /* GeneXus formulas. */
      AV16Pgmname = "PedidosClienteSinDetalle.ControlTablaLMACRO" ;
      Gx_err = (short)(0) ;
   }

   private byte A1204MacBarReo ;
   private short A1201MacLin ;
   private short Gx_err ;
   private int A1199MacCod ;
   private int A1203MacBarCod ;
   private String A396EmprCod ;
   private String AV11Usurcod ;
   private String AV12station ;
   private String scmdbuf ;
   private String A1205MacBarPar ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String AV16Pgmname ;
   private String GXv_char5[] ;
   private String AV10TablaHdrs_SDTJson ;
   private IDataStoreProvider pr_default ;
   private String[] P0AJN2_A396EmprCod ;
   private int[] P0AJN2_A1199MacCod ;
   private int[] P0AJN2_A1203MacBarCod ;
   private byte[] P0AJN2_A1204MacBarReo ;
   private String[] P0AJN2_A1205MacBarPar ;
   private short[] P0AJN2_A1201MacLin ;
   private GXBaseCollection<app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem> AV9TablaHdrs_SDT ;
   private app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem AV8TabladeHdrs_SDTItem ;
}

final  class controltablalmacro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AJN2", "SELECT EmprCod, MacCod, MacBarCod, MacBarReo, MacBarPar, MacLin FROM TXPLMACRO WHERE EmprCod = ? and MacCod = ? ORDER BY EmprCod, MacCod, MacLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
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

