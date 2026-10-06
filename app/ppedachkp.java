package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppedachkp extends GXProcedure
{
   public ppedachkp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppedachkp.class ), "" );
   }

   public ppedachkp( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 )
   {
      ppedachkp.this.aP2 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        java.math.BigDecimal[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             java.math.BigDecimal[] aP2 )
   {
      ppedachkp.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppedachkp.this.A11604PArtId = aP1[0];
      this.aP1 = aP1;
      ppedachkp.this.AV10Ok = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10Ok = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P04MJ3 */
      pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Integer.valueOf(A11604PArtId)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1013DibCli = P04MJ3_A1013DibCli[0] ;
         n1013DibCli = P04MJ3_n1013DibCli[0] ;
         A1014DibInt = P04MJ3_A1014DibInt[0] ;
         n1014DibInt = P04MJ3_n1014DibInt[0] ;
         A11592PAFPre = P04MJ3_A11592PAFPre[0] ;
         n11592PAFPre = P04MJ3_n11592PAFPre[0] ;
         A11596PAFAut = P04MJ3_A11596PAFAut[0] ;
         n11596PAFAut = P04MJ3_n11596PAFAut[0] ;
         A7744FasPreObl = P04MJ3_A7744FasPreObl[0] ;
         n7744FasPreObl = P04MJ3_n7744FasPreObl[0] ;
         A457FasCod = P04MJ3_A457FasCod[0] ;
         A456FasActTin = P04MJ3_A456FasActTin[0] ;
         n456FasActTin = P04MJ3_n456FasActTin[0] ;
         A11550PArtColNom = P04MJ3_A11550PArtColNom[0] ;
         n11550PArtColNom = P04MJ3_n11550PArtColNom[0] ;
         A65ArtCod = P04MJ3_A65ArtCod[0] ;
         n65ArtCod = P04MJ3_n65ArtCod[0] ;
         A11551PArtTipCol = P04MJ3_A11551PArtTipCol[0] ;
         A252CliCod = P04MJ3_A252CliCod[0] ;
         n252CliCod = P04MJ3_n252CliCod[0] ;
         A11611PAFOrd = P04MJ3_A11611PAFOrd[0] ;
         A7744FasPreObl = P04MJ3_A7744FasPreObl[0] ;
         n7744FasPreObl = P04MJ3_n7744FasPreObl[0] ;
         A456FasActTin = P04MJ3_A456FasActTin[0] ;
         n456FasActTin = P04MJ3_n456FasActTin[0] ;
         A1013DibCli = P04MJ3_A1013DibCli[0] ;
         n1013DibCli = P04MJ3_n1013DibCli[0] ;
         A1014DibInt = P04MJ3_A1014DibInt[0] ;
         n1014DibInt = P04MJ3_n1014DibInt[0] ;
         A11550PArtColNom = P04MJ3_A11550PArtColNom[0] ;
         n11550PArtColNom = P04MJ3_n11550PArtColNom[0] ;
         A65ArtCod = P04MJ3_A65ArtCod[0] ;
         n65ArtCod = P04MJ3_n65ArtCod[0] ;
         A252CliCod = P04MJ3_A252CliCod[0] ;
         n252CliCod = P04MJ3_n252CliCod[0] ;
         A11551PArtTipCol = P04MJ3_A11551PArtTipCol[0] ;
         GXt_int1 = (long)(DecimalUtil.decToDouble(A11599PAFPreLis)) ;
         GXv_char2[0] = A396EmprCod ;
         GXv_int3[0] = A11604PArtId ;
         GXv_char4[0] = A457FasCod ;
         GXv_int5[0] = (short)(0) ;
         GXv_char6[0] = httpContext.getMessage( "P", "") ;
         GXv_int7[0] = GXt_int1 ;
         new app.partpre(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4, GXv_int5, GXv_char6, GXv_int7) ;
         ppedachkp.this.A396EmprCod = GXv_char2[0] ;
         ppedachkp.this.A11604PArtId = GXv_int3[0] ;
         ppedachkp.this.A457FasCod = GXv_char4[0] ;
         ppedachkp.this.GXt_int1 = GXv_int7[0] ;
         A11599PAFPreLis = DecimalUtil.doubleToDec(GXt_int1) ;
         if ( A11599PAFPreLis.doubleValue() > 0 )
         {
            A11602PAFPreL = (byte)(1) ;
         }
         else
         {
            if ( A11599PAFPreLis.doubleValue() == 0 )
            {
               A11602PAFPreL = (byte)(0) ;
            }
            else
            {
               A11602PAFPreL = (byte)(0) ;
            }
         }
         GXt_decimal8 = A11598PAFPreMax ;
         GXv_char6[0] = A396EmprCod ;
         GXv_int3[0] = A252CliCod ;
         GXv_char4[0] = A65ArtCod ;
         GXv_char2[0] = A11550PArtColNom ;
         GXv_int9[0] = 0 ;
         GXv_int10[0] = A11551PArtTipCol ;
         GXv_char11[0] = A456FasActTin ;
         GXv_decimal12[0] = GXt_decimal8 ;
         new app.partprmax(remoteHandle, context).execute( GXv_char6, GXv_int3, GXv_char4, GXv_char2, GXv_int9, GXv_int10, GXv_char11, GXv_decimal12) ;
         ppedachkp.this.A396EmprCod = GXv_char6[0] ;
         ppedachkp.this.A252CliCod = GXv_int3[0] ;
         ppedachkp.this.A65ArtCod = GXv_char4[0] ;
         ppedachkp.this.A11550PArtColNom = GXv_char2[0] ;
         ppedachkp.this.A11551PArtTipCol = GXv_int10[0] ;
         ppedachkp.this.A456FasActTin = GXv_char11[0] ;
         ppedachkp.this.GXt_decimal8 = GXv_decimal12[0] ;
         A11598PAFPreMax = GXt_decimal8 ;
         GXt_decimal8 = A11597PAFPreMin ;
         GXv_char11[0] = A396EmprCod ;
         GXv_int9[0] = A252CliCod ;
         GXv_char6[0] = A65ArtCod ;
         GXv_char4[0] = A11550PArtColNom ;
         GXv_int3[0] = 0 ;
         GXv_int10[0] = A11551PArtTipCol ;
         GXv_char2[0] = A456FasActTin ;
         GXv_decimal12[0] = GXt_decimal8 ;
         new app.partprmin(remoteHandle, context).execute( GXv_char11, GXv_int9, GXv_char6, GXv_char4, GXv_int3, GXv_int10, GXv_char2, GXv_decimal12) ;
         ppedachkp.this.A396EmprCod = GXv_char11[0] ;
         ppedachkp.this.A252CliCod = GXv_int9[0] ;
         ppedachkp.this.A65ArtCod = GXv_char6[0] ;
         ppedachkp.this.A11550PArtColNom = GXv_char4[0] ;
         ppedachkp.this.A11551PArtTipCol = GXv_int10[0] ;
         ppedachkp.this.A456FasActTin = GXv_char2[0] ;
         ppedachkp.this.GXt_decimal8 = GXv_decimal12[0] ;
         A11597PAFPreMin = GXt_decimal8 ;
         Gx_msg = httpContext.getMessage( "Fase : ", "") + GXutil.trim( A457FasCod) + GXutil.chr( (short)(13)) + GXutil.chr( (short)(10)) ;
         Gx_msg += httpContext.getMessage( "Precio : ", "") + GXutil.trim( GXutil.str( A11592PAFPre, 10, 2)) + GXutil.chr( (short)(13)) + GXutil.chr( (short)(10)) ;
         Gx_msg += httpContext.getMessage( "Tintura : ", "") + GXutil.trim( A456FasActTin) + GXutil.chr( (short)(13)) + GXutil.chr( (short)(10)) ;
         Gx_msg += httpContext.getMessage( "Mínimo : ", "") + GXutil.trim( GXutil.str( A11597PAFPreMin, 10, 2)) + GXutil.chr( (short)(13)) + GXutil.chr( (short)(10)) ;
         Gx_msg += httpContext.getMessage( "Máximo : ", "") + GXutil.trim( GXutil.str( A11598PAFPreMax, 10, 2)) + GXutil.chr( (short)(13)) + GXutil.chr( (short)(10)) ;
         Gx_msg += httpContext.getMessage( "Autorizado : ", "") + GXutil.trim( GXutil.str( A11596PAFAut, 10, 0)) + GXutil.chr( (short)(13)) + GXutil.chr( (short)(10)) ;
         Gx_msg += httpContext.getMessage( "Obligatorio : ", "") + GXutil.trim( GXutil.str( A7744FasPreObl, 10, 0)) + GXutil.chr( (short)(13)) + GXutil.chr( (short)(10)) ;
         Gx_msg += httpContext.getMessage( "Lista : ", "") + GXutil.trim( GXutil.str( A11602PAFPreL, 10, 0)) ;
         if ( ( ( ( DecimalUtil.compareTo(A11592PAFPre, A11597PAFPreMin) < 0 ) && ( GXutil.strcmp(A456FasActTin, httpContext.getMessage( "S", "")) == 0 ) ) && ( A11596PAFAut == 0 ) && ( A11602PAFPreL == 0 ) ) || ( ( ( DecimalUtil.compareTo(A11592PAFPre, A11598PAFPreMax) > 0 ) && ( GXutil.strcmp(A456FasActTin, httpContext.getMessage( "S", "")) == 0 ) ) && ( A11596PAFAut == 0 ) && ( A11602PAFPreL == 0 ) ) || ( ( ( A7744FasPreObl == 1 ) && ( A11592PAFPre.doubleValue() == 0 ) ) && ( A11596PAFAut == 0 ) && ( A11602PAFPreL == 0 ) ) || ( ( DecimalUtil.compareTo(A11592PAFPre, A11599PAFPreLis) != 0 ) && ( A11602PAFPreL == 1 ) && ( A11596PAFAut == 0 ) ) )
         {
            AV10Ok = DecimalUtil.doubleToDec(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppedachkp.this.A396EmprCod;
      this.aP1[0] = ppedachkp.this.A11604PArtId;
      this.aP2[0] = ppedachkp.this.AV10Ok;
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
      P04MJ3_A1013DibCli = new String[] {""} ;
      P04MJ3_n1013DibCli = new boolean[] {false} ;
      P04MJ3_A1014DibInt = new int[1] ;
      P04MJ3_n1014DibInt = new boolean[] {false} ;
      P04MJ3_A11592PAFPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04MJ3_n11592PAFPre = new boolean[] {false} ;
      P04MJ3_A11596PAFAut = new byte[1] ;
      P04MJ3_n11596PAFAut = new boolean[] {false} ;
      P04MJ3_A7744FasPreObl = new byte[1] ;
      P04MJ3_n7744FasPreObl = new boolean[] {false} ;
      P04MJ3_A396EmprCod = new String[] {""} ;
      P04MJ3_A11604PArtId = new int[1] ;
      P04MJ3_A457FasCod = new String[] {""} ;
      P04MJ3_A456FasActTin = new String[] {""} ;
      P04MJ3_n456FasActTin = new boolean[] {false} ;
      P04MJ3_A11550PArtColNom = new String[] {""} ;
      P04MJ3_n11550PArtColNom = new boolean[] {false} ;
      P04MJ3_A65ArtCod = new String[] {""} ;
      P04MJ3_n65ArtCod = new boolean[] {false} ;
      P04MJ3_A11551PArtTipCol = new byte[1] ;
      P04MJ3_A252CliCod = new int[1] ;
      P04MJ3_n252CliCod = new boolean[] {false} ;
      P04MJ3_A11611PAFOrd = new short[1] ;
      A1013DibCli = "" ;
      A11592PAFPre = DecimalUtil.ZERO ;
      A457FasCod = "" ;
      A456FasActTin = "" ;
      A11550PArtColNom = "" ;
      A65ArtCod = "" ;
      A11599PAFPreLis = DecimalUtil.ZERO ;
      GXv_int5 = new short[1] ;
      GXv_int7 = new long[1] ;
      A11598PAFPreMax = DecimalUtil.ZERO ;
      A11597PAFPreMin = DecimalUtil.ZERO ;
      GXt_decimal8 = DecimalUtil.ZERO ;
      GXv_char11 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_char6 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_int10 = new byte[1] ;
      GXv_char2 = new String[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppedachkp__default(),
         new Object[] {
             new Object[] {
            P04MJ3_A1013DibCli, P04MJ3_n1013DibCli, P04MJ3_A1014DibInt, P04MJ3_n1014DibInt, P04MJ3_A11592PAFPre, P04MJ3_n11592PAFPre, P04MJ3_A11596PAFAut, P04MJ3_n11596PAFAut, P04MJ3_A7744FasPreObl, P04MJ3_n7744FasPreObl,
            P04MJ3_A396EmprCod, P04MJ3_A11604PArtId, P04MJ3_A457FasCod, P04MJ3_A456FasActTin, P04MJ3_n456FasActTin, P04MJ3_A11550PArtColNom, P04MJ3_n11550PArtColNom, P04MJ3_A65ArtCod, P04MJ3_n65ArtCod, P04MJ3_A11551PArtTipCol,
            P04MJ3_A252CliCod, P04MJ3_n252CliCod, P04MJ3_A11611PAFOrd
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A11596PAFAut ;
   private byte A7744FasPreObl ;
   private byte A11551PArtTipCol ;
   private byte A11602PAFPreL ;
   private byte GXv_int10[] ;
   private short A11611PAFOrd ;
   private short GXv_int5[] ;
   private short Gx_err ;
   private int A11604PArtId ;
   private int A252CliCod ;
   private int A1014DibInt ;
   private int GXv_int9[] ;
   private int GXv_int3[] ;
   private long GXt_int1 ;
   private long GXv_int7[] ;
   private java.math.BigDecimal AV10Ok ;
   private java.math.BigDecimal A11592PAFPre ;
   private java.math.BigDecimal A11599PAFPreLis ;
   private java.math.BigDecimal A11598PAFPreMax ;
   private java.math.BigDecimal A11597PAFPreMin ;
   private java.math.BigDecimal GXt_decimal8 ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A1013DibCli ;
   private String A457FasCod ;
   private String A456FasActTin ;
   private String A11550PArtColNom ;
   private String A65ArtCod ;
   private String GXv_char11[] ;
   private String GXv_char6[] ;
   private String GXv_char4[] ;
   private String GXv_char2[] ;
   private String Gx_msg ;
   private boolean n252CliCod ;
   private boolean n1013DibCli ;
   private boolean n1014DibInt ;
   private boolean n11592PAFPre ;
   private boolean n11596PAFAut ;
   private boolean n7744FasPreObl ;
   private boolean n456FasActTin ;
   private boolean n11550PArtColNom ;
   private boolean n65ArtCod ;
   private java.math.BigDecimal[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P04MJ3_A1013DibCli ;
   private boolean[] P04MJ3_n1013DibCli ;
   private int[] P04MJ3_A1014DibInt ;
   private boolean[] P04MJ3_n1014DibInt ;
   private java.math.BigDecimal[] P04MJ3_A11592PAFPre ;
   private boolean[] P04MJ3_n11592PAFPre ;
   private byte[] P04MJ3_A11596PAFAut ;
   private boolean[] P04MJ3_n11596PAFAut ;
   private byte[] P04MJ3_A7744FasPreObl ;
   private boolean[] P04MJ3_n7744FasPreObl ;
   private String[] P04MJ3_A396EmprCod ;
   private int[] P04MJ3_A11604PArtId ;
   private String[] P04MJ3_A457FasCod ;
   private String[] P04MJ3_A456FasActTin ;
   private boolean[] P04MJ3_n456FasActTin ;
   private String[] P04MJ3_A11550PArtColNom ;
   private boolean[] P04MJ3_n11550PArtColNom ;
   private String[] P04MJ3_A65ArtCod ;
   private boolean[] P04MJ3_n65ArtCod ;
   private byte[] P04MJ3_A11551PArtTipCol ;
   private int[] P04MJ3_A252CliCod ;
   private boolean[] P04MJ3_n252CliCod ;
   private short[] P04MJ3_A11611PAFOrd ;
}

final  class ppedachkp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04MJ3", "SELECT T3.DibCli, T3.DibInt, T1.PAFPre, T1.PAFAut, T2.FasPreObl, T1.EmprCod, T1.PArtId, T1.FasCod, T2.FasActTin, T3.PArtColNom, T3.ArtCod, COALESCE( T4.PArtTipCol, 0) AS PArtTipCol, T3.CliCod, T1.PAFOrd FROM (((TXPPedAFa T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPPedAEs T3 ON T3.EmprCod = T1.EmprCod AND T3.PArtId = T1.PArtId) LEFT JOIN (SELECT T7.DibCli, T7.DibInt, T8.PArtId, MIN(T5.TipColCod) AS PArtTipCol FROM (((TXPCFORMU T5 LEFT JOIN TXPBARCAD T6 ON T6.EmprCod = T5.EmprCod AND T6.BarCod = T5.BarCod AND T6.BarCodReo = T5.BarCodReo AND T6.BarCodPar = T5.BarCodPar) LEFT JOIN TXPDISPOS T7 ON T7.EmprCod = T5.EmprCod AND T7.DisCod = T6.DisCod) LEFT JOIN TXPPedAEs T8 ON T8.EmprCod = T5.EmprCod AND T8.DibCli = T7.DibCli AND T8.DibInt = T7.DibInt) WHERE (T5.EmprCod = ?) AND (T5.CliCod = ?) AND (T5.ForSer = T8.ArtCod) AND (T5.ForColNom = T8.PArtColNom) AND (T5.ForColNum = 0) GROUP BY T7.DibCli, T7.DibInt, T8.PArtId ) T4 ON T4.DibCli = T3.DibCli AND T4.DibInt = T3.DibInt AND T4.PArtId = T1.PArtId) WHERE T1.EmprCod = ? and T1.PArtId = ? ORDER BY T1.EmprCod, T1.PArtId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 3);
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((String[]) buf[12])[0] = rslt.getString(8, 8);
               ((String[]) buf[13])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 16);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(12);
               ((int[]) buf[20])[0] = rslt.getInt(13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(14);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
      }
   }

}

