package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.thpreie", "/app.thpreie"})
@jakarta.servlet.annotation.MultipartConfig
public final  class thpreie extends GXWebObjectStub
{
   public thpreie( )
   {
   }

   public thpreie( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( thpreie.class ));
   }

   public thpreie( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new thpreie_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new thpreie_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ESCALADOS";
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

