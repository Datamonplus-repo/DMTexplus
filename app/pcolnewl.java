package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcolnewl extends GXProcedure
{
   public pcolnewl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcolnewl.class ), "" );
   }

   public pcolnewl( int remoteHandle ,
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
      pcolnewl.this.aP9 = new int[] {0};
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
      pcolnewl.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcolnewl.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pcolnewl.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pcolnewl.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pcolnewl.this.AV15BarSer = aP4[0];
      this.aP4 = aP4;
      pcolnewl.this.AV16ColNom = aP5[0];
      this.aP5 = aP5;
      pcolnewl.this.AV17ColNum = aP6[0];
      this.aP6 = aP6;
      pcolnewl.this.AV18TipCol = aP7[0];
      this.aP7 = aP7;
      pcolnewl.this.AV23BaNomcli = aP8[0];
      this.aP8 = aP8;
      pcolnewl.this.AV24BarNumCli = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV25Lindalana ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "LINDAL", ""), GXv_int2) ;
      pcolnewl.this.GXt_int1 = GXv_int2[0] ;
      AV25Lindalana = GXt_int1 ;
      GXt_int1 = AV30NoCliente ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "COLCUS", ""), GXv_int2) ;
      pcolnewl.this.GXt_int1 = GXv_int2[0] ;
      AV30NoCliente = GXt_int1 ;
      GXt_int1 = AV32moda21 ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int2) ;
      pcolnewl.this.GXt_int1 = GXv_int2[0] ;
      AV32moda21 = GXt_int1 ;
      GXt_char3 = AV28Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      pcolnewl.this.GXt_char3 = GXv_char4[0] ;
      AV28Station = GXt_char3 ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char5[0] = AV29EmprNom ;
      GXv_char6[0] = AV27UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV28Station, GXv_char4, GXv_char5, GXv_char6) ;
      pcolnewl.this.A396EmprCod = GXv_char4[0] ;
      pcolnewl.this.AV29EmprNom = GXv_char5[0] ;
      pcolnewl.this.AV27UsurCod = GXv_char6[0] ;
      /* Using cursor P03OW2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A135BarColNom = P03OW2_A135BarColNom[0] ;
         A136BarColNum = P03OW2_A136BarColNum[0] ;
         A252CliCod = P03OW2_A252CliCod[0] ;
         n252CliCod = P03OW2_n252CliCod[0] ;
         A212BarSer = P03OW2_A212BarSer[0] ;
         A218BarTipCol = P03OW2_A218BarTipCol[0] ;
         A1234BarNomCli = P03OW2_A1234BarNomCli[0] ;
         A1235BarNumCli = P03OW2_A1235BarNumCli[0] ;
         A2454BarGirar = P03OW2_A2454BarGirar[0] ;
         A921BarMatiz = P03OW2_A921BarMatiz[0] ;
         A5351BarObsGrm = P03OW2_A5351BarObsGrm[0] ;
         A213BarSit = P03OW2_A213BarSit[0] ;
         A193BarOpeEsp = P03OW2_A193BarOpeEsp[0] ;
         AV21ColNom1 = A135BarColNom ;
         AV22ColNum1 = A136BarColNum ;
         GXv_char6[0] = A396EmprCod ;
         GXv_int7[0] = A252CliCod ;
         GXv_char5[0] = AV15BarSer ;
         GXv_char4[0] = AV16ColNom ;
         GXv_int8[0] = AV17ColNum ;
         GXv_int2[0] = AV18TipCol ;
         GXv_int9[0] = AV19Matiz ;
         new app.pbuscmat(remoteHandle, context).execute( GXv_char6, GXv_int7, GXv_char5, GXv_char4, GXv_int8, GXv_int2, GXv_int9) ;
         pcolnewl.this.A396EmprCod = GXv_char6[0] ;
         pcolnewl.this.A252CliCod = GXv_int7[0] ;
         pcolnewl.this.AV15BarSer = GXv_char5[0] ;
         pcolnewl.this.AV16ColNom = GXv_char4[0] ;
         pcolnewl.this.AV17ColNum = GXv_int8[0] ;
         pcolnewl.this.AV18TipCol = GXv_int2[0] ;
         pcolnewl.this.AV19Matiz = GXv_int9[0] ;
         GXv_char6[0] = A396EmprCod ;
         GXv_int8[0] = A252CliCod ;
         GXv_char5[0] = AV15BarSer ;
         GXv_char4[0] = AV16ColNom ;
         GXv_int7[0] = AV17ColNum ;
         GXv_int2[0] = AV18TipCol ;
         GXv_char10[0] = AV31Fortonal ;
         new app.pbuston(remoteHandle, context).execute( GXv_char6, GXv_int8, GXv_char5, GXv_char4, GXv_int7, GXv_int2, GXv_char10) ;
         pcolnewl.this.A396EmprCod = GXv_char6[0] ;
         pcolnewl.this.A252CliCod = GXv_int8[0] ;
         pcolnewl.this.AV15BarSer = GXv_char5[0] ;
         pcolnewl.this.AV16ColNom = GXv_char4[0] ;
         pcolnewl.this.AV17ColNum = GXv_int7[0] ;
         pcolnewl.this.AV18TipCol = GXv_int2[0] ;
         pcolnewl.this.AV31Fortonal = GXv_char10[0] ;
         AV26Inc_obs = httpContext.getMessage( "Cambio Color", "") + GXutil.newLine( ) ;
         AV26Inc_obs += httpContext.getMessage( "Articulo = ", "") + GXutil.trim( A212BarSer) + " <- " + GXutil.trim( AV15BarSer) + GXutil.newLine( ) ;
         AV26Inc_obs += httpContext.getMessage( "Color    = ", "") + GXutil.trim( A135BarColNom) + " <- " + GXutil.trim( AV16ColNom) + GXutil.newLine( ) ;
         AV26Inc_obs += httpContext.getMessage( "Numero   = ", "") + GXutil.str( A136BarColNum, 6, 0) + " <- " + GXutil.str( AV17ColNum, 6, 0) + GXutil.newLine( ) ;
         AV26Inc_obs += httpContext.getMessage( "Tc       = ", "") + GXutil.str( A218BarTipCol, 2, 0) + " <- " + GXutil.str( AV18TipCol, 2, 0) + GXutil.newLine( ) ;
         if ( AV30NoCliente == 0 )
         {
            AV26Inc_obs += httpContext.getMessage( "Color Cli= ", "") + GXutil.trim( A1234BarNomCli) + " <- " + GXutil.trim( AV23BaNomcli) + GXutil.newLine( ) ;
            AV26Inc_obs += httpContext.getMessage( "NumeroCli= ", "") + GXutil.str( A1235BarNumCli, 6, 0) + " <- " + GXutil.str( AV24BarNumCli, 6, 0) + GXutil.newLine( ) ;
         }
         if ( AV32moda21 == 1 )
         {
            AV26Inc_obs += httpContext.getMessage( "Cartaz   = ", "") + A2454BarGirar + " <- " + AV31Fortonal + GXutil.newLine( ) ;
         }
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV36Pgmname, AV27UsurCod, AV28Station, AV26Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         A212BarSer = AV15BarSer ;
         A135BarColNom = AV16ColNom ;
         A136BarColNum = AV17ColNum ;
         A218BarTipCol = AV18TipCol ;
         A921BarMatiz = AV19Matiz ;
         if ( AV30NoCliente == 0 )
         {
            A1234BarNomCli = AV23BaNomcli ;
            A1235BarNumCli = AV24BarNumCli ;
         }
         if ( AV25Lindalana == 1 )
         {
            A5351BarObsGrm = AV23BaNomcli + GXutil.str( AV24BarNumCli, 6, 0) ;
         }
         A2454BarGirar = ((AV32moda21==1) ? AV31Fortonal : A2454BarGirar) ;
         if ( A213BarSit < 3 )
         {
            AV26Inc_obs = httpContext.getMessage( "Cambio Situacion= ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + GXutil.newLine( ) ;
            AV26Inc_obs += httpContext.getMessage( "Situacion ", "") + GXutil.str( A213BarSit, 2, 0) + " -> " + "1" + GXutil.newLine( ) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV36Pgmname, AV27UsurCod, AV28Station, AV26Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
            A213BarSit = (byte)(1) ;
            if ( A193BarOpeEsp == 4 )
            {
               A193BarOpeEsp = (byte)(0) ;
            }
         }
         /* Using cursor P03OW3 */
         pr_default.execute(1, new Object[] {A135BarColNom, Integer.valueOf(A136BarColNum), A212BarSer, Byte.valueOf(A218BarTipCol), A1234BarNomCli, Integer.valueOf(A1235BarNumCli), A2454BarGirar, Short.valueOf(A921BarMatiz), A5351BarObsGrm, Byte.valueOf(A213BarSit), Byte.valueOf(A193BarOpeEsp), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcolnewl.this.A396EmprCod;
      this.aP1[0] = pcolnewl.this.A129BarCod;
      this.aP2[0] = pcolnewl.this.A132BarCodReo;
      this.aP3[0] = pcolnewl.this.A130BarCodPar;
      this.aP4[0] = pcolnewl.this.AV15BarSer;
      this.aP5[0] = pcolnewl.this.AV16ColNom;
      this.aP6[0] = pcolnewl.this.AV17ColNum;
      this.aP7[0] = pcolnewl.this.AV18TipCol;
      this.aP8[0] = pcolnewl.this.AV23BaNomcli;
      this.aP9[0] = pcolnewl.this.AV24BarNumCli;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcolnewl");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV28Station = "" ;
      GXt_char3 = "" ;
      AV29EmprNom = "" ;
      AV27UsurCod = "" ;
      scmdbuf = "" ;
      P03OW2_A396EmprCod = new String[] {""} ;
      P03OW2_A129BarCod = new int[1] ;
      P03OW2_A132BarCodReo = new byte[1] ;
      P03OW2_A130BarCodPar = new String[] {""} ;
      P03OW2_A135BarColNom = new String[] {""} ;
      P03OW2_A136BarColNum = new int[1] ;
      P03OW2_A252CliCod = new int[1] ;
      P03OW2_n252CliCod = new boolean[] {false} ;
      P03OW2_A212BarSer = new String[] {""} ;
      P03OW2_A218BarTipCol = new byte[1] ;
      P03OW2_A1234BarNomCli = new String[] {""} ;
      P03OW2_A1235BarNumCli = new int[1] ;
      P03OW2_A2454BarGirar = new String[] {""} ;
      P03OW2_A921BarMatiz = new short[1] ;
      P03OW2_A5351BarObsGrm = new String[] {""} ;
      P03OW2_A213BarSit = new byte[1] ;
      P03OW2_A193BarOpeEsp = new byte[1] ;
      A135BarColNom = "" ;
      A212BarSer = "" ;
      A1234BarNomCli = "" ;
      A2454BarGirar = "" ;
      A5351BarObsGrm = "" ;
      AV21ColNom1 = "" ;
      GXv_int9 = new short[1] ;
      GXv_char6 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int2 = new byte[1] ;
      AV31Fortonal = "" ;
      GXv_char10 = new String[1] ;
      AV26Inc_obs = "" ;
      AV36Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcolnewl__default(),
         new Object[] {
             new Object[] {
            P03OW2_A396EmprCod, P03OW2_A129BarCod, P03OW2_A132BarCodReo, P03OW2_A130BarCodPar, P03OW2_A135BarColNom, P03OW2_A136BarColNum, P03OW2_A252CliCod, P03OW2_n252CliCod, P03OW2_A212BarSer, P03OW2_A218BarTipCol,
            P03OW2_A1234BarNomCli, P03OW2_A1235BarNumCli, P03OW2_A2454BarGirar, P03OW2_A921BarMatiz, P03OW2_A5351BarObsGrm, P03OW2_A213BarSit, P03OW2_A193BarOpeEsp
            }
            , new Object[] {
            }
         }
      );
      AV36Pgmname = "PCOLNEWl" ;
      /* GeneXus formulas. */
      AV36Pgmname = "PCOLNEWl" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV18TipCol ;
   private byte AV25Lindalana ;
   private byte AV30NoCliente ;
   private byte AV32moda21 ;
   private byte GXt_int1 ;
   private byte A218BarTipCol ;
   private byte A213BarSit ;
   private byte A193BarOpeEsp ;
   private byte GXv_int2[] ;
   private short A921BarMatiz ;
   private short AV19Matiz ;
   private short GXv_int9[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV17ColNum ;
   private int AV24BarNumCli ;
   private int A136BarColNum ;
   private int A252CliCod ;
   private int A1235BarNumCli ;
   private int AV22ColNum1 ;
   private int GXv_int8[] ;
   private int GXv_int7[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV15BarSer ;
   private String AV16ColNom ;
   private String AV23BaNomcli ;
   private String AV28Station ;
   private String GXt_char3 ;
   private String AV29EmprNom ;
   private String AV27UsurCod ;
   private String scmdbuf ;
   private String A135BarColNom ;
   private String A212BarSer ;
   private String A1234BarNomCli ;
   private String A2454BarGirar ;
   private String A5351BarObsGrm ;
   private String AV21ColNom1 ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String AV31Fortonal ;
   private String GXv_char10[] ;
   private String AV36Pgmname ;
   private boolean n252CliCod ;
   private String AV26Inc_obs ;
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
   private String[] P03OW2_A396EmprCod ;
   private int[] P03OW2_A129BarCod ;
   private byte[] P03OW2_A132BarCodReo ;
   private String[] P03OW2_A130BarCodPar ;
   private String[] P03OW2_A135BarColNom ;
   private int[] P03OW2_A136BarColNum ;
   private int[] P03OW2_A252CliCod ;
   private boolean[] P03OW2_n252CliCod ;
   private String[] P03OW2_A212BarSer ;
   private byte[] P03OW2_A218BarTipCol ;
   private String[] P03OW2_A1234BarNomCli ;
   private int[] P03OW2_A1235BarNumCli ;
   private String[] P03OW2_A2454BarGirar ;
   private short[] P03OW2_A921BarMatiz ;
   private String[] P03OW2_A5351BarObsGrm ;
   private byte[] P03OW2_A213BarSit ;
   private byte[] P03OW2_A193BarOpeEsp ;
}

final  class pcolnewl__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03OW2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarColNom, BarColNum, CliCod, BarSer, BarTipCol, BarNomCli, BarNumCli, BarGirar, BarMatiz, BarObsGrm, BarSit, BarOpeEsp FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03OW3", "UPDATE TXPBARCAD SET BarColNom=?, BarColNum=?, BarSer=?, BarTipCol=?, BarNomCli=?, BarNumCli=?, BarGirar=?, BarMatiz=?, BarObsGrm=?, BarSit=?, BarOpeEsp=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 13);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 20);
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 20);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((byte[]) buf[16])[0] = rslt.getByte(16);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 13);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setString(7, (String)parms[6], 20);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setString(9, (String)parms[8], 20);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setString(12, (String)parms[11], 3);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setString(15, (String)parms[14], 1);
               return;
      }
   }

}

