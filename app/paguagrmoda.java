package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.paguagrmoda", "/app.paguagrmoda"})
@jakarta.servlet.annotation.MultipartConfig
public final  class paguagrmoda extends GXWebObjectStub
{
   public paguagrmoda( )
   {
   }

   public paguagrmoda( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( paguagrmoda.class ));
   }

   public paguagrmoda( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new paguagrmoda_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new paguagrmoda_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Guia";
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

