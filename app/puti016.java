package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class puti016 extends GXProcedure
{
   public puti016( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( puti016.class ), "" );
   }

   public puti016( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            int aP1 ,
                            byte aP2 ,
                            String aP3 ,
                            short aP4 )
   {
      puti016.this.aP5 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        short aP4 ,
                        short[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             short aP4 ,
                             short[] aP5 )
   {
      puti016.this.AV14EmprCod = aP0;
      puti016.this.AV15BarCod = aP1;
      puti016.this.AV16BarCodReo = aP2;
      puti016.this.AV17BarCodPar = aP3;
      puti016.this.AV18RecLinMaq = aP4;
      puti016.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV9Consumos ;
      GXv_char2[0] = AV14EmprCod ;
      GXv_char3[0] = "011100" ;
      GXv_int4[0] = GXt_int1 ;
      new app.pbuscou(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_int4) ;
      puti016.this.AV14EmprCod = GXv_char2[0] ;
      puti016.this.GXt_int1 = GXv_int4[0] ;
      AV9Consumos = (byte)(GXt_int1) ;
      AV10Ninci = (short)(0) ;
      /* Using cursor P05212 */
      pr_default.execute(0, new Object[] {AV14EmprCod, Integer.valueOf(AV15BarCod), Byte.valueOf(AV16BarCodReo), AV17BarCodPar, Short.valueOf(AV18RecLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P05212_A719PrdNum[0] ;
         n719PrdNum = P05212_n719PrdNum[0] ;
         A2804RecLinMaq = P05212_A2804RecLinMaq[0] ;
         A130BarCodPar = P05212_A130BarCodPar[0] ;
         A132BarCodReo = P05212_A132BarCodReo[0] ;
         A129BarCod = P05212_A129BarCod[0] ;
         A396EmprCod = P05212_A396EmprCod[0] ;
         A707PrdFacCon = P05212_A707PrdFacCon[0] ;
         A1797PrdCanAny = P05212_A1797PrdCanAny[0] ;
         A686PrdCant = P05212_A686PrdCant[0] ;
         A704PrdExiAlm = P05212_A704PrdExiAlm[0] ;
         A705PrdExiCC = P05212_A705PrdExiCC[0] ;
         A1273RecLinPro = P05212_A1273RecLinPro[0] ;
         A811RecLin = P05212_A811RecLin[0] ;
         A707PrdFacCon = P05212_A707PrdFacCon[0] ;
         A704PrdExiAlm = P05212_A704PrdExiAlm[0] ;
         A705PrdExiCC = P05212_A705PrdExiCC[0] ;
         AV8EXistencias = ((A686PrdCant.add(A1797PrdCanAny)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon) ;
         if ( AV9Consumos == 1 )
         {
            AV11Recmar = (byte)(((DecimalUtil.compareTo(AV8EXistencias, A704PrdExiAlm)>0) ? 1 : 0)) ;
         }
         else
         {
            AV11Recmar = (byte)(((DecimalUtil.compareTo(AV8EXistencias, A705PrdExiCC)>0) ? 1 : 0)) ;
         }
         AV10Ninci = (short)(AV10Ninci+(((AV11Recmar==1) ? 1 : 0))) ;
         AV12BarInci = (byte)(((AV10Ninci>0) ? 9 : 0)) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = puti016.this.AV10Ninci;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      scmdbuf = "" ;
      P05212_A719PrdNum = new String[] {""} ;
      P05212_n719PrdNum = new boolean[] {false} ;
      P05212_A2804RecLinMaq = new short[1] ;
      P05212_A130BarCodPar = new String[] {""} ;
      P05212_A132BarCodReo = new byte[1] ;
      P05212_A129BarCod = new int[1] ;
      P05212_A396EmprCod = new String[] {""} ;
      P05212_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05212_A1797PrdCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05212_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05212_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05212_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05212_A1273RecLinPro = new byte[1] ;
      P05212_A811RecLin = new short[1] ;
      A719PrdNum = "" ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A1797PrdCanAny = DecimalUtil.ZERO ;
      A686PrdCant = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      AV8EXistencias = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.puti016__default(),
         new Object[] {
             new Object[] {
            P05212_A719PrdNum, P05212_n719PrdNum, P05212_A2804RecLinMaq, P05212_A130BarCodPar, P05212_A132BarCodReo, P05212_A129BarCod, P05212_A396EmprCod, P05212_A707PrdFacCon, P05212_A1797PrdCanAny, P05212_A686PrdCant,
            P05212_A704PrdExiAlm, P05212_A705PrdExiCC, P05212_A1273RecLinPro, P05212_A811RecLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16BarCodReo ;
   private byte AV9Consumos ;
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte AV11Recmar ;
   private byte AV12BarInci ;
   private short AV18RecLinMaq ;
   private short AV10Ninci ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short Gx_err ;
   private int AV15BarCod ;
   private int GXt_int1 ;
   private int GXv_int4[] ;
   private int A129BarCod ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A1797PrdCanAny ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal AV8EXistencias ;
   private String AV14EmprCod ;
   private String AV17BarCodPar ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private boolean n719PrdNum ;
   private short[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P05212_A719PrdNum ;
   private boolean[] P05212_n719PrdNum ;
   private short[] P05212_A2804RecLinMaq ;
   private String[] P05212_A130BarCodPar ;
   private byte[] P05212_A132BarCodReo ;
   private int[] P05212_A129BarCod ;
   private String[] P05212_A396EmprCod ;
   private java.math.BigDecimal[] P05212_A707PrdFacCon ;
   private java.math.BigDecimal[] P05212_A1797PrdCanAny ;
   private java.math.BigDecimal[] P05212_A686PrdCant ;
   private java.math.BigDecimal[] P05212_A704PrdExiAlm ;
   private java.math.BigDecimal[] P05212_A705PrdExiCC ;
   private byte[] P05212_A1273RecLinPro ;
   private short[] P05212_A811RecLin ;
}

final  class puti016__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05212", "SELECT T1.PrdNum, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T2.PrdFacCon, T1.PrdCanAny, T1.PrdCant, T2.PrdExiAlm, T2.PrdExiCC, T1.RecLinPro, T1.RecLin FROM (TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,3);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,3);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,4);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,4);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((short[]) buf[13])[0] = rslt.getShort(13);
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

