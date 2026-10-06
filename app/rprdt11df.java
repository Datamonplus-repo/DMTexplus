package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rprdt11df", "/app.rprdt11df"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rprdt11df extends GXWebObjectStub
{
   public rprdt11df( )
   {
   }

   public rprdt11df( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rprdt11df.class ));
   }

   public rprdt11df( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rprdt11df_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rprdt11df_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PRdt11df";
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

