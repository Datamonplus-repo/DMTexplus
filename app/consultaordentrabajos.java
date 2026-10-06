package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.consultaordentrabajos", "/app.consultaordentrabajos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consultaordentrabajos extends GXWebObjectStub
{
   public consultaordentrabajos( )
   {
   }

   public consultaordentrabajos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consultaordentrabajos.class ));
   }

   public consultaordentrabajos( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consultaordentrabajos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consultaordentrabajos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consulta Orden de Trabajos";
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

