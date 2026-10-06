package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfasespreviascoleccion extends GXProcedure
{
   public pfasespreviascoleccion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfasespreviascoleccion.class ), "" );
   }

   public pfasespreviascoleccion( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             String aP4 ,
                             short aP5 )
   {
      pfasespreviascoleccion.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        String aP4 ,
                        short aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             String aP4 ,
                             short aP5 ,
                             String[] aP6 )
   {
      pfasespreviascoleccion.this.A396EmprCod = aP0;
      pfasespreviascoleccion.this.A129BarCod = aP1;
      pfasespreviascoleccion.this.A132BarCodReo = aP2;
      pfasespreviascoleccion.this.A130BarCodPar = aP3;
      pfasespreviascoleccion.this.A758ProCod = aP4;
      pfasespreviascoleccion.this.AV8Barordlin = aP5;
      pfasespreviascoleccion.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9fases_json = "" ;
      AV11Pfasespreviascoleccion_SDT.clear();
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV13TabFases[GX_I-1] = " " ;
         GX_I = (int)(GX_I+1) ;
      }
      AV10i = (byte)(1) ;
      /* Using cursor P0ANW2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(AV8Barordlin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A194BarOrdLin = P0ANW2_A194BarOrdLin[0] ;
         A460FasDsc = P0ANW2_A460FasDsc[0] ;
         A457FasCod = P0ANW2_A457FasCod[0] ;
         A460FasDsc = P0ANW2_A460FasDsc[0] ;
         if ( AV10i > 10 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         AV12Pfasespreviascoleccion_SDTItem = (app.controlcalidadhtd.SdtPfasespreviascoleccion_SDT_Item)new app.controlcalidadhtd.SdtPfasespreviascoleccion_SDT_Item(remoteHandle, context);
         AV12Pfasespreviascoleccion_SDTItem.setgxTv_SdtPfasespreviascoleccion_SDT_Item_Fasedescripcion( GXutil.trim( A457FasCod)+" "+GXutil.trim( A460FasDsc) );
         AV11Pfasespreviascoleccion_SDT.add(AV12Pfasespreviascoleccion_SDTItem, 0);
         AV10i = (byte)(AV10i+1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV9fases_json = AV11Pfasespreviascoleccion_SDT.toJSonString(false) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP6[0] = pfasespreviascoleccion.this.AV9fases_json;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9fases_json = "" ;
      AV11Pfasespreviascoleccion_SDT = new GXBaseCollection<app.controlcalidadhtd.SdtPfasespreviascoleccion_SDT_Item>(app.controlcalidadhtd.SdtPfasespreviascoleccion_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV13TabFases = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV13TabFases[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      scmdbuf = "" ;
      P0ANW2_A396EmprCod = new String[] {""} ;
      P0ANW2_A129BarCod = new int[1] ;
      P0ANW2_A132BarCodReo = new byte[1] ;
      P0ANW2_A130BarCodPar = new String[] {""} ;
      P0ANW2_A758ProCod = new String[] {""} ;
      P0ANW2_A194BarOrdLin = new short[1] ;
      P0ANW2_A460FasDsc = new String[] {""} ;
      P0ANW2_A457FasCod = new String[] {""} ;
      A460FasDsc = "" ;
      A457FasCod = "" ;
      AV12Pfasespreviascoleccion_SDTItem = new app.controlcalidadhtd.SdtPfasespreviascoleccion_SDT_Item(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.pfasespreviascoleccion__default(),
         new Object[] {
             new Object[] {
            P0ANW2_A396EmprCod, P0ANW2_A129BarCod, P0ANW2_A132BarCodReo, P0ANW2_A130BarCodPar, P0ANW2_A758ProCod, P0ANW2_A194BarOrdLin, P0ANW2_A460FasDsc, P0ANW2_A457FasCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV10i ;
   private short AV8Barordlin ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int GX_I ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String AV13TabFases[] ;
   private String scmdbuf ;
   private String A460FasDsc ;
   private String A457FasCod ;
   private String AV9fases_json ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ANW2_A396EmprCod ;
   private int[] P0ANW2_A129BarCod ;
   private byte[] P0ANW2_A132BarCodReo ;
   private String[] P0ANW2_A130BarCodPar ;
   private String[] P0ANW2_A758ProCod ;
   private short[] P0ANW2_A194BarOrdLin ;
   private String[] P0ANW2_A460FasDsc ;
   private String[] P0ANW2_A457FasCod ;
   private GXBaseCollection<app.controlcalidadhtd.SdtPfasespreviascoleccion_SDT_Item> AV11Pfasespreviascoleccion_SDT ;
   private app.controlcalidadhtd.SdtPfasespreviascoleccion_SDT_Item AV12Pfasespreviascoleccion_SDTItem ;
}

final  class pfasespreviascoleccion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ANW2", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T2.FasDsc, T1.FasCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ?) AND (T1.BarOrdLin < ?) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 28);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

