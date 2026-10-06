package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class obtenerqrcurl extends GXProcedure
{
   public obtenerqrcurl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( obtenerqrcurl.class ), "" );
   }

   public obtenerqrcurl( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 )
   {
      obtenerqrcurl.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             String[] aP1 )
   {
      obtenerqrcurl.this.AV21TextoGenerar = aP0;
      obtenerqrcurl.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14K = (short)(GXutil.len( AV21TextoGenerar)) ;
      if ( ! (0==AV14K) )
      {
         GXv_char1[0] = AV15PaginaGeneradora ;
         GXv_char2[0] = AV16PaginaImagenGenerada ;
         GXv_char3[0] = AV17PaginaImagenPNG ;
         GXv_char4[0] = AV20SecretKey ;
         GXv_char5[0] = AV11FormatoGenerarQRCode ;
         GXv_char6[0] = AV12FormatoUrlPNG ;
         GXv_char7[0] = AV10FormatoDeleteQrCodeManager ;
         new app.parametrosqrcodesitioqrc_es(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_char3, GXv_char4, GXv_char5, GXv_char6, GXv_char7) ;
         obtenerqrcurl.this.AV15PaginaGeneradora = GXv_char1[0] ;
         obtenerqrcurl.this.AV16PaginaImagenGenerada = GXv_char2[0] ;
         obtenerqrcurl.this.AV17PaginaImagenPNG = GXv_char3[0] ;
         obtenerqrcurl.this.AV20SecretKey = GXv_char4[0] ;
         obtenerqrcurl.this.AV11FormatoGenerarQRCode = GXv_char5[0] ;
         obtenerqrcurl.this.AV12FormatoUrlPNG = GXv_char6[0] ;
         obtenerqrcurl.this.AV10FormatoDeleteQrCodeManager = GXv_char7[0] ;
         /* Execute user subroutine: 'DETERMINAR QRCID' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'REALIZAR HTTPCLIENT PARA GENERAR QR CODE' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV9CargadoSDT = AV19SdtResultQRCode.fromJSonString(AV22TextoJSON, null) ;
         if ( AV9CargadoSDT )
         {
            AV18QrCodeManager = AV19SdtResultQRCode.getgxTv_SdtSdtResultQRCode_Result().getgxTv_SdtSdtQRCode_Qr() ;
            AV18QrCodeManager = GXutil.strReplace( AV18QrCodeManager, AV16PaginaImagenGenerada, "") ;
            if ( ! (GXutil.strcmp("", AV18QrCodeManager)==0) )
            {
               AV23TextoURL = GXutil.format( AV12FormatoUrlPNG, AV17PaginaImagenPNG, AV18QrCodeManager, "", "", "", "", "", "", "") ;
               AV26QrcURL = AV23TextoURL ;
               /* Execute user subroutine: 'ACTUALIZAR TABLE QRCODES' */
               S141 ();
               if ( returnInSub )
               {
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'REALIZAR HTTPCLIENT PARA GENERAR QR CODE' Routine */
      returnInSub = false ;
      AV13GenerarQRCode = GXutil.format( AV11FormatoGenerarQRCode, AV15PaginaGeneradora, AV20SecretKey, AV21TextoGenerar, "", "", "", "", "", "") ;
      AV8HttpClient.execute(httpContext.getMessage( "GET", ""), AV13GenerarQRCode);
      AV22TextoJSON = AV8HttpClient.getString() ;
   }

   public void S121( )
   {
      /* 'BORRAR CÓDIGO PARA OPTIMIZAR SERVICIO EN SITIO PAGO... QRC.ES' Routine */
      returnInSub = false ;
      AV13GenerarQRCode = GXutil.format( AV10FormatoDeleteQrCodeManager, AV15PaginaGeneradora, AV20SecretKey, AV18QrCodeManager, "", "", "", "", "", "") ;
      AV8HttpClient.execute(httpContext.getMessage( "GET", ""), AV13GenerarQRCode);
   }

   public void S131( )
   {
      /* 'DETERMINAR QRCID' Routine */
      returnInSub = false ;
      AV29GXLvl33 = (byte)(0) ;
      /* Using cursor P085V2 */
      pr_default.execute(0, new Object[] {AV21TextoGenerar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13692QrcTexto = P085V2_A13692QrcTexto[0] ;
         n13692QrcTexto = P085V2_n13692QrcTexto[0] ;
         A13689QrcNombre = P085V2_A13689QrcNombre[0] ;
         n13689QrcNombre = P085V2_n13689QrcNombre[0] ;
         A13688QrcID = P085V2_A13688QrcID[0] ;
         AV29GXLvl33 = (byte)(1) ;
         AV18QrCodeManager = A13689QrcNombre ;
         AV24QrcID = A13688QrcID ;
         /* Execute user subroutine: 'BORRAR CÓDIGO PARA OPTIMIZAR SERVICIO EN SITIO PAGO... QRC.ES' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV29GXLvl33 == 0 )
      {
         AV25QRCodesTotal = (short)(0) ;
         /* Using cursor P085V3 */
         pr_default.execute(1);
         while ( (pr_default.getStatus(1) != 101) )
         {
            A13689QrcNombre = P085V3_A13689QrcNombre[0] ;
            n13689QrcNombre = P085V3_n13689QrcNombre[0] ;
            A13688QrcID = P085V3_A13688QrcID[0] ;
            AV25QRCodesTotal = (short)(AV25QRCodesTotal+1) ;
            if ( AV25QRCodesTotal >= 3 )
            {
               AV18QrCodeManager = A13689QrcNombre ;
               /* Execute user subroutine: 'BORRAR CÓDIGO PARA OPTIMIZAR SERVICIO EN SITIO PAGO... QRC.ES' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  returnInSub = true;
                  if (true) return;
               }
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
   }

   public void S141( )
   {
      /* 'ACTUALIZAR TABLE QRCODES' Routine */
      returnInSub = false ;
      AV31GXLvl53 = (byte)(0) ;
      /* Using cursor P085V4 */
      pr_default.execute(2, new Object[] {Long.valueOf(AV24QrcID)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A13688QrcID = P085V4_A13688QrcID[0] ;
         A40000QrcImagen_ = P085V4_A40000QrcImagen_[0] ;
         n40000QrcImagen_ = P085V4_n40000QrcImagen_[0] ;
         A13689QrcNombre = P085V4_A13689QrcNombre[0] ;
         n13689QrcNombre = P085V4_n13689QrcNombre[0] ;
         A13690QrcURL = P085V4_A13690QrcURL[0] ;
         n13690QrcURL = P085V4_n13690QrcURL[0] ;
         A13691QrcImagen = P085V4_A13691QrcImagen[0] ;
         n13691QrcImagen = P085V4_n13691QrcImagen[0] ;
         A13692QrcTexto = P085V4_A13692QrcTexto[0] ;
         n13692QrcTexto = P085V4_n13692QrcTexto[0] ;
         AV31GXLvl53 = (byte)(1) ;
         A13689QrcNombre = AV18QrCodeManager ;
         n13689QrcNombre = false ;
         A13690QrcURL = AV26QrcURL ;
         n13690QrcURL = false ;
         A13691QrcImagen = AV26QrcURL ;
         n13691QrcImagen = false ;
         A40000QrcImagen_ = GXDbFile.pathToUrl( AV26QrcURL, context.getHttpContext()) ;
         n40000QrcImagen_ = false ;
         A13692QrcTexto = AV21TextoGenerar ;
         n13692QrcTexto = false ;
         /* Using cursor P085V5 */
         pr_default.execute(3, new Object[] {Boolean.valueOf(n13689QrcNombre), A13689QrcNombre, Boolean.valueOf(n13690QrcURL), A13690QrcURL, Boolean.valueOf(n13691QrcImagen), A13691QrcImagen, Boolean.valueOf(n13692QrcTexto), A13692QrcTexto, Boolean.valueOf(n40000QrcImagen_), A40000QrcImagen_, Long.valueOf(A13688QrcID)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("QRCodes");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      if ( AV31GXLvl53 == 0 )
      {
         /*
            INSERT RECORD ON TABLE QRCodes

         */
         A13689QrcNombre = AV18QrCodeManager ;
         n13689QrcNombre = false ;
         A13690QrcURL = AV26QrcURL ;
         n13690QrcURL = false ;
         A13691QrcImagen = AV26QrcURL ;
         n13691QrcImagen = false ;
         A40000QrcImagen_ = GXDbFile.pathToUrl( AV26QrcURL, context.getHttpContext()) ;
         n40000QrcImagen_ = false ;
         A13692QrcTexto = AV21TextoGenerar ;
         n13692QrcTexto = false ;
         /* Using cursor P085V6 */
         pr_default.execute(4, new Object[] {Boolean.valueOf(n13689QrcNombre), A13689QrcNombre, Boolean.valueOf(n13690QrcURL), A13690QrcURL, Boolean.valueOf(n13691QrcImagen), A13691QrcImagen, Boolean.valueOf(n40000QrcImagen_), A40000QrcImagen_, Boolean.valueOf(n13692QrcTexto), A13692QrcTexto});
         /* Retrieving last key number assigned */
         /* Using cursor P085V7 */
         pr_default.execute(5);
         A13688QrcID = P085V7_A13688QrcID[0] ;
         pr_default.close(5);
         Application.getSmartCacheProvider(remoteHandle).setUpdated("QRCodes");
         if ( (pr_default.getStatus(4) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
      }
   }

   protected void cleanup( )
   {
      this.aP1[0] = obtenerqrcurl.this.AV26QrcURL;
      Application.commitDataStores(context, remoteHandle, pr_default, "obtenerqrcurl");
      CloseOpenCursors();
      AV8HttpClient.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV26QrcURL = "" ;
      AV15PaginaGeneradora = "" ;
      GXv_char1 = new String[1] ;
      AV16PaginaImagenGenerada = "" ;
      GXv_char2 = new String[1] ;
      AV17PaginaImagenPNG = "" ;
      GXv_char3 = new String[1] ;
      AV20SecretKey = "" ;
      GXv_char4 = new String[1] ;
      AV11FormatoGenerarQRCode = "" ;
      GXv_char5 = new String[1] ;
      AV12FormatoUrlPNG = "" ;
      GXv_char6 = new String[1] ;
      AV10FormatoDeleteQrCodeManager = "" ;
      GXv_char7 = new String[1] ;
      AV22TextoJSON = "" ;
      AV19SdtResultQRCode = new app.SdtSdtResultQRCode(remoteHandle, context);
      AV18QrCodeManager = "" ;
      AV23TextoURL = "" ;
      AV13GenerarQRCode = "" ;
      AV8HttpClient = new com.genexus.internet.HttpClient();
      A13689QrcNombre = "" ;
      scmdbuf = "" ;
      P085V2_A13692QrcTexto = new String[] {""} ;
      P085V2_n13692QrcTexto = new boolean[] {false} ;
      P085V2_A13689QrcNombre = new String[] {""} ;
      P085V2_n13689QrcNombre = new boolean[] {false} ;
      P085V2_A13688QrcID = new long[1] ;
      A13692QrcTexto = "" ;
      P085V3_A13689QrcNombre = new String[] {""} ;
      P085V3_n13689QrcNombre = new boolean[] {false} ;
      P085V3_A13688QrcID = new long[1] ;
      A13691QrcImagen = "" ;
      A13690QrcURL = "" ;
      A40000QrcImagen_ = "" ;
      P085V4_A13688QrcID = new long[1] ;
      P085V4_A40000QrcImagen_ = new String[] {""} ;
      P085V4_n40000QrcImagen_ = new boolean[] {false} ;
      P085V4_A13689QrcNombre = new String[] {""} ;
      P085V4_n13689QrcNombre = new boolean[] {false} ;
      P085V4_A13690QrcURL = new String[] {""} ;
      P085V4_n13690QrcURL = new boolean[] {false} ;
      P085V4_A13691QrcImagen = new String[] {""} ;
      P085V4_n13691QrcImagen = new boolean[] {false} ;
      P085V4_A13692QrcTexto = new String[] {""} ;
      P085V4_n13692QrcTexto = new boolean[] {false} ;
      P085V7_A13688QrcID = new long[1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.obtenerqrcurl__default(),
         new Object[] {
             new Object[] {
            P085V2_A13692QrcTexto, P085V2_n13692QrcTexto, P085V2_A13689QrcNombre, P085V2_n13689QrcNombre, P085V2_A13688QrcID
            }
            , new Object[] {
            P085V3_A13689QrcNombre, P085V3_n13689QrcNombre, P085V3_A13688QrcID
            }
            , new Object[] {
            P085V4_A13688QrcID, P085V4_A40000QrcImagen_, P085V4_n40000QrcImagen_, P085V4_A13689QrcNombre, P085V4_n13689QrcNombre, P085V4_A13690QrcURL, P085V4_n13690QrcURL, P085V4_A13691QrcImagen, P085V4_n13691QrcImagen, P085V4_A13692QrcTexto,
            P085V4_n13692QrcTexto
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P085V7_A13688QrcID
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV29GXLvl33 ;
   private byte AV31GXLvl53 ;
   private short AV14K ;
   private short AV25QRCodesTotal ;
   private short Gx_err ;
   private int GX_INS1869 ;
   private long A13688QrcID ;
   private long AV24QrcID ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private String GXv_char7[] ;
   private String scmdbuf ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean AV9CargadoSDT ;
   private boolean n13692QrcTexto ;
   private boolean n13689QrcNombre ;
   private boolean n40000QrcImagen_ ;
   private boolean n13690QrcURL ;
   private boolean n13691QrcImagen ;
   private String AV21TextoGenerar ;
   private String AV26QrcURL ;
   private String AV15PaginaGeneradora ;
   private String AV16PaginaImagenGenerada ;
   private String AV17PaginaImagenPNG ;
   private String AV20SecretKey ;
   private String AV11FormatoGenerarQRCode ;
   private String AV12FormatoUrlPNG ;
   private String AV10FormatoDeleteQrCodeManager ;
   private String AV22TextoJSON ;
   private String AV18QrCodeManager ;
   private String AV23TextoURL ;
   private String AV13GenerarQRCode ;
   private String A13689QrcNombre ;
   private String A13692QrcTexto ;
   private String A13690QrcURL ;
   private String A40000QrcImagen_ ;
   private String A13691QrcImagen ;
   private app.SdtSdtResultQRCode AV19SdtResultQRCode ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P085V2_A13692QrcTexto ;
   private boolean[] P085V2_n13692QrcTexto ;
   private String[] P085V2_A13689QrcNombre ;
   private boolean[] P085V2_n13689QrcNombre ;
   private long[] P085V2_A13688QrcID ;
   private String[] P085V3_A13689QrcNombre ;
   private boolean[] P085V3_n13689QrcNombre ;
   private long[] P085V3_A13688QrcID ;
   private long[] P085V4_A13688QrcID ;
   private String[] P085V4_A40000QrcImagen_ ;
   private boolean[] P085V4_n40000QrcImagen_ ;
   private String[] P085V4_A13689QrcNombre ;
   private boolean[] P085V4_n13689QrcNombre ;
   private String[] P085V4_A13690QrcURL ;
   private boolean[] P085V4_n13690QrcURL ;
   private String[] P085V4_A13691QrcImagen ;
   private boolean[] P085V4_n13691QrcImagen ;
   private String[] P085V4_A13692QrcTexto ;
   private boolean[] P085V4_n13692QrcTexto ;
   private long[] P085V7_A13688QrcID ;
   private com.genexus.internet.HttpClient AV8HttpClient ;
}

final  class obtenerqrcurl__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P085V2", "SELECT * FROM (SELECT QrcTexto, QrcNombre, QrcID FROM QRCodes WHERE QrcTexto = ? ORDER BY QrcID) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P085V3", "SELECT QrcNombre, QrcID FROM QRCodes ORDER BY QrcID DESC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P085V4", "SELECT QrcID, QrcImagen_, QrcNombre, QrcURL, QrcImagen, QrcTexto FROM QRCodes WHERE QrcID = ? ORDER BY QrcID  FOR UPDATE OF QrcNombre, QrcURL, QrcImagen, QrcTexto, QrcImagen_ NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new BlobUpdateCursor("P085V5", "UPDATE QRCodes SET QrcNombre=?, QrcURL=?, QrcImagen='0', QrcTexto=?, QrcImagen_=?  WHERE QrcID = ?",
         "SELECT QrcImagen FROM QRCodes WHERE QrcID = ? FOR UPDATE", "upd", 5, GX_NOMASK + GX_MASKLOOPLOCK, "QRCodes")
         ,new BlobUpdateCursor("P085V6", "BEGIN INSERT INTO QRCodes(QrcNombre, QrcURL, QrcImagen, QrcImagen_, QrcTexto) VALUES(?, ?, '0', ?, ?)  RETURNING ROWID INTO ?; END;",
         "SELECT QrcImagen FROM QRCodes WHERE ROWID = ? FOR UPDATE", "ins", 4, GX_NOMASK + GX_MASKLOOPLOCK, "QRCodes")
         ,new ForEachCursor("P085V7", "SELECT QrcID.CURRVAL FROM DUAL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2);
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getMultimediaUri(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getMultimediaFile(5, rslt.getVarchar(2));
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
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
               stmt.setVarchar(1, (String)parms[0], 1024);
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 255);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 1000);
               }
               stmt.setBLOBFile(1, ((Boolean) parms[4]).booleanValue() ? null : (String)parms[5], true);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[7], 2048);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setGXDbFileURI(4, (String)parms[9], ((Boolean) parms[4]).booleanValue() ? null : (String)parms[5], 2048,"QRCodes","QrcImagen");
               }
               stmt.setLong(5, ((Number) parms[10]).longValue());
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 255);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 1000);
               }
               stmt.setBLOBFile(1, ((Boolean) parms[4]).booleanValue() ? null : (String)parms[5], true);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setGXDbFileURI(3, (String)parms[7], ((Boolean) parms[4]).booleanValue() ? null : (String)parms[5], 2048,"QRCodes","QrcImagen");
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[9], 2048);
               }
               return;
            case 65539 :
               stmt.setLong(1, ((Number) parms[10]).longValue());
               break;
      }
   }

}

