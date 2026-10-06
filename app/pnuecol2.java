package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnuecol2 extends GXProcedure
{
   public pnuecol2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnuecol2.class ), "" );
   }

   public pnuecol2( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 ,
                             byte[] aP7 ,
                             String[] aP8 ,
                             int[] aP9 ,
                             String[] aP10 )
   {
      pnuecol2.this.aP11 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
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
                        int[] aP9 ,
                        String[] aP10 ,
                        String[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
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
                             int[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 )
   {
      pnuecol2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnuecol2.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pnuecol2.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pnuecol2.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pnuecol2.this.AV15BarSer = aP4[0];
      this.aP4 = aP4;
      pnuecol2.this.AV16ColNom = aP5[0];
      this.aP5 = aP5;
      pnuecol2.this.AV17ColNum = aP6[0];
      this.aP6 = aP6;
      pnuecol2.this.AV18TipCol = aP7[0];
      this.aP7 = aP7;
      pnuecol2.this.AV21BARNOMCLI = aP8[0];
      this.aP8 = aP8;
      pnuecol2.this.AV22BARNUMCLI = aP9[0];
      this.aP9 = aP9;
      pnuecol2.this.AV24Usurcod = aP10[0];
      this.aP10 = aP10;
      pnuecol2.this.AV25Station = aP11[0];
      this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV27Coleccion ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VERCAR", ""), GXv_int2) ;
      pnuecol2.this.GXt_int1 = GXv_int2[0] ;
      AV27Coleccion = GXt_int1 ;
      /* Using cursor P02YA2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P02YA2_A252CliCod[0] ;
         n252CliCod = P02YA2_n252CliCod[0] ;
         A218BarTipCol = P02YA2_A218BarTipCol[0] ;
         A136BarColNum = P02YA2_A136BarColNum[0] ;
         A135BarColNom = P02YA2_A135BarColNom[0] ;
         A212BarSer = P02YA2_A212BarSer[0] ;
         A2454BarGirar = P02YA2_A2454BarGirar[0] ;
         A921BarMatiz = P02YA2_A921BarMatiz[0] ;
         A1234BarNomCli = P02YA2_A1234BarNomCli[0] ;
         A1235BarNumCli = P02YA2_A1235BarNumCli[0] ;
         A213BarSit = P02YA2_A213BarSit[0] ;
         A193BarOpeEsp = P02YA2_A193BarOpeEsp[0] ;
         GXv_char3[0] = A396EmprCod ;
         GXv_int4[0] = A252CliCod ;
         GXv_char5[0] = AV15BarSer ;
         GXv_char6[0] = AV16ColNom ;
         GXv_int7[0] = AV17ColNum ;
         GXv_int2[0] = AV18TipCol ;
         GXv_int8[0] = AV19Matiz ;
         new app.pbuscmat(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_char5, GXv_char6, GXv_int7, GXv_int2, GXv_int8) ;
         pnuecol2.this.A396EmprCod = GXv_char3[0] ;
         pnuecol2.this.A252CliCod = GXv_int4[0] ;
         pnuecol2.this.AV15BarSer = GXv_char5[0] ;
         pnuecol2.this.AV16ColNom = GXv_char6[0] ;
         pnuecol2.this.AV17ColNum = GXv_int7[0] ;
         pnuecol2.this.AV18TipCol = GXv_int2[0] ;
         pnuecol2.this.AV19Matiz = GXv_int8[0] ;
         if ( AV27Coleccion == 1 )
         {
            GXv_char6[0] = A396EmprCod ;
            GXv_int7[0] = A252CliCod ;
            GXv_char5[0] = AV15BarSer ;
            GXv_char3[0] = AV16ColNom ;
            GXv_int4[0] = AV17ColNum ;
            GXv_int2[0] = AV18TipCol ;
            GXv_char9[0] = AV26BarGirar ;
            new app.pcolcl5(remoteHandle, context).execute( GXv_char6, GXv_int7, GXv_char5, GXv_char3, GXv_int4, GXv_int2, GXv_char9) ;
            pnuecol2.this.A396EmprCod = GXv_char6[0] ;
            pnuecol2.this.A252CliCod = GXv_int7[0] ;
            pnuecol2.this.AV15BarSer = GXv_char5[0] ;
            pnuecol2.this.AV16ColNom = GXv_char3[0] ;
            pnuecol2.this.AV17ColNum = GXv_int4[0] ;
            pnuecol2.this.AV18TipCol = GXv_int2[0] ;
            pnuecol2.this.AV26BarGirar = GXv_char9[0] ;
         }
         AV23Texto_i = httpContext.getMessage( "Se ha cambiado el color a la HDR= ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
         AV23Texto_i += httpContext.getMessage( "Color Original Cliente/Articulo/Color/Numero/Tc= ", "") + GXutil.str( A252CliCod, 6, 0) + "/" + A212BarSer + "/" + A135BarColNom + "/" + GXutil.str( A136BarColNum, 6, 0) + "/" + GXutil.str( A218BarTipCol, 2, 0) ;
         AV23Texto_i += httpContext.getMessage( "Color Nuevo    Cliente/Articulo/Color/Numero/Tc= ", "") + GXutil.str( A252CliCod, 6, 0) + "/" + A212BarSer + "/" + AV16ColNom + "/" + GXutil.str( AV17ColNum, 6, 0) + "/" + GXutil.str( AV18TipCol, 2, 0) ;
         if ( AV27Coleccion == 1 )
         {
            AV23Texto_i += httpContext.getMessage( "Coleccion                                       = ", "") + GXutil.trim( A2454BarGirar) + httpContext.getMessage( " se cambia por ", "") + AV26BarGirar ;
         }
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV31Pgmname, AV24Usurcod, AV25Station, AV23Texto_i, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         A212BarSer = AV15BarSer ;
         A135BarColNom = AV16ColNom ;
         A136BarColNum = AV17ColNum ;
         A218BarTipCol = AV18TipCol ;
         A921BarMatiz = AV19Matiz ;
         A1234BarNomCli = AV21BARNOMCLI ;
         A1235BarNumCli = AV22BARNUMCLI ;
         A2454BarGirar = ((AV27Coleccion==1) ? AV26BarGirar : A2454BarGirar) ;
         if ( A213BarSit == 2 )
         {
            A213BarSit = (byte)(1) ;
            if ( A193BarOpeEsp == 4 )
            {
               A193BarOpeEsp = (byte)(0) ;
            }
         }
         /* Using cursor P02YA3 */
         pr_default.execute(1, new Object[] {Byte.valueOf(A218BarTipCol), Integer.valueOf(A136BarColNum), A135BarColNom, A212BarSer, A2454BarGirar, Short.valueOf(A921BarMatiz), A1234BarNomCli, Integer.valueOf(A1235BarNumCli), Byte.valueOf(A213BarSit), Byte.valueOf(A193BarOpeEsp), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnuecol2.this.A396EmprCod;
      this.aP1[0] = pnuecol2.this.A129BarCod;
      this.aP2[0] = pnuecol2.this.A132BarCodReo;
      this.aP3[0] = pnuecol2.this.A130BarCodPar;
      this.aP4[0] = pnuecol2.this.AV15BarSer;
      this.aP5[0] = pnuecol2.this.AV16ColNom;
      this.aP6[0] = pnuecol2.this.AV17ColNum;
      this.aP7[0] = pnuecol2.this.AV18TipCol;
      this.aP8[0] = pnuecol2.this.AV21BARNOMCLI;
      this.aP9[0] = pnuecol2.this.AV22BARNUMCLI;
      this.aP10[0] = pnuecol2.this.AV24Usurcod;
      this.aP11[0] = pnuecol2.this.AV25Station;
      Application.commitDataStores(context, remoteHandle, pr_default, "pnuecol2");
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
      P02YA2_A396EmprCod = new String[] {""} ;
      P02YA2_A129BarCod = new int[1] ;
      P02YA2_A132BarCodReo = new byte[1] ;
      P02YA2_A130BarCodPar = new String[] {""} ;
      P02YA2_A252CliCod = new int[1] ;
      P02YA2_n252CliCod = new boolean[] {false} ;
      P02YA2_A218BarTipCol = new byte[1] ;
      P02YA2_A136BarColNum = new int[1] ;
      P02YA2_A135BarColNom = new String[] {""} ;
      P02YA2_A212BarSer = new String[] {""} ;
      P02YA2_A2454BarGirar = new String[] {""} ;
      P02YA2_A921BarMatiz = new short[1] ;
      P02YA2_A1234BarNomCli = new String[] {""} ;
      P02YA2_A1235BarNumCli = new int[1] ;
      P02YA2_A213BarSit = new byte[1] ;
      P02YA2_A193BarOpeEsp = new byte[1] ;
      A135BarColNom = "" ;
      A212BarSer = "" ;
      A2454BarGirar = "" ;
      A1234BarNomCli = "" ;
      GXv_int8 = new short[1] ;
      GXv_char6 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_char5 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_int2 = new byte[1] ;
      AV26BarGirar = "" ;
      GXv_char9 = new String[1] ;
      AV23Texto_i = "" ;
      AV31Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnuecol2__default(),
         new Object[] {
             new Object[] {
            P02YA2_A396EmprCod, P02YA2_A129BarCod, P02YA2_A132BarCodReo, P02YA2_A130BarCodPar, P02YA2_A252CliCod, P02YA2_n252CliCod, P02YA2_A218BarTipCol, P02YA2_A136BarColNum, P02YA2_A135BarColNom, P02YA2_A212BarSer,
            P02YA2_A2454BarGirar, P02YA2_A921BarMatiz, P02YA2_A1234BarNomCli, P02YA2_A1235BarNumCli, P02YA2_A213BarSit, P02YA2_A193BarOpeEsp
            }
            , new Object[] {
            }
         }
      );
      AV31Pgmname = "PNUECOL2" ;
      /* GeneXus formulas. */
      AV31Pgmname = "PNUECOL2" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV18TipCol ;
   private byte AV27Coleccion ;
   private byte GXt_int1 ;
   private byte A218BarTipCol ;
   private byte A213BarSit ;
   private byte A193BarOpeEsp ;
   private byte GXv_int2[] ;
   private short A921BarMatiz ;
   private short AV19Matiz ;
   private short GXv_int8[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV17ColNum ;
   private int AV22BARNUMCLI ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int GXv_int7[] ;
   private int GXv_int4[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV15BarSer ;
   private String AV16ColNom ;
   private String AV21BARNOMCLI ;
   private String AV24Usurcod ;
   private String AV25Station ;
   private String scmdbuf ;
   private String A135BarColNom ;
   private String A212BarSer ;
   private String A2454BarGirar ;
   private String A1234BarNomCli ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char3[] ;
   private String AV26BarGirar ;
   private String GXv_char9[] ;
   private String AV31Pgmname ;
   private boolean n252CliCod ;
   private String AV23Texto_i ;
   private String[] aP11 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private int[] aP6 ;
   private byte[] aP7 ;
   private String[] aP8 ;
   private int[] aP9 ;
   private String[] aP10 ;
   private IDataStoreProvider pr_default ;
   private String[] P02YA2_A396EmprCod ;
   private int[] P02YA2_A129BarCod ;
   private byte[] P02YA2_A132BarCodReo ;
   private String[] P02YA2_A130BarCodPar ;
   private int[] P02YA2_A252CliCod ;
   private boolean[] P02YA2_n252CliCod ;
   private byte[] P02YA2_A218BarTipCol ;
   private int[] P02YA2_A136BarColNum ;
   private String[] P02YA2_A135BarColNom ;
   private String[] P02YA2_A212BarSer ;
   private String[] P02YA2_A2454BarGirar ;
   private short[] P02YA2_A921BarMatiz ;
   private String[] P02YA2_A1234BarNomCli ;
   private int[] P02YA2_A1235BarNumCli ;
   private byte[] P02YA2_A213BarSit ;
   private byte[] P02YA2_A193BarOpeEsp ;
}

final  class pnuecol2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02YA2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, CliCod, BarTipCol, BarColNum, BarColNom, BarSer, BarGirar, BarMatiz, BarNomCli, BarNumCli, BarSit, BarOpeEsp FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02YA3", "UPDATE TXPBARCAD SET BarTipCol=?, BarColNum=?, BarColNom=?, BarSer=?, BarGirar=?, BarMatiz=?, BarNomCli=?, BarNumCli=?, BarSit=?, BarOpeEsp=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((String[]) buf[9])[0] = rslt.getString(9, 16);
               ((String[]) buf[10])[0] = rslt.getString(10, 20);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 13);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
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
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 13);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setString(5, (String)parms[4], 20);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 13);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setString(11, (String)parms[10], 3);
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setString(14, (String)parms[13], 1);
               return;
      }
   }

}

