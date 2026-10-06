package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tpedobsgeneral", "/app.tpedobsgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpedobsgeneral extends GXWebObjectStub
{
   public tpedobsgeneral( )
   {
   }

   public tpedobsgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpedobsgeneral.class ));
   }

   public tpedobsgeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpedobsgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpedobsgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TPEDOBSGeneral";
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

