package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctrmer extends GXProcedure
{
   public pctrmer( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctrmer.class ), "" );
   }

   public pctrmer( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           java.math.BigDecimal[] aP4 )
   {
      pctrmer.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             byte[] aP5 )
   {
      pctrmer.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pctrmer.this.AV12BarCod = aP1[0];
      this.aP1 = aP1;
      pctrmer.this.AV13BarCodReo = aP2[0];
      this.aP2 = aP2;
      pctrmer.this.AV14BarCodPar = aP3[0];
      this.aP3 = aP3;
      pctrmer.this.AV8KgsEnt = aP4[0];
      this.aP4 = aP4;
      pctrmer.this.AV18Ok_CtrMer = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV20Moda21 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int1) ;
      pctrmer.this.AV20Moda21 = GXv_int1[0] ;
      AV18Ok_CtrMer = (byte)(1) ;
      /* Using cursor P00UN3 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV12BarCod), Byte.valueOf(AV13BarCodReo), AV14BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P00UN3_A130BarCodPar[0] ;
         A132BarCodReo = P00UN3_A132BarCodReo[0] ;
         A129BarCod = P00UN3_A129BarCod[0] ;
         A252CliCod = P00UN3_A252CliCod[0] ;
         n252CliCod = P00UN3_n252CliCod[0] ;
         A212BarSer = P00UN3_A212BarSer[0] ;
         A2827BarKgsLot = P00UN3_A2827BarKgsLot[0] ;
         A166BarKgm = P00UN3_A166BarKgm[0] ;
         n166BarKgm = P00UN3_n166BarKgm[0] ;
         A166BarKgm = P00UN3_A166BarKgm[0] ;
         n166BarKgm = P00UN3_n166BarKgm[0] ;
         AV15CliCod = A252CliCod ;
         AV16BarSer = A212BarSer ;
         AV17KhsHdr = A166BarKgm ;
         if ( A2827BarKgsLot.doubleValue() != 0 )
         {
            AV17KhsHdr = A166BarKgm ;
         }
         /* Execute user subroutine: 'ARTICU' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV11MermaC = ((AV8KgsEnt.subtract(AV17KhsHdr)).divide(AV17KhsHdr, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) ;
         if ( AV11MermaC.doubleValue() < 0 )
         {
            AV11MermaC = AV11MermaC.multiply(DecimalUtil.doubleToDec((-1))) ;
         }
         if ( ( DecimalUtil.compareTo(AV11MermaC, AV9Porcen) > 0 ) && ( AV9Porcen.doubleValue() != 0 ) )
         {
            AV18Ok_CtrMer = (byte)(0) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'ARTICU' Routine */
      returnInSub = false ;
      AV9Porcen = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P00UN4 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV15CliCod), AV16BarSer});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A65ArtCod = P00UN4_A65ArtCod[0] ;
         A252CliCod = P00UN4_A252CliCod[0] ;
         n252CliCod = P00UN4_n252CliCod[0] ;
         A88ArtMer = P00UN4_A88ArtMer[0] ;
         n88ArtMer = P00UN4_n88ArtMer[0] ;
         AV9Porcen = A88ArtMer ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pctrmer.this.A396EmprCod;
      this.aP1[0] = pctrmer.this.AV12BarCod;
      this.aP2[0] = pctrmer.this.AV13BarCodReo;
      this.aP3[0] = pctrmer.this.AV14BarCodPar;
      this.aP4[0] = pctrmer.this.AV8KgsEnt;
      this.aP5[0] = pctrmer.this.AV18Ok_CtrMer;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      scmdbuf = "" ;
      P00UN3_A396EmprCod = new String[] {""} ;
      P00UN3_A130BarCodPar = new String[] {""} ;
      P00UN3_A132BarCodReo = new byte[1] ;
      P00UN3_A129BarCod = new int[1] ;
      P00UN3_A252CliCod = new int[1] ;
      P00UN3_n252CliCod = new boolean[] {false} ;
      P00UN3_A212BarSer = new String[] {""} ;
      P00UN3_A2827BarKgsLot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00UN3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00UN3_n166BarKgm = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A2827BarKgsLot = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      AV16BarSer = "" ;
      AV17KhsHdr = DecimalUtil.ZERO ;
      AV11MermaC = DecimalUtil.ZERO ;
      AV9Porcen = DecimalUtil.ZERO ;
      P00UN4_A396EmprCod = new String[] {""} ;
      P00UN4_A65ArtCod = new String[] {""} ;
      P00UN4_A252CliCod = new int[1] ;
      P00UN4_n252CliCod = new boolean[] {false} ;
      P00UN4_A88ArtMer = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00UN4_n88ArtMer = new boolean[] {false} ;
      A65ArtCod = "" ;
      A88ArtMer = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pctrmer__default(),
         new Object[] {
             new Object[] {
            P00UN3_A396EmprCod, P00UN3_A130BarCodPar, P00UN3_A132BarCodReo, P00UN3_A129BarCod, P00UN3_A252CliCod, P00UN3_n252CliCod, P00UN3_A212BarSer, P00UN3_A2827BarKgsLot, P00UN3_A166BarKgm, P00UN3_n166BarKgm
            }
            , new Object[] {
            P00UN4_A396EmprCod, P00UN4_A65ArtCod, P00UN4_A252CliCod, P00UN4_A88ArtMer, P00UN4_n88ArtMer
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13BarCodReo ;
   private byte AV18Ok_CtrMer ;
   private byte AV20Moda21 ;
   private byte GXv_int1[] ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int AV12BarCod ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int AV15CliCod ;
   private java.math.BigDecimal AV8KgsEnt ;
   private java.math.BigDecimal A2827BarKgsLot ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV17KhsHdr ;
   private java.math.BigDecimal AV11MermaC ;
   private java.math.BigDecimal AV9Porcen ;
   private java.math.BigDecimal A88ArtMer ;
   private String A396EmprCod ;
   private String AV14BarCodPar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String AV16BarSer ;
   private String A65ArtCod ;
   private boolean n252CliCod ;
   private boolean n166BarKgm ;
   private boolean returnInSub ;
   private boolean n88ArtMer ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P00UN3_A396EmprCod ;
   private String[] P00UN3_A130BarCodPar ;
   private byte[] P00UN3_A132BarCodReo ;
   private int[] P00UN3_A129BarCod ;
   private int[] P00UN3_A252CliCod ;
   private boolean[] P00UN3_n252CliCod ;
   private String[] P00UN3_A212BarSer ;
   private java.math.BigDecimal[] P00UN3_A2827BarKgsLot ;
   private java.math.BigDecimal[] P00UN3_A166BarKgm ;
   private boolean[] P00UN3_n166BarKgm ;
   private String[] P00UN4_A396EmprCod ;
   private String[] P00UN4_A65ArtCod ;
   private int[] P00UN4_A252CliCod ;
   private boolean[] P00UN4_n252CliCod ;
   private java.math.BigDecimal[] P00UN4_A88ArtMer ;
   private boolean[] P00UN4_n88ArtMer ;
}

final  class pctrmer__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00UN3", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.CliCod, T1.BarSer, T1.BarKgsLot, COALESCE( T2.BarKgm, 0) AS BarKgm FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00UN4", "SELECT EmprCod, ArtCod, CliCod, ArtMer FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

