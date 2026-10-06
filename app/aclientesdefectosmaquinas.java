package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.aclientesdefectosmaquinas", "/app.aclientesdefectosmaquinas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class aclientesdefectosmaquinas extends GXWebObjectStub
{
   public aclientesdefectosmaquinas( )
   {
   }

   public aclientesdefectosmaquinas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( aclientesdefectosmaquinas.class ));
   }

   public aclientesdefectosmaquinas( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new aclientesdefectosmaquinas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new aclientesdefectosmaquinas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Clientes Defectos Maquinas";
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

