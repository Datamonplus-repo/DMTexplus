package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.impressadirectaww", "/app.impressadirectaww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class impressadirectaww extends GXWebObjectStub
{
   public impressadirectaww( )
   {
   }

   public impressadirectaww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( impressadirectaww.class ));
   }

   public impressadirectaww( int remoteHandle ,
                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new impressadirectaww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new impressadirectaww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Impressa Directaww";
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

