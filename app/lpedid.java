package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.lpedid", "/app.lpedid"})
@jakarta.servlet.annotation.MultipartConfig
public final  class lpedid extends GXWebObjectStub
{
   public lpedid( )
   {
   }

   public lpedid( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( lpedid.class ));
   }

   public lpedid( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new lpedid_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new lpedid_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tabla LPEDID";
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

