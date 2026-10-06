package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tclibrs", "/app.tclibrs"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tclibrs extends GXWebObjectStub
{
   public tclibrs( )
   {
   }

   public tclibrs( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tclibrs.class ));
   }

   public tclibrs( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tclibrs_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tclibrs_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CONTROL DIAS CLIENTE";
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

