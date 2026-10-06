package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mmostr", "/app.mmostr"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mmostr extends GXWebObjectStub
{
   public mmostr( )
   {
   }

   public mmostr( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mmostr.class ));
   }

   public mmostr( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mmostr_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mmostr_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tabla MMOSTR";
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

