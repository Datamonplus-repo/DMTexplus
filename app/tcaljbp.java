package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcaljbp", "/app.tcaljbp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcaljbp extends GXWebObjectStub
{
   public tcaljbp( )
   {
   }

   public tcaljbp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcaljbp.class ));
   }

   public tcaljbp( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcaljbp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcaljbp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Calidad HDR (JBP)";
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

