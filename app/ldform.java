package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ldform", "/app.ldform"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ldform extends GXWebObjectStub
{
   public ldform( )
   {
   }

   public ldform( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ldform.class ));
   }

   public ldform( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ldform_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ldform_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tabla LDFORM";
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

