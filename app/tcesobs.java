package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcesobs", "/app.tcesobs"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcesobs extends GXWebObjectStub
{
   public tcesobs( )
   {
   }

   public tcesobs( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcesobs.class ));
   }

   public tcesobs( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcesobs_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcesobs_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CESOBS";
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

