package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.albbar", "/app.albbar"})
@jakarta.servlet.annotation.MultipartConfig
public final  class albbar extends GXWebObjectStub
{
   public albbar( )
   {
   }

   public albbar( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( albbar.class ));
   }

   public albbar( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new albbar_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new albbar_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ALBBAR";
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

