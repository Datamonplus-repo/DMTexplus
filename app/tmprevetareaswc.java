package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmprevetareaswc", "/app.tmprevetareaswc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmprevetareaswc extends GXWebObjectStub
{
   public tmprevetareaswc( )
   {
   }

   public tmprevetareaswc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmprevetareaswc.class ));
   }

   public tmprevetareaswc( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmprevetareaswc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmprevetareaswc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMPreve Tareas WC";
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

