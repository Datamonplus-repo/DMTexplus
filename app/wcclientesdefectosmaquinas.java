package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcclientesdefectosmaquinas", "/app.wcclientesdefectosmaquinas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcclientesdefectosmaquinas extends GXWebObjectStub
{
   public wcclientesdefectosmaquinas( )
   {
   }

   public wcclientesdefectosmaquinas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcclientesdefectosmaquinas.class ));
   }

   public wcclientesdefectosmaquinas( int remoteHandle ,
                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcclientesdefectosmaquinas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcclientesdefectosmaquinas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCClientes Defectos Maquinas";
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

