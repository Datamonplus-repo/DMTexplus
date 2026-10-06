package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.selecciondocumento_prompt", "/app.facturacion.selecciondocumento_prompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class selecciondocumento_prompt extends GXWebObjectStub
{
   public selecciondocumento_prompt( )
   {
   }

   public selecciondocumento_prompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( selecciondocumento_prompt.class ));
   }

   public selecciondocumento_prompt( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new selecciondocumento_prompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new selecciondocumento_prompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Guias (Header)";
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

