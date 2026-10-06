package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class kilosaentregar extends GXProcedure
{
   public kilosaentregar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( kilosaentregar.class ), "" );
   }

   public kilosaentregar( int remoteHandle ,
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
      kilosaentregar.this.aP4 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
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
      kilosaentregar.this.A396EmprCod = aP0;
      kilosaentregar.this.A129BarCod = aP1;
      kilosaentregar.this.A132BarCodReo = aP2;
      kilosaentregar.this.A130BarCodPar = aP3;
      kilosaentregar.this.aP4 = aP4;
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
      kilosaentregar.this.AV17FlagModa = GXv_int1[0] ;
      GXt_int2 = (byte)(AV34noaut) ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NOAUT", ""), GXv_int1) ;
      kilosaentregar.this.GXt_int2 = GXv_int1[0] ;
      AV34noaut = GXt_int2 ;
      AV11BarKgm2 = DecimalUtil.doubleToDec(0) ;
      AV9Metros2 = DecimalUtil.doubleToDec(0) ;
      AV15BarKgm1 = DecimalUtil.doubleToDec(0) ;
      AV14Metros1 = DecimalUtil.doubleToDec(0) ;
      AV16PzasLan1 = 0 ;
      /* Using cursor P0ACG2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1909BarGraAca = P0ACG2_A1909BarGraAca[0] ;
         A125BarAncAca1 = P0ACG2_A125BarAncAca1[0] ;
         AV18BarGraAca = A1909BarGraAca ;
         AV19BarAncAca1 = A125BarAncAca1 ;
         /* Using cursor P0ACG3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A3277BarPieAut = P0ACG3_A3277BarPieAut[0] ;
            n3277BarPieAut = P0ACG3_n3277BarPieAut[0] ;
            A1501BarPiePie = P0ACG3_A1501BarPiePie[0] ;
            A3275BarKgsAut = P0ACG3_A3275BarKgsAut[0] ;
            n3275BarKgsAut = P0ACG3_n3275BarKgsAut[0] ;
            A203BarPieKil = P0ACG3_A203BarPieKil[0] ;
            A3276BarMtsAut = P0ACG3_A3276BarMtsAut[0] ;
            n3276BarMtsAut = P0ACG3_n3276BarMtsAut[0] ;
            A205BarPieMet = P0ACG3_A205BarPieMet[0] ;
            A170BarKilLan = P0ACG3_A170BarKilLan[0] ;
            A183BarMetLan = P0ACG3_A183BarMetLan[0] ;
            A200BarPieCod = P0ACG3_A200BarPieCod[0] ;
            if ( (0==A3277BarPieAut) || ( AV34noaut == 1 ) )
            {
               AV16PzasLan1 = (int)(AV16PzasLan1+A1501BarPiePie) ;
            }
            else
            {
               AV16PzasLan1 = (int)(AV16PzasLan1+A3277BarPieAut) ;
            }
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A3275BarKgsAut)==0) || ( AV34noaut == 1 ) )
            {
               AV15BarKgm1 = AV15BarKgm1.add(A203BarPieKil) ;
            }
            else
            {
               AV15BarKgm1 = AV15BarKgm1.add(A3275BarKgsAut) ;
            }
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A3276BarMtsAut)==0) || ( AV34noaut == 1 ) )
            {
               AV14Metros1 = AV14Metros1.add(A205BarPieMet) ;
            }
            else
            {
               AV14Metros1 = AV14Metros1.add(A3276BarMtsAut) ;
            }
            AV11BarKgm2 = AV11BarKgm2.add(A170BarKilLan) ;
            AV9Metros2 = AV9Metros2.add(A183BarMetLan) ;
            if ( ( AV23carvema == 1 ) && ( ( A3275BarKgsAut.doubleValue() > 0 ) || ( A3276BarMtsAut.doubleValue() > 0 ) ) )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV10BarKgm = AV15BarKgm1.subtract(AV11BarKgm2) ;
      AV10BarKgm = ((AV10BarKgm.doubleValue()<0) ? DecimalUtil.doubleToDec(0) : AV10BarKgm) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = kilosaentregar.this.AV10BarKgm;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10BarKgm = DecimalUtil.ZERO ;
      AV8Metros = DecimalUtil.ZERO ;
      GXv_int1 = new byte[1] ;
      AV11BarKgm2 = DecimalUtil.ZERO ;
      AV9Metros2 = DecimalUtil.ZERO ;
      AV15BarKgm1 = DecimalUtil.ZERO ;
      AV14Metros1 = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P0ACG2_A396EmprCod = new String[] {""} ;
      P0ACG2_A129BarCod = new int[1] ;
      P0ACG2_A132BarCodReo = new byte[1] ;
      P0ACG2_A130BarCodPar = new String[] {""} ;
      P0ACG2_A1909BarGraAca = new short[1] ;
      P0ACG2_A125BarAncAca1 = new short[1] ;
      P0ACG3_A396EmprCod = new String[] {""} ;
      P0ACG3_A129BarCod = new int[1] ;
      P0ACG3_A132BarCodReo = new byte[1] ;
      P0ACG3_A130BarCodPar = new String[] {""} ;
      P0ACG3_A3277BarPieAut = new short[1] ;
      P0ACG3_n3277BarPieAut = new boolean[] {false} ;
      P0ACG3_A1501BarPiePie = new int[1] ;
      P0ACG3_A3275BarKgsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ACG3_n3275BarKgsAut = new boolean[] {false} ;
      P0ACG3_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ACG3_A3276BarMtsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ACG3_n3276BarMtsAut = new boolean[] {false} ;
      P0ACG3_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ACG3_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ACG3_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ACG3_A200BarPieCod = new String[] {""} ;
      A3275BarKgsAut = DecimalUtil.ZERO ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A3276BarMtsAut = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A170BarKilLan = DecimalUtil.ZERO ;
      A183BarMetLan = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.kilosaentregar__default(),
         new Object[] {
             new Object[] {
            P0ACG2_A396EmprCod, P0ACG2_A129BarCod, P0ACG2_A132BarCodReo, P0ACG2_A130BarCodPar, P0ACG2_A1909BarGraAca, P0ACG2_A125BarAncAca1
            }
            , new Object[] {
            P0ACG3_A396EmprCod, P0ACG3_A129BarCod, P0ACG3_A132BarCodReo, P0ACG3_A130BarCodPar, P0ACG3_A3277BarPieAut, P0ACG3_n3277BarPieAut, P0ACG3_A1501BarPiePie, P0ACG3_A3275BarKgsAut, P0ACG3_n3275BarKgsAut, P0ACG3_A203BarPieKil,
            P0ACG3_A3276BarMtsAut, P0ACG3_n3276BarMtsAut, P0ACG3_A205BarPieMet, P0ACG3_A170BarKilLan, P0ACG3_A183BarMetLan, P0ACG3_A200BarPieCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV17FlagModa ;
   private byte GXt_int2 ;
   private byte GXv_int1[] ;
   private byte AV23carvema ;
   private short AV34noaut ;
   private short A1909BarGraAca ;
   private short A125BarAncAca1 ;
   private short AV18BarGraAca ;
   private short AV19BarAncAca1 ;
   private short A3277BarPieAut ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV12PzasLan ;
   private int AV16PzasLan1 ;
   private int A1501BarPiePie ;
   private java.math.BigDecimal AV10BarKgm ;
   private java.math.BigDecimal AV8Metros ;
   private java.math.BigDecimal AV11BarKgm2 ;
   private java.math.BigDecimal AV9Metros2 ;
   private java.math.BigDecimal AV15BarKgm1 ;
   private java.math.BigDecimal AV14Metros1 ;
   private java.math.BigDecimal A3275BarKgsAut ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A3276BarMtsAut ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal A170BarKilLan ;
   private java.math.BigDecimal A183BarMetLan ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A200BarPieCod ;
   private boolean n3277BarPieAut ;
   private boolean n3275BarKgsAut ;
   private boolean n3276BarMtsAut ;
   private java.math.BigDecimal[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ACG2_A396EmprCod ;
   private int[] P0ACG2_A129BarCod ;
   private byte[] P0ACG2_A132BarCodReo ;
   private String[] P0ACG2_A130BarCodPar ;
   private short[] P0ACG2_A1909BarGraAca ;
   private short[] P0ACG2_A125BarAncAca1 ;
   private String[] P0ACG3_A396EmprCod ;
   private int[] P0ACG3_A129BarCod ;
   private byte[] P0ACG3_A132BarCodReo ;
   private String[] P0ACG3_A130BarCodPar ;
   private short[] P0ACG3_A3277BarPieAut ;
   private boolean[] P0ACG3_n3277BarPieAut ;
   private int[] P0ACG3_A1501BarPiePie ;
   private java.math.BigDecimal[] P0ACG3_A3275BarKgsAut ;
   private boolean[] P0ACG3_n3275BarKgsAut ;
   private java.math.BigDecimal[] P0ACG3_A203BarPieKil ;
   private java.math.BigDecimal[] P0ACG3_A3276BarMtsAut ;
   private boolean[] P0ACG3_n3276BarMtsAut ;
   private java.math.BigDecimal[] P0ACG3_A205BarPieMet ;
   private java.math.BigDecimal[] P0ACG3_A170BarKilLan ;
   private java.math.BigDecimal[] P0ACG3_A183BarMetLan ;
   private String[] P0ACG3_A200BarPieCod ;
}

final  class kilosaentregar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ACG2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarGraAca, BarAncAca1 FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ACG3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieAut, BarPiePie, BarKgsAut, BarPieKil, BarMtsAut, BarPieMet, BarKilLan, BarMetLan, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[15])[0] = rslt.getString(13, 9);
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

