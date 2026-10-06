package app.asyncbatch ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.asyncbatch.wclistfacturajob", "/app.asyncbatch.wclistfacturajob"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wclistfacturajob extends GXWebObjectStub
{
   public wclistfacturajob( )
   {
   }

   public wclistfacturajob( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wclistfacturajob.class ));
   }

   public wclistfacturajob( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wclistfacturajob_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wclistfacturajob_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Lista de Facturas";
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

