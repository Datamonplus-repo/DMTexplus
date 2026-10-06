package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pefechdrs extends GXProcedure
{
   public pefechdrs( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pefechdrs.class ), "" );
   }

   public pefechdrs( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           short[] aP2 ,
                           byte[] aP3 ,
                           long[] aP4 ,
                           java.util.Date[] aP5 ,
                           java.util.Date[] aP6 )
   {
      pefechdrs.this.aP7 = new long[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        short[] aP2 ,
                        byte[] aP3 ,
                        long[] aP4 ,
                        java.util.Date[] aP5 ,
                        java.util.Date[] aP6 ,
                        long[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 ,
                             byte[] aP3 ,
                             long[] aP4 ,
                             java.util.Date[] aP5 ,
                             java.util.Date[] aP6 ,
                             long[] aP7 )
   {
      pefechdrs.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pefechdrs.this.AV27BarDibCli = aP1[0];
      this.aP1 = aP1;
      pefechdrs.this.AV17year = aP2[0];
      this.aP2 = aP2;
      pefechdrs.this.AV18mes = aP3[0];
      this.aP3 = aP3;
      pefechdrs.this.AV16NumHdrs = aP4[0];
      this.aP4 = aP4;
      pefechdrs.this.AV20Fec1 = aP5[0];
      this.aP5 = aP5;
      pefechdrs.this.AV21Fec2 = aP6[0];
      this.aP6 = aP6;
      pefechdrs.this.AV24hnd = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16NumHdrs = 0 ;
      AV19mes2 = (byte)(AV18mes+3) ;
      AV23year2 = (short)(((AV19mes2>12) ? AV17year+1 : AV17year)) ;
      AV19mes2 = (byte)(((AV19mes2>12) ? AV19mes2-12 : AV19mes2)) ;
      AV22Fecalfa = "01" + "/" + GXutil.str( AV19mes2, 2, 0) + "/" + GXutil.str( AV23year2, 4, 0) ;
      AV21Fec2 = GXutil.eomdate( localUtil.ctod( AV22Fecalfa, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
      AV22Fecalfa = "01" + "/" + GXutil.str( AV18mes, 2, 0) + "/" + GXutil.str( AV17year, 4, 0) ;
      AV20Fec1 = localUtil.ctod( AV22Fecalfa, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      /* Using cursor P05GT3 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV20Fec1, AV21Fec2});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P05GT3_A252CliCod[0] ;
         n252CliCod = P05GT3_n252CliCod[0] ;
         A143BarDisNum = P05GT3_A143BarDisNum[0] ;
         A1798BarDibCli = P05GT3_A1798BarDibCli[0] ;
         A2010BarTipDis = P05GT3_A2010BarTipDis[0] ;
         A159BarFecGen = P05GT3_A159BarFecGen[0] ;
         A279CliNom = P05GT3_A279CliNom[0] ;
         A130BarCodPar = P05GT3_A130BarCodPar[0] ;
         A132BarCodReo = P05GT3_A132BarCodReo[0] ;
         A129BarCod = P05GT3_A129BarCod[0] ;
         A184BarMtr = P05GT3_A184BarMtr[0] ;
         n184BarMtr = P05GT3_n184BarMtr[0] ;
         A279CliNom = P05GT3_A279CliNom[0] ;
         A184BarMtr = P05GT3_A184BarMtr[0] ;
         n184BarMtr = P05GT3_n184BarMtr[0] ;
         if ( GXutil.strcmp(A2010BarTipDis, httpContext.getMessage( "S", "")) == 0 )
         {
            if ( ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "PRENDAS", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "SEPARACI", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "GRABACIO", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "MUESTRAS", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "GRAB+MUE", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "SOLOMUES", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "SOLOPREN", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "SEP+GRAB", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "AGRABAR", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "CON-GRAN", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "DIGPAPEL", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "CON-PREN", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "DIGTELA", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "PRETRATA", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "DIGITAL", "")) != 0 ) && ( GXutil.strcmp(A143BarDisNum, httpContext.getMessage( "MULTIDNO", "")) != 0 ) )
            {
               AV16NumHdrs = (long)(AV16NumHdrs+1) ;
               AV25Control = A1798BarDibCli + ";" + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + ";" + GXutil.str( A184BarMtr, 9, 2) + ";" + localUtil.dtoc( A159BarFecGen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + ";" + A279CliNom + ";" + A143BarDisNum ;
               GXt_int1 = AV26stat ;
               GXv_int2[0] = GXt_int1 ;
               new app.core.fputs(remoteHandle, context).execute( AV24hnd, AV25Control, GXv_int2) ;
               pefechdrs.this.GXt_int1 = GXv_int2[0] ;
               AV26stat = GXt_int1 ;
               System.out.println( AV25Control );
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pefechdrs.this.A396EmprCod;
      this.aP1[0] = pefechdrs.this.AV27BarDibCli;
      this.aP2[0] = pefechdrs.this.AV17year;
      this.aP3[0] = pefechdrs.this.AV18mes;
      this.aP4[0] = pefechdrs.this.AV16NumHdrs;
      this.aP5[0] = pefechdrs.this.AV20Fec1;
      this.aP6[0] = pefechdrs.this.AV21Fec2;
      this.aP7[0] = pefechdrs.this.AV24hnd;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV22Fecalfa = "" ;
      scmdbuf = "" ;
      P05GT3_A252CliCod = new int[1] ;
      P05GT3_n252CliCod = new boolean[] {false} ;
      P05GT3_A396EmprCod = new String[] {""} ;
      P05GT3_A143BarDisNum = new String[] {""} ;
      P05GT3_A1798BarDibCli = new String[] {""} ;
      P05GT3_A2010BarTipDis = new String[] {""} ;
      P05GT3_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P05GT3_A279CliNom = new String[] {""} ;
      P05GT3_A130BarCodPar = new String[] {""} ;
      P05GT3_A132BarCodReo = new byte[1] ;
      P05GT3_A129BarCod = new int[1] ;
      P05GT3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05GT3_n184BarMtr = new boolean[] {false} ;
      A143BarDisNum = "" ;
      A1798BarDibCli = "" ;
      A2010BarTipDis = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A279CliNom = "" ;
      A130BarCodPar = "" ;
      A184BarMtr = DecimalUtil.ZERO ;
      AV25Control = "" ;
      GXv_int2 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pefechdrs__default(),
         new Object[] {
             new Object[] {
            P05GT3_A252CliCod, P05GT3_n252CliCod, P05GT3_A396EmprCod, P05GT3_A143BarDisNum, P05GT3_A1798BarDibCli, P05GT3_A2010BarTipDis, P05GT3_A159BarFecGen, P05GT3_A279CliNom, P05GT3_A130BarCodPar, P05GT3_A132BarCodReo,
            P05GT3_A129BarCod, P05GT3_A184BarMtr, P05GT3_n184BarMtr
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18mes ;
   private byte AV19mes2 ;
   private byte A132BarCodReo ;
   private byte AV26stat ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private short AV17year ;
   private short AV23year2 ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A129BarCod ;
   private long AV16NumHdrs ;
   private long AV24hnd ;
   private java.math.BigDecimal A184BarMtr ;
   private String A396EmprCod ;
   private String AV27BarDibCli ;
   private String AV22Fecalfa ;
   private String scmdbuf ;
   private String A143BarDisNum ;
   private String A1798BarDibCli ;
   private String A2010BarTipDis ;
   private String A279CliNom ;
   private String A130BarCodPar ;
   private java.util.Date AV20Fec1 ;
   private java.util.Date AV21Fec2 ;
   private java.util.Date A159BarFecGen ;
   private boolean n252CliCod ;
   private boolean n184BarMtr ;
   private String AV25Control ;
   private long[] aP7 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private short[] aP2 ;
   private byte[] aP3 ;
   private long[] aP4 ;
   private java.util.Date[] aP5 ;
   private java.util.Date[] aP6 ;
   private IDataStoreProvider pr_default ;
   private int[] P05GT3_A252CliCod ;
   private boolean[] P05GT3_n252CliCod ;
   private String[] P05GT3_A396EmprCod ;
   private String[] P05GT3_A143BarDisNum ;
   private String[] P05GT3_A1798BarDibCli ;
   private String[] P05GT3_A2010BarTipDis ;
   private java.util.Date[] P05GT3_A159BarFecGen ;
   private String[] P05GT3_A279CliNom ;
   private String[] P05GT3_A130BarCodPar ;
   private byte[] P05GT3_A132BarCodReo ;
   private int[] P05GT3_A129BarCod ;
   private java.math.BigDecimal[] P05GT3_A184BarMtr ;
   private boolean[] P05GT3_n184BarMtr ;
}

final  class pefechdrs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05GT3", "SELECT T1.CliCod, T1.EmprCod, T1.BarDisNum, T1.BarDibCli, T1.BarTipDis, T1.BarFecGen, T2.CliNom, T1.BarCodPar, T1.BarCodReo, T1.BarCod, COALESCE( T3.BarMtr, 0) AS BarMtr FROM ((TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.BarFecGen >= ?) AND (Not (rtrim(T1.BarDibCli) IS NULL AND NOT(T1.BarDibCli IS NULL))) AND (COALESCE( T3.BarMtr, 0) >= 300) AND (T1.BarFecGen <= ?) ORDER BY T1.EmprCod, T1.BarFecGen ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
      }
   }

}

