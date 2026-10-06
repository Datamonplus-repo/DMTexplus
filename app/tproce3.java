package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tproce3", "/app.tproce3"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tproce3 extends GXWebObjectStub
{
   public tproce3( )
   {
   }

   public tproce3( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tproce3.class ));
   }

   public tproce3( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tproce3_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tproce3_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Procesos con notas de observ.";
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

