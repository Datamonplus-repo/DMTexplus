package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.trecbon", "/app.trecbon"})
@jakarta.servlet.annotation.MultipartConfig
public final  class trecbon extends GXWebObjectStub
{
   public trecbon( )
   {
   }

   public trecbon( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( trecbon.class ));
   }

   public trecbon( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new trecbon_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new trecbon_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "RECARGO/BONIFICA. INTENSIDAD";
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

