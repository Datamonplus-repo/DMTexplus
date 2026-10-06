package app.aeat ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class registraraeathistoricocfaven extends GXProcedure
{
   public registraraeathistoricocfaven( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( registraraeathistoricocfaven.class ), "" );
   }

   public registraraeathistoricocfaven( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             boolean[] aP2 )
   {
      registraraeathistoricocfaven.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        boolean[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             boolean[] aP2 ,
                             String[] aP3 )
   {
      registraraeathistoricocfaven.this.AV8xmlEnvio = aP0;
      registraraeathistoricocfaven.this.AV9xmlRespuesta = aP1;
      registraraeathistoricocfaven.this.aP2 = aP2;
      registraraeathistoricocfaven.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV33EmprCod ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerempresa(remoteHandle, context).execute( GXv_char2) ;
      registraraeathistoricocfaven.this.GXt_char1 = GXv_char2[0] ;
      AV33EmprCod = GXt_char1 ;
      AV32EstadoRegistroCollection.add("Correcto", 0);
      AV32EstadoRegistroCollection.add("Error", 0);
      AV32EstadoRegistroCollection.add("Failure", 0);
      AV29AEATXmlEnviado = AV8xmlEnvio ;
      AV30AEATXmlRespuesta = AV9xmlRespuesta ;
      AV15IsSuccess = false ;
      AV18RegistroFacturacionAlta.fromxml(AV8xmlEnvio, null, null);
      if ( AV18RegistroFacturacionAlta.getgxTv_SdtRegistroFacturacionAlta_Registro().size() > 0 )
      {
         AV17RespuestaRegistroFacturacionAlta.fromxml(AV9xmlRespuesta, null, null);
         AV23AEATReceptorNIF = AV18RegistroFacturacionAlta.getgxTv_SdtRegistroFacturacionAlta_Cabecera().getgxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor().getgxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor_Nif() ;
         GXt_dtime3 = AV31AEATFechaEnvio ;
         GXv_dtime4[0] = GXt_dtime3 ;
         new app.aeat.fechaiso8601todatetime(remoteHandle, context).execute( AV18RegistroFacturacionAlta.getgxTv_SdtRegistroFacturacionAlta_Cabecera().getgxTv_SdtRegistroFacturacionAlta_Cabecera_Fechaenvio(), GXv_dtime4) ;
         registraraeathistoricocfaven.this.GXt_dtime3 = GXv_dtime4[0] ;
         AV31AEATFechaEnvio = GXt_dtime3 ;
         AV26AEATEstadoRegistro = AV17RespuestaRegistroFacturacionAlta.getgxTv_SdtRespuestaRegistroFacturacionAlta_Estadoregistro() ;
         AV28AEATCSV = AV17RespuestaRegistroFacturacionAlta.getgxTv_SdtRespuestaRegistroFacturacionAlta_Csv() ;
         AV27AEATFRecepcion = AV17RespuestaRegistroFacturacionAlta.getgxTv_SdtRespuestaRegistroFacturacionAlta_Fecharecepcion() ;
         if ( AV32EstadoRegistroCollection.indexof(AV26AEATEstadoRegistro) > 0 )
         {
            AV39GXV1 = 1 ;
            while ( AV39GXV1 <= AV18RegistroFacturacionAlta.getgxTv_SdtRegistroFacturacionAlta_Registro().size() )
            {
               AV19RegistroFacturacionAltaRegistro = (app.aeat.SdtRegistroFacturacionAlta_RegistroItem)((app.aeat.SdtRegistroFacturacionAlta_RegistroItem)AV18RegistroFacturacionAlta.getgxTv_SdtRegistroFacturacionAlta_Registro().elementAt(-1+AV39GXV1));
               /* Execute user subroutine: 'LIMPIAR VARIABLES AEATHISTORICO' */
               S111 ();
               if ( returnInSub )
               {
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               AV21AEATNumeroFactura = AV19RegistroFacturacionAltaRegistro.getgxTv_SdtRegistroFacturacionAlta_RegistroItem_Cabecerafactura().getgxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Numeroseriefacturaemisor() ;
               if ( ! (GXutil.strcmp("", AV21AEATNumeroFactura)==0) )
               {
                  AV40GXLvl21 = (byte)(0) ;
                  /* Using cursor P0AIQ2 */
                  pr_default.execute(0, new Object[] {AV21AEATNumeroFactura});
                  while ( (pr_default.getStatus(0) != 101) )
                  {
                     A14379AEATEstado = P0AIQ2_A14379AEATEstado[0] ;
                     n14379AEATEstado = P0AIQ2_n14379AEATEstado[0] ;
                     A14381AEATNumero = P0AIQ2_A14381AEATNumero[0] ;
                     A14386AEATCSV = P0AIQ2_A14386AEATCSV[0] ;
                     n14386AEATCSV = P0AIQ2_n14386AEATCSV[0] ;
                     A14378AEATId = P0AIQ2_A14378AEATId[0] ;
                     A14380AEATFRecep = P0AIQ2_A14380AEATFRecep[0] ;
                     n14380AEATFRecep = P0AIQ2_n14380AEATFRecep[0] ;
                     AV40GXLvl21 = (byte)(1) ;
                     AV13MensajeProcesamiento += GXutil.format( httpContext.getMessage( "Factura %1, Se registra recibida con CSV: %2, Fecha: %3", ""), GXutil.trim( A14381AEATNumero), GXutil.trim( A14386AEATCSV), GXutil.trim( localUtil.ttoc( A14380AEATFRecep, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+GXutil.newLine( ), "", "", "", "", "", "") ;
                     pr_default.readNext(0);
                  }
                  pr_default.close(0);
                  if ( AV40GXLvl21 == 0 )
                  {
                     AV15IsSuccess = true ;
                     AV36FechaISO8601 = AV19RegistroFacturacionAltaRegistro.getgxTv_SdtRegistroFacturacionAlta_RegistroItem_Cabecerafactura().getgxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Fechaexpedicionfacturaemisor() ;
                     GXt_dtime3 = GXutil.resetTime( AV22AEATFExpedicion );
                     GXv_dtime4[0] = GXt_dtime3 ;
                     new app.aeat.fechaiso8601todatetime(remoteHandle, context).execute( AV36FechaISO8601, GXv_dtime4) ;
                     registraraeathistoricocfaven.this.GXt_dtime3 = GXv_dtime4[0] ;
                     AV22AEATFExpedicion = GXutil.resetTime(GXt_dtime3) ;
                     AV24AEATHuellaFactura = AV19RegistroFacturacionAltaRegistro.getgxTv_SdtRegistroFacturacionAlta_RegistroItem_Huellafactura() ;
                     AV25AEATAnteriorHuella = AV19RegistroFacturacionAltaRegistro.getgxTv_SdtRegistroFacturacionAlta_RegistroItem_Huellafacturaanterior() ;
                     AV26AEATEstadoRegistro = AV17RespuestaRegistroFacturacionAlta.getgxTv_SdtRespuestaRegistroFacturacionAlta_Estadoregistro() ;
                     /*
                        INSERT RECORD ON TABLE TXPAEATHi

                     */
                     A14381AEATNumero = AV21AEATNumeroFactura ;
                     A14382AEATFExped = AV22AEATFExpedicion ;
                     A14383AEATRecept = AV23AEATReceptorNIF ;
                     A14384AEATHuella = AV24AEATHuellaFactura ;
                     A14385AEATAnteri = AV25AEATAnteriorHuella ;
                     n14385AEATAnteri = false ;
                     A14379AEATEstado = AV26AEATEstadoRegistro ;
                     n14379AEATEstado = false ;
                     if ( GXutil.strcmp(AV26AEATEstadoRegistro, httpContext.getMessage( "Correcto", "")) == 0 )
                     {
                        A14386AEATCSV = AV28AEATCSV ;
                        n14386AEATCSV = false ;
                        A14380AEATFRecep = AV27AEATFRecepcion ;
                        n14380AEATFRecep = false ;
                     }
                     A14387AEATXmlEnv = AV8xmlEnvio ;
                     A14388AEATXmlRes = AV9xmlRespuesta ;
                     n14388AEATXmlRes = false ;
                     A14389AEATFechaE = AV31AEATFechaEnvio ;
                     /* Using cursor P0AIQ3 */
                     pr_default.execute(1, new Object[] {A14381AEATNumero, A14382AEATFExped, A14383AEATRecept, A14384AEATHuella, Boolean.valueOf(n14385AEATAnteri), A14385AEATAnteri, Boolean.valueOf(n14379AEATEstado), A14379AEATEstado, Boolean.valueOf(n14380AEATFRecep), A14380AEATFRecep, Boolean.valueOf(n14386AEATCSV), A14386AEATCSV, A14387AEATXmlEnv, Boolean.valueOf(n14388AEATXmlRes), A14388AEATXmlRes, A14389AEATFechaE});
                     /* Retrieving last key number assigned */
                     /* Using cursor P0AIQ4 */
                     pr_default.execute(2);
                     A14378AEATId = P0AIQ4_A14378AEATId[0] ;
                     pr_default.close(2);
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAEATHi");
                     if ( (pr_default.getStatus(1) == 1) )
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
                     AV35AEATId = A14378AEATId ;
                     Application.commitDataStores(context, remoteHandle, pr_default, "aeat.registraraeathistoricocfaven");
                     if ( GXutil.strcmp(AV26AEATEstadoRegistro, httpContext.getMessage( "Correcto", "")) == 0 )
                     {
                        AV34FacCod = (int)(GXutil.lval( GXutil.trim( AV20NumeroSerieFacturaEmisor))) ;
                        /* Optimized UPDATE. */
                        /* Using cursor P0AIQ5 */
                        String AV24AEATHuellaFactura9710Aux;
                        AV24AEATHuellaFactura9710Aux = AV24AEATHuellaFactura ;
                        pr_default.execute(3, new Object[] {AV24AEATHuellaFactura9710Aux, Long.valueOf(AV35AEATId), AV28AEATCSV, AV26AEATEstadoRegistro, AV33EmprCod, Integer.valueOf(AV34FacCod)});
                        if ( (pr_default.getStatus(3) != 101) )
                        {
                           AV40GXLvl21 = (byte)(1) ;
                        }
                        Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFAVEN");
                        /* End optimized UPDATE. */
                     }
                  }
               }
               AV39GXV1 = (int)(AV39GXV1+1) ;
            }
         }
         else
         {
            AV13MensajeProcesamiento = httpContext.getMessage( "XML Respuesta no reporta Estados: ", "") + AV32EstadoRegistroCollection.toJSonString(false) ;
         }
      }
      else
      {
         AV13MensajeProcesamiento = httpContext.getMessage( "Sin registros reportados en XML Enviado", "") ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'LIMPIAR VARIABLES AEATHISTORICO' Routine */
      returnInSub = false ;
      AV22AEATFExpedicion = GXutil.nullDate() ;
      AV24AEATHuellaFactura = "" ;
      AV25AEATAnteriorHuella = "" ;
   }

   protected void cleanup( )
   {
      this.aP2[0] = registraraeathistoricocfaven.this.AV15IsSuccess;
      this.aP3[0] = registraraeathistoricocfaven.this.AV13MensajeProcesamiento;
      Application.commitDataStores(context, remoteHandle, pr_default, "aeat.registraraeathistoricocfaven");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13MensajeProcesamiento = "" ;
      AV33EmprCod = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV32EstadoRegistroCollection = new GXSimpleCollection<String>(String.class, "internal", "");
      AV29AEATXmlEnviado = "" ;
      AV30AEATXmlRespuesta = "" ;
      AV18RegistroFacturacionAlta = new app.aeat.SdtRegistroFacturacionAlta(remoteHandle, context);
      AV17RespuestaRegistroFacturacionAlta = new app.aeat.SdtRespuestaRegistroFacturacionAlta(remoteHandle, context);
      AV23AEATReceptorNIF = "" ;
      AV31AEATFechaEnvio = GXutil.resetTime( GXutil.nullDate() );
      AV26AEATEstadoRegistro = "" ;
      AV28AEATCSV = "" ;
      AV27AEATFRecepcion = GXutil.resetTime( GXutil.nullDate() );
      AV19RegistroFacturacionAltaRegistro = new app.aeat.SdtRegistroFacturacionAlta_RegistroItem(remoteHandle, context);
      AV21AEATNumeroFactura = "" ;
      scmdbuf = "" ;
      P0AIQ2_A14379AEATEstado = new String[] {""} ;
      P0AIQ2_n14379AEATEstado = new boolean[] {false} ;
      P0AIQ2_A14381AEATNumero = new String[] {""} ;
      P0AIQ2_A14386AEATCSV = new String[] {""} ;
      P0AIQ2_n14386AEATCSV = new boolean[] {false} ;
      P0AIQ2_A14378AEATId = new long[1] ;
      P0AIQ2_A14380AEATFRecep = new java.util.Date[] {GXutil.nullDate()} ;
      P0AIQ2_n14380AEATFRecep = new boolean[] {false} ;
      A14379AEATEstado = "" ;
      A14381AEATNumero = "" ;
      A14386AEATCSV = "" ;
      A14380AEATFRecep = GXutil.resetTime( GXutil.nullDate() );
      AV36FechaISO8601 = "" ;
      AV22AEATFExpedicion = GXutil.nullDate() ;
      GXt_dtime3 = GXutil.resetTime( GXutil.nullDate() );
      GXv_dtime4 = new java.util.Date[1] ;
      AV24AEATHuellaFactura = "" ;
      AV25AEATAnteriorHuella = "" ;
      A14382AEATFExped = GXutil.nullDate() ;
      A14383AEATRecept = "" ;
      A14384AEATHuella = "" ;
      A14385AEATAnteri = "" ;
      A14387AEATXmlEnv = "" ;
      A14388AEATXmlRes = "" ;
      A14389AEATFechaE = GXutil.resetTime( GXutil.nullDate() );
      P0AIQ4_A14378AEATId = new long[1] ;
      Gx_emsg = "" ;
      AV20NumeroSerieFacturaEmisor = "" ;
      A9710FacFirDg = "" ;
      A14233FacMsgATc = "" ;
      A14231FacMsgATe = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.aeat.registraraeathistoricocfaven__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.aeat.registraraeathistoricocfaven__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.aeat.registraraeathistoricocfaven__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aeat.registraraeathistoricocfaven__default(),
         new Object[] {
             new Object[] {
            P0AIQ2_A14379AEATEstado, P0AIQ2_n14379AEATEstado, P0AIQ2_A14381AEATNumero, P0AIQ2_A14386AEATCSV, P0AIQ2_n14386AEATCSV, P0AIQ2_A14378AEATId, P0AIQ2_A14380AEATFRecep, P0AIQ2_n14380AEATFRecep
            }
            , new Object[] {
            }
            , new Object[] {
            P0AIQ4_A14378AEATId
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV40GXLvl21 ;
   private short Gx_err ;
   private int AV39GXV1 ;
   private int GX_INS1905 ;
   private int AV34FacCod ;
   private long A14378AEATId ;
   private long AV35AEATId ;
   private String AV33EmprCod ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String Gx_emsg ;
   private String A9710FacFirDg ;
   private java.util.Date AV31AEATFechaEnvio ;
   private java.util.Date AV27AEATFRecepcion ;
   private java.util.Date A14380AEATFRecep ;
   private java.util.Date GXt_dtime3 ;
   private java.util.Date GXv_dtime4[] ;
   private java.util.Date A14389AEATFechaE ;
   private java.util.Date AV22AEATFExpedicion ;
   private java.util.Date A14382AEATFExped ;
   private boolean AV15IsSuccess ;
   private boolean returnInSub ;
   private boolean n14379AEATEstado ;
   private boolean n14386AEATCSV ;
   private boolean n14380AEATFRecep ;
   private boolean n14385AEATAnteri ;
   private boolean n14388AEATXmlRes ;
   private String AV8xmlEnvio ;
   private String AV9xmlRespuesta ;
   private String AV29AEATXmlEnviado ;
   private String AV30AEATXmlRespuesta ;
   private String A14387AEATXmlEnv ;
   private String A14388AEATXmlRes ;
   private String AV13MensajeProcesamiento ;
   private String AV23AEATReceptorNIF ;
   private String AV26AEATEstadoRegistro ;
   private String AV28AEATCSV ;
   private String AV21AEATNumeroFactura ;
   private String A14379AEATEstado ;
   private String A14381AEATNumero ;
   private String A14386AEATCSV ;
   private String AV36FechaISO8601 ;
   private String AV24AEATHuellaFactura ;
   private String AV25AEATAnteriorHuella ;
   private String A14383AEATRecept ;
   private String A14384AEATHuella ;
   private String A14385AEATAnteri ;
   private String AV20NumeroSerieFacturaEmisor ;
   private String A14233FacMsgATc ;
   private String A14231FacMsgATe ;
   private String[] aP3 ;
   private boolean[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AIQ2_A14379AEATEstado ;
   private boolean[] P0AIQ2_n14379AEATEstado ;
   private String[] P0AIQ2_A14381AEATNumero ;
   private String[] P0AIQ2_A14386AEATCSV ;
   private boolean[] P0AIQ2_n14386AEATCSV ;
   private long[] P0AIQ2_A14378AEATId ;
   private java.util.Date[] P0AIQ2_A14380AEATFRecep ;
   private boolean[] P0AIQ2_n14380AEATFRecep ;
   private long[] P0AIQ4_A14378AEATId ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private GXSimpleCollection<String> AV32EstadoRegistroCollection ;
   private app.aeat.SdtRespuestaRegistroFacturacionAlta AV17RespuestaRegistroFacturacionAlta ;
   private app.aeat.SdtRegistroFacturacionAlta AV18RegistroFacturacionAlta ;
   private app.aeat.SdtRegistroFacturacionAlta_RegistroItem AV19RegistroFacturacionAltaRegistro ;
}

final  class registraraeathistoricocfaven__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class registraraeathistoricocfaven__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class registraraeathistoricocfaven__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class registraraeathistoricocfaven__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AIQ2", "SELECT AEATEstado, AEATNumero, AEATCSV, AEATId, AEATFRecep FROM TXPAEATHi WHERE (AEATEstado = 'Correcto') AND (AEATNumero = ?) ORDER BY AEATEstado, AEATFRecep DESC, AEATId DESC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0AIQ3", "INSERT INTO TXPAEATHi(AEATNumero, AEATFExped, AEATRecept, AEATHuella, AEATAnteri, AEATEstado, AEATFRecep, AEATCSV, AEATXmlEnv, AEATXmlRes, AEATFechaE) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPAEATHi")
         ,new ForEachCursor("P0AIQ4", "SELECT AEATId.CURRVAL FROM DUAL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0AIQ5", "UPDATE TXPCFAVEN SET FacFirDg=?, FacMsgATd=RTRIM(LTRIM(SUBSTR(TO_CHAR(?,'999999999999999990'), 2))), FacMsgATc=?, FacMsgATe=?  WHERE (EmprCod = ? and FacCod = ?) AND (FacCod > 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFAVEN")
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
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((long[]) buf[5])[0] = rslt.getLong(4);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 2 :
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
               stmt.setVarchar(1, (String)parms[0], 100);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 100, false);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setVarchar(3, (String)parms[2], 100, false);
               stmt.setVarchar(4, (String)parms[3], 100, false);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[5], 100);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[7], 100);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[9], false);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[11], 100);
               }
               stmt.setLongVarchar(9, (String)parms[12], false);
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(10, (String)parms[14]);
               }
               stmt.setDateTime(11, (java.util.Date)parms[15], false);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 200);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 200, false);
               stmt.setVarchar(4, (String)parms[3], 200, false);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
      }
   }

}

