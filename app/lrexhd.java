package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.lrexhd", "/app.lrexhd"})
@jakarta.servlet.annotation.MultipartConfig
public final  class lrexhd extends GXWebObjectStub
{
   public lrexhd( )
   {
   }

   public lrexhd( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( lrexhd.class ));
   }

   public lrexhd( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new lrexhd_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new lrexhd_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tabla LREXHD";
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

