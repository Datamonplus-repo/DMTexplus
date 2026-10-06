package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tworkrep", "/app.tworkrep"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tworkrep extends GXWebObjectStub
{
   public tworkrep( )
   {
   }

   public tworkrep( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tworkrep.class ));
   }

   public tworkrep( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tworkrep_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tworkrep_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Recepcion Trabajos Externos";
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

