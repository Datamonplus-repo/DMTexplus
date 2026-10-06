package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tterpesgeneral", "/app.tterpesgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tterpesgeneral extends GXWebObjectStub
{
   public tterpesgeneral( )
   {
   }

   public tterpesgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tterpesgeneral.class ));
   }

   public tterpesgeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tterpesgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tterpesgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTERPESGeneral";
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

