package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class recetadetinte02_prc extends GXProcedure
{
   public recetadetinte02_prc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetadetinte02_prc.class ), "" );
   }

   public recetadetinte02_prc( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 )
   {
      recetadetinte02_prc.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 )
   {
      recetadetinte02_prc.this.AV12Emprcod = aP0[0];
      this.aP0 = aP0;
      recetadetinte02_prc.this.AV13Barcod = aP1[0];
      this.aP1 = aP1;
      recetadetinte02_prc.this.AV14Barcodreo = aP2[0];
      this.aP2 = aP2;
      recetadetinte02_prc.this.AV15Barcodpar = aP3[0];
      this.aP3 = aP3;
      recetadetinte02_prc.this.AV16RecLinMaq = aP4[0];
      this.aP4 = aP4;
      recetadetinte02_prc.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10RecetasTinteProcesosQuimicos_SDTs.clear();
      /* Using cursor P09AX2 */
      pr_default.execute(0, new Object[] {AV12Emprcod, Integer.valueOf(AV13Barcod), Byte.valueOf(AV14Barcodreo), AV15Barcodpar, Short.valueOf(AV16RecLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2804RecLinMaq = P09AX2_A2804RecLinMaq[0] ;
         A130BarCodPar = P09AX2_A130BarCodPar[0] ;
         A132BarCodReo = P09AX2_A132BarCodReo[0] ;
         A129BarCod = P09AX2_A129BarCod[0] ;
         A396EmprCod = P09AX2_A396EmprCod[0] ;
         A764ProForCod = P09AX2_A764ProForCod[0] ;
         A766ProForDsc = P09AX2_A766ProForDsc[0] ;
         A1273RecLinPro = P09AX2_A1273RecLinPro[0] ;
         A766ProForDsc = P09AX2_A766ProForDsc[0] ;
         AV9RecetasTinteProcesosQuimicos_SDT = (app.SdtRecetasTinteProcesosQuimicos_SDT)new app.SdtRecetasTinteProcesosQuimicos_SDT(remoteHandle, context);
         AV9RecetasTinteProcesosQuimicos_SDT.setgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Proforcod( A764ProForCod );
         AV9RecetasTinteProcesosQuimicos_SDT.setgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Profordsc( A766ProForDsc );
         AV9RecetasTinteProcesosQuimicos_SDT.setgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Numerodelinea( A1273RecLinPro );
         AV10RecetasTinteProcesosQuimicos_SDTs.add(AV9RecetasTinteProcesosQuimicos_SDT, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV11RecetasTinteProcesosQuimicosToJson = AV10RecetasTinteProcesosQuimicos_SDTs.toJSonString(false) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = recetadetinte02_prc.this.AV12Emprcod;
      this.aP1[0] = recetadetinte02_prc.this.AV13Barcod;
      this.aP2[0] = recetadetinte02_prc.this.AV14Barcodreo;
      this.aP3[0] = recetadetinte02_prc.this.AV15Barcodpar;
      this.aP4[0] = recetadetinte02_prc.this.AV16RecLinMaq;
      this.aP5[0] = recetadetinte02_prc.this.AV11RecetasTinteProcesosQuimicosToJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11RecetasTinteProcesosQuimicosToJson = "" ;
      AV10RecetasTinteProcesosQuimicos_SDTs = new GXBaseCollection<app.SdtRecetasTinteProcesosQuimicos_SDT>(app.SdtRecetasTinteProcesosQuimicos_SDT.class, "RecetasTinteProcesosQuimicos_SDT", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P09AX2_A2804RecLinMaq = new short[1] ;
      P09AX2_A130BarCodPar = new String[] {""} ;
      P09AX2_A132BarCodReo = new byte[1] ;
      P09AX2_A129BarCod = new int[1] ;
      P09AX2_A396EmprCod = new String[] {""} ;
      P09AX2_A764ProForCod = new String[] {""} ;
      P09AX2_A766ProForDsc = new String[] {""} ;
      P09AX2_A1273RecLinPro = new byte[1] ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      AV9RecetasTinteProcesosQuimicos_SDT = new app.SdtRecetasTinteProcesosQuimicos_SDT(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recetadetinte02_prc__default(),
         new Object[] {
             new Object[] {
            P09AX2_A2804RecLinMaq, P09AX2_A130BarCodPar, P09AX2_A132BarCodReo, P09AX2_A129BarCod, P09AX2_A396EmprCod, P09AX2_A764ProForCod, P09AX2_A766ProForDsc, P09AX2_A1273RecLinPro
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV14Barcodreo ;
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private short AV16RecLinMaq ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int AV13Barcod ;
   private int A129BarCod ;
   private String AV12Emprcod ;
   private String AV15Barcodpar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A764ProForCod ;
   private String A766ProForDsc ;
   private String AV11RecetasTinteProcesosQuimicosToJson ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private IDataStoreProvider pr_default ;
   private short[] P09AX2_A2804RecLinMaq ;
   private String[] P09AX2_A130BarCodPar ;
   private byte[] P09AX2_A132BarCodReo ;
   private int[] P09AX2_A129BarCod ;
   private String[] P09AX2_A396EmprCod ;
   private String[] P09AX2_A764ProForCod ;
   private String[] P09AX2_A766ProForDsc ;
   private byte[] P09AX2_A1273RecLinPro ;
   private GXBaseCollection<app.SdtRecetasTinteProcesosQuimicos_SDT> AV10RecetasTinteProcesosQuimicos_SDTs ;
   private app.SdtRecetasTinteProcesosQuimicos_SDT AV9RecetasTinteProcesosQuimicos_SDT ;
}

final  class recetadetinte02_prc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09AX2", "SELECT T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.ProForCod, T2.ProForDsc, T1.RecLinPro FROM (TXPCRECET T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

