package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.partedeproduccion_seleccion_hdr_orden_prompt", "/app.partedeproduccion_seleccion_hdr_orden_prompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class partedeproduccion_seleccion_hdr_orden_prompt extends GXWebObjectStub
{
   public partedeproduccion_seleccion_hdr_orden_prompt( )
   {
   }

   public partedeproduccion_seleccion_hdr_orden_prompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( partedeproduccion_seleccion_hdr_orden_prompt.class ));
   }

   public partedeproduccion_seleccion_hdr_orden_prompt( int remoteHandle ,
                                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new partedeproduccion_seleccion_hdr_orden_prompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new partedeproduccion_seleccion_hdr_orden_prompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Detalle Fases Produccion";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

