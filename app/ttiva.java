package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttiva", "/app.ttiva"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttiva extends GXWebObjectStub
{
   public ttiva( )
   {
   }

   public ttiva( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttiva.class ));
   }

   public ttiva( int remoteHandle ,
                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttiva_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttiva_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TAXAS IVA";
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

