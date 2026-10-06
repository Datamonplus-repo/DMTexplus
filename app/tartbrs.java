package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tartbrs", "/app.tartbrs"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tartbrs extends GXWebObjectStub
{
   public tartbrs( )
   {
   }

   public tartbrs( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tartbrs.class ));
   }

   public tartbrs( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tartbrs_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tartbrs_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "FICHA TECNICA ARTICULO";
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

