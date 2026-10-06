package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmqddln", "/app.tmqddln"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmqddln extends GXWebObjectStub
{
   public tmqddln( )
   {
   }

   public tmqddln( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmqddln.class ));
   }

   public tmqddln( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmqddln_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmqddln_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CONTROL ACREDITACION LINEA";
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

