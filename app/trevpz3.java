package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.trevpz3", "/app.trevpz3"})
@jakarta.servlet.annotation.MultipartConfig
public final  class trevpz3 extends GXWebObjectStub
{
   public trevpz3( )
   {
   }

   public trevpz3( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( trevpz3.class ));
   }

   public trevpz3( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new trevpz3_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new trevpz3_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "REVISION PIEZAS-DEFECTOS";
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

