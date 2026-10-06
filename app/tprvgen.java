package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tprvgen", "/app.tprvgen"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprvgen extends GXWebObjectStub
{
   public tprvgen( )
   {
   }

   public tprvgen( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprvgen.class ));
   }

   public tprvgen( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprvgen_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprvgen_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mantenimiento de Proveedores";
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

