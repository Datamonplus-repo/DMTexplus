package app.trabajosexternos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class trabajoexterno_fases_n_pc extends GXProcedure
{
   public trabajoexterno_fases_n_pc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trabajoexterno_fases_n_pc.class ), "" );
   }

   public trabajoexterno_fases_n_pc( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 )
   {
      trabajoexterno_fases_n_pc.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             String[] aP4 )
   {
      trabajoexterno_fases_n_pc.this.AV11Emprcod = aP0;
      trabajoexterno_fases_n_pc.this.AV8Barcod = aP1;
      trabajoexterno_fases_n_pc.this.AV10Barcodreo = aP2;
      trabajoexterno_fases_n_pc.this.AV9Barcodpar = aP3;
      trabajoexterno_fases_n_pc.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = (byte)(AV14moda21) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV11Emprcod, httpContext.getMessage( "MODA21", ""), GXv_int2) ;
      trabajoexterno_fases_n_pc.this.GXt_int1 = GXv_int2[0] ;
      AV14moda21 = GXt_int1 ;
      AV12TrabajoExterno_Fases_n_SDT.clear();
      /* Using cursor P0AG32 */
      pr_default.execute(0, new Object[] {AV11Emprcod, Integer.valueOf(AV8Barcod), Byte.valueOf(AV10Barcodreo), AV9Barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A153BarFasEst = P0AG32_A153BarFasEst[0] ;
         A130BarCodPar = P0AG32_A130BarCodPar[0] ;
         A132BarCodReo = P0AG32_A132BarCodReo[0] ;
         A129BarCod = P0AG32_A129BarCod[0] ;
         A396EmprCod = P0AG32_A396EmprCod[0] ;
         A252CliCod = P0AG32_A252CliCod[0] ;
         n252CliCod = P0AG32_n252CliCod[0] ;
         A457FasCod = P0AG32_A457FasCod[0] ;
         A460FasDsc = P0AG32_A460FasDsc[0] ;
         A194BarOrdLin = P0AG32_A194BarOrdLin[0] ;
         A758ProCod = P0AG32_A758ProCod[0] ;
         A252CliCod = P0AG32_A252CliCod[0] ;
         n252CliCod = P0AG32_n252CliCod[0] ;
         A460FasDsc = P0AG32_A460FasDsc[0] ;
         AV17clicod = A252CliCod ;
         AV18Fascod = A457FasCod ;
         /* Execute user subroutine: 'PREFAS' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( ( ( AV15Prefas == 1 ) && ( AV14moda21 == 1 ) ) || ( ( AV14moda21 == 0 ) ) )
         {
            AV13TrabajoExterno_Fases_n_SDT_item = (app.trabajosexternos.SdtTrabajoExterno_Fases_n_SDT_Item)new app.trabajosexternos.SdtTrabajoExterno_Fases_n_SDT_Item(remoteHandle, context);
            AV13TrabajoExterno_Fases_n_SDT_item.setgxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Seleccionar( (((AV16HayPrecio==1)&&(AV14moda21==1))||((AV14moda21==0)) ? true : false) );
            AV13TrabajoExterno_Fases_n_SDT_item.setgxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Procod( A758ProCod );
            AV13TrabajoExterno_Fases_n_SDT_item.setgxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Barordlin( A194BarOrdLin );
            AV13TrabajoExterno_Fases_n_SDT_item.setgxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Fascod( A457FasCod );
            AV13TrabajoExterno_Fases_n_SDT_item.setgxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Fasdsc( A460FasDsc );
            AV12TrabajoExterno_Fases_n_SDT.add(AV13TrabajoExterno_Fases_n_SDT_item, 0);
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV19TrabajoExterno_Fases_n_SDT_json = AV12TrabajoExterno_Fases_n_SDT.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'PREFAS' Routine */
      returnInSub = false ;
      AV15Prefas = (short)(0) ;
      AV16HayPrecio = (short)(0) ;
      /* Using cursor P0AG33 */
      pr_default.execute(1, new Object[] {AV11Emprcod, Integer.valueOf(AV17clicod), AV18Fascod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A457FasCod = P0AG33_A457FasCod[0] ;
         A252CliCod = P0AG33_A252CliCod[0] ;
         n252CliCod = P0AG33_n252CliCod[0] ;
         A396EmprCod = P0AG33_A396EmprCod[0] ;
         A467FasPreMtr = P0AG33_A467FasPreMtr[0] ;
         n467FasPreMtr = P0AG33_n467FasPreMtr[0] ;
         A466FasPreKgm = P0AG33_A466FasPreKgm[0] ;
         n466FasPreKgm = P0AG33_n466FasPreKgm[0] ;
         AV15Prefas = (short)(1) ;
         AV16HayPrecio = (short)(((A466FasPreKgm.doubleValue()==0)&&(A467FasPreMtr.doubleValue()==0) ? 0 : 1)) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP4[0] = trabajoexterno_fases_n_pc.this.AV19TrabajoExterno_Fases_n_SDT_json;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV19TrabajoExterno_Fases_n_SDT_json = "" ;
      GXv_int2 = new byte[1] ;
      AV12TrabajoExterno_Fases_n_SDT = new GXBaseCollection<app.trabajosexternos.SdtTrabajoExterno_Fases_n_SDT_Item>(app.trabajosexternos.SdtTrabajoExterno_Fases_n_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P0AG32_A153BarFasEst = new byte[1] ;
      P0AG32_A130BarCodPar = new String[] {""} ;
      P0AG32_A132BarCodReo = new byte[1] ;
      P0AG32_A129BarCod = new int[1] ;
      P0AG32_A396EmprCod = new String[] {""} ;
      P0AG32_A252CliCod = new int[1] ;
      P0AG32_n252CliCod = new boolean[] {false} ;
      P0AG32_A457FasCod = new String[] {""} ;
      P0AG32_A460FasDsc = new String[] {""} ;
      P0AG32_A194BarOrdLin = new short[1] ;
      P0AG32_A758ProCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A758ProCod = "" ;
      AV18Fascod = "" ;
      AV13TrabajoExterno_Fases_n_SDT_item = new app.trabajosexternos.SdtTrabajoExterno_Fases_n_SDT_Item(remoteHandle, context);
      P0AG33_A457FasCod = new String[] {""} ;
      P0AG33_A252CliCod = new int[1] ;
      P0AG33_n252CliCod = new boolean[] {false} ;
      P0AG33_A396EmprCod = new String[] {""} ;
      P0AG33_A467FasPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG33_n467FasPreMtr = new boolean[] {false} ;
      P0AG33_A466FasPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG33_n466FasPreKgm = new boolean[] {false} ;
      A467FasPreMtr = DecimalUtil.ZERO ;
      A466FasPreKgm = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.trabajoexterno_fases_n_pc__default(),
         new Object[] {
             new Object[] {
            P0AG32_A153BarFasEst, P0AG32_A130BarCodPar, P0AG32_A132BarCodReo, P0AG32_A129BarCod, P0AG32_A396EmprCod, P0AG32_A252CliCod, P0AG32_n252CliCod, P0AG32_A457FasCod, P0AG32_A460FasDsc, P0AG32_A194BarOrdLin,
            P0AG32_A758ProCod
            }
            , new Object[] {
            P0AG33_A457FasCod, P0AG33_A252CliCod, P0AG33_A396EmprCod, P0AG33_A467FasPreMtr, P0AG33_n467FasPreMtr, P0AG33_A466FasPreKgm, P0AG33_n466FasPreKgm
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10Barcodreo ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A153BarFasEst ;
   private byte A132BarCodReo ;
   private short AV14moda21 ;
   private short A194BarOrdLin ;
   private short AV15Prefas ;
   private short AV16HayPrecio ;
   private short Gx_err ;
   private int AV8Barcod ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int AV17clicod ;
   private java.math.BigDecimal A467FasPreMtr ;
   private java.math.BigDecimal A466FasPreKgm ;
   private String AV11Emprcod ;
   private String AV9Barcodpar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A758ProCod ;
   private String AV18Fascod ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n467FasPreMtr ;
   private boolean n466FasPreKgm ;
   private String AV19TrabajoExterno_Fases_n_SDT_json ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private byte[] P0AG32_A153BarFasEst ;
   private String[] P0AG32_A130BarCodPar ;
   private byte[] P0AG32_A132BarCodReo ;
   private int[] P0AG32_A129BarCod ;
   private String[] P0AG32_A396EmprCod ;
   private int[] P0AG32_A252CliCod ;
   private boolean[] P0AG32_n252CliCod ;
   private String[] P0AG32_A457FasCod ;
   private String[] P0AG32_A460FasDsc ;
   private short[] P0AG32_A194BarOrdLin ;
   private String[] P0AG32_A758ProCod ;
   private String[] P0AG33_A457FasCod ;
   private int[] P0AG33_A252CliCod ;
   private boolean[] P0AG33_n252CliCod ;
   private String[] P0AG33_A396EmprCod ;
   private java.math.BigDecimal[] P0AG33_A467FasPreMtr ;
   private boolean[] P0AG33_n467FasPreMtr ;
   private java.math.BigDecimal[] P0AG33_A466FasPreKgm ;
   private boolean[] P0AG33_n466FasPreKgm ;
   private GXBaseCollection<app.trabajosexternos.SdtTrabajoExterno_Fases_n_SDT_Item> AV12TrabajoExterno_Fases_n_SDT ;
   private app.trabajosexternos.SdtTrabajoExterno_Fases_n_SDT_Item AV13TrabajoExterno_Fases_n_SDT_item ;
}

final  class trabajoexterno_fases_n_pc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AG32", "SELECT T1.BarFasEst, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T2.CliCod, T1.FasCod, T3.FasDsc, T1.BarOrdLin, T1.ProCod FROM ((TXPBARFAS T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN TXPFASPRO T3 ON T3.EmprCod = T1.EmprCod AND T3.FasCod = T1.FasCod) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?) AND (T1.BarFasEst = 0) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AG33", "SELECT FasCod, CliCod, EmprCod, FasPreMtr, FasPreKgm FROM TXPPREFAS WHERE EmprCod = ? and CliCod = ? and FasCod = ? ORDER BY EmprCod, CliCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               ((String[]) buf[8])[0] = rslt.getString(8, 28);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
      }
   }

}

