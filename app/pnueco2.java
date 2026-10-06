package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnueco2 extends GXProcedure
{
   public pnueco2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnueco2.class ), "" );
   }

   public pnueco2( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           String[] aP4 ,
                           String[] aP5 ,
                           int[] aP6 )
   {
      pnueco2.this.aP7 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        int[] aP6 ,
                        byte[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 ,
                             byte[] aP7 )
   {
      pnueco2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnueco2.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pnueco2.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pnueco2.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pnueco2.this.AV15BarSer = aP4[0];
      this.aP4 = aP4;
      pnueco2.this.AV16ColNom = aP5[0];
      this.aP5 = aP5;
      pnueco2.this.AV17ColNum = aP6[0];
      this.aP6 = aP6;
      pnueco2.this.AV18TipCol = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV22Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV23EmprNom ;
      GXv_char3[0] = AV24Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char1, GXv_char2, GXv_char3) ;
      pnueco2.this.A396EmprCod = GXv_char1[0] ;
      pnueco2.this.AV23EmprNom = GXv_char2[0] ;
      pnueco2.this.AV24Usurcod = GXv_char3[0] ;
      /* Using cursor P008Z2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P008Z2_A252CliCod[0] ;
         n252CliCod = P008Z2_n252CliCod[0] ;
         A135BarColNom = P008Z2_A135BarColNom[0] ;
         A136BarColNum = P008Z2_A136BarColNum[0] ;
         A218BarTipCol = P008Z2_A218BarTipCol[0] ;
         A921BarMatiz = P008Z2_A921BarMatiz[0] ;
         A213BarSit = P008Z2_A213BarSit[0] ;
         A193BarOpeEsp = P008Z2_A193BarOpeEsp[0] ;
         AV25Barser_p = AV15BarSer ;
         AV26ColNom_p = AV16ColNom ;
         AV27ColNum_p = AV17ColNum ;
         AV28TipCol_p = AV18TipCol ;
         GXv_char3[0] = A396EmprCod ;
         GXv_int4[0] = A252CliCod ;
         GXv_char2[0] = AV25Barser_p ;
         GXv_char1[0] = AV26ColNom_p ;
         GXv_int5[0] = AV27ColNum_p ;
         GXv_int6[0] = AV28TipCol_p ;
         GXv_int7[0] = AV19Matiz ;
         new app.pbuscmat(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_char2, GXv_char1, GXv_int5, GXv_int6, GXv_int7) ;
         pnueco2.this.A396EmprCod = GXv_char3[0] ;
         pnueco2.this.A252CliCod = GXv_int4[0] ;
         pnueco2.this.AV25Barser_p = GXv_char2[0] ;
         pnueco2.this.AV26ColNom_p = GXv_char1[0] ;
         pnueco2.this.AV27ColNum_p = GXv_int5[0] ;
         pnueco2.this.AV28TipCol_p = GXv_int6[0] ;
         pnueco2.this.AV19Matiz = GXv_int7[0] ;
         A135BarColNom = AV16ColNom ;
         A136BarColNum = AV17ColNum ;
         A218BarTipCol = AV18TipCol ;
         A921BarMatiz = AV19Matiz ;
         if ( A213BarSit == 2 )
         {
            AV29Inc_obs = httpContext.getMessage( "Cambio Situacion= ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + GXutil.newLine( ) ;
            AV29Inc_obs += httpContext.getMessage( "Situacion ", "") + GXutil.str( A213BarSit, 2, 0) + " -> " + "1" + GXutil.newLine( ) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV33Pgmname, AV24Usurcod, AV22Station, AV29Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
            A213BarSit = (byte)(1) ;
            if ( A193BarOpeEsp == 4 )
            {
               A193BarOpeEsp = (byte)(0) ;
            }
         }
         AV21Texto_i = httpContext.getMessage( "Cambio Color en Agrupadas ", "") + httpContext.getMessage( " Terminal ", "") + GXutil.trim( AV22Station) + httpContext.getMessage( " Usuario ", "") + GXutil.trim( AV24Usurcod) + httpContext.getMessage( " Dia ", "") + localUtil.dtoc( Gx_date, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + httpContext.getMessage( " Hora ", "") + Gx_time + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV33Pgmname, AV24Usurcod, AV22Station, AV21Texto_i, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         /* Using cursor P008Z3 */
         pr_default.execute(1, new Object[] {A135BarColNom, Integer.valueOf(A136BarColNum), Byte.valueOf(A218BarTipCol), Short.valueOf(A921BarMatiz), Byte.valueOf(A213BarSit), Byte.valueOf(A193BarOpeEsp), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnueco2.this.A396EmprCod;
      this.aP1[0] = pnueco2.this.A129BarCod;
      this.aP2[0] = pnueco2.this.A132BarCodReo;
      this.aP3[0] = pnueco2.this.A130BarCodPar;
      this.aP4[0] = pnueco2.this.AV15BarSer;
      this.aP5[0] = pnueco2.this.AV16ColNom;
      this.aP6[0] = pnueco2.this.AV17ColNum;
      this.aP7[0] = pnueco2.this.AV18TipCol;
      Application.commitDataStores(context, remoteHandle, pr_default, "pnueco2");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV22Station = "" ;
      AV23EmprNom = "" ;
      AV24Usurcod = "" ;
      scmdbuf = "" ;
      P008Z2_A396EmprCod = new String[] {""} ;
      P008Z2_A129BarCod = new int[1] ;
      P008Z2_A132BarCodReo = new byte[1] ;
      P008Z2_A130BarCodPar = new String[] {""} ;
      P008Z2_A252CliCod = new int[1] ;
      P008Z2_n252CliCod = new boolean[] {false} ;
      P008Z2_A135BarColNom = new String[] {""} ;
      P008Z2_A136BarColNum = new int[1] ;
      P008Z2_A218BarTipCol = new byte[1] ;
      P008Z2_A921BarMatiz = new short[1] ;
      P008Z2_A213BarSit = new byte[1] ;
      P008Z2_A193BarOpeEsp = new byte[1] ;
      A135BarColNom = "" ;
      AV25Barser_p = "" ;
      AV26ColNom_p = "" ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_char1 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_int7 = new short[1] ;
      AV29Inc_obs = "" ;
      AV33Pgmname = "" ;
      AV21Texto_i = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnueco2__default(),
         new Object[] {
             new Object[] {
            P008Z2_A396EmprCod, P008Z2_A129BarCod, P008Z2_A132BarCodReo, P008Z2_A130BarCodPar, P008Z2_A252CliCod, P008Z2_n252CliCod, P008Z2_A135BarColNom, P008Z2_A136BarColNum, P008Z2_A218BarTipCol, P008Z2_A921BarMatiz,
            P008Z2_A213BarSit, P008Z2_A193BarOpeEsp
            }
            , new Object[] {
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV33Pgmname = "Pnueco2" ;
      /* GeneXus formulas. */
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV33Pgmname = "Pnueco2" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV18TipCol ;
   private byte A218BarTipCol ;
   private byte A213BarSit ;
   private byte A193BarOpeEsp ;
   private byte AV28TipCol_p ;
   private byte GXv_int6[] ;
   private short A921BarMatiz ;
   private short AV19Matiz ;
   private short GXv_int7[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV17ColNum ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int AV27ColNum_p ;
   private int GXv_int4[] ;
   private int GXv_int5[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV15BarSer ;
   private String AV16ColNom ;
   private String AV22Station ;
   private String AV23EmprNom ;
   private String AV24Usurcod ;
   private String scmdbuf ;
   private String A135BarColNom ;
   private String AV25Barser_p ;
   private String AV26ColNom_p ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String AV33Pgmname ;
   private String Gx_time ;
   private java.util.Date Gx_date ;
   private boolean n252CliCod ;
   private String AV21Texto_i ;
   private String AV29Inc_obs ;
   private byte[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private int[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P008Z2_A396EmprCod ;
   private int[] P008Z2_A129BarCod ;
   private byte[] P008Z2_A132BarCodReo ;
   private String[] P008Z2_A130BarCodPar ;
   private int[] P008Z2_A252CliCod ;
   private boolean[] P008Z2_n252CliCod ;
   private String[] P008Z2_A135BarColNom ;
   private int[] P008Z2_A136BarColNum ;
   private byte[] P008Z2_A218BarTipCol ;
   private short[] P008Z2_A921BarMatiz ;
   private byte[] P008Z2_A213BarSit ;
   private byte[] P008Z2_A193BarOpeEsp ;
}

final  class pnueco2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P008Z2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, CliCod, BarColNom, BarColNum, BarTipCol, BarMatiz, BarSit, BarOpeEsp FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P008Z3", "UPDATE TXPBARCAD SET BarColNom=?, BarColNum=?, BarTipCol=?, BarMatiz=?, BarSit=?, BarOpeEsp=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
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
               stmt.setString(1, (String)parms[0], 13);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 1);
               return;
      }
   }

}

