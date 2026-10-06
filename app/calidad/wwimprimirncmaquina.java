package app.calidad ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.calidad.wwimprimirncmaquina", "/app.calidad.wwimprimirncmaquina"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wwimprimirncmaquina extends GXWebObjectStub
{
   public wwimprimirncmaquina( )
   {
   }

   public wwimprimirncmaquina( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wwimprimirncmaquina.class ));
   }

   public wwimprimirncmaquina( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wwimprimirncmaquina_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wwimprimirncmaquina_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "NC por máquina";
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

