package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttrnusuari", "/app.ttrnusuari"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrnusuari extends GXWebObjectStub
{
   public ttrnusuari( )
   {
   }

   public ttrnusuari( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrnusuari.class ));
   }

   public ttrnusuari( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrnusuari_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrnusuari_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "USUARI";
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

