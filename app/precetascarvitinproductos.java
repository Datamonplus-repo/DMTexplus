package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class precetascarvitinproductos extends GXProcedure
{
   public precetascarvitinproductos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( precetascarvitinproductos.class ), "" );
   }

   public precetascarvitinproductos( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            String[] aP1 ,
                            String[] aP2 ,
                            int[] aP3 ,
                            byte[] aP4 ,
                            String[] aP5 )
   {
      precetascarvitinproductos.this.aP6 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 ,
                        short[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             short[] aP6 )
   {
      precetascarvitinproductos.this.AV206EmprCod = aP0[0];
      this.aP0 = aP0;
      precetascarvitinproductos.this.AV225Dirp = aP1[0];
      this.aP1 = aP1;
      precetascarvitinproductos.this.AV235Dirp2 = aP2[0];
      this.aP2 = aP2;
      precetascarvitinproductos.this.AV226Barcod = aP3[0];
      this.aP3 = aP3;
      precetascarvitinproductos.this.AV227Barcodreo = aP4[0];
      this.aP4 = aP4;
      precetascarvitinproductos.this.AV228Barcodpar = aP5[0];
      this.aP5 = aP5;
      precetascarvitinproductos.this.AV229Reclinmaq = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV203UsurCod = " " ;
      GXt_char1 = AV204Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      precetascarvitinproductos.this.GXt_char1 = GXv_char2[0] ;
      AV204Station = GXt_char1 ;
      GXv_char2[0] = AV206EmprCod ;
      GXv_char3[0] = AV205EmprNom ;
      GXv_char4[0] = AV203UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV204Station, GXv_char2, GXv_char3, GXv_char4) ;
      precetascarvitinproductos.this.AV206EmprCod = GXv_char2[0] ;
      precetascarvitinproductos.this.AV205EmprNom = GXv_char3[0] ;
      precetascarvitinproductos.this.AV203UsurCod = GXv_char4[0] ;
      GXt_int5 = AV238VarSleep ;
      GXv_int6[0] = GXt_int5 ;
      new app.pbuscon(remoteHandle, context).execute( AV206EmprCod, httpContext.getMessage( "SEDTIM", ""), GXv_int6) ;
      precetascarvitinproductos.this.GXt_int5 = GXv_int6[0] ;
      AV238VarSleep = (short)(GXt_int5) ;
      AV238VarSleep = (short)(((AV238VarSleep==0) ? 0 : AV238VarSleep)) ;
      Gx_msg = "" ;
      AV244Inicio = GXutil.now( ) ;
      AV243Fin = GXutil.dtadd( AV244Inicio, AV238VarSleep) ;
      while ( AV243Fin.after( GXutil.now( ) ) )
      {
         AV244Inicio = GXutil.now( ) ;
         Gx_msg = "-> " + httpContext.getMessage( "Inicio= ", "") + localUtil.ttoc( AV244Inicio, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Espero...para inciar fichero PROD... ", "") + GXutil.newLine( ) ;
         Gx_msg += "-> " + httpContext.getMessage( "Fin= ", "") + localUtil.ttoc( AV243Fin, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + GXutil.newLine( ) ;
         System.out.println( Gx_msg );
      }
      AV224Dir = AV235Dirp2 ;
      AV182LenVar = (byte)(GXutil.len( AV224Dir)) ;
      AV224Dir = ((GXutil.strcmp(GXutil.substring( AV224Dir, AV182LenVar, 1), "\\")!=0) ? AV224Dir+"\\" : AV224Dir) ;
      AV235Dirp2 = GXutil.trim( AV224Dir) ;
      GXt_int5 = AV223Contval ;
      GXv_int6[0] = GXt_int5 ;
      new app.pnumdoc(remoteHandle, context).execute( AV206EmprCod, httpContext.getMessage( "SEDOCV", ""), GXv_int6) ;
      precetascarvitinproductos.this.GXt_int5 = GXv_int6[0] ;
      AV223Contval = GXt_int5 ;
      AV159FicA = GXutil.padl( GXutil.trim( GXutil.str( AV223Contval, 8, 0)), (short)(8), "0") ;
      AV137File = AV235Dirp2 ;
      AV247Filename = AV137File + AV159FicA + ".dat" ;
      AV246TextFile.setSource( AV247Filename );
      AV246TextFile.create();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV246TextFile.openWrite("");
      /* Execute user subroutine: 'CHECKSTATUS' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV230LastRecForNro = (byte)(0) ;
      AV231Npedidos = (byte)(1) ;
      /* Using cursor P08RP2 */
      pr_default.execute(0, new Object[] {AV206EmprCod, Integer.valueOf(AV226Barcod), Byte.valueOf(AV227Barcodreo), AV228Barcodpar, Short.valueOf(AV229Reclinmaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P08RP2_A719PrdNum[0] ;
         n719PrdNum = P08RP2_n719PrdNum[0] ;
         A2804RecLinMaq = P08RP2_A2804RecLinMaq[0] ;
         A130BarCodPar = P08RP2_A130BarCodPar[0] ;
         A132BarCodReo = P08RP2_A132BarCodReo[0] ;
         A129BarCod = P08RP2_A129BarCod[0] ;
         A396EmprCod = P08RP2_A396EmprCod[0] ;
         A2394RecForNro = P08RP2_A2394RecForNro[0] ;
         A1643PrdTip = P08RP2_A1643PrdTip[0] ;
         A872RecPrdNum = P08RP2_A872RecPrdNum[0] ;
         A875RecPrdDsc = P08RP2_A875RecPrdDsc[0] ;
         A5109RecNumInt = P08RP2_A5109RecNumInt[0] ;
         A686PrdCant = P08RP2_A686PrdCant[0] ;
         A811RecLin = P08RP2_A811RecLin[0] ;
         A1273RecLinPro = P08RP2_A1273RecLinPro[0] ;
         A1643PrdTip = P08RP2_A1643PrdTip[0] ;
         A5109RecNumInt = P08RP2_A5109RecNumInt[0] ;
         if ( ( AV230LastRecForNro != A2394RecForNro ) && ( A2394RecForNro > 0 ) && ( AV230LastRecForNro > 0 ) )
         {
            AV231Npedidos = (byte)(1) ;
         }
         AV233PrdTip = ((GXutil.strcmp(A1643PrdTip, httpContext.getMessage( "M", ""))==0) ? httpContext.getMessage( "M", "") : httpContext.getMessage( "A", "")) ;
         AV233PrdTip = ((GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 2), "10")>=0)&&(GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 2), "79")<=0)&&(GXutil.strcmp(AV245MoAColorantes, httpContext.getMessage( "M", ""))==0) ? httpContext.getMessage( "M", "") : AV233PrdTip) ;
         AV232DescProducto = GXutil.substring( A875RecPrdDsc, 1, 13) ;
         AV250TextFileLine = httpContext.getMessage( "\"PROD\"", "") + "," ;
         AV250TextFileLine += "\"" + GXutil.padl( GXutil.trim( GXutil.str( AV160Num_mq, 4, 0)), (short)(4), "0") + "\"" + "," ;
         if ( AV237ActOF9 == 0 )
         {
            AV250TextFileLine += "\"" + GXutil.padr( GXutil.trim( GXutil.str( A5109RecNumInt, 8, 0)), 8, " ") + "\"" + "," ;
         }
         else
         {
            AV250TextFileLine += "\"" + GXutil.padr( GXutil.trim( AV236Of9), 9, " ") + "\"" + "," ;
         }
         AV250TextFileLine += "\"" + GXutil.padl( GXutil.trim( GXutil.str( ((A2394RecForNro==0) ? AV230LastRecForNro : A2394RecForNro), 2, 0)), (short)(2), "0") + "\"" + "," ;
         AV250TextFileLine += "\"" + GXutil.padl( GXutil.trim( GXutil.str( AV231Npedidos, 2, 0)), (short)(2), "0") + "\"" + "," ;
         AV250TextFileLine += "\"" + GXutil.padr( GXutil.trim( A872RecPrdNum), 13, " ") + "\"" + "," ;
         AV250TextFileLine += "\"" + GXutil.padr( GXutil.trim( AV232DescProducto), 13, " ") + "\"" + "," ;
         AV250TextFileLine += "\"" + GXutil.padl( GXutil.trim( GXutil.str( A686PrdCant, 12, 1)), (short)(12), "0") + "\"" + "," ;
         AV250TextFileLine += "\"" + httpContext.getMessage( "g", "") + "\"" + "," ;
         AV250TextFileLine += "\"" + ((GXutil.strcmp(AV233PrdTip, httpContext.getMessage( "M", ""))==0) ? "1" : "0") + "\"" ;
         if ( GXutil.len( AV250TextFileLine) > 0 )
         {
            AV246TextFile.writeLine(AV250TextFileLine);
         }
         AV230LastRecForNro = ((A2394RecForNro==0) ? AV230LastRecForNro : A2394RecForNro) ;
         AV231Npedidos = (byte)(AV231Npedidos+1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV246TextFile.close();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( AV246TextFile.getErrCode() == 0 )
      {
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV249HttpResponse.addHeader("Content-Type", "text/csv");
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV249HttpResponse.addHeader("Content-Disposition", "attachment;filename=PRecetasCarvitinProductos.csv");
         }
         AV249HttpResponse.addFile(AV246TextFile.getAbsoluteName());
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV246TextFile.getErrCode() != 0 )
      {
         AV247Filename = "" ;
         AV248ErrorMessage = AV246TextFile.getErrDescription() ;
         AV246TextFile.close();
         AV249HttpResponse.addString(AV248ErrorMessage);
         returnInSub = true;
         if (true) return;
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = precetascarvitinproductos.this.AV206EmprCod;
      this.aP1[0] = precetascarvitinproductos.this.AV225Dirp;
      this.aP2[0] = precetascarvitinproductos.this.AV235Dirp2;
      this.aP3[0] = precetascarvitinproductos.this.AV226Barcod;
      this.aP4[0] = precetascarvitinproductos.this.AV227Barcodreo;
      this.aP5[0] = precetascarvitinproductos.this.AV228Barcodpar;
      this.aP6[0] = precetascarvitinproductos.this.AV229Reclinmaq;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV203UsurCod = "" ;
      AV204Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV205EmprNom = "" ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      Gx_msg = "" ;
      AV244Inicio = GXutil.resetTime( GXutil.nullDate() );
      AV243Fin = GXutil.resetTime( GXutil.nullDate() );
      AV224Dir = "" ;
      GXv_int6 = new int[1] ;
      AV159FicA = "" ;
      AV137File = "" ;
      AV247Filename = "" ;
      AV246TextFile = new com.genexus.util.GXFile();
      scmdbuf = "" ;
      P08RP2_A719PrdNum = new String[] {""} ;
      P08RP2_n719PrdNum = new boolean[] {false} ;
      P08RP2_A2804RecLinMaq = new short[1] ;
      P08RP2_A130BarCodPar = new String[] {""} ;
      P08RP2_A132BarCodReo = new byte[1] ;
      P08RP2_A129BarCod = new int[1] ;
      P08RP2_A396EmprCod = new String[] {""} ;
      P08RP2_A2394RecForNro = new byte[1] ;
      P08RP2_A1643PrdTip = new String[] {""} ;
      P08RP2_A872RecPrdNum = new String[] {""} ;
      P08RP2_A875RecPrdDsc = new String[] {""} ;
      P08RP2_A5109RecNumInt = new int[1] ;
      P08RP2_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RP2_A811RecLin = new short[1] ;
      P08RP2_A1273RecLinPro = new byte[1] ;
      A719PrdNum = "" ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A1643PrdTip = "" ;
      A872RecPrdNum = "" ;
      A875RecPrdDsc = "" ;
      A686PrdCant = DecimalUtil.ZERO ;
      AV233PrdTip = "" ;
      AV245MoAColorantes = "" ;
      AV232DescProducto = "" ;
      AV250TextFileLine = "" ;
      AV236Of9 = "" ;
      AV249HttpResponse = httpContext.getHttpResponse();
      AV248ErrorMessage = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.precetascarvitinproductos__default(),
         new Object[] {
             new Object[] {
            P08RP2_A719PrdNum, P08RP2_n719PrdNum, P08RP2_A2804RecLinMaq, P08RP2_A130BarCodPar, P08RP2_A132BarCodReo, P08RP2_A129BarCod, P08RP2_A396EmprCod, P08RP2_A2394RecForNro, P08RP2_A1643PrdTip, P08RP2_A872RecPrdNum,
            P08RP2_A875RecPrdDsc, P08RP2_A5109RecNumInt, P08RP2_A686PrdCant, P08RP2_A811RecLin, P08RP2_A1273RecLinPro
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV227Barcodreo ;
   private byte AV182LenVar ;
   private byte AV230LastRecForNro ;
   private byte AV231Npedidos ;
   private byte A132BarCodReo ;
   private byte A2394RecForNro ;
   private byte A1273RecLinPro ;
   private byte AV237ActOF9 ;
   private short AV229Reclinmaq ;
   private short AV238VarSleep ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short AV160Num_mq ;
   private short Gx_err ;
   private int AV226Barcod ;
   private int AV223Contval ;
   private int GXt_int5 ;
   private int GXv_int6[] ;
   private int A129BarCod ;
   private int A5109RecNumInt ;
   private java.math.BigDecimal A686PrdCant ;
   private String AV206EmprCod ;
   private String AV225Dirp ;
   private String AV235Dirp2 ;
   private String AV228Barcodpar ;
   private String AV203UsurCod ;
   private String AV204Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV205EmprNom ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String Gx_msg ;
   private String AV224Dir ;
   private String AV159FicA ;
   private String AV137File ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A1643PrdTip ;
   private String A872RecPrdNum ;
   private String A875RecPrdDsc ;
   private String AV233PrdTip ;
   private String AV245MoAColorantes ;
   private String AV232DescProducto ;
   private String AV236Of9 ;
   private java.util.Date AV244Inicio ;
   private java.util.Date AV243Fin ;
   private boolean returnInSub ;
   private boolean n719PrdNum ;
   private String AV250TextFileLine ;
   private String AV247Filename ;
   private String AV248ErrorMessage ;
   private com.genexus.util.GXFile AV246TextFile ;
   private short[] aP6 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private byte[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P08RP2_A719PrdNum ;
   private boolean[] P08RP2_n719PrdNum ;
   private short[] P08RP2_A2804RecLinMaq ;
   private String[] P08RP2_A130BarCodPar ;
   private byte[] P08RP2_A132BarCodReo ;
   private int[] P08RP2_A129BarCod ;
   private String[] P08RP2_A396EmprCod ;
   private byte[] P08RP2_A2394RecForNro ;
   private String[] P08RP2_A1643PrdTip ;
   private String[] P08RP2_A872RecPrdNum ;
   private String[] P08RP2_A875RecPrdDsc ;
   private int[] P08RP2_A5109RecNumInt ;
   private java.math.BigDecimal[] P08RP2_A686PrdCant ;
   private short[] P08RP2_A811RecLin ;
   private byte[] P08RP2_A1273RecLinPro ;
   private com.genexus.internet.HttpResponse AV249HttpResponse ;
}

final  class precetascarvitinproductos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08RP2", "SELECT T1.PrdNum, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.RecForNro, T2.PrdTip, T1.RecPrdNum, T1.RecPrdDsc, T3.RecNumInt, T1.PrdCant, T1.RecLin, T1.RecLinPro FROM ((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPRECMAQ T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar AND T3.RecLinMaq = T1.RecLinMaq) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?) AND (SUBSTR(T1.PrdNum, 1, 2) >= '10' and SUBSTR(T1.PrdNum, 1, 2) <= '99') ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,3);
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

