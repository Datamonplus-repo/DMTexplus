package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmordco", "/app.tmordco"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmordco extends GXWebObjectStub
{
   public tmordco( )
   {
   }

   public tmordco( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmordco.class ));
   }

   public tmordco( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmordco_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmordco_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Control de Ordenes de Mantto";
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

