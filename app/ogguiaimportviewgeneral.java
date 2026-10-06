package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ogguiaimportviewgeneral", "/app.ogguiaimportviewgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ogguiaimportviewgeneral extends GXWebObjectStub
{
   public ogguiaimportviewgeneral( )
   {
   }

   public ogguiaimportviewgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ogguiaimportviewgeneral.class ));
   }

   public ogguiaimportviewgeneral( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ogguiaimportviewgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ogguiaimportviewgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Og Guia Import View General";
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

