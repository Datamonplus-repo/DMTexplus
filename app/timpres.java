package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.timpres", "/app.timpres"})
@jakarta.servlet.annotation.MultipartConfig
public final  class timpres extends GXWebObjectStub
{
   public timpres( )
   {
   }

   public timpres( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( timpres.class ));
   }

   public timpres( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new timpres_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new timpres_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "IMPRESORAS";
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

