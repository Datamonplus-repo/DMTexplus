package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidos.disalb__albreccod_prompt", "/app.pedidos.disalb__albreccod_prompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class disalb__albreccod_prompt extends GXWebObjectStub
{
   public disalb__albreccod_prompt( )
   {
   }

   public disalb__albreccod_prompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( disalb__albreccod_prompt.class ));
   }

   public disalb__albreccod_prompt( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new disalb__albreccod_prompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new disalb__albreccod_prompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Almacen Tejido";
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

