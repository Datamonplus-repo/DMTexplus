package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppshdr extends GXProcedure
{
   public ppshdr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppshdr.class ), "" );
   }

   public ppshdr( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 ,
                                           String[] aP4 ,
                                           java.math.BigDecimal[] aP5 )
   {
      ppshdr.this.aP6 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 )
   {
      ppshdr.this.AV11emprcod = aP0[0];
      this.aP0 = aP0;
      ppshdr.this.AV12Barcod = aP1[0];
      this.aP1 = aP1;
      ppshdr.this.AV13Barcodreo = aP2[0];
      this.aP2 = aP2;
      ppshdr.this.AV14Barcodpar = aP3[0];
      this.aP3 = aP3;
      ppshdr.this.AV9BarAgrEst = aP4[0];
      this.aP4 = aP4;
      ppshdr.this.AV10BarKgm = aP5[0];
      this.aP5 = aP5;
      ppshdr.this.AV8Rectotkgm = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Rectotkgm = AV10BarKgm ;
      if ( GXutil.strcmp(AV9BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
      {
         /* Using cursor P09F32 */
         pr_default.execute(0, new Object[] {AV11emprcod, Integer.valueOf(AV12Barcod), Byte.valueOf(AV13Barcodreo), AV14Barcodpar});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A130BarCodPar = P09F32_A130BarCodPar[0] ;
            A132BarCodReo = P09F32_A132BarCodReo[0] ;
            A129BarCod = P09F32_A129BarCod[0] ;
            A396EmprCod = P09F32_A396EmprCod[0] ;
            A119BarAgrCod = P09F32_A119BarAgrCod[0] ;
            A124BarAgrReo = P09F32_A124BarAgrReo[0] ;
            A122BarAgrPar = P09F32_A122BarAgrPar[0] ;
            GXv_char1[0] = A396EmprCod ;
            GXv_int2[0] = A119BarAgrCod ;
            GXv_int3[0] = A124BarAgrReo ;
            GXv_char4[0] = A122BarAgrPar ;
            GXv_decimal5[0] = AV15BarPiekgl ;
            new app.ppsagr(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_decimal5) ;
            ppshdr.this.A396EmprCod = GXv_char1[0] ;
            ppshdr.this.A119BarAgrCod = GXv_int2[0] ;
            ppshdr.this.A124BarAgrReo = GXv_int3[0] ;
            ppshdr.this.A122BarAgrPar = GXv_char4[0] ;
            ppshdr.this.AV15BarPiekgl = GXv_decimal5[0] ;
            AV8Rectotkgm = AV8Rectotkgm.add(AV15BarPiekgl) ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppshdr.this.AV11emprcod;
      this.aP1[0] = ppshdr.this.AV12Barcod;
      this.aP2[0] = ppshdr.this.AV13Barcodreo;
      this.aP3[0] = ppshdr.this.AV14Barcodpar;
      this.aP4[0] = ppshdr.this.AV9BarAgrEst;
      this.aP5[0] = ppshdr.this.AV10BarKgm;
      this.aP6[0] = ppshdr.this.AV8Rectotkgm;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P09F32_A130BarCodPar = new String[] {""} ;
      P09F32_A132BarCodReo = new byte[1] ;
      P09F32_A129BarCod = new int[1] ;
      P09F32_A396EmprCod = new String[] {""} ;
      P09F32_A119BarAgrCod = new int[1] ;
      P09F32_A124BarAgrReo = new byte[1] ;
      P09F32_A122BarAgrPar = new String[] {""} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A122BarAgrPar = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      AV15BarPiekgl = DecimalUtil.ZERO ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppshdr__default(),
         new Object[] {
             new Object[] {
            P09F32_A130BarCodPar, P09F32_A132BarCodReo, P09F32_A129BarCod, P09F32_A396EmprCod, P09F32_A119BarAgrCod, P09F32_A124BarAgrReo, P09F32_A122BarAgrPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13Barcodreo ;
   private byte A132BarCodReo ;
   private byte A124BarAgrReo ;
   private byte GXv_int3[] ;
   private short Gx_err ;
   private int AV12Barcod ;
   private int A129BarCod ;
   private int A119BarAgrCod ;
   private int GXv_int2[] ;
   private java.math.BigDecimal AV10BarKgm ;
   private java.math.BigDecimal AV8Rectotkgm ;
   private java.math.BigDecimal AV15BarPiekgl ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private String AV11emprcod ;
   private String AV14Barcodpar ;
   private String AV9BarAgrEst ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A122BarAgrPar ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private java.math.BigDecimal[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P09F32_A130BarCodPar ;
   private byte[] P09F32_A132BarCodReo ;
   private int[] P09F32_A129BarCod ;
   private String[] P09F32_A396EmprCod ;
   private int[] P09F32_A119BarAgrCod ;
   private byte[] P09F32_A124BarAgrReo ;
   private String[] P09F32_A122BarAgrPar ;
}

final  class ppshdr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09F32", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
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
      }
   }

}

