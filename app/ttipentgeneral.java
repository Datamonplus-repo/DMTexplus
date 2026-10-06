package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttipentgeneral", "/app.ttipentgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipentgeneral extends GXWebObjectStub
{
   public ttipentgeneral( )
   {
   }

   public ttipentgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipentgeneral.class ));
   }

   public ttipentgeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipentgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipentgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTIPENTGeneral";
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

