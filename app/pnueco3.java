package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnueco3 extends GXProcedure
{
   public pnueco3( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnueco3.class ), "" );
   }

   public pnueco3( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 ,
                          String[] aP4 ,
                          String[] aP5 ,
                          int[] aP6 ,
                          byte[] aP7 ,
                          String[] aP8 )
   {
      pnueco3.this.aP9 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        int[] aP6 ,
                        byte[] aP7 ,
                        String[] aP8 ,
                        int[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 ,
                             byte[] aP7 ,
                             String[] aP8 ,
                             int[] aP9 )
   {
      pnueco3.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnueco3.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pnueco3.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pnueco3.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pnueco3.this.AV15BarSer = aP4[0];
      this.aP4 = aP4;
      pnueco3.this.AV16ColNom = aP5[0];
      this.aP5 = aP5;
      pnueco3.this.AV17ColNum = aP6[0];
      this.aP6 = aP6;
      pnueco3.this.AV18TipCol = aP7[0];
      this.aP7 = aP7;
      pnueco3.this.AV29Barnomcli = aP8[0];
      this.aP8 = aP8;
      pnueco3.this.AV30BarNumcli = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV31Ccli ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NUECO3", ""), GXv_int2) ;
      pnueco3.this.GXt_int1 = GXv_int2[0] ;
      AV31Ccli = GXt_int1 ;
      GXt_int1 = AV33NoTC ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NOCHTC", ""), GXv_int2) ;
      pnueco3.this.GXt_int1 = GXv_int2[0] ;
      AV33NoTC = GXt_int1 ;
      GXt_int1 = AV34Coleccion ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VERCAR", ""), GXv_int2) ;
      pnueco3.this.GXt_int1 = GXv_int2[0] ;
      AV34Coleccion = GXt_int1 ;
      GXt_char3 = AV22Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      pnueco3.this.GXt_char3 = GXv_char4[0] ;
      AV22Station = GXt_char3 ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char5[0] = AV23EmprNom ;
      GXv_char6[0] = AV24Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char4, GXv_char5, GXv_char6) ;
      pnueco3.this.A396EmprCod = GXv_char4[0] ;
      pnueco3.this.AV23EmprNom = GXv_char5[0] ;
      pnueco3.this.AV24Usurcod = GXv_char6[0] ;
      /* Using cursor P040H2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P040H2_A252CliCod[0] ;
         n252CliCod = P040H2_n252CliCod[0] ;
         A135BarColNom = P040H2_A135BarColNom[0] ;
         A136BarColNum = P040H2_A136BarColNum[0] ;
         A218BarTipCol = P040H2_A218BarTipCol[0] ;
         A2454BarGirar = P040H2_A2454BarGirar[0] ;
         A921BarMatiz = P040H2_A921BarMatiz[0] ;
         A213BarSit = P040H2_A213BarSit[0] ;
         A193BarOpeEsp = P040H2_A193BarOpeEsp[0] ;
         A1234BarNomCli = P040H2_A1234BarNomCli[0] ;
         A1235BarNumCli = P040H2_A1235BarNumCli[0] ;
         AV25Barser_p = AV15BarSer ;
         AV26ColNom_p = AV16ColNom ;
         AV27ColNum_p = AV17ColNum ;
         AV28TipCol_p = AV18TipCol ;
         GXv_char6[0] = A396EmprCod ;
         GXv_int7[0] = A252CliCod ;
         GXv_char5[0] = AV25Barser_p ;
         GXv_char4[0] = AV26ColNom_p ;
         GXv_int8[0] = AV27ColNum_p ;
         GXv_int2[0] = AV28TipCol_p ;
         GXv_int9[0] = AV19Matiz ;
         new app.pbuscmat(remoteHandle, context).execute( GXv_char6, GXv_int7, GXv_char5, GXv_char4, GXv_int8, GXv_int2, GXv_int9) ;
         pnueco3.this.A396EmprCod = GXv_char6[0] ;
         pnueco3.this.A252CliCod = GXv_int7[0] ;
         pnueco3.this.AV25Barser_p = GXv_char5[0] ;
         pnueco3.this.AV26ColNom_p = GXv_char4[0] ;
         pnueco3.this.AV27ColNum_p = GXv_int8[0] ;
         pnueco3.this.AV28TipCol_p = GXv_int2[0] ;
         pnueco3.this.AV19Matiz = GXv_int9[0] ;
         if ( AV34Coleccion == 1 )
         {
            GXv_char6[0] = A396EmprCod ;
            GXv_int8[0] = A252CliCod ;
            GXv_char5[0] = AV25Barser_p ;
            GXv_char4[0] = AV26ColNom_p ;
            GXv_int7[0] = AV27ColNum_p ;
            GXv_int2[0] = AV28TipCol_p ;
            GXv_char10[0] = AV35BarGirar ;
            new app.pcolcl5(remoteHandle, context).execute( GXv_char6, GXv_int8, GXv_char5, GXv_char4, GXv_int7, GXv_int2, GXv_char10) ;
            pnueco3.this.A396EmprCod = GXv_char6[0] ;
            pnueco3.this.A252CliCod = GXv_int8[0] ;
            pnueco3.this.AV25Barser_p = GXv_char5[0] ;
            pnueco3.this.AV26ColNom_p = GXv_char4[0] ;
            pnueco3.this.AV27ColNum_p = GXv_int7[0] ;
            pnueco3.this.AV28TipCol_p = GXv_int2[0] ;
            pnueco3.this.AV35BarGirar = GXv_char10[0] ;
         }
         AV21Texto_i = httpContext.getMessage( "Cambio Color en Agrupadas ", "") + GXutil.newLine( ) ;
         AV21Texto_i += httpContext.getMessage( " Color  ", "") + A135BarColNom + httpContext.getMessage( " se cambia por ", "") + AV16ColNom + GXutil.newLine( ) ;
         AV21Texto_i += httpContext.getMessage( " Numero ", "") + GXutil.str( A136BarColNum, 6, 0) + httpContext.getMessage( " se cambia por ", "") + GXutil.str( AV17ColNum, 6, 0) + GXutil.newLine( ) ;
         if ( AV33NoTC == 0 )
         {
            AV21Texto_i += httpContext.getMessage( " Tc     ", "") + GXutil.str( A218BarTipCol, 2, 0) + httpContext.getMessage( " se cambia por ", "") + GXutil.str( AV18TipCol, 2, 0) + GXutil.newLine( ) ;
         }
         else
         {
            AV21Texto_i += httpContext.getMessage( " Tc     ", "") + GXutil.str( A218BarTipCol, 2, 0) + httpContext.getMessage( " se manteniene, no se cambia ", "") ;
         }
         if ( AV34Coleccion == 1 )
         {
            AV21Texto_i += httpContext.getMessage( "Coleccion                                       = ", "") + GXutil.trim( A2454BarGirar) + httpContext.getMessage( " se cambia por ", "") + AV35BarGirar ;
         }
         A135BarColNom = AV16ColNom ;
         A136BarColNum = AV17ColNum ;
         A218BarTipCol = ((AV33NoTC==1) ? A218BarTipCol : AV18TipCol) ;
         A921BarMatiz = AV19Matiz ;
         if ( A213BarSit < 3 )
         {
            AV32Inc_obs = httpContext.getMessage( "Agrupadas.Cambio Situacion= ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + GXutil.newLine( ) ;
            AV32Inc_obs += httpContext.getMessage( "Situacion ", "") + GXutil.str( A213BarSit, 2, 0) + " -> " + "1" + GXutil.newLine( ) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV39Pgmname, AV24Usurcod, AV22Station, AV32Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
            A213BarSit = (byte)(1) ;
            if ( A193BarOpeEsp == 4 )
            {
               A193BarOpeEsp = (byte)(0) ;
            }
         }
         if ( AV31Ccli == 1 )
         {
            A1234BarNomCli = AV29Barnomcli ;
            A1235BarNumCli = AV30BarNumcli ;
         }
         A2454BarGirar = ((AV34Coleccion==1) ? AV35BarGirar : A2454BarGirar) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV39Pgmname, AV24Usurcod, AV22Station, AV21Texto_i, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         /* Using cursor P040H3 */
         pr_default.execute(1, new Object[] {A135BarColNom, Integer.valueOf(A136BarColNum), Byte.valueOf(A218BarTipCol), A2454BarGirar, Short.valueOf(A921BarMatiz), Byte.valueOf(A213BarSit), Byte.valueOf(A193BarOpeEsp), A1234BarNomCli, Integer.valueOf(A1235BarNumCli), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnueco3.this.A396EmprCod;
      this.aP1[0] = pnueco3.this.A129BarCod;
      this.aP2[0] = pnueco3.this.A132BarCodReo;
      this.aP3[0] = pnueco3.this.A130BarCodPar;
      this.aP4[0] = pnueco3.this.AV15BarSer;
      this.aP5[0] = pnueco3.this.AV16ColNom;
      this.aP6[0] = pnueco3.this.AV17ColNum;
      this.aP7[0] = pnueco3.this.AV18TipCol;
      this.aP8[0] = pnueco3.this.AV29Barnomcli;
      this.aP9[0] = pnueco3.this.AV30BarNumcli;
      Application.commitDataStores(context, remoteHandle, pr_default, "pnueco3");
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
      GXt_char3 = "" ;
      AV23EmprNom = "" ;
      AV24Usurcod = "" ;
      scmdbuf = "" ;
      P040H2_A396EmprCod = new String[] {""} ;
      P040H2_A129BarCod = new int[1] ;
      P040H2_A132BarCodReo = new byte[1] ;
      P040H2_A130BarCodPar = new String[] {""} ;
      P040H2_A252CliCod = new int[1] ;
      P040H2_n252CliCod = new boolean[] {false} ;
      P040H2_A135BarColNom = new String[] {""} ;
      P040H2_A136BarColNum = new int[1] ;
      P040H2_A218BarTipCol = new byte[1] ;
      P040H2_A2454BarGirar = new String[] {""} ;
      P040H2_A921BarMatiz = new short[1] ;
      P040H2_A213BarSit = new byte[1] ;
      P040H2_A193BarOpeEsp = new byte[1] ;
      P040H2_A1234BarNomCli = new String[] {""} ;
      P040H2_A1235BarNumCli = new int[1] ;
      A135BarColNom = "" ;
      A2454BarGirar = "" ;
      A1234BarNomCli = "" ;
      AV25Barser_p = "" ;
      AV26ColNom_p = "" ;
      GXv_int9 = new short[1] ;
      GXv_char6 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int2 = new byte[1] ;
      AV35BarGirar = "" ;
      GXv_char10 = new String[1] ;
      AV21Texto_i = "" ;
      AV32Inc_obs = "" ;
      AV39Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnueco3__default(),
         new Object[] {
             new Object[] {
            P040H2_A396EmprCod, P040H2_A129BarCod, P040H2_A132BarCodReo, P040H2_A130BarCodPar, P040H2_A252CliCod, P040H2_n252CliCod, P040H2_A135BarColNom, P040H2_A136BarColNum, P040H2_A218BarTipCol, P040H2_A2454BarGirar,
            P040H2_A921BarMatiz, P040H2_A213BarSit, P040H2_A193BarOpeEsp, P040H2_A1234BarNomCli, P040H2_A1235BarNumCli
            }
            , new Object[] {
            }
         }
      );
      AV39Pgmname = "PNUECO3" ;
      /* GeneXus formulas. */
      AV39Pgmname = "PNUECO3" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV18TipCol ;
   private byte AV31Ccli ;
   private byte AV33NoTC ;
   private byte AV34Coleccion ;
   private byte GXt_int1 ;
   private byte A218BarTipCol ;
   private byte A213BarSit ;
   private byte A193BarOpeEsp ;
   private byte AV28TipCol_p ;
   private byte GXv_int2[] ;
   private short A921BarMatiz ;
   private short AV19Matiz ;
   private short GXv_int9[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV17ColNum ;
   private int AV30BarNumcli ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int AV27ColNum_p ;
   private int GXv_int8[] ;
   private int GXv_int7[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV15BarSer ;
   private String AV16ColNom ;
   private String AV29Barnomcli ;
   private String AV22Station ;
   private String GXt_char3 ;
   private String AV23EmprNom ;
   private String AV24Usurcod ;
   private String scmdbuf ;
   private String A135BarColNom ;
   private String A2454BarGirar ;
   private String A1234BarNomCli ;
   private String AV25Barser_p ;
   private String AV26ColNom_p ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String AV35BarGirar ;
   private String GXv_char10[] ;
   private String AV39Pgmname ;
   private boolean n252CliCod ;
   private String AV21Texto_i ;
   private String AV32Inc_obs ;
   private int[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private int[] aP6 ;
   private byte[] aP7 ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P040H2_A396EmprCod ;
   private int[] P040H2_A129BarCod ;
   private byte[] P040H2_A132BarCodReo ;
   private String[] P040H2_A130BarCodPar ;
   private int[] P040H2_A252CliCod ;
   private boolean[] P040H2_n252CliCod ;
   private String[] P040H2_A135BarColNom ;
   private int[] P040H2_A136BarColNum ;
   private byte[] P040H2_A218BarTipCol ;
   private String[] P040H2_A2454BarGirar ;
   private short[] P040H2_A921BarMatiz ;
   private byte[] P040H2_A213BarSit ;
   private byte[] P040H2_A193BarOpeEsp ;
   private String[] P040H2_A1234BarNomCli ;
   private int[] P040H2_A1235BarNumCli ;
}

final  class pnueco3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P040H2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, CliCod, BarColNom, BarColNum, BarTipCol, BarGirar, BarMatiz, BarSit, BarOpeEsp, BarNomCli, BarNumCli FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P040H3", "UPDATE TXPBARCAD SET BarColNom=?, BarColNum=?, BarTipCol=?, BarGirar=?, BarMatiz=?, BarSit=?, BarOpeEsp=?, BarNomCli=?, BarNumCli=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((String[]) buf[9])[0] = rslt.getString(9, 20);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
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
               stmt.setString(4, (String)parms[3], 20);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 13);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setString(10, (String)parms[9], 3);
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setString(13, (String)parms[12], 1);
               return;
      }
   }

}

