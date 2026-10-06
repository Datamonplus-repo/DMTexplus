package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class parametrosqrcodesitioqrc_es extends GXProcedure
{
   public parametrosqrcodesitioqrc_es( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( parametrosqrcodesitioqrc_es.class ), "" );
   }

   public parametrosqrcodesitioqrc_es( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      parametrosqrcodesitioqrc_es.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      parametrosqrcodesitioqrc_es.this.aP0 = aP0;
      parametrosqrcodesitioqrc_es.this.aP1 = aP1;
      parametrosqrcodesitioqrc_es.this.aP2 = aP2;
      parametrosqrcodesitioqrc_es.this.aP3 = aP3;
      parametrosqrcodesitioqrc_es.this.aP4 = aP4;
      parametrosqrcodesitioqrc_es.this.aP5 = aP5;
      parametrosqrcodesitioqrc_es.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11PaginaGeneradora = httpContext.getMessage( "https://eavendano.qrc.es/api/", "") ;
      AV12PaginaImagenGenerada = httpContext.getMessage( "https://eavendano.qrc.es/i/", "") ;
      AV13PaginaImagenPNG = httpContext.getMessage( "https://eavendano.qrc.es/d/", "") ;
      AV14SecretKey = httpContext.getMessage( "901030f5862251a36884c62b4931ab9d", "") ;
      AV9FormatoGenerarQRCode = httpContext.getMessage( "%1short?secretkey=%2&url=%3&static=1", "") ;
      AV10FormatoUrlPNG = httpContext.getMessage( "%1%2/7/M/5/0", "") ;
      AV8FormatoDeleteQrCodeManager = httpContext.getMessage( "%1delete?secretkey=%2&shorturl=%3", "") ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = parametrosqrcodesitioqrc_es.this.AV11PaginaGeneradora;
      this.aP1[0] = parametrosqrcodesitioqrc_es.this.AV12PaginaImagenGenerada;
      this.aP2[0] = parametrosqrcodesitioqrc_es.this.AV13PaginaImagenPNG;
      this.aP3[0] = parametrosqrcodesitioqrc_es.this.AV14SecretKey;
      this.aP4[0] = parametrosqrcodesitioqrc_es.this.AV9FormatoGenerarQRCode;
      this.aP5[0] = parametrosqrcodesitioqrc_es.this.AV10FormatoUrlPNG;
      this.aP6[0] = parametrosqrcodesitioqrc_es.this.AV8FormatoDeleteQrCodeManager;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11PaginaGeneradora = "" ;
      AV12PaginaImagenGenerada = "" ;
      AV13PaginaImagenPNG = "" ;
      AV14SecretKey = "" ;
      AV9FormatoGenerarQRCode = "" ;
      AV10FormatoUrlPNG = "" ;
      AV8FormatoDeleteQrCodeManager = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV11PaginaGeneradora ;
   private String AV12PaginaImagenGenerada ;
   private String AV13PaginaImagenPNG ;
   private String AV14SecretKey ;
   private String AV9FormatoGenerarQRCode ;
   private String AV10FormatoUrlPNG ;
   private String AV8FormatoDeleteQrCodeManager ;
   private String[] aP6 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
}

