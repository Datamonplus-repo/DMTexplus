package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tsocrat", "/app.tsocrat"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tsocrat extends GXWebObjectStub
{
   public tsocrat( )
   {
   }

   public tsocrat( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tsocrat.class ));
   }

   public tsocrat( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tsocrat_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tsocrat_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "SOCRATES INTERFACE CODIGO";
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

