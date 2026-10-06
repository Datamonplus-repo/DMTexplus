package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppla005 extends GXProcedure
{
   public ppla005( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppla005.class ), "" );
   }

   public ppla005( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      ppla005.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      ppla005.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppla005.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      ppla005.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      ppla005.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P020C2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A153BarFasEst = P020C2_A153BarFasEst[0] ;
         A120BarAgrEst = P020C2_A120BarAgrEst[0] ;
         A150BarFacTin = P020C2_A150BarFacTin[0] ;
         A457FasCod = P020C2_A457FasCod[0] ;
         A603MaqCodBis = P020C2_A603MaqCodBis[0] ;
         A252CliCod = P020C2_A252CliCod[0] ;
         n252CliCod = P020C2_n252CliCod[0] ;
         A212BarSer = P020C2_A212BarSer[0] ;
         A194BarOrdLin = P020C2_A194BarOrdLin[0] ;
         A758ProCod = P020C2_A758ProCod[0] ;
         A120BarAgrEst = P020C2_A120BarAgrEst[0] ;
         A252CliCod = P020C2_A252CliCod[0] ;
         n252CliCod = P020C2_n252CliCod[0] ;
         A212BarSer = P020C2_A212BarSer[0] ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A129BarCod ;
         GXv_int3[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_int5[0] = A194BarOrdLin ;
         GXv_int6[0] = AV33EstS ;
         new app.prestof(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_int5, GXv_int6) ;
         ppla005.this.A396EmprCod = GXv_char1[0] ;
         ppla005.this.A129BarCod = GXv_int2[0] ;
         ppla005.this.A132BarCodReo = GXv_int3[0] ;
         ppla005.this.A130BarCodPar = GXv_char4[0] ;
         ppla005.this.A194BarOrdLin = GXv_int5[0] ;
         ppla005.this.AV33EstS = GXv_int6[0] ;
         if ( AV33EstS == 0 )
         {
            AV34barCod = A129BarCod ;
            AV35BarCodReo = A132BarCodReo ;
            AV36barCodPar = A130BarCodPar ;
            if ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
            {
               new app.pminagr(remoteHandle, context).execute( A396EmprCod, AV34barCod, AV35BarCodReo, AV36barCodPar) ;
            }
            if ( GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", "")) == 0 )
            {
               GXv_char4[0] = A396EmprCod ;
               GXv_int2[0] = AV34barCod ;
               GXv_int6[0] = AV35BarCodReo ;
               GXv_char1[0] = AV36barCodPar ;
               GXv_char7[0] = A457FasCod ;
               GXv_date8[0] = AV28FecTeo ;
               GXv_decimal9[0] = AV29TieTeo ;
               GXv_decimal10[0] = AV30Decalaje ;
               GXv_decimal11[0] = AV32Resto ;
               GXv_char12[0] = AV31T_c ;
               GXv_char13[0] = A758ProCod ;
               GXv_char14[0] = A603MaqCodBis ;
               GXv_int15[0] = A252CliCod ;
               GXv_char16[0] = A212BarSer ;
               GXv_int17[0] = 0 ;
               GXv_int3[0] = (byte)(0) ;
               new app.ppla001(remoteHandle, context).execute( GXv_char4, GXv_int2, GXv_int6, GXv_char1, GXv_char7, GXv_date8, GXv_decimal9, GXv_decimal10, GXv_decimal11, GXv_char12, GXv_char13, GXv_char14, GXv_int15, GXv_char16, GXv_int17, GXv_int3) ;
               ppla005.this.A396EmprCod = GXv_char4[0] ;
               ppla005.this.AV34barCod = GXv_int2[0] ;
               ppla005.this.AV35BarCodReo = GXv_int6[0] ;
               ppla005.this.AV36barCodPar = GXv_char1[0] ;
               ppla005.this.A457FasCod = GXv_char7[0] ;
               ppla005.this.AV28FecTeo = GXv_date8[0] ;
               ppla005.this.AV29TieTeo = GXv_decimal9[0] ;
               ppla005.this.AV30Decalaje = GXv_decimal10[0] ;
               ppla005.this.AV32Resto = GXv_decimal11[0] ;
               ppla005.this.AV31T_c = GXv_char12[0] ;
               ppla005.this.A758ProCod = GXv_char13[0] ;
               ppla005.this.A603MaqCodBis = GXv_char14[0] ;
               ppla005.this.A252CliCod = GXv_int15[0] ;
               ppla005.this.A212BarSer = GXv_char16[0] ;
               Gx_msg = httpContext.getMessage( "&FecTeo=", "") + localUtil.dtoc( AV28FecTeo, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + GXutil.chr( (short)(13)) ;
               Gx_msg += httpContext.getMessage( "&TieTeo=", "") + GXutil.str( AV29TieTeo, 5, 2) + GXutil.chr( (short)(13)) ;
               Gx_msg += httpContext.getMessage( "Fascod=", "") + A457FasCod + GXutil.chr( (short)(13)) ;
            }
            else
            {
               GXv_char16[0] = A396EmprCod ;
               GXv_int15[0] = A129BarCod ;
               GXv_int6[0] = A132BarCodReo ;
               GXv_char14[0] = A130BarCodPar ;
               GXv_char13[0] = A457FasCod ;
               GXv_date8[0] = AV28FecTeo ;
               GXv_decimal11[0] = AV29TieTeo ;
               GXv_decimal10[0] = AV30Decalaje ;
               GXv_decimal9[0] = AV32Resto ;
               GXv_char12[0] = AV31T_c ;
               GXv_char7[0] = A758ProCod ;
               GXv_char4[0] = A603MaqCodBis ;
               GXv_int2[0] = A252CliCod ;
               GXv_char1[0] = A212BarSer ;
               GXv_int17[0] = 0 ;
               GXv_int3[0] = (byte)(0) ;
               new app.ppla001(remoteHandle, context).execute( GXv_char16, GXv_int15, GXv_int6, GXv_char14, GXv_char13, GXv_date8, GXv_decimal11, GXv_decimal10, GXv_decimal9, GXv_char12, GXv_char7, GXv_char4, GXv_int2, GXv_char1, GXv_int17, GXv_int3) ;
               ppla005.this.A396EmprCod = GXv_char16[0] ;
               ppla005.this.A129BarCod = GXv_int15[0] ;
               ppla005.this.A132BarCodReo = GXv_int6[0] ;
               ppla005.this.A130BarCodPar = GXv_char14[0] ;
               ppla005.this.A457FasCod = GXv_char13[0] ;
               ppla005.this.AV28FecTeo = GXv_date8[0] ;
               ppla005.this.AV29TieTeo = GXv_decimal11[0] ;
               ppla005.this.AV30Decalaje = GXv_decimal10[0] ;
               ppla005.this.AV32Resto = GXv_decimal9[0] ;
               ppla005.this.AV31T_c = GXv_char12[0] ;
               ppla005.this.A758ProCod = GXv_char7[0] ;
               ppla005.this.A603MaqCodBis = GXv_char4[0] ;
               ppla005.this.A252CliCod = GXv_int2[0] ;
               ppla005.this.A212BarSer = GXv_char1[0] ;
            }
            System.out.println( Gx_msg );
            GXv_char16[0] = A396EmprCod ;
            GXv_int15[0] = A129BarCod ;
            GXv_int6[0] = A132BarCodReo ;
            GXv_char14[0] = A130BarCodPar ;
            GXv_char13[0] = A758ProCod ;
            GXv_int5[0] = A194BarOrdLin ;
            GXv_date8[0] = AV28FecTeo ;
            GXv_decimal11[0] = AV29TieTeo ;
            new app.ppla003(remoteHandle, context).execute( GXv_char16, GXv_int15, GXv_int6, GXv_char14, GXv_char13, GXv_int5, GXv_date8, GXv_decimal11) ;
            ppla005.this.A396EmprCod = GXv_char16[0] ;
            ppla005.this.A129BarCod = GXv_int15[0] ;
            ppla005.this.A132BarCodReo = GXv_int6[0] ;
            ppla005.this.A130BarCodPar = GXv_char14[0] ;
            ppla005.this.A758ProCod = GXv_char13[0] ;
            ppla005.this.A194BarOrdLin = GXv_int5[0] ;
            ppla005.this.AV28FecTeo = GXv_date8[0] ;
            ppla005.this.AV29TieTeo = GXv_decimal11[0] ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppla005.this.A396EmprCod;
      this.aP1[0] = ppla005.this.A129BarCod;
      this.aP2[0] = ppla005.this.A132BarCodReo;
      this.aP3[0] = ppla005.this.A130BarCodPar;
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
      P020C2_A396EmprCod = new String[] {""} ;
      P020C2_A129BarCod = new int[1] ;
      P020C2_A132BarCodReo = new byte[1] ;
      P020C2_A130BarCodPar = new String[] {""} ;
      P020C2_A153BarFasEst = new byte[1] ;
      P020C2_A120BarAgrEst = new String[] {""} ;
      P020C2_A150BarFacTin = new String[] {""} ;
      P020C2_A457FasCod = new String[] {""} ;
      P020C2_A603MaqCodBis = new String[] {""} ;
      P020C2_A252CliCod = new int[1] ;
      P020C2_n252CliCod = new boolean[] {false} ;
      P020C2_A212BarSer = new String[] {""} ;
      P020C2_A194BarOrdLin = new short[1] ;
      P020C2_A758ProCod = new String[] {""} ;
      A120BarAgrEst = "" ;
      A150BarFacTin = "" ;
      A457FasCod = "" ;
      A603MaqCodBis = "" ;
      A212BarSer = "" ;
      A758ProCod = "" ;
      AV36barCodPar = "" ;
      AV28FecTeo = GXutil.nullDate() ;
      AV29TieTeo = DecimalUtil.ZERO ;
      AV30Decalaje = DecimalUtil.ZERO ;
      AV32Resto = DecimalUtil.ZERO ;
      AV31T_c = "" ;
      Gx_msg = "" ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_char12 = new String[1] ;
      GXv_char7 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char1 = new String[1] ;
      GXv_int17 = new long[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char16 = new String[1] ;
      GXv_int15 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char14 = new String[1] ;
      GXv_char13 = new String[1] ;
      GXv_int5 = new short[1] ;
      GXv_date8 = new java.util.Date[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppla005__default(),
         new Object[] {
             new Object[] {
            P020C2_A396EmprCod, P020C2_A129BarCod, P020C2_A132BarCodReo, P020C2_A130BarCodPar, P020C2_A153BarFasEst, P020C2_A120BarAgrEst, P020C2_A150BarFacTin, P020C2_A457FasCod, P020C2_A603MaqCodBis, P020C2_A252CliCod,
            P020C2_n252CliCod, P020C2_A212BarSer, P020C2_A194BarOrdLin, P020C2_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A153BarFasEst ;
   private byte AV33EstS ;
   private byte AV35BarCodReo ;
   private byte GXv_int3[] ;
   private byte GXv_int6[] ;
   private short A194BarOrdLin ;
   private short GXv_int5[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int AV34barCod ;
   private int GXv_int2[] ;
   private int GXv_int15[] ;
   private long GXv_int17[] ;
   private java.math.BigDecimal AV29TieTeo ;
   private java.math.BigDecimal AV30Decalaje ;
   private java.math.BigDecimal AV32Resto ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A120BarAgrEst ;
   private String A150BarFacTin ;
   private String A457FasCod ;
   private String A603MaqCodBis ;
   private String A212BarSer ;
   private String A758ProCod ;
   private String AV36barCodPar ;
   private String AV31T_c ;
   private String Gx_msg ;
   private String GXv_char12[] ;
   private String GXv_char7[] ;
   private String GXv_char4[] ;
   private String GXv_char1[] ;
   private String GXv_char16[] ;
   private String GXv_char14[] ;
   private String GXv_char13[] ;
   private java.util.Date AV28FecTeo ;
   private java.util.Date GXv_date8[] ;
   private boolean n252CliCod ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P020C2_A396EmprCod ;
   private int[] P020C2_A129BarCod ;
   private byte[] P020C2_A132BarCodReo ;
   private String[] P020C2_A130BarCodPar ;
   private byte[] P020C2_A153BarFasEst ;
   private String[] P020C2_A120BarAgrEst ;
   private String[] P020C2_A150BarFacTin ;
   private String[] P020C2_A457FasCod ;
   private String[] P020C2_A603MaqCodBis ;
   private int[] P020C2_A252CliCod ;
   private boolean[] P020C2_n252CliCod ;
   private String[] P020C2_A212BarSer ;
   private short[] P020C2_A194BarOrdLin ;
   private String[] P020C2_A758ProCod ;
}

final  class ppla005__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P020C2", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasEst, T2.BarAgrEst, T1.BarFacTin, T1.FasCod, T1.MaqCodBis, T2.CliCod, T2.BarSer, T1.BarOrdLin, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?) AND (T1.BarFasEst <= 1) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 16);
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 8);
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

