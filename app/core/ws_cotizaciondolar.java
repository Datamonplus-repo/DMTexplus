package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ws_cotizaciondolar extends GXProcedure
{
   public ws_cotizaciondolar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ws_cotizaciondolar.class ), "" );
   }

   public ws_cotizaciondolar( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( java.util.Date aP0 )
   {
      ws_cotizaciondolar.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( java.util.Date aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( java.util.Date aP0 ,
                             String[] aP1 )
   {
      ws_cotizaciondolar.this.AV8Fecha = aP0;
      ws_cotizaciondolar.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9FechaString = GXutil.str( GXutil.year( AV8Fecha), 10, 0) + "-" + GXutil.padl( GXutil.str( GXutil.month( AV8Fecha), 10, 0), (short)(2), "0") + "-" + GXutil.padl( GXutil.str( GXutil.day( AV8Fecha), 10, 0), (short)(2), "0") + httpContext.getMessage( "T", "") + "00:00:00.000" ;
      AV12URL = GXutil.format( "%1%2", httpContext.getMessage( "https://www.datos.gov.co/resource/32sa-8pi3.json?vigenciadesde=", ""), GXutil.trim( AV9FechaString), "", "", "", "", "", "", "") ;
      AV10httpClient.execute(httpContext.getMessage( "GET", ""), AV12URL);
      AV11Longvarchar = AV10httpClient.getString() ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = ws_cotizaciondolar.this.AV11Longvarchar;
      CloseOpenCursors();
      AV10httpClient.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11Longvarchar = "" ;
      AV9FechaString = "" ;
      AV12URL = "" ;
      AV10httpClient = new com.genexus.internet.HttpClient();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private java.util.Date AV8Fecha ;
   private String AV11Longvarchar ;
   private String AV9FechaString ;
   private String AV12URL ;
   private String[] aP1 ;
   private com.genexus.internet.HttpClient AV10httpClient ;
}

