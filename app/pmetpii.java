package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmetpii extends GXProcedure
{
   public pmetpii( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmetpii.class ), "" );
   }

   public pmetpii( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 )
   {
      pmetpii.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 )
   {
      pmetpii.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmetpii.this.A2809MetTerCod = aP1[0];
      this.aP1 = aP1;
      pmetpii.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pmetpii.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pmetpii.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04NO2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2813MetPieCod = P04NO2_A2813MetPieCod[0] ;
         A2814MetPieKil = P04NO2_A2814MetPieKil[0] ;
         A2815MetPieMet = P04NO2_A2815MetPieMet[0] ;
         A6635MetPieAnc = P04NO2_A6635MetPieAnc[0] ;
         A4910MetPieMtD = P04NO2_A4910MetPieMtD[0] ;
         httpContext.popup(formatLink("app.retim21", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A2813MetPieCod)),GXutil.URLEncode(DecimalUtil.decToString(A2814MetPieKil)),GXutil.URLEncode(DecimalUtil.decToString(A2815MetPieMet)),GXutil.URLEncode(GXutil.ltrimstr(A6635MetPieAnc,3,0)),GXutil.URLEncode(DecimalUtil.decToString(A4910MetPieMtD)),GXutil.URLEncode(GXutil.rtrim(" ")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "PRN", "")))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","Metpiecod","Metpiekil","Metpiemet","MetPieAnc","MetPieMtd","MaqCod","Opecod","Output"}) , new Object[] {"A396EmprCod","A129BarCod","A132BarCodReo","A130BarCodPar","A2813MetPieCod","A2814MetPieKil","A2815MetPieMet","A6635MetPieAnc","A4910MetPieMtD","","",""});
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmetpii.this.A396EmprCod;
      this.aP1[0] = pmetpii.this.A2809MetTerCod;
      this.aP2[0] = pmetpii.this.A129BarCod;
      this.aP3[0] = pmetpii.this.A132BarCodReo;
      this.aP4[0] = pmetpii.this.A130BarCodPar;
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
      P04NO2_A396EmprCod = new String[] {""} ;
      P04NO2_A2809MetTerCod = new String[] {""} ;
      P04NO2_A129BarCod = new int[1] ;
      P04NO2_A132BarCodReo = new byte[1] ;
      P04NO2_A130BarCodPar = new String[] {""} ;
      P04NO2_A2813MetPieCod = new String[] {""} ;
      P04NO2_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04NO2_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04NO2_A6635MetPieAnc = new short[1] ;
      P04NO2_A4910MetPieMtD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A2813MetPieCod = "" ;
      A2814MetPieKil = DecimalUtil.ZERO ;
      A2815MetPieMet = DecimalUtil.ZERO ;
      A4910MetPieMtD = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmetpii__default(),
         new Object[] {
             new Object[] {
            P04NO2_A396EmprCod, P04NO2_A2809MetTerCod, P04NO2_A129BarCod, P04NO2_A132BarCodReo, P04NO2_A130BarCodPar, P04NO2_A2813MetPieCod, P04NO2_A2814MetPieKil, P04NO2_A2815MetPieMet, P04NO2_A6635MetPieAnc, P04NO2_A4910MetPieMtD
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A6635MetPieAnc ;
   private short Gx_err ;
   private int A129BarCod ;
   private java.math.BigDecimal A2814MetPieKil ;
   private java.math.BigDecimal A2815MetPieMet ;
   private java.math.BigDecimal A4910MetPieMtD ;
   private String A396EmprCod ;
   private String A2809MetTerCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A2813MetPieCod ;
   private String[] aP4 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P04NO2_A396EmprCod ;
   private String[] P04NO2_A2809MetTerCod ;
   private int[] P04NO2_A129BarCod ;
   private byte[] P04NO2_A132BarCodReo ;
   private String[] P04NO2_A130BarCodPar ;
   private String[] P04NO2_A2813MetPieCod ;
   private java.math.BigDecimal[] P04NO2_A2814MetPieKil ;
   private java.math.BigDecimal[] P04NO2_A2815MetPieMet ;
   private short[] P04NO2_A6635MetPieAnc ;
   private java.math.BigDecimal[] P04NO2_A4910MetPieMtD ;
}

final  class pmetpii__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04NO2", "SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieKil, MetPieMet, MetPieAnc, MetPieMtD FROM TXPLMETPI WHERE EmprCod = ? and MetTerCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
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
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

