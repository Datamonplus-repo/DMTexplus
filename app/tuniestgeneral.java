package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tuniestgeneral", "/app.tuniestgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tuniestgeneral extends GXWebObjectStub
{
   public tuniestgeneral( )
   {
   }

   public tuniestgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tuniestgeneral.class ));
   }

   public tuniestgeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tuniestgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tuniestgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TUNIESTGeneral";
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

