package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc388 extends GXProcedure
{
   public pprc388( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc388.class ), "" );
   }

   public pprc388( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 )
   {
      pprc388.this.aP4 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 )
   {
      pprc388.this.AV8emprcod = aP0[0];
      this.aP0 = aP0;
      pprc388.this.AV9barcod = aP1[0];
      this.aP1 = aP1;
      pprc388.this.AV10barcodreo = aP2[0];
      this.aP2 = aP2;
      pprc388.this.AV11barcodpar = aP3[0];
      this.aP3 = aP3;
      pprc388.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15coste_tf = DecimalUtil.ZERO ;
      AV12barcodreo2 = (byte)(AV10barcodreo-1) ;
      while ( AV12barcodreo2 >= 0 )
      {
         /* Using cursor P09R43 */
         pr_default.execute(0, new Object[] {AV8emprcod, Integer.valueOf(AV9barcod), Byte.valueOf(AV12barcodreo2), AV11barcodpar});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A130BarCodPar = P09R43_A130BarCodPar[0] ;
            A132BarCodReo = P09R43_A132BarCodReo[0] ;
            A129BarCod = P09R43_A129BarCod[0] ;
            A396EmprCod = P09R43_A396EmprCod[0] ;
            A184BarMtr = P09R43_A184BarMtr[0] ;
            A166BarKgm = P09R43_A166BarKgm[0] ;
            A184BarMtr = P09R43_A184BarMtr[0] ;
            A166BarKgm = P09R43_A166BarKgm[0] ;
            if ( ( A166BarKgm.doubleValue() == 0 ) && ( A184BarMtr.doubleValue() == 0 ) )
            {
               GXv_char1[0] = AV8emprcod ;
               GXv_int2[0] = AV9barcod ;
               GXv_int3[0] = AV12barcodreo2 ;
               GXv_char4[0] = AV11barcodpar ;
               GXv_decimal5[0] = AV13coste_f ;
               new app.pprc387(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_decimal5) ;
               pprc388.this.AV8emprcod = GXv_char1[0] ;
               pprc388.this.AV9barcod = GXv_int2[0] ;
               pprc388.this.AV12barcodreo2 = GXv_int3[0] ;
               pprc388.this.AV11barcodpar = GXv_char4[0] ;
               pprc388.this.AV13coste_f = GXv_decimal5[0] ;
               AV15coste_tf = AV15coste_tf.add(AV13coste_f) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV12barcodreo2 = (byte)(AV12barcodreo2-1) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc388.this.AV8emprcod;
      this.aP1[0] = pprc388.this.AV9barcod;
      this.aP2[0] = pprc388.this.AV10barcodreo;
      this.aP3[0] = pprc388.this.AV11barcodpar;
      this.aP4[0] = pprc388.this.AV15coste_tf;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15coste_tf = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P09R43_A130BarCodPar = new String[] {""} ;
      P09R43_A132BarCodReo = new byte[1] ;
      P09R43_A129BarCod = new int[1] ;
      P09R43_A396EmprCod = new String[] {""} ;
      P09R43_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R43_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A184BarMtr = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      AV13coste_f = DecimalUtil.ZERO ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc388__default(),
         new Object[] {
             new Object[] {
            P09R43_A130BarCodPar, P09R43_A132BarCodReo, P09R43_A129BarCod, P09R43_A396EmprCod, P09R43_A184BarMtr, P09R43_A166BarKgm
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10barcodreo ;
   private byte AV12barcodreo2 ;
   private byte A132BarCodReo ;
   private byte GXv_int3[] ;
   private short Gx_err ;
   private int AV9barcod ;
   private int A129BarCod ;
   private int GXv_int2[] ;
   private java.math.BigDecimal AV15coste_tf ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV13coste_f ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private String AV8emprcod ;
   private String AV11barcodpar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private java.math.BigDecimal[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P09R43_A130BarCodPar ;
   private byte[] P09R43_A132BarCodReo ;
   private int[] P09R43_A129BarCod ;
   private String[] P09R43_A396EmprCod ;
   private java.math.BigDecimal[] P09R43_A184BarMtr ;
   private java.math.BigDecimal[] P09R43_A166BarKgm ;
}

final  class pprc388__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09R43", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarKgm, 0) AS BarKgm FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
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

