package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.txcarem", "/app.txcarem"})
@jakarta.servlet.annotation.MultipartConfig
public final  class txcarem extends GXWebObjectStub
{
   public txcarem( )
   {
   }

   public txcarem( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( txcarem.class ));
   }

   public txcarem( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new txcarem_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new txcarem_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "XCAREM";
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

