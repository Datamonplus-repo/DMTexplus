package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttrncos", "/app.ttrncos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrncos extends GXWebObjectStub
{
   public ttrncos( )
   {
   }

   public ttrncos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrncos.class ));
   }

   public ttrncos( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrncos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrncos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "COSTES TRANSPORTISTA";
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

