package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidos.disqui", "/app.pedidos.disqui"})
@jakarta.servlet.annotation.MultipartConfig
public final  class disqui extends GXWebObjectStub
{
   public disqui( )
   {
   }

   public disqui( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( disqui.class ));
   }

   public disqui( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new disqui_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new disqui_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Proceso químico";
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

