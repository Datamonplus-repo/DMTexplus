package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tnofart", "/app.tnofart"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tnofart extends GXWebObjectStub
{
   public tnofart( )
   {
   }

   public tnofart( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tnofart.class ));
   }

   public tnofart( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tnofart_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tnofart_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "FICHA TECNICA ASOCIADA A NOF";
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

