package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcestam", "/app.tcestam"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcestam extends GXWebObjectStub
{
   public tcestam( )
   {
   }

   public tcestam( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcestam.class ));
   }

   public tcestam( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcestam_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcestam_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CESTAM";
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

