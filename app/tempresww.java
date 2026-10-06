package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tempresww", "/app.tempresww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tempresww extends GXWebObjectStub
{
   public tempresww( )
   {
   }

   public tempresww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tempresww.class ));
   }

   public tempresww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tempresww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tempresww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " EMPRESAS";
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

