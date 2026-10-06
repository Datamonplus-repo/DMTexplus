package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.colorcolorantes_wp", "/app.formulaciontinte.colorcolorantes_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class colorcolorantes_wp extends GXWebObjectStub
{
   public colorcolorantes_wp( )
   {
   }

   public colorcolorantes_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( colorcolorantes_wp.class ));
   }

   public colorcolorantes_wp( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new colorcolorantes_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new colorcolorantes_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Colorantes";
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

