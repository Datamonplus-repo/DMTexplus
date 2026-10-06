package app.costesbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc393 extends GXProcedure
{
   public pprc393( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc393.class ), "" );
   }

   public pprc393( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        byte aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             byte aP5 )
   {
      pprc393.this.AV8EmprCod = aP0[0];
      this.aP0 = aP0;
      pprc393.this.AV9BarCod = aP1[0];
      this.aP1 = aP1;
      pprc393.this.AV10BarCodReo = aP2[0];
      this.aP2 = aP2;
      pprc393.this.AV11BarCodPar = aP3[0];
      this.aP3 = aP3;
      pprc393.this.aP4 = aP4;
      pprc393.this.AV19reoperados = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15Costefab = DecimalUtil.ZERO ;
      AV17CostefabHDR = DecimalUtil.ZERO ;
      AV18i = (byte)(AV10BarCodReo-1) ;
      while ( AV18i >= 0 )
      {
         AV16BarCodReoin = AV18i ;
         /* Using cursor P0ATB3 */
         pr_default.execute(0, new Object[] {AV8EmprCod, Integer.valueOf(AV9BarCod), Byte.valueOf(AV16BarCodReoin), AV11BarCodPar});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A130BarCodPar = P0ATB3_A130BarCodPar[0] ;
            A132BarCodReo = P0ATB3_A132BarCodReo[0] ;
            A129BarCod = P0ATB3_A129BarCod[0] ;
            A396EmprCod = P0ATB3_A396EmprCod[0] ;
            A228BarUniMed = P0ATB3_A228BarUniMed[0] ;
            A166BarKgm = P0ATB3_A166BarKgm[0] ;
            A184BarMtr = P0ATB3_A184BarMtr[0] ;
            A166BarKgm = P0ATB3_A166BarKgm[0] ;
            A184BarMtr = P0ATB3_A184BarMtr[0] ;
            AV12BarUniMed = A228BarUniMed ;
            AV13BarKgm = A166BarKgm ;
            AV14barMtr = A184BarMtr ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GXv_decimal1[0] = AV17CostefabHDR ;
         GXv_decimal2[0] = DecimalUtil.doubleToDec(0) ;
         GXv_decimal3[0] = DecimalUtil.doubleToDec(0) ;
         GXv_decimal4[0] = DecimalUtil.doubleToDec(0) ;
         GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
         GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
         GXv_decimal7[0] = DecimalUtil.doubleToDec(0) ;
         GXv_decimal8[0] = DecimalUtil.doubleToDec(0) ;
         GXv_decimal9[0] = DecimalUtil.doubleToDec(0) ;
         GXv_decimal10[0] = DecimalUtil.doubleToDec(0) ;
         GXv_decimal11[0] = DecimalUtil.doubleToDec(0) ;
         new app.costesbasicos.costesbasicos_00(remoteHandle, context).execute( AV8EmprCod, AV9BarCod, AV16BarCodReoin, AV11BarCodPar, AV12BarUniMed, AV13BarKgm, AV14barMtr, GXv_decimal1, GXv_decimal2, GXv_decimal3, GXv_decimal4, GXv_decimal5, GXv_decimal6, GXv_decimal7, GXv_decimal8, GXv_decimal9, GXv_decimal10, GXv_decimal11, (byte)(0), (byte)(0)) ;
         pprc393.this.AV17CostefabHDR = GXv_decimal1[0] ;
         AV15Costefab = AV15Costefab.add(AV17CostefabHDR) ;
         AV18i = (byte)(AV18i-1) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc393.this.AV8EmprCod;
      this.aP1[0] = pprc393.this.AV9BarCod;
      this.aP2[0] = pprc393.this.AV10BarCodReo;
      this.aP3[0] = pprc393.this.AV11BarCodPar;
      this.aP4[0] = pprc393.this.AV15Costefab;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15Costefab = DecimalUtil.ZERO ;
      AV17CostefabHDR = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P0ATB3_A130BarCodPar = new String[] {""} ;
      P0ATB3_A132BarCodReo = new byte[1] ;
      P0ATB3_A129BarCod = new int[1] ;
      P0ATB3_A396EmprCod = new String[] {""} ;
      P0ATB3_A228BarUniMed = new String[] {""} ;
      P0ATB3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATB3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A228BarUniMed = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      AV12BarUniMed = "" ;
      AV13BarKgm = DecimalUtil.ZERO ;
      AV14barMtr = DecimalUtil.ZERO ;
      GXv_decimal1 = new java.math.BigDecimal[1] ;
      GXv_decimal2 = new java.math.BigDecimal[1] ;
      GXv_decimal3 = new java.math.BigDecimal[1] ;
      GXv_decimal4 = new java.math.BigDecimal[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.costesbasicos.pprc393__default(),
         new Object[] {
             new Object[] {
            P0ATB3_A130BarCodPar, P0ATB3_A132BarCodReo, P0ATB3_A129BarCod, P0ATB3_A396EmprCod, P0ATB3_A228BarUniMed, P0ATB3_A166BarKgm, P0ATB3_A184BarMtr
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10BarCodReo ;
   private byte AV19reoperados ;
   private byte AV18i ;
   private byte AV16BarCodReoin ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int AV9BarCod ;
   private int A129BarCod ;
   private java.math.BigDecimal AV15Costefab ;
   private java.math.BigDecimal AV17CostefabHDR ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV13BarKgm ;
   private java.math.BigDecimal AV14barMtr ;
   private java.math.BigDecimal GXv_decimal1[] ;
   private java.math.BigDecimal GXv_decimal2[] ;
   private java.math.BigDecimal GXv_decimal3[] ;
   private java.math.BigDecimal GXv_decimal4[] ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private String AV8EmprCod ;
   private String AV11BarCodPar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A228BarUniMed ;
   private String AV12BarUniMed ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ATB3_A130BarCodPar ;
   private byte[] P0ATB3_A132BarCodReo ;
   private int[] P0ATB3_A129BarCod ;
   private String[] P0ATB3_A396EmprCod ;
   private String[] P0ATB3_A228BarUniMed ;
   private java.math.BigDecimal[] P0ATB3_A166BarKgm ;
   private java.math.BigDecimal[] P0ATB3_A184BarMtr ;
}

final  class pprc393__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ATB3", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.BarUniMed, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
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

