package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.imprimirtrabajoexterno", "/app.imprimirtrabajoexterno"})
@jakarta.servlet.annotation.MultipartConfig
public final  class imprimirtrabajoexterno extends GXWebObjectStub
{
   public imprimirtrabajoexterno( )
   {
   }

   public imprimirtrabajoexterno( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( imprimirtrabajoexterno.class ));
   }

   public imprimirtrabajoexterno( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new imprimirtrabajoexterno_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new imprimirtrabajoexterno_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Imprimir Trabajo Externo";
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

