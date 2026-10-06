package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.toperargeneral", "/app.toperargeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class toperargeneral extends GXWebObjectStub
{
   public toperargeneral( )
   {
   }

   public toperargeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( toperargeneral.class ));
   }

   public toperargeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new toperargeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new toperargeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TOPERARGeneral";
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

