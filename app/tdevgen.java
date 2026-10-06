package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdevgen", "/app.tdevgen"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdevgen extends GXWebObjectStub
{
   public tdevgen( )
   {
   }

   public tdevgen( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdevgen.class ));
   }

   public tdevgen( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdevgen_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdevgen_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Devolucion de Entradas Almacen v 01";
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

