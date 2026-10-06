package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controlcalidad_cc1_prc extends GXProcedure
{
   public controlcalidad_cc1_prc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidad_cc1_prc.class ), "" );
   }

   public controlcalidad_cc1_prc( int remoteHandle ,
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
                             short aP5 ,
                             int aP6 )
   {
      controlcalidad_cc1_prc.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        String aP4 ,
                        short aP5 ,
                        int aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             String aP4 ,
                             short aP5 ,
                             int aP6 ,
                             String[] aP7 )
   {
      controlcalidad_cc1_prc.this.AV15EmprCod = aP0;
      controlcalidad_cc1_prc.this.AV8Barcod = aP1;
      controlcalidad_cc1_prc.this.AV10Barcodreo = aP2;
      controlcalidad_cc1_prc.this.AV9BarCodPar = aP3;
      controlcalidad_cc1_prc.this.AV16Procod = aP4;
      controlcalidad_cc1_prc.this.AV11Barordlin = aP5;
      controlcalidad_cc1_prc.this.AV12Cctcod = aP6;
      controlcalidad_cc1_prc.this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14ControlCalidad_CC1_SDT_json = "" ;
      AV13ControlCalidad_CC1_SDT.clear();
      /* Using cursor P0APY2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV8Barcod), Byte.valueOf(AV10Barcodreo), AV9BarCodPar, AV16Procod, Short.valueOf(AV11Barordlin), Integer.valueOf(AV12Cctcod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4031CCTCod = P0APY2_A4031CCTCod[0] ;
         A194BarOrdLin = P0APY2_A194BarOrdLin[0] ;
         A758ProCod = P0APY2_A758ProCod[0] ;
         A130BarCodPar = P0APY2_A130BarCodPar[0] ;
         A132BarCodReo = P0APY2_A132BarCodReo[0] ;
         A129BarCod = P0APY2_A129BarCod[0] ;
         A396EmprCod = P0APY2_A396EmprCod[0] ;
         A4043CCTLinDsc = P0APY2_A4043CCTLinDsc[0] ;
         A14344CCTLinDc2 = P0APY2_A14344CCTLinDc2[0] ;
         A14489CCEspecif2 = P0APY2_A14489CCEspecif2[0] ;
         A13251CCMetodo = P0APY2_A13251CCMetodo[0] ;
         A4035CCVal = P0APY2_A4035CCVal[0] ;
         A4048CCTLinTpoI = P0APY2_A4048CCTLinTpoI[0] ;
         A4034CCTLin = P0APY2_A4034CCTLin[0] ;
         A4043CCTLinDsc = P0APY2_A4043CCTLinDsc[0] ;
         A14344CCTLinDc2 = P0APY2_A14344CCTLinDc2[0] ;
         A4048CCTLinTpoI = P0APY2_A4048CCTLinTpoI[0] ;
         AV17ControlCalidad_CC1_SDT_item = (app.controlcalidadhtd.SdtControlCalidad_CC1_SDT_Item)new app.controlcalidadhtd.SdtControlCalidad_CC1_SDT_Item(remoteHandle, context);
         AV20Cctlin = A4034CCTLin ;
         AV17ControlCalidad_CC1_SDT_item.setgxTv_SdtControlCalidad_CC1_SDT_Item_Cctlindsc( A4043CCTLinDsc );
         AV17ControlCalidad_CC1_SDT_item.setgxTv_SdtControlCalidad_CC1_SDT_Item_Cctlindc2( A14344CCTLinDc2 );
         AV17ControlCalidad_CC1_SDT_item.setgxTv_SdtControlCalidad_CC1_SDT_Item_Ccespecif2( A14489CCEspecif2 );
         AV17ControlCalidad_CC1_SDT_item.setgxTv_SdtControlCalidad_CC1_SDT_Item_Ccmetodo( A13251CCMetodo );
         AV17ControlCalidad_CC1_SDT_item.setgxTv_SdtControlCalidad_CC1_SDT_Item_Cctlin( A4034CCTLin );
         AV17ControlCalidad_CC1_SDT_item.setgxTv_SdtControlCalidad_CC1_SDT_Item_Ccval( A4035CCVal );
         AV18CCTValDsc = " " ;
         AV19ccval = A4035CCVal ;
         if ( ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( "L", "")) == 0 ) && ( GXutil.strcmp(AV19ccval, " ") != 0 ) )
         {
            /* Execute user subroutine: 'CCDEF2' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         AV17ControlCalidad_CC1_SDT_item.setgxTv_SdtControlCalidad_CC1_SDT_Item_Cctvaldsc( AV18CCTValDsc );
         AV13ControlCalidad_CC1_SDT.add(AV17ControlCalidad_CC1_SDT_item, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV14ControlCalidad_CC1_SDT_json = AV13ControlCalidad_CC1_SDT.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'CCDEF2' Routine */
      returnInSub = false ;
      AV18CCTValDsc = " " ;
      /* Using cursor P0APY3 */
      pr_default.execute(1, new Object[] {AV15EmprCod, Integer.valueOf(AV12Cctcod), Short.valueOf(AV20Cctlin), AV19ccval});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A4051CCTVal = P0APY3_A4051CCTVal[0] ;
         A4034CCTLin = P0APY3_A4034CCTLin[0] ;
         A4031CCTCod = P0APY3_A4031CCTCod[0] ;
         A396EmprCod = P0APY3_A396EmprCod[0] ;
         A4050CCTValDsc = P0APY3_A4050CCTValDsc[0] ;
         A4049CCTValLin = P0APY3_A4049CCTValLin[0] ;
         AV18CCTValDsc = A4050CCTValDsc ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP7[0] = controlcalidad_cc1_prc.this.AV14ControlCalidad_CC1_SDT_json;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV14ControlCalidad_CC1_SDT_json = "" ;
      AV13ControlCalidad_CC1_SDT = new GXBaseCollection<app.controlcalidadhtd.SdtControlCalidad_CC1_SDT_Item>(app.controlcalidadhtd.SdtControlCalidad_CC1_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P0APY2_A4031CCTCod = new int[1] ;
      P0APY2_A194BarOrdLin = new short[1] ;
      P0APY2_A758ProCod = new String[] {""} ;
      P0APY2_A130BarCodPar = new String[] {""} ;
      P0APY2_A132BarCodReo = new byte[1] ;
      P0APY2_A129BarCod = new int[1] ;
      P0APY2_A396EmprCod = new String[] {""} ;
      P0APY2_A4043CCTLinDsc = new String[] {""} ;
      P0APY2_A14344CCTLinDc2 = new String[] {""} ;
      P0APY2_A14489CCEspecif2 = new String[] {""} ;
      P0APY2_A13251CCMetodo = new String[] {""} ;
      P0APY2_A4035CCVal = new String[] {""} ;
      P0APY2_A4048CCTLinTpoI = new String[] {""} ;
      P0APY2_A4034CCTLin = new short[1] ;
      A758ProCod = "" ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A4043CCTLinDsc = "" ;
      A14344CCTLinDc2 = "" ;
      A14489CCEspecif2 = "" ;
      A13251CCMetodo = "" ;
      A4035CCVal = "" ;
      A4048CCTLinTpoI = "" ;
      AV17ControlCalidad_CC1_SDT_item = new app.controlcalidadhtd.SdtControlCalidad_CC1_SDT_Item(remoteHandle, context);
      AV18CCTValDsc = "" ;
      AV19ccval = "" ;
      P0APY3_A4051CCTVal = new String[] {""} ;
      P0APY3_A4034CCTLin = new short[1] ;
      P0APY3_A4031CCTCod = new int[1] ;
      P0APY3_A396EmprCod = new String[] {""} ;
      P0APY3_A4050CCTValDsc = new String[] {""} ;
      P0APY3_A4049CCTValLin = new byte[1] ;
      A4051CCTVal = "" ;
      A4050CCTValDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_cc1_prc__default(),
         new Object[] {
             new Object[] {
            P0APY2_A4031CCTCod, P0APY2_A194BarOrdLin, P0APY2_A758ProCod, P0APY2_A130BarCodPar, P0APY2_A132BarCodReo, P0APY2_A129BarCod, P0APY2_A396EmprCod, P0APY2_A4043CCTLinDsc, P0APY2_A14344CCTLinDc2, P0APY2_A14489CCEspecif2,
            P0APY2_A13251CCMetodo, P0APY2_A4035CCVal, P0APY2_A4048CCTLinTpoI, P0APY2_A4034CCTLin
            }
            , new Object[] {
            P0APY3_A4051CCTVal, P0APY3_A4034CCTLin, P0APY3_A4031CCTCod, P0APY3_A396EmprCod, P0APY3_A4050CCTValDsc, P0APY3_A4049CCTValLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10Barcodreo ;
   private byte A132BarCodReo ;
   private byte A4049CCTValLin ;
   private short AV11Barordlin ;
   private short A194BarOrdLin ;
   private short A4034CCTLin ;
   private short AV20Cctlin ;
   private short Gx_err ;
   private int AV8Barcod ;
   private int AV12Cctcod ;
   private int A4031CCTCod ;
   private int A129BarCod ;
   private String AV15EmprCod ;
   private String AV9BarCodPar ;
   private String AV16Procod ;
   private String scmdbuf ;
   private String A758ProCod ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A4043CCTLinDsc ;
   private String A14344CCTLinDc2 ;
   private String A13251CCMetodo ;
   private String A4035CCVal ;
   private String A4048CCTLinTpoI ;
   private String AV18CCTValDsc ;
   private String AV19ccval ;
   private String A4051CCTVal ;
   private String A4050CCTValDsc ;
   private boolean returnInSub ;
   private String AV14ControlCalidad_CC1_SDT_json ;
   private String A14489CCEspecif2 ;
   private String[] aP7 ;
   private IDataStoreProvider pr_default ;
   private int[] P0APY2_A4031CCTCod ;
   private short[] P0APY2_A194BarOrdLin ;
   private String[] P0APY2_A758ProCod ;
   private String[] P0APY2_A130BarCodPar ;
   private byte[] P0APY2_A132BarCodReo ;
   private int[] P0APY2_A129BarCod ;
   private String[] P0APY2_A396EmprCod ;
   private String[] P0APY2_A4043CCTLinDsc ;
   private String[] P0APY2_A14344CCTLinDc2 ;
   private String[] P0APY2_A14489CCEspecif2 ;
   private String[] P0APY2_A13251CCMetodo ;
   private String[] P0APY2_A4035CCVal ;
   private String[] P0APY2_A4048CCTLinTpoI ;
   private short[] P0APY2_A4034CCTLin ;
   private String[] P0APY3_A4051CCTVal ;
   private short[] P0APY3_A4034CCTLin ;
   private int[] P0APY3_A4031CCTCod ;
   private String[] P0APY3_A396EmprCod ;
   private String[] P0APY3_A4050CCTValDsc ;
   private byte[] P0APY3_A4049CCTValLin ;
   private GXBaseCollection<app.controlcalidadhtd.SdtControlCalidad_CC1_SDT_Item> AV13ControlCalidad_CC1_SDT ;
   private app.controlcalidadhtd.SdtControlCalidad_CC1_SDT_Item AV17ControlCalidad_CC1_SDT_item ;
}

final  class controlcalidad_cc1_prc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0APY2", "SELECT T1.CCTCod, T1.BarOrdLin, T1.ProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T2.CCTLinDsc, T2.CCTLinDc2, T1.CCEspecif2, T1.CCMetodo, T1.CCVal, T2.CCTLinTpoI, T1.CCTLin FROM (TXPCC1 T1 INNER JOIN TXPCCDef1 T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod AND T2.CCTLin = T1.CCTLin) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? and T1.BarOrdLin = ? and T1.CCTCod = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.CCTCod, T1.CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0APY3", "SELECT CCTVal, CCTLin, CCTCod, EmprCod, CCTValDsc, CCTValLin FROM TXPCCDef2 WHERE (EmprCod = ? and CCTCod = ? and CCTLin = ?) AND (RTRIM(LTRIM(CCTVal)) = RTRIM(LTRIM(?))) ORDER BY EmprCod, CCTCod, CCTLin, CCTValLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((String[]) buf[8])[0] = rslt.getString(9, 60);
               ((String[]) buf[9])[0] = rslt.getVarchar(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 30);
               ((String[]) buf[11])[0] = rslt.getString(12, 40);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
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
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 40);
               return;
      }
   }

}

