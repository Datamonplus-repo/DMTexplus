package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmqddin", "/app.tmqddin"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmqddin extends GXWebObjectStub
{
   public tmqddin( )
   {
   }

   public tmqddin( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmqddin.class ));
   }

   public tmqddin( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmqddin_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmqddin_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ALTA LINEAS";
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

