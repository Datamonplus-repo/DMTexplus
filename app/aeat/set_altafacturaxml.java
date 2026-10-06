package app.aeat ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class set_altafacturaxml extends GXProcedure
{
   public set_altafacturaxml( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( set_altafacturaxml.class ), "" );
   }

   public set_altafacturaxml( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( app.aeat.SdtRegistroFacturacionAlta aP0 )
   {
      set_altafacturaxml.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( app.aeat.SdtRegistroFacturacionAlta aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( app.aeat.SdtRegistroFacturacionAlta aP0 ,
                             String[] aP1 )
   {
      set_altafacturaxml.this.AV11RegistroFacturacionAlta = aP0;
      set_altafacturaxml.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8XMLWriter.openToString();
      AV8XMLWriter.writeStartDocument("", (byte)(0));
      AV8XMLWriter.writeStartElement(httpContext.getMessage( "soapenv:Envelope", ""));
      AV8XMLWriter.writeAttribute(httpContext.getMessage( "xmlns:soapenv", ""), httpContext.getMessage( "http://schemas.xmlsoap.org/soap/envelope/", ""));
      AV8XMLWriter.writeAttribute(httpContext.getMessage( "xmlns:sf", ""), httpContext.getMessage( "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroLR.xsd", ""));
      AV8XMLWriter.writeAttribute(httpContext.getMessage( "xmlns:sfi", ""), httpContext.getMessage( "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd", ""));
      AV8XMLWriter.writeStartElement(httpContext.getMessage( "soapenv:Header", ""));
      AV8XMLWriter.writeEndElement();
      AV8XMLWriter.writeStartElement(httpContext.getMessage( "soapenv:Body", ""));
      AV8XMLWriter.writeStartElement(httpContext.getMessage( "sf:RegFactuSistemaFacturacion", ""));
      AV8XMLWriter.writeStartElement(httpContext.getMessage( "sf:Cabecera", ""));
      AV8XMLWriter.writeStartElement(httpContext.getMessage( "sfi:ObligadoEmision", ""));
      AV8XMLWriter.writeElement(httpContext.getMessage( "sfi:NombreRazon", ""), httpContext.getMessage( "DATAMON PLUS S.L.", ""));
      AV8XMLWriter.writeElement(httpContext.getMessage( "sfi:NIF", ""), httpContext.getMessage( "B65104358", ""));
      AV8XMLWriter.writeEndElement();
      AV8XMLWriter.writeEndElement();
      AV8XMLWriter.writeStartElement(httpContext.getMessage( "sf:RegistroFactura", ""));
      AV8XMLWriter.writeStartElement(httpContext.getMessage( "sfi:RegistroAlta", ""));
      AV8XMLWriter.writeElement(httpContext.getMessage( "sfi:IDVersion", ""), "1.0");
      AV8XMLWriter.writeStartElement(httpContext.getMessage( "sfi:IDFactura", ""));
      AV8XMLWriter.writeElement(httpContext.getMessage( "sfi:IDEmisorFactura", ""), httpContext.getMessage( "B65104358", ""));
      AV8XMLWriter.writeElement(httpContext.getMessage( "sfi:NumSerieFactura", ""), "0002");
      AV8XMLWriter.writeElement(httpContext.getMessage( "sfi:FechaExpedicionFactura", ""), "01-07-2025");
      AV8XMLWriter.writeEndElement();
      AV8XMLWriter.writeElement(httpContext.getMessage( "sfi:NombreRazonEmisor", ""), httpContext.getMessage( "DATAMON PLUS S.L.", ""));
      AV8XMLWriter.writeElement(httpContext.getMessage( "sfi:TipoFactura", ""), httpContext.getMessage( "F1", ""));
      AV8XMLWriter.writeElement(httpContext.getMessage( "sfi:DescripcionOperacion", ""), httpContext.getMessage( "Teste interno de alta de fatura", ""));
      AV8XMLWriter.writeStartElement(httpContext.getMessage( "sfi:Destinatarios", ""));
      AV8XMLWriter.writeStartElement(httpContext.getMessage( "sfi:IDDestinatario", ""));
      AV8XMLWriter.writeElement(httpContext.getMessage( "sfi:NombreRazon", ""), httpContext.getMessage( "DATAMON PLUS S.L.", ""));
      AV8XMLWriter.writeElement(httpContext.getMessage( "sfi:NIF", ""), httpContext.getMessage( "B65104358", ""));
      AV8XMLWriter.writeEndElement();
      AV8XMLWriter.writeEndElement();
      AV8XMLWriter.writeStartElement(httpContext.getMessage( "sfi:Desglose", ""));
      AV8XMLWriter.writeStartElement(httpContext.getMessage( "sfi:DetalleDesglose", ""));
      AV8XMLWriter.writeElement(httpContext.getMessage( "sfi:ClaveRegimen", ""), "01");
      AV8XMLWriter.writeElement(httpContext.getMessage( "sfi:CalificacionOperacion", ""), httpContext.getMessage( "S1", ""));
      AV8XMLWriter.writeElement(httpContext.getMessage( "sfi:TipoImpositivo", ""), "21");
      AV8XMLWriter.writeElement(httpContext.getMessage( "sfi:BaseImponibleOimporteNoSujeto", ""), "100.00");
      AV8XMLWriter.writeElement(httpContext.getMessage( "sfi:CuotaRepercutida", ""), "21.00");
      AV8XMLWriter.writeEndElement();
      AV8XMLWriter.writeEndElement();
      AV8XMLWriter.writeElement(httpContext.getMessage( "sfi:CuotaTotal", ""), "21.00");
      AV8XMLWriter.writeElement(httpContext.getMessage( "sfi:ImporteTotal", ""), "121.00");
      AV8XMLWriter.writeStartElement(httpContext.getMessage( "sfi:Encadenamiento", ""));
      AV8XMLWriter.writeStartElement(httpContext.getMessage( "sfi:RegistroAnterior", ""));
      AV8XMLWriter.writeElement(httpContext.getMessage( "sfi:IDEmisorFactura", ""), httpContext.getMessage( "B65104358", ""));
      AV8XMLWriter.writeElement(httpContext.getMessage( "sfi:NumSerieFactura", ""), "0000");
      AV8XMLWriter.writeElement(httpContext.getMessage( "sfi:FechaExpedicionFactura", ""), "01-07-2025");
      AV8XMLWriter.writeElement(httpContext.getMessage( "sfi:Huella", ""), "0000000000000000000000000000000000000000000000000000000000000000");
      AV8XMLWriter.writeEndElement();
      AV8XMLWriter.writeEndElement();
      AV8XMLWriter.writeStartElement(httpContext.getMessage( "sfi:SistemaInformatico", ""));
      AV8XMLWriter.writeElement(httpContext.getMessage( "sfi:NombreRazon", ""), httpContext.getMessage( "DATAMON PLUS S.L.", ""));
      AV8XMLWriter.writeElement(httpContext.getMessage( "sfi:NIF", ""), httpContext.getMessage( "B65104358", ""));
      AV8XMLWriter.writeElement(httpContext.getMessage( "sfi:NombreSistemaInformatico", ""), httpContext.getMessage( "DMVeriFactu", ""));
      AV8XMLWriter.writeElement(httpContext.getMessage( "sfi:IdSistemaInformatico", ""), "77");
      AV8XMLWriter.writeElement(httpContext.getMessage( "sfi:Version", ""), "1.0.0");
      AV8XMLWriter.writeElement(httpContext.getMessage( "sfi:NumeroInstalacion", ""), "1");
      AV8XMLWriter.writeElement(httpContext.getMessage( "sfi:TipoUsoPosibleSoloVerifactu", ""), httpContext.getMessage( "S", ""));
      AV8XMLWriter.writeElement(httpContext.getMessage( "sfi:TipoUsoPosibleMultiOT", ""), httpContext.getMessage( "N", ""));
      AV8XMLWriter.writeElement(httpContext.getMessage( "sfi:IndicadorMultiplesOT", ""), httpContext.getMessage( "N", ""));
      AV8XMLWriter.writeEndElement();
      AV8XMLWriter.writeElement(httpContext.getMessage( "sfi:FechaHoraHusoGenRegistro", ""), httpContext.getMessage( "2025-07-01T15:00:00+02:00", ""));
      AV8XMLWriter.writeElement(httpContext.getMessage( "sfi:TipoHuella", ""), "01");
      AV8XMLWriter.writeElement(httpContext.getMessage( "sfi:Huella", ""), httpContext.getMessage( "65BF4D9D61860463B9DC2AA4C0ABCEEAE4869411369C47B80EA2AD27D61F9810", ""));
      AV8XMLWriter.writeEndElement();
      AV8XMLWriter.writeEndElement();
      AV8XMLWriter.writeEndElement();
      AV8XMLWriter.writeEndElement();
      AV8XMLWriter.writeEndElement();
      AV8XMLWriter.close();
      AV9XmlAltafactura = AV8XMLWriter.getResultingString() ;
      System.out.println( AV9XmlAltafactura );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = set_altafacturaxml.this.AV9XmlAltafactura;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9XmlAltafactura = "" ;
      AV8XMLWriter = new com.genexus.xml.XMLWriter();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV9XmlAltafactura ;
   private String[] aP1 ;
   private com.genexus.xml.XMLWriter AV8XMLWriter ;
   private app.aeat.SdtRegistroFacturacionAlta AV11RegistroFacturacionAlta ;
}

