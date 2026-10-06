package app.oliveiraegoncalves.v1 ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class apibaseurloliveiraegoncalves extends GXProcedure
{
   public apibaseurloliveiraegoncalves( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apibaseurloliveiraegoncalves.class ), "" );
   }

   public apibaseurloliveiraegoncalves( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 )
   {
      apibaseurloliveiraegoncalves.this.aP1 = new String[] {""};
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
      apibaseurloliveiraegoncalves.this.AV9PathAndMethod = aP0;
      apibaseurloliveiraegoncalves.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( ( GXutil.strcmp(AV9PathAndMethod, httpContext.getMessage( "/api/v1/Artigos/{artigo} - GET", "")) == 0 ) || ( GXutil.strcmp(AV9PathAndMethod, httpContext.getMessage( "/api/Auth/login - POST", "")) == 0 ) || ( GXutil.strcmp(AV9PathAndMethod, httpContext.getMessage( "/api/v1/Dashboard - GET", "")) == 0 ) || ( GXutil.strcmp(AV9PathAndMethod, httpContext.getMessage( "/api/v1/Encomendas - PUT", "")) == 0 ) || ( GXutil.strcmp(AV9PathAndMethod, httpContext.getMessage( "/api/v1/Encomendas/atribuirArtigo - PUT", "")) == 0 ) || ( GXutil.strcmp(AV9PathAndMethod, httpContext.getMessage( "/api/v1/Encomendas/de/{de}/ate/{ate}/estado/{estado} - GET", "")) == 0 ) || ( GXutil.strcmp(AV9PathAndMethod, httpContext.getMessage( "/api/v1/Encomendas/serie/{serie}/codDocumento/{codDocumento} - GET", "")) == 0 ) || ( GXutil.strcmp(AV9PathAndMethod, httpContext.getMessage( "/api/v1/GuiasRemessa/m21/numeroguia/{numeroGuia} - GET", "")) == 0 ) || ( GXutil.strcmp(AV9PathAndMethod, httpContext.getMessage( "/api/v1/GuiasRemessa/og/serie/{serie}/numeroguia/{numeroGuia} - GET", "")) == 0 ) || ( GXutil.strcmp(AV9PathAndMethod, httpContext.getMessage( "/api/v1/GuiasRemessa/og/de/{de}/ate/{ate} - GET", "")) == 0 ) || ( GXutil.strcmp(AV9PathAndMethod, httpContext.getMessage( "/api/v1/GuiasRemessa - POST", "")) == 0 ) || ( GXutil.strcmp(AV9PathAndMethod, httpContext.getMessage( "/api/v1/MapasProducao/{codMapaProducao} - GET", "")) == 0 ) || ( GXutil.strcmp(AV9PathAndMethod, httpContext.getMessage( "/api/v1/OrdensTingimento/ordemtingimento - GET", "")) == 0 ) || ( GXutil.strcmp(AV9PathAndMethod, httpContext.getMessage( "/api/v1/Planeamento - GET", "")) == 0 ) || ( GXutil.strcmp(AV9PathAndMethod, httpContext.getMessage( "/api/v1/Shopfloor - GET", "")) == 0 ) )
      {
         AV8BaseURL = httpContext.getMessage( "https://oliveiraegoncalves.no-ip.org/ponteway", "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = apibaseurloliveiraegoncalves.this.AV8BaseURL;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8BaseURL = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV9PathAndMethod ;
   private String AV8BaseURL ;
   private String[] aP1 ;
}

