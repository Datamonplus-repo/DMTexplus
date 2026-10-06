package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class metrosaentregar extends GXProcedure
{
   public metrosaentregar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( metrosaentregar.class ), "" );
   }

   public metrosaentregar( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String aP0 ,
                                           int aP1 ,
                                           byte aP2 ,
                                           String aP3 )
   {
      metrosaentregar.this.aP4 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        java.math.BigDecimal[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             java.math.BigDecimal[] aP4 )
   {
      metrosaentregar.this.A396EmprCod = aP0;
      metrosaentregar.this.A129BarCod = aP1;
      metrosaentregar.this.A132BarCodReo = aP2;
      metrosaentregar.this.A130BarCodPar = aP3;
      metrosaentregar.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Metros = DecimalUtil.ZERO ;
      AV10BarKgm = DecimalUtil.ZERO ;
      AV12PzasLan = 0 ;
      AV17FlagModa = (byte)(0) ;
      GXv_int1[0] = AV17FlagModa ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int1) ;
      metrosaentregar.this.AV17FlagModa = GXv_int1[0] ;
      AV11BarKgm2 = DecimalUtil.doubleToDec(0) ;
      AV9Metros2 = DecimalUtil.doubleToDec(0) ;
      AV15BarKgm1 = DecimalUtil.doubleToDec(0) ;
      AV14Metros1 = DecimalUtil.doubleToDec(0) ;
      AV16PzasLan1 = 0 ;
      /* Using cursor P0ACH2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1909BarGraAca = P0ACH2_A1909BarGraAca[0] ;
         A125BarAncAca1 = P0ACH2_A125BarAncAca1[0] ;
         AV18BarGraAca = A1909BarGraAca ;
         AV19BarAncAca1 = A125BarAncAca1 ;
         /* Using cursor P0ACH3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A3275BarKgsAut = P0ACH3_A3275BarKgsAut[0] ;
            n3275BarKgsAut = P0ACH3_n3275BarKgsAut[0] ;
            A203BarPieKil = P0ACH3_A203BarPieKil[0] ;
            A3276BarMtsAut = P0ACH3_A3276BarMtsAut[0] ;
            n3276BarMtsAut = P0ACH3_n3276BarMtsAut[0] ;
            A205BarPieMet = P0ACH3_A205BarPieMet[0] ;
            A183BarMetLan = P0ACH3_A183BarMetLan[0] ;
            A200BarPieCod = P0ACH3_A200BarPieCod[0] ;
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A3275BarKgsAut)==0) )
            {
               AV15BarKgm1 = AV15BarKgm1.add(A203BarPieKil) ;
            }
            else
            {
               AV15BarKgm1 = AV15BarKgm1.add(A3275BarKgsAut) ;
            }
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A3276BarMtsAut)==0) )
            {
               AV14Metros1 = AV14Metros1.add(A205BarPieMet) ;
            }
            else
            {
               AV14Metros1 = AV14Metros1.add(A3276BarMtsAut) ;
            }
            AV9Metros2 = AV9Metros2.add(A183BarMetLan) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV8Metros = AV14Metros1.subtract(AV9Metros2) ;
      AV8Metros = ((AV8Metros.doubleValue()<0) ? DecimalUtil.doubleToDec(0) : AV8Metros) ;
      if ( AV24RounMts == 1 )
      {
         AV8Metros = GXutil.roundDecimal( AV8Metros, 0) ;
      }
      if ( ( AV17FlagModa == 1 ) && ( AV8Metros.doubleValue() > 0 ) )
      {
         AV20Ancho = DecimalUtil.doubleToDec(AV19BarAncAca1/ (double) (100)) ;
         if ( (DecimalUtil.doubleToDec(AV18BarGraAca).multiply(AV20Ancho)).doubleValue() > 0 )
         {
            AV8Metros = (AV15BarKgm1.divide((DecimalUtil.doubleToDec(AV18BarGraAca).multiply(AV20Ancho)), 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(1000)) ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = metrosaentregar.this.AV8Metros;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Metros = DecimalUtil.ZERO ;
      AV10BarKgm = DecimalUtil.ZERO ;
      GXv_int1 = new byte[1] ;
      AV11BarKgm2 = DecimalUtil.ZERO ;
      AV9Metros2 = DecimalUtil.ZERO ;
      AV15BarKgm1 = DecimalUtil.ZERO ;
      AV14Metros1 = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P0ACH2_A396EmprCod = new String[] {""} ;
      P0ACH2_A129BarCod = new int[1] ;
      P0ACH2_A132BarCodReo = new byte[1] ;
      P0ACH2_A130BarCodPar = new String[] {""} ;
      P0ACH2_A1909BarGraAca = new short[1] ;
      P0ACH2_A125BarAncAca1 = new short[1] ;
      P0ACH3_A396EmprCod = new String[] {""} ;
      P0ACH3_A129BarCod = new int[1] ;
      P0ACH3_A132BarCodReo = new byte[1] ;
      P0ACH3_A130BarCodPar = new String[] {""} ;
      P0ACH3_A3275BarKgsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ACH3_n3275BarKgsAut = new boolean[] {false} ;
      P0ACH3_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ACH3_A3276BarMtsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ACH3_n3276BarMtsAut = new boolean[] {false} ;
      P0ACH3_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ACH3_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ACH3_A200BarPieCod = new String[] {""} ;
      A3275BarKgsAut = DecimalUtil.ZERO ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A3276BarMtsAut = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A183BarMetLan = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      AV20Ancho = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.metrosaentregar__default(),
         new Object[] {
             new Object[] {
            P0ACH2_A396EmprCod, P0ACH2_A129BarCod, P0ACH2_A132BarCodReo, P0ACH2_A130BarCodPar, P0ACH2_A1909BarGraAca, P0ACH2_A125BarAncAca1
            }
            , new Object[] {
            P0ACH3_A396EmprCod, P0ACH3_A129BarCod, P0ACH3_A132BarCodReo, P0ACH3_A130BarCodPar, P0ACH3_A3275BarKgsAut, P0ACH3_n3275BarKgsAut, P0ACH3_A203BarPieKil, P0ACH3_A3276BarMtsAut, P0ACH3_n3276BarMtsAut, P0ACH3_A205BarPieMet,
            P0ACH3_A183BarMetLan, P0ACH3_A200BarPieCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV17FlagModa ;
   private byte GXv_int1[] ;
   private byte AV24RounMts ;
   private short A1909BarGraAca ;
   private short A125BarAncAca1 ;
   private short AV18BarGraAca ;
   private short AV19BarAncAca1 ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV12PzasLan ;
   private int AV16PzasLan1 ;
   private java.math.BigDecimal AV8Metros ;
   private java.math.BigDecimal AV10BarKgm ;
   private java.math.BigDecimal AV11BarKgm2 ;
   private java.math.BigDecimal AV9Metros2 ;
   private java.math.BigDecimal AV15BarKgm1 ;
   private java.math.BigDecimal AV14Metros1 ;
   private java.math.BigDecimal A3275BarKgsAut ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A3276BarMtsAut ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal A183BarMetLan ;
   private java.math.BigDecimal AV20Ancho ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A200BarPieCod ;
   private boolean n3275BarKgsAut ;
   private boolean n3276BarMtsAut ;
   private java.math.BigDecimal[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ACH2_A396EmprCod ;
   private int[] P0ACH2_A129BarCod ;
   private byte[] P0ACH2_A132BarCodReo ;
   private String[] P0ACH2_A130BarCodPar ;
   private short[] P0ACH2_A1909BarGraAca ;
   private short[] P0ACH2_A125BarAncAca1 ;
   private String[] P0ACH3_A396EmprCod ;
   private int[] P0ACH3_A129BarCod ;
   private byte[] P0ACH3_A132BarCodReo ;
   private String[] P0ACH3_A130BarCodPar ;
   private java.math.BigDecimal[] P0ACH3_A3275BarKgsAut ;
   private boolean[] P0ACH3_n3275BarKgsAut ;
   private java.math.BigDecimal[] P0ACH3_A203BarPieKil ;
   private java.math.BigDecimal[] P0ACH3_A3276BarMtsAut ;
   private boolean[] P0ACH3_n3276BarMtsAut ;
   private java.math.BigDecimal[] P0ACH3_A205BarPieMet ;
   private java.math.BigDecimal[] P0ACH3_A183BarMetLan ;
   private String[] P0ACH3_A200BarPieCod ;
}

final  class metrosaentregar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ACH2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarGraAca, BarAncAca1 FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ACH3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarKgsAut, BarPieKil, BarMtsAut, BarPieMet, BarMetLan, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[11])[0] = rslt.getString(10, 9);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

