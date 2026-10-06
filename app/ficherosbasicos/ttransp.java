package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttransp", "/app.ficherosbasicos.ttransp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttransp extends GXWebObjectStub
{
   public ttransp( )
   {
   }

   public ttransp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttransp.class ));
   }

   public ttransp( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttransp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttransp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Transportista";
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

