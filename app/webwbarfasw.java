package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwbarfasw", "/app.webwbarfasw"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwbarfasw extends GXWebObjectStub
{
   public webwbarfasw( )
   {
   }

   public webwbarfasw( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwbarfasw.class ));
   }

   public webwbarfasw( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwbarfasw_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwbarfasw_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Alta, Baja, Modificacion FASES";
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

